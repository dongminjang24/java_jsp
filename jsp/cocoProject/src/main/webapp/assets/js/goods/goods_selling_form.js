document.addEventListener("DOMContentLoaded", () => {
    init();
    updateHiddenTags();
    console.log('왜안돼3')

});

function init(){
	document.querySelector(".goods_tag > input").addEventListener("keyup", tagAdd);
	document.querySelector(".checkbox_safePay > input[type='checkbox']").addEventListener("click", thunerPay);
	console.log('왜안돼2')
}


function setImages(event){
    let cnt = document.querySelector(".image_num").innerText

    for(var image of event.target.files){
        var reader = new FileReader();
        
        reader.onload = function(e){
            var img = document.createElement("img");
            img.setAttribute("src", e.target.result);
            img.setAttribute("class", "preview");
            document.querySelector("div.preview_wrap").appendChild(img);
            cnt++;
            document.querySelector(".image_num").innerText = cnt;
        };
        
        reader.readAsDataURL(image);
        if(cnt >= 4){
            break;
        }
    }
}

function countTitleLength(event) {
    document.querySelector("span.goods_title_length span").innerText = event.target.value.length;
}

function countInfoLength(event) {
    document.querySelector("span.info_length span").innerText = event.target.value.length;
}

function valueIsNumber(event){
    event.target.value = event.target.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');
}

function tagDelete(event) {
    let lastParent = event.target;
    while(true){
        lastParent =  lastParent.parentElement;
        if(lastParent.className === "tag_button"){
            lastParent.replaceChildren();
            lastParent.remove()
            break;
        }
    }
}


function tagAdd(event){
    if(event.keyCode == 32){
        const tagValue = event.target.value.trim();
        const existingTags = document.querySelectorAll(".tag_button button:first-child");
        for(let tag of existingTags) {
            if(tag.innerText.trim() === tagValue) {
                alert("이미 추가된 태그입니다.");
                event.target.value = "";
                return;
            }
        }

        const tag_button = document.querySelectorAll(".tag_button").length;
        if(tag_button > 5){ 
            alert("태그는 최대 5개까지만 입력가능합니다");
        } else{
            event.preventDefault();
            let tagBtn = document.querySelector("div.tag_button").cloneNode(true);
            tagBtn.children[0].innerText = tagValue; 
            tagBtn.classList.remove("hidden");
            document.querySelector("div.goods_tag").insertBefore(tagBtn, event.target);
            event.target.value = "";
            
            // Add this line to update the hidden input value
            document.getElementById("hiddenTags").value += tagValue + ",";
        }
    }
}


function thunerPay() {
    if(this.checked){
        document.querySelectorAll("div.safe_pay_notice span.check").forEach(check => {
            check.style.borderLeftColor="#ff5058"
            check.style.borderBottomColor="#ff5058"
        })
    } else{
        document.querySelectorAll("div.safe_pay_notice span.check").forEach(check => {

            check.style.borderLeftColor="rgb(250, 250, 253)"
            check.style.borderBottomColor="rgb(250, 250, 253)"
        })
    }
}


function updateHiddenTags() {
    const tagButtons = document.querySelectorAll(".tag_button button:first-child");
    const tagsArray = Array.from(tagButtons).map(btn => btn.innerText.trim());
    document.getElementById("hiddenTags").value = tagsArray.join(",");
}


