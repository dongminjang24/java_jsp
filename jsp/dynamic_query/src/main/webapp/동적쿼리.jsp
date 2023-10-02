<!-- 동적 쿼리는 컬럼명이 동적으로 변경되어야할때 사용한다
<if test=""></if>
참일때 안에 작성된 쿼리 추가

<choose>
	<when test=""></when>
	<otherwise></otherwise>
	<forEach item="" index="" collection="">
	</forEach>
</choose>

불필요한 부분을 없애거나 반복되는 부분을 일괄처리할 수 있다.
<trim></trim>
  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동적쿼리</title>
<style>
div.wrap {
	width: 80%;
	display: flex;
	margin: 0 auto;
}
div.container1 {
	width: 50%;
	text-align: center;
}
div.container2 {
	width: 50%;
	text-align: center;
}
ul {
	width: fit-content;
	margin: 30px auto;
}
</style>
</head>
<body> 
	<div class="wrap">
		<div class="container1">
			<select id="type-container" name="type">
				<option value="nsl">전체</option>
				<option value=“n”>이름</option>
				<option value="s">종류</option>
				<option value="l">수명</option>
				<option value=“ns”>이름 또는 종류</option>
			</select>
			<input type="text" name="keyword" id="keyword">
			<!-- <button onclick="showResultBySearch()">검색</button>  -->
	 		<button onclick="show()">검색</button>
		</div> 
		<div class="container2">
			<button id="n" onclick="show(this.id)">이름순</button>
			<button id="s" onclick="show(this.id)">종류순</button>
			<button id="l" onclick="show(this.id)">수명순</button>
		</div> 
	</div> 
	<ul id="result"></ul>
</body> 
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script>

	show();
	
	function show(order){
		let type = $("#type-container").val() || 'none';
		let keyword = $("#keyword").val() || 'none';
		order= order || 'none';
		let text ="";
		$.ajax({
			url: "${pageContext.request.contextPath}/find.an",
			type: "get",
			dataType: "json",
			data: {type: type,keyword:keyword,order:order},
			success: function(results){
				$(results).each(function(i,result){
					text += `<li>`+ result.animalNumber +`</li>`+ `&nbsp; &nbsp;`;
						text += result.animalName + `&nbsp;&nbsp`; 
						text += result.animalSpecies + `&nbsp;&nbsp;`;
						text += result.animalLife + `&nbsp;&nbsp;`;
						text += result.animalDetail + `</li>`
				})
				if(results.length ==0){
					text = "검색 결과가 없습니다"
				}
				$("#result").html(text);
			}

		});
		
	}
</script>
</html>









