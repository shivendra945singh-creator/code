
//this file is used to export the data from the three files apple.js, banana.js and orange.js in a single file so that we can import it in a single line in index.js file.
//index.js file name is fix

const apple = require('./apple');
const banana = require('./banana');
const orange = require('./orange');

let fruits = [apple, banana, orange];
module.exports = fruits;