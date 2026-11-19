
//we assume we get data from database and we store that data in data.json file

// const express = require('express');
// const app = express();
// const path = require("path");

// const port = 8080;

// app.set("view engine", "ejs");
// app.set("views", path.join(__dirname,"/views"));


// app.get("/", (req, res) => {
//    res.render("home.ejs");//"home" also valid //rendering the ejs file //show in browser
// });

// app.get("/hello", (req, res) => {
//    res.send("home");
// });

// //** instagram page with ejs  //in this we send database data(data.json) in res.render()
// app.get("/ig/:username", (req, res) => {//ig/anyname 
//     let {username} = req.params;
//    const instadata = require("./views/data.json");//acess or require  data.json data into instadata
//    const data = instadata[username];//instadata mein wahi data jayega jo specific username ke liye hoga  // means in browser localhost:8080 /cats kiya toh instagram ke data mein search hoga ki cats name ka object hai kya agar hai toh woh object print ho jayega
//    console.log(data);
//    //console.log(instadata);//show in terminal
//    if(data) {
//       res.render("instagram2.ejs", { data });
//    }else{
//       res.render("noaccount.ejs");
//    }
// });

//** serving static files //in this we not only send html files in res.render() , we  also send css and js files in  res.render()

const express = require('express');
const app = express();
const path = require("path");

const port = 8080;

//app.use(express.static("public"))// here "public" is a folder in which all our static files(css and js) store // bydafault express static files ko public folder name se  hi leta hai //public folder create in ejsdir //express by default publid  folder ke andar ki all files ko access kar sakta hai
// or 
//app.use(express.static(path.join(__dirname,"public"))); //"/public" is also valid //above statement mein ek problem hai agar mein kisi dusri directory se terminal ko run karuga toh express ko public folder nhi milega
//or
app.use(express.static(path.join(__dirname,"/public/css")));//upper code is right ab mene 2 folder ko ek sath serve kar sakta hu , isme mene css file ko kar diya and niche mene js file ko kar diya
app.use(express.static(path.join(__dirname,"/public/js")));
app.set("view engine", "ejs");
app.set("views", path.join(__dirname,"/views"));


app.get("/", (req, res) => {
   res.render("home.ejs");
});

app.get("/hello", (req, res) => {
   res.send("home");
});

app.get("/ig/:username", (req, res) => {
    let {username} = req.params;
   const instadata = require("./views/data.json");
   const data = instadata[username];//instadata mein wahi data jayega jo specific username ke liye hoga  // means in browser localhost:8080 /cats kiya toh instagram ke data mein search hoga ki cats name ka object hai kya agar hai toh woh object print ho jayega
   console.log(data);
   
   if(data) {
      res.render("instagram2.ejs", { data });
   }else{
      res.render("noaccount.ejs");
   }
});

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);//show in terminal 
});


