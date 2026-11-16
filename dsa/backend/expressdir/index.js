// this file is act as  express server

const express = require("express");
const app = express();

//console.dir(app); when you run this line it will show you all the methods and properties of express app

let port = 8080;

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);//this line will show you the message in terminal when server is running
});
// to stop the server you can use ctrl+c in terminal

// app.use((req, res) => { //for receiving request on powershell from client  when click on locoalhost:8080
//     console.log("request recieved");//this line will show you the message in terminal when request is received
//     res.send("<h1>hello from express server</h1>"); //here same response for all routes  //sending response to client //this line will show you the message in browser(localhost:8080) when request is received
// });


// app.get("/", (req, res) => { 
//     res.send("request recieved for root or this  paths");//when write locoalhost:8080 print this message in browser
// });

// app.get("/orange", (req, res) => { 
//     res.send("request recieved for orange path");//when write locoalhost:8080/orange print thismessage in browser
// });

// app.get("/apple", (req, res) => { 
//     res.send("request recieved for apple path");//when write locoalhost:8080/apple print this message in browser
// });

//if we  write locoalhost:8080/other name except   above  like locoalhost:8080/grape print cannot GET /grape 404 in browser because we have not defined any route for grape

// app.get("/*splat", (req, res) => {///*splat for all other paths or routes except above defined paths
//     res.send("request recieved for all other paths or routes");//when write locoalhost:8080/other name except   above  like locoalhost:8080/grape print this message in browser
// });

//similarly above  method(get) can be used for post, put, delete, patch etc. methods also

//now we install nodemon package to run server automatically when we make any changes in code
// for install - npm install -g nodemon
// for conformation - nodemon -v
//for server restart - nodemon index.js ,  phele node index.js likte the //now if we make any changes in code  nodemon will automatically restart the server and show the changes in browser


//**path parameters

app.get("/", (req, res) => { 
    res.send("hello i am root path");
});

// app.get("/:username", (req, res) => { 
//     console.log(req.params); // write in localhost:8080/apnacollege ,output in terminal  {username: apnacollege }
//     res.send("request recieved for user path");//this line will show in browser
// });



// app.get("/:username/:id", (req, res) => { //write in localhost:8080/apnacollege/12 //both username and id are write in browser otherwise it will show only one path that you write in browser
//     console.log(req.params); //  show in terminal - { username: 'apnacollege', id: '12' }
//     res.send("request recieved for user path");//this line will show in browser
// });

// app.get("/:username/:id", (req, res) => { //input in browser localhost:8080/shivam/55
//    let {username, id} = req.params;
//     res.send(`welcome ${username}, your id is ${id}`);//output in browser - welcome shivam, your id is 55
// });


// //**query parameters 
// app.get("/query", (req, res) => {//input in browser localhost:8080/query?name=shivam&age=34
//     console.log(req.query); // show in terminal - { 'name ': ' shivam', ' age ': '34' }
//     res.send(` no result `);//this line will show in browser
// });

app.get("/search", (req, res) => {//input in browser localhost:8080/search?q=shivam
    let {q} = req.query; 
    res.send(` search result for query: ${q} `);//this line will show in browser - search result for query: red
});