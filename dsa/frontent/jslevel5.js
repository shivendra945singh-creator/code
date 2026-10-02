
function anyName() {
    console.log('SHIVAM');
}

anyName();//calling function // SHIVAM
anyName();//SHIVAM
anyName();//SHIVAM

function print1to5() {
    for(let i= 1; i<=5; i++){
        console.log(i);
    }
}

print1to5();

function isAdult(){
    let age = 34;
    if(age>=18){
        console.log("i am adult");
    }else{
        console.log("i am not adult");
    }  
}

isAdult();

//question

function rollDice() {
    let rand = Math.floor(Math.random() * 6) + 1;
    console.log(rand);
}

rollDice();//2
rollDice();//4
rollDice();//3

//function argument

function printInfo(name) {
    console.log(name);
}

printInfo("shivam");//shivam


//function argument

function printInfo(name, age) {
    console.log(name, age);
}
printInfo("shivam", 25);//shivam , 25 // if we pass only one argument like 25 then it will treat as name parameter not age parameter


function printInfo(name, age) {
    console.log(`${name} is ${age} years old`);
}
printInfo(23);//23 treat as name parameter not age parameter // jho value phele pass karege woh phele parameter mein pass hogi order matter karega

function sum(a, b) {
    console.log(a + b);
}
sum(5, 10); // 15
sum(20, 30); // 50

//question

function average(a, b, c) {
    let avg = (a + b + c) / 3;
    console.log(avg);
}
average(10, 20, 30); // 20

function printTable(n) {
    for (let i = n; i <= n*10; i += n) {
        console.log(i);
    }
}
printTable(5); // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50

//return keyword

function add(a, b) {
    return a + b;//return 15 but not print 15 because we are not calling console.log() function
}

let result = add(5, 10);//result variable mein add function ka return value store ho gaya
console.log(result); // 15


function multiply(a, b) {
    console.log("hello1");
    return a * b;//return ke baad function ka kaam khatam ho jata hai aur function ke andar ke code execute nahi hote
    console.log("hello2");//yeh line execute nahi hogi
}
console.log(multiply(10, 5)); // 50 replce kar dega multiply(10, 5)


function sum(a, b) {
    return a + b;
}
console.log(sum(sum(1,2), 10)); // 13

//question

function getSum(n) {
    let sum = 0;
    for (let i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}

console.log(getSum(5)); // 15 (1 + 2 + 3 + 4 + 5)

//create a function that retuns the concatenation of all the strings in an array

let str = ["Hello", " ", "World", "!"];

function concat(str) {
    let result = "";
    for (let i = 0; i < str.length; i++) {
        result += str[i];
    }
    return result;
}

console.log(concat(str)); // "Hello World!"

//function scope

// function calsum(a, b) {
//     let su = a + b;//this sum variable is only accessible inside the calsum function, it is not accessible outside the function
// }
// calsum(5, 10);
// console.log(su); // ReferenceError: sum is not defined (sum variable is not accessible outside the function)


let summ = 3;//this sum variable is global scope - this sum variable is accessible outside the calsum function, it is not accessible inside the function
function calsum(a, b) {
    let summ = a + b;//this sum is function scope - this sum variable is only accessible inside the calsum function, it is not accessible outside the function // if we not declare sum variable inside the function then it will take the global sum variable and change its value
    console.log(summ);
}
calsum(5, 10);
console.log(summ);//3

//block scope

{
    let x = 10; // x is only accessible within this block
}
// console.log(x); // ReferenceError: x is not defined (x variable is not accessible outside the block)

{
    var y = 20; // y is accessible outside this block
    console.log(y); // 20
}

for (let i = 0; i < 5; i++) {
    console.log(i); // 0, 1, 2, 3, 4
}
//console.log(i); // ReferenceError: i is not defined (i variable is not accessible outside the for loop block)

//lexical scope

function outerFunction() {
    let x = 10; // x is accessible within outerFunction and innerFunction
    let y = 20; // y is accessible within outerFunction and innerFunction

    function innerFunction() {
        console.log(x); // 10
        let z = 30; // z is only accessible within innerFunction
        console.log(z); // 30
    }

    innerFunction(); // calling innerFunction inside outerFunction
    //console.log(z); // ReferenceError: z is not defined (z variable is not accessible outside innerFunction)
}
outerFunction();
//innerFunction(); // ReferenceError: innerFunction is not defined (innerFunction is not accessible outside outerFunction)

//question

let greet = "hello";

function outerGreet() {
    let greet = "hi";
    console.log(greet); // "hi" (local variable)

    function innerChangeGreet() {
        console.log(greet); // "hi" (accessing the local variable from the outer function)
    }
}

console.log(greet); // "hello" (global variable)
outerGreet(); // calling outerGreet function

//function expression

let addd = function(a, b) {
    return a + b;
};
console.log(addd(5, 10)); // 15 // calling the function expression using the variable name
//console.log(addd); // error - addd has been declared


let hello = function() {
    console.log("shivam");
}
//console.log(hello); // error - hello has been declared
console.log(hello()); //shivam //calling the function expression using the variable name


let hi = function() {
    console.log("hello");
}
hi = function() {//updating the function expression using the variable name
    console.log("noooo");
}
console.log(hi()); //noooo 

//higher order function

function multipleGreet(func, count) {
    for (let i = 0; i <= count; i++) {
        func();
    }
}

let greeet = function() {
    console.log("hello");
}

multipleGreet(greeet, 3); // calling the higher order function with greeet function and count 3
//or
//multipleGreet(function() { console.log("hello")}, 3); // calling the higher order function with anonymous function and count 3


//higher order function(return)

//example of odd
let odd = function(num) {
    console.log(num % 2 != 0);
}
console.log(odd(5)); // true


function oddorEvenfactory(request) {
    if(request == "odd") {
        let odd = function(n) {
            console.log(!(n % 2 == 0));
        }
        return odd;
    } else if(request == "even") {
        let even = function(n) {
            console.log(n % 2 === 0);
        }   
        return even;
    }else  {
        console.log("invalid request");
    }
}

let request = "odd";
let oddFunction = oddorEvenfactory();
oddFunction(5); // true

//dry run

// JavaScript defines oddorEvenfactory
// The function is available to call, but its body does not run yet.

// request is set to "odd"

// let request = "odd";
// This happens before the factory is called, so request has the value "odd" when the function checks it.

// The factory function is called

// let oddFunction = oddorEvenfactory();
// Inside oddorEvenfactory, JavaScript checks:

// if (request == "odd")
// The condition is true, so it creates the odd function:

// let odd = function(n) {
//     console.log(n % 2 !== 0);
// }
// The factory returns that function. The returned function is stored in oddFunction.

// The returned function is called with 5

// oddFunction(5);
// Inside the function, n is 5. JavaScript evaluates:

// 5 % 2 !== 0
// 5 % 2 gives 1 (the remainder after dividing 5 by 2).
// 1 !== 0 is true.
// The result is printed

// console.log(true);
// That is why the output is:

// true