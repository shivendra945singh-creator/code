
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