
const express = require('express');
const app = express();

const port = 8080;

app.set("view engine", "ejs");


app.get("/", (req, res) => {
   // res.send("Hello World!");//not write this//print in browser
   res.render("home.ejs");//"home" also valid //rendering the ejs file //show in browser
});

app.get("/home", (req, res) => {//write in localhost:8080/home in browser
   res.send("hello");// show hello in browser //but when we go to  root directory localhost:8080 it will show error //because hamare  code ko views directory ke andar home.js dik hi nhi rha //bydefault humara code views directory ko /backend/views ke andar search kar rha h means jha se server run hua hai waha woh views ko search kar rha h //index.js ke through  humne server run kya hai //uske parent folder ejsdir  ke andar views search nhi ho rha views waha search ho rha jha se humara server run hua hai yahni backend directory ke andar
});


app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);//show in terminal 
});