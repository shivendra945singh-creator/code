
//for loop
for(let i = 1; i<=5; i++){
    console.log(i);
}

for(let i = 5; i>=1; i--){//backward
    console.log(i); 
}

let i =2;
console.log(i); //i  is not found if we dont write let i =2; // i in for loop is valid only in for loop

for(let i = 1; i<=15; i=i+2){
    console.log(i); 
}

for(let i = 15; i>=1; i=i-2){ //backward
    console.log(i); 
}

for(let i = 2; i<=10; i=i+2){
    console.log(i); 
}

for(let i = 5; i<=50; i=i+5){
    console.log(i); 
}

//question
// let n = prompt("write your number");
// n = parseInt(n);

// for(let i=n; i<=n*10; i=i+n){
//     console.log(i);
// }

//infinte loops

// for(let i = 1; i>=0; i++){
//     console.log(i); 
// }

// for(let i = 1; ; i=i+2){
//     console.log(i); 
// }

//nested for loop

for(let i=1; i<=3; i++) {
    console.log(`outer loop ${i}`);  
  for(let j=1; j<=3; j++) {
    console.log(`inner loop ${j}`);
  }
}

//while loop

let j =1;
while(j<=5) {
    console.log(j);
    j++;//if not write this condition will always true and code execute infinitly
    
}

let k =1;
while(k<=5) {
    console.log(k);
    k=k+2;
}

//question

// const favmovie = "avatar";
// let guess = prompt("guess my fav movie");
// while((guess != favmovie) && (guess != "quit")) {
//    guess = prompt("wrong guess. pls try again");
// }

// if(guess == favmovie) {
//     console.log("congrates");
// }else{
//     console.log("u quit");
// }

//break statment

let a =1;
while(a<=5) {
    if(a == 3){
        break;
    }
    console.log(a);
    a++;
}

//loops with arrays

let fruits =  ["mango", "apple", "banana", "litichi", "orange"];
for(let i = 0; i<fruits.length; i++) {
    console.log(i, fruits[i]);
}

let fruit =  ["mango", "apple", "banana", "litichi", "orange"];
for(let i = fruit.length; i>=0; i--) {//reverse
    console.log(i, fruit[i]);
}

//loops with nested array

let heroes = [["ironman", "spiderman", "thor"], ["superman", "wonder woman", "flash"]];

for(let i = 0; i<heroes.length; i++){// for outer array
    console.log(i, heroes[i], heroes[i].length);
    for(let j=0; j<heroes[i].length; j++){//for inner array
        console.log(`j=${j}, ${heroes[i][j]}`);
    }
}

let stud = [["aman", 32], ["shivam", 45], ["rahul", 44]];

for(let i = 0; i<stud.length; i++){// for outer array
    console.log(`info of student #${i}`);
    for(let j=0; j<stud[i].length; j++){//for inner array
        console.log(stud[i][j]);
    }
}

//for of loop

let frui = ["mango", "mang", "man", "ma"];

for(fruits of frui){
    console.log(fruits);
}

for(char of "appanacollege"){
    console.log(char);
}

let heroe = [["ironman", "spiderman", "thor"], ["superman", "wonder woman", "flash"]];
for(heroes of heroe){
    console.log(heroes);
}

//nested for of loop

let heroess = [["ironman", "spiderman", "thor"], ["superman", "wonder woman", "flash"]];
for(heroes of heroess){
    for(jja of heroes){
      console.log(jja);
    } 
}
