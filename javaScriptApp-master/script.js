function nextPage() {
if(document.getElementById("usrname")&& document.getElementById("psw")!=null){
		console.log(document.getElementById("psw").value);
		if(document.getElementById("psw").value.match((/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/))){
			console.log("i eneterd");
		        page();
				 
		}
		else
		{
		alert('password must have 1.One upper case  letter,2.one Special character,3.Should be greater than 8characters');
	    }
		 return false;
	}
	else{
		alert('enter the feilds');
	}
}

function page() {
    window.open('./list.html');
}

function prevPage() {
    location.href = './index.html';
}

window.onload = function(){
    var deleteline = document.getElementsByClassName("delete"); // or document.querySelectorAll("li");
 var listItems = document.getElementsByTagName("li");    
   for (var i = 0; i < deleteline.length; i++) {
        deleteline[i].onclick = function () {
			      this.parentNode.remove();
        }
    }
}