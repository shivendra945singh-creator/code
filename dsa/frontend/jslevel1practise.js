
//Q2

let name = prompt("what is your name");
let age = prompt("what is your age");

alert("your name is " + name + " and your age is " + age);

//Q3

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

    //Q4

    let str = "hello world";
    if((str[0] == "a"  || str[0] == "A") && str.length > 5 ) {
        console.log("golden string");
    }else {
        console.log("not a golden string");
    }

    //Q5

    let a = 23;
    let b = 45
    let c = 56

    if(a>=b && a>=c){
        console.log("a is the largest");
    } else if(b>c){
        console.log("b is the largest");
    }else{
        console.log("c is the largest");
    }

    let aa= 32;
    let bb = 47852;
    if(aa.length()-1 == bb.length()-1){
        console.log("the last digit is same");
    }else{
        console.log("the last digit is not same");
    }
