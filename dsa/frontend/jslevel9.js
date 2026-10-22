
//onclick

// let btn = document.querySelector("button ");
// console.dir(btn);
// btn.onclick = function() {
//     console.log("hi");
// }
//or
// function sayHello() {
//     console.log("hi");
// }
// btn.onclick = sayHello;

//onmouseenter

let btn = document.querySelector("button ");
console.dir(btn);
btn.onmouseenter = function() {
    console.log("u hover a mouse");
}

// to select all buttons do this

// let btns = document.querySelectorAll("button");
// for(btn of btns) {
//     btn.onclick = sayHell;
// }
// function sayHell() {
//     alert("hello");
// }

//EventListner

// let btns = document.querySelectorAll("button");
// for(btn of btns) {
//     btn.addEventListener("click", sayHello);
//     btn.addEventListener("click", sayName);
// }
// function sayHello() {
//     alert("hello");
// }
// function sayName() {
//     alert("ok");
// }

let p = document.querySelector("p");
p.addEventListener("click", function(){
  console.log("para was clicked");
})

let box = document.querySelector(".box");
box.addEventListener("mouseenter", function(){
  console.log("mouse inside div");
})

//this

let butto = document.querySelector("button");
butto.addEventListener("click", function() {
    console.log(this);//this = button object
    console.dir(this);//button object print 
    console.dir(this.innerText);
    this.style.backgroundColor = "green";
});

// more example of this

