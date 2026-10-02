const students = {
    name: "John",
    age: 20,
    grade: "A",
    english: 85,
    math: 90,
    science: 80,
    getAvg() {
       // let avg= (english + math + science) // error: english, math, and science are not defined in this scope. They should be accessed  bu using 'this' keyword.
     let avg= (this.english + this.math + this.science) / 3; //this keyword se hum object(students) ke properties ko access karte hai.
        console.log(avg);
        console.log(this);//{name: 'John', age: 20, grade: 'A', english: 85, math: 90, science: 80, getAvg: ƒ}
    }
}
console.log(students.name);
console.log(students.getAvg());

function getAvg() {
    console.log(this); //this keyword will refer to the global object (window in browsers and window is object here) when used in a regular function.
}
getAvg(); 

//try and catch block

console.log("hello");
console.log("hello");
//console.log(a);//error: a is not defined //after this line, the program will stop executing and will not run the next lines of code. 
console.log("hello");
console.log("hello");


try {
    console.log(a);// ReferenceError: a is not defined
} catch  {
    console.log("shivam");
}
console.log("hello");
console.log("hello");


let b= 10;
try {
    console.log(b);// 10
} catch  {
    console.log("shivam");//try block me error nahi hai isliye catch block execute nahi hoga.
}
console.log("hello");
console.log("hello");


try {
    console.log(c);
} catch(error)  {
    console.log("shivam");//try block me error nahi hai isliye catch block execute nahi hoga.
    console.log(error);// ReferenceError: c is not defined this is not a error
}
console.log("hello");
console.log("hello");

//arrow function

const sum = (a, b) => {
    console.log(a + b);
};
console.log(sum(10, 20)); //30


const cube = (a) => {//or cube = a => a * a * a; //if there is only one parameter then we can ignore brackets.
    return a * a * a;
};
console.log(cube(3)); //27
let result = cube(4);
console.log(result); //64


const hello = () => {//hello =  => we can not write it like this. // if there is zero arguments in the function body then () is compulsory. if we remove () then it will give error.
    console.log("hello world");
}
console.log(hello()); //hello world


//arrow function (implicit return) //if there is only one statement in the function body then we can ignore {} and return keyword. it will automatically return the value.

const multiply = (a, b) =>(
     a * b
);
console.log(multiply(10, 20)); //200


//setTimeout 

console.log("hello");
setTimeout(() => {
    console.log("shivam");//after 2 seconds this line will be executed.
}, 2000);
console.log("how are you?");


//setInterval

// setInterval(() => {
//     console.log("shivendra");//every 2 seconds this line will be executed.
// }, 2000);


let id = setInterval(() => {
    console.log("rahul");//every 2 seconds this line will be executed.
}, 2000);

//console.log(id);//1 //id is the unique identifier for the interval. we can use this id to clear the interval.
//clearInterval(id);//this will stop the interval from executing. after this line, the interval will not execute anymore.

setTimeout(() => {
    clearInterval(id);//this will stop the interval from executing. after this line, the interval will not execute anymore.
    console.log("interval cleared");
}, 10000);//after 10 seconds the interval will be cleared and will not execute anymore.