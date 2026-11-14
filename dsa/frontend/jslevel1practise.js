
let name = prompt("what is your name");
let age = prompt("what is your age");

alert("your name is " + name + " and your age is " + age);

let quarter = 1;
switch(quarter) {
    case 1:
        console.log("january, february, march");
        break;
        case 2:
        console.log("april, may, june");
        break;
    case 3:
        console.log("july, august, september");
        break;
    case 4:
        console.log("october, november, december");
        break;
    default:
        console.log("it is not a quarter");
    }

    let str = "hello world";
    if((str[0] == "a"  || str[0] == "A") && str.length > 5 ) {
        console.log("golden string");
    }else {
        console.log("not a golden string");
    }