
//**Get & Post request

// const express = require("express");
// const app = express();
// const port = 8080;

// app.get("/register", (req, res) => { //get request ko accept karne ke liye app.get use karte hai // get request ko accept karuga "/register route par , "/register" ko form mein likha tha and form "/request" mein submit hoga url mein "/register" show hoga
//     let {user, password} = req.query;//jo form mein data send kar rhe hai woh req.qurery se collect kar sakte hai 
//     res.send(`standard get response .  Welcome${user} your password is ${password}`);
// });

// // app.post("/register", (req, res) => { //post request ko accept karne ke liye post.get use karte hai
// //     res.send("standard post request");
// // });

// app.listen(port, () => {
//     console.log(`listening to port ${port}`);
// });

// //** handling post request 
// //post data ka data collect karne ke liye

const express = require("express");
const app = express();
const port = 8080;

app.use(express.urlencoded({extended: true})); // agar kisi bhi request mein urlencoded data aata hai toh express automatically parse karke samaj lega // app.use is work for all type of request like get, post, put etc. 
app.use(express.json());//when we pass json data in form , with the help of this line express is capable to understand json data 

app.get("/register", (req, res) => { //get request ko accept karne ke liye app.get use karte hai // get request ko accept karuga "/register route par , "/register" ko form mein likha tha and form "/request" mein submit hoga url mein "/register" show hoga
    let {user, password} = req.query;//jo form mein data send kar rhe hai woh res.qurery se collect kar sakte hai 
    res.send(`standard get response .  Welcome${user} your password is ${password}`);
});

app.post("/register", (req, res) => {
   console.log(req.body); //res.body mein form ka data hai //form mein post data fill kya toh terminal mein show hua 'undefined' //undefined print hua kuki express ko nhi samaj ha rha ki hum kya data send kar rha hai , toh iss data ko express ko readable karne ke liye pass karna padega // after write this in above line app.use(express.urlencoded({extended: true})); show in terminal { user: 'shsii', password: 'dsds' }
                          // now ab hum post data ko bhi collect kar sakte hai
   res.send("standard post request");
});
//or
// app.post("/register", (req, res) => {
//    console.log(req.body); 
//    let { user, password } = req.body;         
//    res.send(`standard post request . Welcome ${user} is your ${password}`);
// });

app.listen(port, () => {
    console.log(`listening to port ${port}`);
});

//** Revisiting js (oops) 

