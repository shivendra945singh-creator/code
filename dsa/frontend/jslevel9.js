
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

// let h1 = document.querySelector("h1");
// let h2 = document.querySelector("h2");

// h1.addEventListener("click", function() {
//   console.log(this.innerText);
//   this.style.backgroundColor = "red";
// });

// h2.addEventListener("click", function() {
//   console.log(this.innerText);
//   this.style.backgroundColor = "red";
// });

//or - reduce redundancy   means not write same things again and again

 let h1 = document.querySelector("h1");
 let h2 = document.querySelector("h2");

function changeColor() {
  console.log(this.innerText);
  this.style.backgroundColor = "red";
}

h1.addEventListener("click", changeColor);
h2.addEventListener("click", changeColor);

//keyboard events

let inp = document.querySelector("input");
inp.addEventListener("keydown", function(){
  console.log("key was pressed");
});
inp.addEventListener("keyup", function(){
  console.log("key was released");
});

//more

let inpu = document.querySelector("input");
inpu.addEventListener("keydown", function(event) {
  console.log("key= ", event.key);
  console.log("code=", event.code);
  console.log("key was pressed");
});

//pointerEvent and keyboardEvent

let btnn = document.querySelector("button ");
btnn.addEventListener("click", function(event) {
  console.log(event);//show pointerEvent
  console.log("button is click");
});

let btnnn = document.querySelector("button ");
btnnn.addEventListener("keydown", function(event) {
  console.log(event);//show pointerEvent
  console.log("button is click");
});

// more example

let inpp = document.querySelector("input");
inpp.addEventListener("keydown", function(event) {
  console.log("code =", event.code);
  if(event.code == "arrowup") {
    console.log("CHACTER MOVES FORWARD");
  } else if(event.code == "arrowdown") {
    console.log("CHACTER MOVES downWARD");
  } else if(event.code == "arrowleft") {
    console.log("CHACTER MOVES left");
  } else if(event.code == "arrowright") {
    console.log("CHACTER MOVES right");
  }
});
