//str.trim();

// let msg = "   hel  lo   ";//"hel  lo"
// let value = msg.trim();
// console.log(value);
// // console.log(msg);//original string never change after trim // trim never make changes in original string it create a new string and make changes on it.


// let pass = prompt("set your password");
// console.log(pass.trim());//now we can not take spaces in password in starting and ending


// str.toUpperCase(); //original string remains same
// let nam = "shivam";//SHIVAM
// console.log(nam.toUpperCase());

// str.indexOf();  //original string remains same
// console.log(nam.indexOf("v"));//3


//method chaining  //original string remains same
// console.log(nam.toLowerCase().indexOf("4"));//-1 // firstly shivam is converted in lowercase and then in that lowercase we find indexOf("4")
// console.log(nam);//shivam


//str.slice(); //original string remains same
// console.log(nam.slice(0 , 4));//shiv // 4 is not included
// console.log(nam.slice(0 , nam.length));//shivam // for ending index we can use nam.length not nam.length()
// console.log(nam.slice(-2));//am // 6-2=>4 to nam.length-1=>5 //4 to 5 => am
// //or
// console.log(nam.slice(nam.length-2));//am
// console.log(nam);


// str.replace();  //original string remains same
// let college = "apnaapnaapna";
// console.log(college.replace("apna", "my"));//myapnaapna //it will replace only first occurence elements


//str.repeat();  //original string remains same
// console.log(nam.repeat(3));//shivamshivamshivam


// question
// let colle = "apnacollege";
// console.log(colle.slice(4).replace("l","t").replace("l","t"));//cottege


// arrays // are mutable

// let arr = [1,2,4,5];//typeof arr is obect in js not array
// console.log(arr);
// console.log(arr[0]);//1
// console.log(arr.length);//4


// let info = ["aman", 23, 6.3];//mixed array // in js is valid but in java is not valid
// console.log(info);
// console.log(info[0][0]);//a // firstly 0th index value aman then its 0th value i.e a


// let ar = [];
// console.log(ar);//[]
// console.log(ar.length);//0
// console.log(ar[0]);//undefined


// let fruits = ["mango" ,"apple" , "nothing"];
// fruits[0] = "banana";
// console.log(fruits);//"banana" ,"apple" , "nothing" // arrays are mutable means changes happen in original array no new array will created for changes 
// fruits[10] = "samsung";
// console.log(fruits);//["mango" ,"apple" , "nothing", empty x 7, "samsung"]
// console.log(fruits.length);//11

// arrays methods

// console.log(fruits.push("noo"));//12 //.push() add element at last 
// console.log(fruits);//["mango" ,"apple" , "nothing", empty x 7, "samsung","noo"]

// console.log(fruits.pop());//noo  //.pop() remove  element from last
// console.log(fruits);//["mango" ,"apple" , "nothing", empty x 7, "samsung"]

// console.log(fruits.unshift("kit"));//12  //.unshift() add element at starting
// console.log(fruits);//["kit", "mango" ,"apple" , "nothing", empty x 7, "samsung"]

// console.log(fruits.shift("kit"));//kit  //.shift() remove element from  starting
// console.log(fruits);//[ "mango" ,"apple" , "nothing", empty x 7, "samsung"]

// example
// let followers = ["a", "b", "c"];
// let blocks = followers.shift();
// console.log(followers);//[ "b", "c"]
// console.log(blocks);//a // if we dont print this line add print only console.log(flowers); => ['b','c']

// question

// let start = ["jan", "fab", "mar", "apr"];
// console.log(start.shift());//jan
// console.log(start.shift());//feb
// console.log(start.unshift("oct"));//3 size  hogya array ka 
// console.log(start);// ["oct", "mar", "apr"]
// console.log(start.unshift("dec"));//4
// console.log(start);//["dec", "oct", "mar", "apr"]


// arr.indexOf
// console.log(start.indexOf("dec"));//0
// console.log(start.indexOf("jan"));//-1


// arr.includes
// console.log(start.includes("dec"));//true
// console.log(start.includes("jan"));//false


// arr.concat(); //adding 2 different arrays
// console.log(followers.concat(start)); //[ "b", "c", "dec", "oct", "mar", "apr"]


// arr.reverse(); //chanes apply on original array no new array formed
// console.log(start.reverse());//["apr", "mar", "oct", "dec"]
// console.log(start);//["apr", "mar", "oct", "dec"]


// arr.slice(); //original array remains same
// console.log(start.slice());//["apr", "mar", "oct", "dec"]
// console.log(start.slice(1));//[ "mar", "oct", "dec"] // changes happen in new array // original array remains same 
// console.log(start.slice(-1));//3-1=>2 //dec
// console.log(start);//["apr", "mar", "oct", "dec"]


// arr.splice();   //original array will affected
// let cars = ["audi","bmw","xuv","maruti"];
// console.log(cars.splice(3));//maruti
// console.log(cars);//["audi","bmw","xuv"];
// console.log(cars.splice(0, 2));// oth index se 2 element delete kardo //["audi","bmw"];
// console.log(cars);//["xuv"]
// console.log(cars.splice(0,0, "toyoto" ,"fam", "ndkl"));//0 element se start karna hai add aur next 0 say we dont want nothing delete
// console.log(cars);//[ "toyoto" ,"fam", "ndkl", "xuv"]
// console.log(cars.splice(0,1, "p" ,"l", "m"));//["toyoto"]
// console.log(cars);//[ "p" , "l" , "m" ,"fam", "ndkl", "xuv"]
// console.log(cars.splice(1,0, "b"));
// console.log(cars);//[ "p" ,"b", "l" , "m" ,"fam", "ndkl", "xuv"]
// console.log(cars.splice(2,1, "x"));//l will replace by x
// console.log(cars);//[ "p" ,"b", "x" , "m" ,"fam", "ndkl", "xuv"]


//arr.sort();   //original array will affected   // sort in alphabetically
// console.log(cars.sort()); //["b", "fam", "m", "ndkl", "p","x","xuv"]
// console.log(cars); //["b", "fam", "m", "ndkl", "p","x","xuv"]


// let numm = [12,13,4,2,5];
// console.log(numm.sort());//[12,13,2,4,5] //not in ascending order becuase number firstly convert in string then sorting will happen

// question
// let starts = ["jan", "fab", "mar", "apr"];
// console.log(starts.splice(0, 2, "may", "june"));//jan and fab delete
// console.log(starts);//["may", "june", "mar", "apr"];

// nested arrays

// let nums = [[1,2], [4,5], [6,3]];
// console.log(nums);//[[1,2], [4,5], [6,3]]
// console.log(nums.length);//3
// console.log(nums[0]);//[1,2]
// console.log(nums[0].length);//2
// console.log(nums[0][0]);//1