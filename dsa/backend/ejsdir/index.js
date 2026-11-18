
const express = require('express');
const app = express();
const path = require("path");

const port = 8080;

app.set("view engine", "ejs");
app.set("views", path.join(__dirname,"/views"));


app.get("/", (req, res) => {
   // res.send("Hello World!");//not write this//print in browser
   res.render("home.ejs");//"home" also valid //rendering the ejs file //show in browser
});

app.get("/home", (req, res) => {//write in localhost:8080/home in browser
   res.send("hello");// show hello in browser //but when we go to  root directory localhost:8080 it will show error //because hamare  code ko views directory ke andar home.js dik hi nhi rha //bydefault humara code views directory ko /backend/views ke andar search kar rha h means jha se server run hua hai waha woh views ko search kar rha h //index.js ke through  humne server run kya hai //uske parent folder ejsdir  ke andar views search nhi ho rha views waha search ho rha jha se humara server run hua hai yahni backend directory ke andar
});

//**passing data to ejs 

// app.get("/rooldice", (req, res) => {//write in localhost:8080/rooldice in browser
//    res.render("rooldice.ejs");  // send file data of rooldice.ejs on browser //this file is in views
// });
//or more optimize way
// app.get("/rooldice", (req,res) => {//write in localhost:8080/rooldice in browser
//    let diceVal = Math.floor(Math.random()*6) + 1; //assume kar liya jho ye random number ha rha hai ye kisi database se haya hoga aur uski value humne diceval  variable mein store karli
//    res.render("rooldice.ejs",{num: diceVal});//diceval ki value  pass kardi num ko // send file data of rooldice.ejs on browser
//     or
//    res.render("rooldice.ejs",{ diceVal});//{diceVal: diceVal} both key and value name same lik sakte hai aur agar same likhi to 2 baar nhi likege sirf ek baar likege like diceval //rooldice.ejs mein num ki jage diceval likna padega //generally hum ese hi likege
// });

//**instagram activity

app.get("/ig/:username", (req, res) => {//ig/anyname 
   let {username} = req.params; // anyname store in username
   console.log(username);//show in terminal
   res.render("instagram.ejs", {username});
})

//loops in ejs file

app.get("/rooldice", (req,res) => {//write in localhost:8080/rooldice in browser
   const followers = ["shivam", "karan", "angel"];
   let num = Math.floor(Math.random()*6) + 1; 
   res.render("rooldice.ejs",{ num , followers}); //num and followers ki values send kardi
});


app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);//show in terminal 
});