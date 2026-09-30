let student = {
    name: "shivam",
    age: 23,
    marks: 233
};
// console.log(student);

const item = {
    price: 234,
    discount: 34,
    colors: ["red", "yellow"]
};

//question

let post = {
    username: "@shivam",
    likes: 23,
    reposts: 3,
    tags: ["@killshot gamer "]
};

//get values 

console.log(post["likes"])//here like is not string it is a key
//or
console.log(post.likes);

console.log(item.colors[0]);//red

let obj = {//we generally prefer that keys are in string format
    1: "a",
    2: "b",
    null: "noo"
};
console.log(obj[1]);//a // but when we use obj.1 error will come because [] convert numerical  keys into string  and then that srting will search 1: "a"

//add or update values

let stud = {
    name: "shivam",
    age: 23,
    marks: 233
};

stud.name = "kartik";//update
stud.age = 'v';//update
stud.city = "bhind";//add
console.log(stud);
delete stud.age;//delete
console.log(stud);

//object of objects

const classInfo = {
    aman: {
        grade: "A",
        city: "delhi"
    },
     a: {
        grade: "c",
        city: "ker"
    },
     shivam: {
        grade: "b",
        city: "mum"
    }
};

console.log(classInfo);
console.log(classInfo.aman);
console.log(classInfo.aman.city);
classInfo.aman.city = "goa";
console.log(classInfo);

//array of objects

const classInfos = [
    {
        grade: "A",
        name: "aman",
        city: "delhi"
    },
    {
        grade: "c",
        name: "kartik",
        city: "ker"
    },
    {
        grade: "b",
        name: "shiv",
        city: "mum"
    }
];

console.log(classInfos);
console.log(classInfos[0]);
console.log(classInfos[0].name);
console.log(classInfos[0].gender="male");
console.log(classInfos);

//math object

//properties
console.log(Math.E); // 2.71828
console.log(Math.PI); // 3.14159265

//methods
console.log(Math.abs(-23.4));//for positive real number
console.log(Math.pow(2, 5));
console.log(Math.floor(-23.4));//-24 //give roundoff integer number which is <= than original number
console.log(Math.floor(5.999999999));//5
console.log(Math.ceil(5.999999999));//6 //give roundoff integer number which is >= than original number
console.log(Math.ceil(5.1));//6
console.log(Math.ceil(5));//5
console.log(Math.random());//0.97810467 // give random value from 0 to 1 but 1 is not including
console.log(Math.random());//0.518