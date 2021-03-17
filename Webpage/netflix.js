	//Validtion Code For Inputs

var email = document.forms['form']['email'];
var password = document.forms['form']['password'];

var email_error = document.getElementById('email_error');
var pass_error = document.getElementById('pass_error');


var personList = [];


email.addEventListener('textInput', email_Verify);
password.addEventListener('textInput', pass_Verify);

function validated(){
	if (email.value.length < 9) {
		email.style.border = "1px solid red";
		email_error.style.display = "block";
		email.focus();
		return false;
	}
	if (password.value.length < 4 || password.value.length > 60 ) {
		password.style.border = "1px solid red";
		pass_error.style.display = "block";
		password.focus();
		return false;
	}

}
function email_Verify(){
	if (email.value.length >= 8) {
		email.style.border = "1px solid silver";
		email_error.style.display = "none";
		return true;
	}
}
function pass_Verify(){
	if (password.value.length >= 5) {
		password.style.border = "1px solid silver";
		pass_error.style.display = "none";
		return true;
	}
}


function person(email, password){
  this.email = email;
  this.password = password;
  //alert(this.email.value)
}

function addPerson(email, password){
    //if (validated()){
      var personToBeAdded = new person(email, password);
      personList.push(personToBeAdded);
      iteratePersonList();
      //alert(personList[i].person.password);
    //}
}

function iteratePersonList(){
  for(var i = 0; i < personList.length; i++){
    alert(personList[i].email.value);
    console.log(personList[i].email.value);
  }
}