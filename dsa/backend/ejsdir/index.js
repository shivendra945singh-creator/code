
//** using ejs 
//   when we run our code inside ejsdir folder like  nodemon index.js //here index.js and home.ejs are files 

// backend
//  └── ejsdir            <-- parent of index.js (and of views)
//       ├── views        <-- parent of home.ejs (Express checks here by default)
//       │    └── home.ejs
//       └── index.js

// directory means folder

// const express = require('express');
// const app = express();

// const port = 8080;

// app.set("view engine", "ejs");

// app.get("/", (req, res) => {
//   // res.send("Hello World!");//print in browser // only one responce send at a time  for / route such as res.send() or res.render()
//    res.render("home.ejs");//"home" also valid //rendering the ejs file //show in browser  // ​When you write res.render("home.ejs"), you don't have to write views/home.ejs because Express already assumes your .ejs files are kept inside a folder named views. 
                                                                                             // ​So when res.render("home.ejs") runs, Express checks the views folder in the directory where you started your server (your ejsdir folder), finds home.ejs inside it, and sends that page to the browser
// });

// app.get("/home", (req, res) => {//write in localhost:8080/home in browser
//    res.send("hello");// show hello in browser //but when we go to  root directory localhost:8080 it will show error //because hamare  code ko views directory ke andar home.js dik hi nhi rha //bydefault humara code views directory ko /backend/views ke andar search kar rha h means jha se server run hua hai waha woh views ko search kar rha h //index.js ke through  humne server run kya hai //uske parent folder ejsdir  ke andar views search nhi ho rha views waha search ho rha jha se humara server run hua hai yahni backend directory ke andar
// });

//if we run our code from  backend directory  like  /backend => nodemon ejsdir/index.js error will come 

// Where views actually lives: Your views folder is inside ejsdir (backend/ejsdir/views/home.ejs), not directly inside backend (backend/views/home.ejs).  
// ​Result: Because Express checks backend/views instead of backend/ejsdir/views, it cannot find home.ejs and throws the lookup error.

// to solve this promblem we use this 
// ​ path.join(__dirname, "views") so Express always looks relative to index.js's own folder (ejsdir), no matter which directory your terminal is in

const express = require('express');
const app = express();
const path = require("path");

const port = 8080;

app.set("view engine", "ejs");
app.set("views", path.join(__dirname,"/views")); // Here, _dirname always points to .../backend/ejsdir, so path.join(_dirname, "views") always resolves to .../backend/ejsdir/views.

app.get("/", (req, res) => {
   res.render("home.ejs");//"home" also valid //rendering the ejs file //show in browser
});

app.get("/home", (req, res) => {//write in localhost:8080/home in browser
   res.send("hello");// show hello in browser //but when we go to  root directory localhost:8080 it will show error //because hamare  code ko views directory ke andar home.js dik hi nhi rha //bydefault humara code views directory ko /backend/views ke andar search kar rha h means jha se server run hua hai waha woh views ko search kar rha h //index.js ke through  humne server run kya hai //uske parent folder ejsdir  ke andar views search nhi ho rha views waha search ho rha jha se humara server run hua hai yahni backend directory ke andar
});

//**passing data to ejs 

app.get("/rooldice", (req, res) => {//write in localhost:8080/rooldice in browser
   res.render("rooldice.ejs");  // send file data of rooldice.ejs on browser //this file is in views
});
//or more optimize way
app.get("/rooldice", (req,res) => {//write in localhost:8080/rooldice in browser
   let diceVal = Math.floor(Math.random()*6) + 1; //assume kar liya jho ye random number ha rha hai ye kisi database se haya hoga aur uski value humne diceval  variable mein store karli
   res.render("rooldice.ejs",{num: diceVal});//diceval ki value  pass kardi num ko // send file data of rooldice.ejs on browser
    or
   res.render("rooldice.ejs",{ diceVal});//{diceVal: diceVal} both key and value name same lik sakte hai aur agar same likhi to 2 baar nhi likege sirf ek baar likege like diceval //rooldice.ejs mein num ki jage diceval likna padega //generally hum ese hi likege
});

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