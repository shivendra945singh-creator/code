console.log("hello world");
console.log("shivam");
let s = 10;
let k = 5;
console.log("sum is :", s+k);
console.log("shivam",123);

//template literals

let pen = 10;
let pencil = 3;
// let output = "the total price is : " + (pen + pencil) +  " i konw "; // + is used to add string 
//or
let output = ` the total price is : ${pen + pencil} i know `;// ` is called back tick
console.log(output);

//arthmetic operator

let a = 12;
let b = 122;

console.log(a+b);
console.log(a-b);
console.log(a*b);
console.log(a%b);
console.log(a/b);

//uniary operator

let r = 12;
console.log(r++);//12
console.log(++r);//14

//assignment operator

let h =12;
let v = 13;
v=h;
console.log(v);//12

//comparison operator

let age = 12;
console.log(age < 18);//true

//conditional statements

console.log("before my if statement");//in js code will execute from top to low
let agee = 12;
if(agee <= 23) {
    console.log("you can drive");
    console.log("you can drink");
}
if(agee > 2 ) {
    console.log("you are in 2");
}
console.log("after my if statement");

let firstname = "shivam";
if(firstname == "shivam") {
    console.log(`welcome ${firstname}`);
}

//traffic light system

let color = "green";

if(color ==="red") {
    console.log("stop light is red");
}
if(color ==="yellow") {
    console.log("slow down light is yellow");
}
if(color ==="green") {
    console.log("go light is green");
}

//else if statement

let year = 12;
if(year>=4) {//in case of if every if condition is checked whether is true or not
   console.log("u can vote") 
}if(year>=4) {
   console.log("u can vote") 
}else if(year>=4) {//if if condition is true then never checked else if condition whatever it is
   console.log("u must vote") 
}else if(year>=8) {
   console.log("u can  also vote") 
}


let marks = 75;

if(marks >= 80) {
    console.log("A+");
}else if(marks >= 60) {//if this else if condition is true then never below else if condition will  checked . below if condition will be checked
    console.log("A");
}if(marks >= 33) {
    console.log("B");
}else if(marks >= 33) {
    console.log("F");
}

//if else condition 

let years = 15;
if(years >=18) {
    console.log("u can vote");
}else{// if upper conditions is false then 100% this statement will print
    console.log("u can not vote");
}


let colors= "white";

if(colors === "red") {
    console.log("stop");
}else if(colors === "yellow") {
    console.log("wait");
}else if(colors === "green") {
    console.log("go");
}else {// if upper conditions is false then 100% this statement will print
    console.log("error");
}

//nested if else

let Marks = 39;

if(Marks>= 33) {
    console.log("pass");
    if(Marks >=80) {
        console.log("grade A");
    }else{
        console.log("grade B");
    }
}else{
  console.log("fail");  
}

//logical operations

let markss = 90;

if(markss >= 22 && markss >= 80) {
    console.log("pass");
     console.log("A+");
}

if(markss >= 22 || markss >= 99) {
    console.log("pass");
     console.log("A+");
}

if(!(markss < 33)) {//or (! markss < 33)
    console.log("pass");
     console.log("A+");
}

if((markss >= 22 && markss >= 80) || !false) {//left to right execution 
    console.log("clear");
     console.log("A+");
}

//practise question

let str = "apple";

if(str[0]==="a" && str.length > 3) {
    console.log("good string");
}else{
    console.log("not a good string");
}

//truthy and falsy

if(true) {
    console.log("it has true value");//it has true value
}else{
    console.log("it has false value");
}

if(0) {
    console.log("it has true value");//it has false value
}else{
    console.log("it has false value");
}

if(1) {
    console.log("it has true value");//it has true value
}else{
    console.log("it has false value");
}

if("") {
    console.log("it has true value");//it has false value
}else{
    console.log("it has false value");
}

if(" ") {
    console.log("it has true value");//it has true value
}else{
    console.log("it has false value");
}

//switch statement

let col = "red";

switch(col) {
  case "red":
    console.log("stop");
    break;//if this break statement is not present below cases also execute
  case "yellow":
    console.log("wait");
    break;
  case "green":
    console.log("go");
    break;
  default:
    console.log("light is broken");
}

//practise question day of the week

let day = 1;

switch(day) {
    case 1:
        console.log("monday");
        break;
    case 2:
        console.log("tue");
        break;
    case 3:
        console.log("wed");
        break;
    case 4:
        console.log("thu");
        break;
    case 5:
        console.log("fri");
        break;
    case 6:
        console.log("sat");
        break;
    case 7:
        console.log("sun");
        break;
     default:
    console.log("error")
}

//alert message

alert("something is wrong");

//error message

console.error("error");

//warning message

console.warn("danger");

//prompt message

let firname = prompt("enter your name ");
let lasname = prompt("enter your last name");
console.log("welcome",firname, lasname,"our website");