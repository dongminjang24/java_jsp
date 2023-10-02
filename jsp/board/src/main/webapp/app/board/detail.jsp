<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initail-scale=1,user-scalable=no"/> 
<title>게시글 상세보기</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
<style>
	form textarea{
		border-radius:0; 
		resize:none;
		color:black !important;
	}
	
	form div#reply{
		display:flex;
		margin-bottom:3%;
	}
	
	input[type='submit']:not(#register), input[type='button'] {border-radius:0;}
	
	ul.actions li {
	    padding: 0 0 0 0.2em;
	}
	
	p.content{
		width:63%;
	}
	
	p.writer{
		width:20%;
		font-weight:bold;
	}
</style>
</head>
<body class="is-preload">
	<%-- <c:if test="${sessionId eq null}">
		<script>
			alert("로그인 후 이용하세요.");
			location.replace("${pageContext.request.contextPath}/member/login.me");
		</script>
	</c:if> --%>
	<c:set var="board" value="${board}"/>
	<c:set var="files" value="${files}"/>
	<!-- Page Wrapper -->
	<div id="page-wrapper">
		<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">
				<jsp:include page="/app/fix/header.jsp"/>
			</div>
		</div>
		<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">
	
				<!-- Main -->
				<section class="main">
					<a href="#" class="image main"><img src="${pageContext.request.contextPath}/assets/images/boardView.png" alt="" /></a>
					<div class="col-12">
						<ul class="actions" style="display:flex; justify-content:flex-end;">
							<li><input type="button" value="글쓰기" class="primary" onclick="location.href='${pageContext.request.contextPath}/board/boardWrite.bo'"/></li>
							<li><input type="button" value="목록" class="primary" onclick="location.href='${pageContext.request.contextPath}/board/boardListOk.bo'"/></li>
							<c:if test="${sessionScope.memberNumber == board.getMemberNumber()}">
								<li><input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/board/boardUpdate.bo?boardNumber=${board.getBoardNumber()}'"/></li>
								<li><input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/board/boardDelete.bo?boardNumber=${board.getBoardNumber()}'"/></li>
							</c:if>
						</ul>
					</div>
					<header class="major">
					
						<h2 style="text-align:left;"><c:out value="${board.getBoardTitle()}"/></h2>
						<p style="text-align:left; margin-bottom:1%">작성자 : <c:out value="${board.getMemberId()}"/></p>
					</header>
					<hr style="margin-top:0;">
						<div>
							첨부파일
						</div>
						<c:forEach var="file" items="${board.getFiles()}">
							<a href="${pageContext.request.contextPath}/file/download.file?fileSystemName=${file.getFileSystemName()}&fileOriginalName=${file.getFileOriginalName()}">
								<c:out value="${file.getFileOriginalName()}"/>
							</a>
							<br>
						</c:forEach>
					<hr />
					<h3><pre><c:out value="${board.getBoardContent()}"/></pre></h3>
				</section>
				<section class="main accent2" style="padding:3%">
					<header class="major" style="text-align:left;">
						<h2>댓글</h2>
						<p>여러분의 소중한 댓글을 작성해주세요.</p>
					</header>
					<form method="post" action="#" class="combined" style="width:auto;" name="replyForm">
						<textarea name="replyContent" id="content" placeholder="비속어를 사용하지 말아주세요." class="invert" rows="5" style="border-radius:0; resize:none;"></textarea>
						<input id="register" type="button" class="primary" value="등록" onclick="send()"/>
					</form>
					<form action="javascript:void(0)" id="replies" class="combined" style="flex-direction:column; margin:0; display:contents;">
					</form>
				</section>
			</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
<script>
	let contextPath = "${pageContext.request.contextPath}";
	let boardNumber = "${board.getBoardNumber()}";
	let memberNumber = "${sessionScope.memberNumber}";
	console.log(memberNumber)
</script>
<script src="${pageContext.request.contextPath}/assets/js/reply.js"></script>

<!-- <script>
	$(document).ready(function(){getList();});
	
	let pageContext = "${pageContext.request.contextPath}";
	let boardNum = "${board.getBoardNumber()}";
	
	function getList(){
		$.ajax({
			url: pageContext + "/board/BoardReplyListOk.bo?boardNum=" + boardNum,
			type: "get",
			dataType: "json",
			success: showList
		});
	}
	
	let replyList;
	
	function showList(replies){
		replyList = replies;
		let text = "";
		if(replies != null && replies.length != 0){
			$.each(replies, function(index, reply){
				text += "<div id='reply'>";
				text += "<p class='writer'>"+reply.memberId+"</p>";
				text += "<div class='content' id='" + (index +1 ) + "' style='width:100%'><pre>" + reply.replyContent + "</pre></div>";
				if("${sessionId}" == reply.memberId){
					text += "<input type='button' id='ready" + (index + 1) + "' class='primary' onclick=readyToUpdate(" + (index+1) + ") value='수정'>"
					text += "<input type='button' id='ok" + (index + 1) + "' class='primary' style='display:none' onclick=update(" + (index + 1) + "," + reply.replyNum + ") value='수정완료'>"
					text += "<input type='button' id='remove" + (index + 1) + "' class='primary' onclick=deleteReply(" + reply.replyNum + ") value='삭제'>"	
				}
				text += "</div>";
			});
		}else{
			text = "<p>댓글이 없습니다.</p>"
		}
		$("#replies").html(text);
	}

	
	function comment(){
		let replyContent = $("textarea[name='content']").val();
		$.ajax({
			url: pageContext + "/board/BoardReplyWriteOk.bo",
			type: "post",
			data: {"boardNum": boardNum, "replyContent": replyContent},
			success: function(){
				$("textarea[name='content']").val("");
				getList();
			}
		});
	}
	
	let check = false;
	
	//수정 버튼 
	function readyToUpdate(index){
		let div = $("#"+index);
		let modifyReady = $("#ready" + index);
		let modifyOk = $("#ok" + index);
		let remove=$("#remove"+index);
		
		//원래 텍스트를 택스트에어리어로 바꿔서 보여주기
		 if(!check){
			div.replaceWith("<textarea name='replyContent' id='"+ index +"' class='invert' style='border-radius:0; resize:none;'>" + div.text() + "</textarea>");
			remove.replaceWith("<input type='button' id='cancel" + index +"' value='취소' onclick=updateCancel(" + index + ")>");
			modifyReady.hide();
			modifyOk.show();
			check = true;
		 }else{	
			alert("수정중인 댓글이 있습니다.")
		}
	} 
	
	//수정 취소 버튼
	function updateCancel(index){
		let remove = $("#cancel"+index);
		let textarea = $("#"+index);//textarea 를 div로 바꿔줄것
		let modifyReady = $("#ready"+index);
		let modifyOk =$("#ok"+index);
		
		
		modifyReady.show();
		modifyOk.hide();
		remove.replaceWith("<input type='button' id='remove" + index + "' class='primary' onclick='' value='삭제'>");
		textarea.replaceWith("<div class='content' id='" + index + "' style='width:100%'><pre>"+ replyList[index-1].replyContent + "</pre></div>");
		check=false;
	}
	
	//수정 완료
	function update(index, replyNum){
		let replyContent = $("textarea#"+index).val(); //사용자가 수정할 글을 가져옴
		
		let json = new Object(); //json 오브젝트를 만들것
		json.replyNum = replyNum;
		json.replyContent = replyContent;
		
		$.ajax({
			url : pageContext + "/board/BoardReplyModifyOk.bo",
			type : "post",
			data : json,
			success: function(){
				check = false;
				getList();
			}
		});
	}
	
	//댓글 삭제
	function deleteReply(replyNum){
		$.ajax({
			url : pageContext + "/board/BoardReplyDeleteOk.bo",
			type : "post",
			data : {"replyNum" : replyNum},
			success: function(){
				check = false;
				getList();
			}
		});
	} 
	
</script> -->

</html>