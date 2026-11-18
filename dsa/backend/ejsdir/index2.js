
const express = require('express');
const app = express();
const path = require("path");

const port = 8080;

app.set("view engine", "ejs");
app.set("views", path.join(__dirname,"/views"));


app.get("/", (req, res) => {
   res.render("home.ejs");//"home" also valid //rendering the ejs file //show in browser
});

app.get("/hello", (req, res) => {
   res.send("home");
});


app.get("/ig/:username", (req, res) => {//ig/anyname 
    let {username} = req.params;
   const instadata = require("./views/data.json");
   const data = instadata[username];
   console.log(data);
   //console.log(instadata);//show in terminal
   res.render("instagram2.ejs", { data });
});


app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);//show in terminal 
});