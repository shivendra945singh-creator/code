
//call stack

function hello() {
    console.log("inside hello fun");
    console.log("hello");
}

function demo(){
    console.log("inside demo fun");
    console.log("calling hello fun");
    hello();
}

console.log("calling demo fun");
demo();
console.log("done , bro");

//example

function one(){
    return 1;
}

function two(){
    return one() + one();
}

function three(){
    let ans = two()+one();
    console.log(ans);
}
three();

//js is single threaded(ek time par ek hi task perform hota hai js mein)
//sychronous nature means here code run line by line
let a = 23;
console.log(a);
let b = 231;
console.log(b);

//asychronous nature means here code run not line by line 
setTimeout(() => {//setTimout ka kaam  js nhi browser karta hai//after complete delay time in broser it send to js callstack than js print this
    console.log("apna college");
}, 4000);
setTimeout(() => {
    console.log("apna ");
}, 2000);
console.log("name");

//callback hell

// h1 = document.querySelector("h1");
// setTimeout(() => {
//     h1.style.color = "red";
// }, 1000);
// setTimeout(() => {
//     h1.style.color = "blue";
// }, 2000);
// setTimeout(() => {
//     h1.style.color = "green";
// }, 3000);

//optimize way


// h1 = document.querySelector("h1");
// function changeColor(color, delay) {
// setTimeout(() => {
//     h1.style.color = color;
// }, delay);
// }
// changeColor("red", 1000);
// changeColor("blue", 2000);
// changeColor("green", 3000);

//more optimize way //now we want to only  when first thing is complete then  go to next thing

// h1 = document.querySelector("h1");
// function changeColor(color, delay, nextColorChange) {
// setTimeout(() => {
//     h1.style.color = color;
//     if(nextColorChange) nextColorChange();
// }, delay);
// }
// changeColor("red", 1000, () => {
//     changeColor("blue", 1000, () => {
//     changeColor("green", 1000, () => {
//     });
//     });
// });
//above situation is called  callback nesting or callback hell

//setting up for promises

// function savetoDb(data) {
//     let internetSpeed = Math.floor(Math.random()*10 ) + 1;
//     if(internetSpeed > 4) {
//         console.log("your data was saved :", data);
//     }else{
//         console.log("weak connection data not saved");
//     }
// }
// savetoDb("apna college");

//optimize way

// function savetoDb(data, success, failure) {
//     let internetSpeed = Math.floor(Math.random()*10 ) + 1;
//     if(internetSpeed > 4) {
//         success();
//     }else{
//         failure();
//     }
// }
// savetoDb(
//     "apna name",
//     () => {//success callback (means success function pass as argument )
//         console.log("success your data was stored");
//     },
//     () => {//failure callback
//         console.log("failure your data was not stored");
//     }
// );

//more ex

// function savetoDb(data, success, failure) {
//     let internetSpeed = Math.floor(Math.random()*10 ) + 1;
//     if(internetSpeed > 4) {
//         success();
//     }else{
//         failure();
//     }
// }
// savetoDb(
//     "apna name",
//     () => {//success callback (means success function pass as argument )
//         console.log("success your data was stored");
//         savetoDb(
//             "shivam",
//             () => {
//                 console.log("awesome data 2 is saved");
//             },
//             () => {
//                 console.log("failure data 2 is  not saved");
//             },
//         );
//     },
//     () => {//failure callback
//         console.log("failure your data was not stored");
//     }
// );
//above function are depends on other if condition is true then excecute futher otherwise stop
//above situation is callback hell

//now we see promise

function savetoDb(data) {
  return new Promise((resolve, reject) => {//resolve is success and reject is failure
    let internetSpeed = Math.floor(Math.random()*10 ) + 1;
    if(internetSpeed > 4) {
        resolve("success data was saved");
    }else{
        reject("failed data was not saved");
    }
  });   
}
savetoDb("hero");