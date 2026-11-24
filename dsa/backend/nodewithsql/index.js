
const { faker } = require('@faker-js/faker'); //faker package require
const mysql = require("mysql2");

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

//or
let  q = "show tables";
try{
connection.query(q, (err, result) => { 
    if(err) throw err;
    console.log(result); 
    console.log(result.length);
    console.log(result[0]);
    console.log(result[1]);
});
} catch (err) {
    console.log(err);
}

connection.end();

let  getRandomUser = () => {
  return {
    Id: faker.string.uuid(),
    username: faker.internet.username(),
    email: faker.internet.email(),
    password: faker.internet.password(),
  };
};
