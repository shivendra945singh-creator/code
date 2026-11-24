
const { faker } = require('@faker-js/faker'); //faker package require

// let  getRandomUser = () => {
//   return {
//     Id: faker.string.uuid(),
//     username: faker.internet.username(),
//     email: faker.internet.email(),
//     password: faker.internet.password(),
//   };
// };

const mysql = require("mysql2");//mysql2 package require

const connection = mysql.createConnection({ //crete the connection to database
    host: "localhost",
    user: "root",
    database: "delta_app",
    password: "Shivendra@123"
});

// try{
// connection.query("show tables", (err, result) => { //connection.query() mein apni query or commands send karege
//     if(err) throw err;
//     console.log(result); // jab bhi result ka data print hua hai toh woh [] ke andar print hua hai and uske andar objects hai //result ke data par arrays ke methods bhi apply ho sakte hai
//     console.log(result.length);
//     console.log(result[0]);
//     console.log(result[1]);
// });
// } catch (err) {
//     console.log(err);
// }

//connection.end();//after execution connection will end 
// **to enter into mysql in vs terminal -  "C:\Program Files\MySQL\MySQL Server 8.0\bin\mysql.exe" -u root -p

//or
// let  q = "show tables";
// try{
// connection.query(q, (err, result) => { 
//     if(err) throw err;
//     console.log(result); 
//     console.log(result.length);
//     console.log(result[0]);
//     console.log(result[1]);
// });
// } catch (err) {
//     console.log(err);
// }

// connection.end();

//** insert into user  

// let  q = "insert into user (id, username, email, password) values (?, ? , ? , ?)"; // ? is placeholder
// let user = ["123", "123shivam", "sav@gmail.com","avds"];

// try {
//   connection.query(q, user, (err, result) => { //user ka data q mein pass kar rhe hai //connection.query ko q mein  placeholder milege toh , woh user array ki values ko uss placeholder mein assign kar dega
//     if(err) throw err;
//     console.log(result); 
//   });
// } catch (err) {
//   console.log(err);
// }

// connection.end();

//**insert multiple users

// let  q = "insert into user (id, username, email, password) values ?"; 
// let users = [
//   ["123b", "123shivamb", "sav@gmail.comb","avdsb"],
//   ["123c", "123shivamc", "sav@gmail.comc","avdsc"],
// ];

// try {
//   connection.query(q, [users], (err, result) => { 
//     if(err) throw err;
//     console.log(result); 
//   });
// } catch (err) {
//   console.log(err);
// }

// connection.end();

//** insert in bulk  

let  getRandomUser = () => {
  return [
     faker.string.uuid(),
     faker.internet.username(),
     faker.internet.email(),
     faker.internet.password(),
  ];
};

let  q = "insert into user (id, username, email, password) values ?"; 

let  data = [];
for(let i = 1; i<= 100; i++) {
  data.push(getRandomUser()); //100 fake data add in data array
}

try {
  connection.query(q, [data], (err, result) => { 
    if(err) throw err;
    console.log(result); 
  });
} catch (err) {
  console.log(err);
}

connection.end(); 