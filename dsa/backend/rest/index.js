// const express = require("express");//express package require kar liya
// const app = express();//express execute
// const port = 8080;
// const path = require("path") //views and public folder ko  index.js mein use karne ke liye path ko require karna padega

// app.use(express.urlencoded({ extended: true }));// agar kisi bhi request mein urlencoded data aata hai toh express automatically parse karke samaj lega

// app.set("view engine", "ejs");//sets ejs as the template engine to render html pages
// app.set("views", path.join(__dirname, "views"));//express ko bataya ki saari ejs files views folder ke andar hain

// app.set(express.static(path.join(__dirname, "public")));//express ko bataya ki saari static files like css,js  public  folder ke andar hain

// app.get("/", (req, res) => { 
//     res.send("serving working well");
// })
// app.listen(port, () => {
//     console.log("listening to port : 8080");
// });

//**implement get/posts

// const express = require("express");//express package require kar liya
// const app = express();//express execute
// const port = 8080;
// const path = require("path") //views and public folder ko  index.js mein use karne ke liye path ko require karna padega

// app.use(express.urlencoded({ extended: true }));// agar kisi bhi request mein urlencoded data aata hai toh express automatically parse karke samaj lega

// app.set("view engine", "ejs");//sets ejs as the template engine to render html pages
// app.set("views", path.join(__dirname, "views"));//express ko bataya ki saari ejs files views folder ke andar hain

// app.use(express.static(path.join(__dirname, "public")));//express ko bataya ki saari static files like css,js  public  folder ke andar hain

// let posts = [
//     {
//         username : "shivam",
//         content : "I love coding"
//     },
//     {
//         username : "shradha",
//         content : "hard work"
//     },
//     {
//         username : "rahul",
//         content : " i got selected"
//     },
// ];

// app.get("/posts", (req, res) => { //jo resource(posts) ka name tha  wahi name api  ko diya hai  
//     res.render("index.ejs", {posts});
// })

// app.listen(port, () => {
//     console.log("listening to port : 8080");
// });

//**implement post/posts

const express = require("express");
const app = express();
const port = 8080;
const path = require("path") ;

app.use(express.urlencoded({ extended: true }));

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));

app.use(express.static(path.join(__dirname, "public")));

let posts = [
    {
        username : "shivam",
        content : "I love coding"
    },
    {
        username : "shradha",
        content : "hard work"
    },
    {
        username : "rahul",
        content : " i got selected"
    },
];

app.get("/posts", (req, res) => { 
    res.render("index.ejs", {posts});
});

app.get("/posts/new", (req, res) => {
    res.render("createpost.ejs");
})

app.listen(port, () => {
    console.log("listening to port : 8080");
});