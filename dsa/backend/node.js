// let n = 5;

// for (let i = 1; i <= n; i++) {
//     console.log('*'.repeat(i));
// }

// input in powershell, PS C:\Users\shive\New folder (2)\dsa\backend> node node.js
// Output in powershell:
// *
// **
// ***
// ****
// *****

//**process.argv(arguments) 

// console.log(process.argv);//here no arguments are passed 
//input in powershell,    PS C:\Users\shive\New folder (2)\dsa\backend> node node.js
// Output in powershell:
// [
//   'C:\\Program Files\\nodejs\\node.exe',
//   'C:\\Users\\shive\\New folder (2)\\dsa\\backend\\node.js'
// ]


//in powershell, when we pass argument like PS C:\Users\shive\New folder (2)\dsa\backend> node node.js hello value then the output will be in powershell:
// [
//   'C:\\Program Files\\nodejs\\node.exe', //this is the executable path for node 
//   'C:\\Users\\shive\\New folder (2)\\dsa\\backend\\node.js', //this is the current file path
//   'hello',
//   'value'
// ]


// let args = process.argv;

// for (let i = 2; i < args.length; i++) {
//     console.log(`hello to  ${args[i]}`);
// }
// input in powershell , PS C:\Users\shive\New folder (2)\dsa\backend> node node.js shivam singh kushwah
// Output in powershell:
// hello to  shivam
// hello to  singh
// hello to  kushwah

//**exports in file //module.exports case 1 - collect data from same  directory

// const somevalue = require('./nodepart1.1');//require(filename) is used to import the module from another file. It is a built-in function in Node.js that allows you to include and use code from other files or modules in your application. In this case, it is importing the module located in the file named "nodepart1.1.js" which is in the same directory as the current file. 
// console.log(somevalue); // Output: 123   
//or
// const somevalue2 = require('./nodepart1.1.js');
// console.log(somevalue2); // Output: 123

//in case when module.exports is not exist then require() will return an empty object {}. 
                            
// const math = require('./nodepart1.1.js');
//console.log(math);
//input in powershell, PS C:\Users\shive\New folder (2)\dsa\backend> node node.js
// Output in powershell:
// {
//  sum: [Function: sum],
//   sub: [Function: sub],
//   mul: [Function: mul],
//   div: [Function: div],
//   pi: 3.14,
//   g: 9.8
// }
// console.log(math.sum(5, 3)); // Output: 8
// console.log(math.sub(5, 3)); // Output: 2
// console.log(math.mul(5, 3)); // Output: 15
// console.log(math.div(5, 3)); // Output: 1.6666666666666667
// console.log(math.pi); // Output: 3.14
// console.log(math.g); // Output: 9.8
//input in powershell, PS C:\Users\shive\New folder (2)\dsa\backend> node node.js
// Output in powershell:
// 8
// 2
// 15
// 1.6666666666666667
// 3.14
// 9.8



//** module.exports case 2 - collect data from different directory 

const info = require("./nodepart1.2.js"); //require(folder name )//here nodepart1.2.js is the name of the folder which contains index.js file. // index.js file is create to store the data from the three files apple.js, banana.js and orange.js in a single file so that we can import it in a single line in index.js file.
console.log(info); // Output: [ { name: 'apple', color: 'red' }, { name: 'banana', color: 'yellow' }, { name: 'orange', color: 'orange' } ]

