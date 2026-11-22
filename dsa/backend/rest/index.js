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

// //**implement post/posts

// const express = require("express");
// const app = express();
// const port = 8080;
// const path = require("path") ;

// app.use(express.urlencoded({ extended: true }));

// app.set("view engine", "ejs");
// app.set("views", path.join(__dirname, "views"));

// app.use(express.static(path.join(__dirname, "public")));

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

// app.get("/posts", (req, res) => { 
//     res.render("index.ejs", {posts});
// });

// app.get("/posts/new", (req, res) => { //when we enter , enter username = shiv and write your post = jdlsj  this data show in browser url 
//     res.render("createpost.ejs"); //get request mein query(url) mein information hoti hai
// });

// // app.post("/posts", (req, res) => { //app.use ka kaam hoga ki yeh "/posts" pe  ek new post request accept karega //post request mein req.body mein information aati hai jo hum form mein data fill karte hai
// //     console.log(req.body); //show in terminal like { username: 'jkb', content: 'as' }
// //     res.send("post request working");
// // });
// //or
// app.post("/posts", (req, res) => { //jaise hi form ko submit kya toh usne ek post request baji /posts ko jiska kaam ho add the new post
//    let {username, content} = req.body;
//    posts.push({ username, content });
//     console.log(req.body); 
//    // res.send("post request working"); //dusra page open hota jisme ye lika hota
//     res.redirect("/posts");//jaisse hi form submit kara toh /posts pe haa gye kisi dusre page pe nhi gya 
// });

// app.listen(port, () => {
//     console.log("listening to port : 8080");
// });


//**implement Get /posts/:id 

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
        id : "1a",
        username : "shivam",
        content : "I love coding"
    },
    {
        id : "2b",
        username : "shradha",
        content : "hard work"
    },
    {
        id : "3c",
        username : "rahul",
        content : " i got selected"
    },
];

app.get("/posts", (req, res) => { 
    res.render("index.ejs", {posts});
});

app.get("/posts/new", (req, res) => { 
    res.render("createpost.ejs"); 
});

app.post("/posts", (req, res) => { 
   let {username, content} = req.body;
   posts.push({ username, content });
    console.log(req.body); 
    res.redirect("/posts");
});

// app.get("/posts/:id", (req, res) => { //search /posts/1a 
//    let { id } = req.params;
//     console.log(id); //show in terminal
//     res.send("req working");//show in browser
// });
//or
// app.get("/posts/:id", (req, res) => { //search /posts/1a 
//    let { id } = req.params;
//     let post = posts.find((p) => id === p.id);//jaise hi posts ki id aur humne jo id de hai equal ho gayege woh post variable mein store ho jayega
//     console.log(post);//show in terminal like { id: '1a', username: 'shivam', content: 'I love coding' }
//     res.send("req working");//show in browser
// });
//or
app.get("/posts/:id", (req, res) => { //search /posts/1a 
   let { id } = req.params;
    let post = posts.find((p) => id === p.id);//ab agar galat id daluga ko error haiga
    res.render("detailpost.ejs", {post});
});

app.listen(port, () => {
    console.log("listening to port : 8080");
});