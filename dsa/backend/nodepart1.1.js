// const sum = (a, b) =>  a + b;
// const sub = (a, b) =>  a - b;
// const mul = (a, b) =>  a * b;
// const div = (a, b) =>  a / b;
// const pi = 3.14;
// const g = 9.8;
// module.exports = 123;

//or

// const sum = (a, b) =>  a + b;
// const sub = (a, b) =>  a - b;
// const mul = (a, b) =>  a * b;
// const div = (a, b) =>  a / b;
// const pi = 3.14;
// const g = 9.8;

// let obj = {
//     sum: sum,
//     sub: sub,
//     mul: mul,
//     div: div,
//     pi: pi,
//     g: g
// };
// module.exports = obj;

//or

// const sum = (a, b) =>  a + b;
// const sub = (a, b) =>  a - b;
// const mul = (a, b) =>  a * b;
// const div = (a, b) =>  a / b;
// const pi = 3.14;
// const g = 9.8;

// module.exports = {
//     sum: sum,
//     sub: sub,
//     mul: mul,
//     div: div,
//     pi: pi,
//     g: g
// };

//or

module.exports.sum = (a, b) =>  a + b;
module.exports.sub = (a, b) =>  a - b;
module.exports.mul = (a, b) =>  a * b;
module.exports.div = (a, b) =>  a / b;
module.exports.pi = 3.14;
module.exports.g = 9.8;

//or

exports.sum = (a, b) =>  a + b;
exports.sub = (a, b) =>  a - b;
exports.mul = (a, b) =>  a * b;
exports.div = (a, b) =>  a / b;
exports.pi = 3.14;
exports.g = 9.8;

 module.exports = 5; //right way to write // module.exports and exports are two different ways to export modules in Node.js. module.exports is the actual object that gets returned as the module, while exports is a shorthand reference to module.exports. If you assign a new value to exports, it will not change the value of module.exports. Therefore, it is recommended to use module.exports when exporting a single value or object, and exports when exporting multiple values or objects.
 exports = 5; //wrong //error will come 

 