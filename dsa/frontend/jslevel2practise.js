
//Q1

// let arr =[2,1,3,4,5];
// console.log(arr.slice(0,3))
//or
// let arr =[2,1,3,4,5];
// let n = 3;
// console.log(arr.slice(0,n)); // in console show - (3) [2,1,3]

//Q2

// let arr = [2,1,3,5,4];
// let n = 3;
// console.log(arr.slice(-3));//or arr.slice(arr.length-n)

//Q3

// let str = "";

// if (str[0] = true){
//     console.log("string is not blank");//print string is not blank
// }else{
//     console.log("string is  blank");
// }

//more better code

// let str = "";

// if (str.length == 0){
//     console.log("string is  blank");//print string is blank
// }else{
//     console.log("string is not blank");
// }

//optimize code 

// let str = prompt("pls enter a string");

// if(str.lenth==0){
//     console.log("string is blank");
// }else{
//     console.log("string is not blank");
// }

//Q4

// let str = "HJHDS";
// let idx =2;

// if( str[idx] == str[2].toLowerCase()){
//     console.log("character is in lowercase");
// }else{
//     console.log("character is not in lowercase");
// }

//Q5

let str = prompt("enter a string");
console.log(`original string = ${str}`);  
console.log(`string without spaces = ${str.trim()}`); 

//Q6

// let arr = ["shivam","rahul", "karan"];
// let elm = "karan";

// if(arr.includes("karan") == true){//or (arr.includes(elm) == true)
//     console.log("element is present in array");
// }else {
//     console.log("element is not present in array");
// }

//optimize code

// let arr = ["hello", 'a', 23, 64, 99,-6];
// let item = 64;
// if(arr.indexOf(item) !=-1) {
// console.log("element exists in array");
// } else {
// console.log("element doesn't exist in array");
// }