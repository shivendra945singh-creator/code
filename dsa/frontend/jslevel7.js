
//forEach method

let array = [1, 2, 3, 4, 5];

let print = function(el) {
    console.log(el);
};

array.forEach(print);

//or

let  arrays = [2, 4, 6, 8, 10];

arrays.forEach(function(el) {
    console.log(el);
});

//or

let arr = [1, 2, 3, 4, 5];

function prints(el) {
    console.log(el);
}

arr.forEach(prints);

//dry run

// let arr = [1, 2, 3, 4, 5];
// Creates an array named arr containing five numbers, in order.

// function print(el) {
//     console.log(el);
// }
// Defines a function named print. It accepts one argument, el, and prints that value to the console.

// arr.forEach(print);
// forEach visits each array element in order and calls print with that element:

// el is 1 → prints 1
// el is 2 → prints 2
// el is 3 → prints 3
// el is 4 → prints 4
// el is 5 → prints 5

//or

let my = [5, 10, 15, 20, 25];
my.forEach((el) => {
    console.log(el);
});

//or

let stu = [{
    name: "aman",
    marks: 23,
},
{
    name: "shivam",
    marks: 45
},
{
    name: "lalu",
    marks: 42
},
];

stu.forEach((student) => {
    console.log(student.marks);
    console.log(student.name);
    console.log(student);
});

//map method

let num = [ 2, 3, 4, 5, 6];

let dou = num.map((el) => {
    return el * 2;
});

console.log(dou);

//or

let numbers = [1, 2, 3, 4, 5];

let double = numbers.map(function(el) {//doube array size is same as numbers array size
    return el * 2;
});

console.log(double);


let stud = [{
    name: "aman",
    marks: 23,
},
{
    name: "shivam",
    marks: 45
},
{
    name: "lalu",
    marks: 42
},
];

let gpa = stud.map((el) => {
    return el.marks / 10;
});

console.log(gpa);

//filter method

let nums = [1,2 ,3,4,5,6,7,8,9,10];

let even = nums.filter((el) => {
    return el % 2 === 0;//filter
});

console.log(even);

//every method - gives true or false 

let positive = nums.every((el) => el%2 ==0);//even condition // if every elements follow this conditon then only print true otherwise false
console.log(positive);

//sum method - gives true or false 

let i = nums.some((el) => (el%2 == 0 )); // if  all or some elements follow this condition then it will print true otherwise false
console.log(i);

//reduce method - reduce the array to a single value

let j = nums.reduce((acc, el) => acc + el );
console.log(j);

//or
let k = [1, 2, 3, 4, 5];
let finalVal = k.reduce((acc, el) => {
    console.log(acc);
    return acc + el;
});
console.log(finalVal);

//ques finding maximum in an array

let result = k.reduce((max, el) => {
    if(el > max) {
        return el;
    }else{
        return max;
    }
});
console.log(result);

//ques check if  all numbers in our array are multiple of 10 or not

let ar = [ 10, 20, 3];

let ans = ar.every((el) => el%10 == 0);
console.log(ans);

// create a function to find the min number in an array

// let res = k.reduce((min, el) => {
//     if( min < el) {
//         return min;
//     }else{
//         return el;
//     }
// });
// console.log(res);


function getMin(ka) {
    let min = ka.reduce((min, el) => {
    if( min < el) {
        return min;
    }else{
        return el;
    }
});
  return min;
}

let ka = [ 10, 20, 3];
getMin(ka);

//default parameters - giving a dafault value to a parameter 

function greet(name, greeting = "Hello") {
    console.log(`${greeting}, ${name}!`);
}

greet("Alice");

function sum(a, b = 2) {
    return a + b;
}
console.log(sum(5)); // Output: 7 // if we pass only one parameter then a is 5 and b is default value 2 so 5+2=7
console.log(sum(5, 3)); // Output: 8 //a is 5 and b is 3 so 5+3=8 // if we pass both parameters then it will take the value of b as 3 instead of default value 2

function summ(a = 2, b) {
    return a + b;
}
console.log(sum(1, 2));//a=1 b = 2
console.log(sum(1));// a = 1  b = undefined


function multiply(a, b ) {
    return a * b;
}
console.log(multiply(5)); // Output: NaN // if we pass only one parameter then a is 5 and b is undefined so 5*undefined=NaN

//spread(apply on arrays and string) - expands an iterable(iterate) into multiple values

let t = [2, 3, 4, 6];
console.log(t);// pura array print hoga
console.log(...t);// elements individually print hoge 
console.log("sppdhkd");
console.log(..."sppdhkd");

//spread with array literals

let char = ["hello"];
let newchar = [..."hello"];
console.log(newchar);

let arra = [ 2, 3, 4, 2];
let newarr = [...arra];
console.log(arra);
newarr.push(0);
console.log(newarr);

let odd = [1, 3, 5, 7];
let evenn = [2, 4, 6, 8];

let total = [...even, ...odd];
console.log(total);


//spread with object literals

let data = {
    email: "shivendra@gmail.com",
    password: 123,
};
let dataCopy = {...data};//hera data object keys and values are copy in datacopy
console.log(dataCopy);

let newCopy = {...data, id: 321};//here data object keys and values are copy in newCopy and new keys and values are also add in newcopy
console.log(newCopy);

let obj = {..."hello"};//by deafult key is index  and  char is value
console.log(obj);

let arrayss = [2, 3, 1, 2];
let obj1 = {...arrayss};
console.log(obj1);


//rest - allows a function to take an indefinite number of arguments and bundle them in an array

function sum(...args) {
    for(let i = 0; i<args.length; i++){
        console.log("u gave us:" , args[i]);
    }
}
sum(1);
sum(1, 3);












//destructuring - storing values of array into multiple varibles

let names = ["shivam", "m", "k", "lalu", "h", "f", "w"];
let [winner , looser, mahalosser, ...others] = names;
console.log(winner);//shivam
console.log(looser);//m
console.log(looser, mahalosser);//m k
console.log(others);

//destructing(objects)

const student = {
    name: "shivam",
    age: 12,
    class: 3,
    subjects: ["hindi", "english", "math" ],
    username: "karan@123",
    password: "123",
};

let {username, password} = student;//keys name hi likne padegi and keys value print hogi
//let {user, pass} = student;//error user and pass key are not in student object
console.log(username);
console.log(password);

let {name: user, subjects: secret} = student;//write key name and its value is stored in varible name user 
console.log(user);// if we write key name then error will come
console.log(secret);

let{age: noo, password: secrdet, city="mumbai"} = student;
console.log(city);//if city = "pune " is exist in student then pune will print // city of student will get higher priority order