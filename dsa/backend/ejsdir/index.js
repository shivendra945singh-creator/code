const express = require('express');
const app = express();

const port = 8080;

app.set("view engine", "ejs");


app.get("/", (req, res) => {
   // res.send("Hello World!");//not write this//print in browser
   res.render("home.ejs");//"home" also valid //rendering the ejs file
});


app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});