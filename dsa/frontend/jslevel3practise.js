
//Q1

// let arr=[1,2,3,4,5,6,2,3];
// let num=2;

// for(let i = 0; i<arr.length; i++){
//     if(arr[i]==num){
//         arr.splice(i,1);
//     }
// }
// console.log(arr);

//Q2

// let num = "38283";//38283 is not valid bcz length property is only apply on string and array
// console.log(num.length);//.length()is not valid

// optimize code

let num = 38283;
let count = 0;
let copy = num;

while(copy > 0){
    count++;
    copy = Math.floor(copy/10);
    console.log(copy);
}

console.log(count)
console.log(copy)