

let jsonresponse = `{"fact":"The Ancient Egyptian word for cat was mau, which means \"to see\".","length":64}`;
console.log(jsonresponse);
console.log(jsonresponse.fact);//here eroor will come bcz jsonresponse is a string and we are trying to access the property of string which is not possible. So we need to convert the string into object using JSON.parse() method.
let validres = JSON.parse(jsonresponse);
console.log(validres.fact);

//stringify method is used to convert the object into string.
let str = {
    name:"shivesh",
    age:22,
    city:"delhi"
};
JSON.stringify(str);
console.log(str);
