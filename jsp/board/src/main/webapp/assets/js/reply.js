/**
 * 
 */
let check =false;
show();

function show(){
	$.ajax({
	url: contextPath + "/reply/replyList.re",
	type: "get",
	data: { boardNumber: boardNumber },
	dataType: "json",
	success: showList
	});
};



function showList(replies) {

	let text = "";

	replies.forEach(reply => {
		text += `<div class="reply">`;
		text += `<div class="info">`;
		text += `<p class="writer">` + reply.memberId + `</p>`;
		text += `<p class="date">` + reply.replyDate + `</p>`;
		text += `</div>`;
		text += `<div class="content" style="width: 100%">`;
		text += `<pre>` + reply.replyContent + `</pre>`;
		text += `<div class="dimmed" style="display:none"></div>`;
		text += `</div>`;
		if (reply.memberNumber == memberNumber) {
			text += `<div class="button-wrap">`;
			text += `<div class="modify-ready-button" data-number=` + reply.replyNumber + `>수정</div>`;
			text += `<div class="modify-button" data-number=` + reply.replyNumber + ` style="display:none;">수정 완료</div>`;
			text += `<div class="delete-button" data-number=`+ reply.replyNumber +`>삭제</div>`;
			text += `<div class="cancel-button" data-number=`+ reply.replyNumber +` style = "display: none;">취소</div>`;
			text += `</div>`;
			}
			text += `</div>`;
				console.log(reply.memberNumber);
				console.log(memberNumber);
		});
	
		$("#replies").html(text);
}


function send(){
	$.ajax({
		url: contextPath + "/reply/replyWrite.re",
		type: "post",
		data: {boardNumber: boardNumber,memberNumber:memberNumber,replyContent:replyForm.replyContent.value},
		success: function(){
			replyForm.replyContent.value="";
			show();
			
		}
	});
	
	
}
//이벤트 위임
//DOM으로 새롭게 추가한 요소들은 이벤트가 발생되지 않는다.
//실행 순서 상, 이벤트가 먼저 적용된 뒤 DOM이 진행되기 때문이다.
//따라서, 기존에 작성되어 있던 태그 중 DoM이 추가될 부모 태그에 이벤트를 발생 시킨 뒤 
//DOM을 통해 자식요소로 추가될 선택자에 기존 이벤트를 전달하여 이벤트를 정상적으로 적용시킬 수 있다.
//$("div.delete-button").on("click",function(){ 위임할 수 있음. 가장 가까운 부모에 이벤트를주고 거기로 전달을 해주기
$("#replies").on("click","div.delete-button",function(){
	let replyNumber = $(this).data("number");
	$.ajax({
		url: contextPath + "/reply/replyDelete.re",
		type: "get",
		data: {replyNumber: replyNumber},
		success: function(){
			show();
		}
	})
});




$("#replies").on("click","div.modify-ready-button",function(){
	if(check){alert("이미 수정중인 댓글이 있습니다.");return;}

	const $buttonWrap = $(this).closest(".button-wrap");
	const $buttons = $buttonWrap.children();
	const $content = $buttonWrap.prev().find(":first-child");
	$buttons.eq(0).hide(); 
	$buttons.eq(1).show();
	$buttons.eq(2).hide(); 
 	$buttons.eq(3).show();
	$content.replaceWith("<textarea>" + $content.text() +"</textarea>")
	check =true;
});


$("#replies").on("click","div.modify-button",function(){
	
	let replyNumber = $(this).data("number");
	const $buttonWrap = $(this).closest(".button-wrap");
	let replyContent = $buttonWrap.prev().find(":first-child").val();
	$.ajax({
		url: contextPath + "/reply/replyUpdate.re",
		type: "get",
		data: {replyNumber: replyNumber,replyContent: replyContent},
		success: function(){
			show();
			check =false;
		}
	})
});



$("#replies").on("click","div.cancel-button",function(){
	const $buttonWrap = $(this).closest(".button-wrap");
	const $buttons = $buttonWrap.children();
	const $content = $buttonWrap.prev().find(":first-child");
	$buttons.eq(0).show(); 
	$buttons.eq(1).hide();
	$buttons.eq(2).show(); 
 	$buttons.eq(3).hide();
	$content.replaceWith("<pre>" + $content.text() +"</pre>")
	check = false;
});












