console.dir(document);
console.dir(document.all);
console.dir(document.all[8]);
console.dir(document.all[8].innerText);
console.dir(document.all[8].innerText = "saktiman");


document.getElementById(mainImg);//here mainImg is treated as  variable but mainImg is id 
document.getElementById("mainImg");//now mainImg is treated as id//iss method ne jho return kiya hai woh img tag or img element nhi hai ye image ka object hai 
let imgobj = document.getElementById("mainImg");
console.dir(imgobj);
console.dir(imgobj.src);
console.dir(imgobj.tagName);


document.getElementsByClassName("oldImg");
let smallImg = document.getElementsByClassName("oldImg");
console.dir(smallImg);
for(let i = 0; i< smallImg.length; i++){
    console.dir(smallImg[i].src);
}
for(let i = 0; i<smallImg.length; i++){
    smallImg[i].src = "creation_3.jpeg";
    console.log(`value of image no ${i} is changed`);
}
let small = document.getElementsByClassName("error");//this id is not exist but in case of getElementByClassName null nhi aata getElementByid me null aata hai
console.log(small);

//getElementsByTagName

let x = document.getElementsByTagName("p");
console.log(x);


//querySelector

console.dir(document.querySelector("p"));//phele jo aayega woh hi select hoga

console.dir(document.querySelector("#description"));

console.dir(document.querySelector(".oldImg"));

console.dir(document.querySelector("div a "));//here only one anchor tag get inside div

console.dir(document.querySelectorAll("div a"));//here we get all anchor tag in div



let para = document.querySelector("p");
console.dir(para);
console.dir(para.innerText);//show exect same text content which is show on our webpage without any bold text 
console.dir(para.innerHTML);//show all content which is in html with their tags
console.dir(para.textContent);//show all content in same format which was written in html including hidden text

console.log(para.innerText = " abfjskhhfisc");
console.log(para.innerText = " abf<b> jskhh </b> fisc");//innertext sabko text samjta hai isliye bold tag as it print hogye
console.log(para.innerHTML = " abf<b> jskhh </b> fisc");//innerhtml tags ko recognise karta hai

let heading = document.querySelector("h1");
console.log(heading.innerText);
console.log(heading.innerHTML = "<u> spider man </u>");//main line underline ho gyi
//or
//console.log(heading.innerHTML = `<u>${heading.innerText}</u>`);


//maupulating attributes

let image = document.querySelector("img");
console.log(image);

console.log(image.getAttribute("id"));
console.log(image.setAttribute("src", "creation_3.jpeg"));

//manupulating style

let headin = document.querySelector("h1");
console.log(headin.style);
console.log(heading.style.color = "green");
console.log(heading.style.backgroundColor = "red");


let link = document.querySelectorAll(".box a ");
for(l of link) {
    l.style.color = "purple";
}
//or
for(let i = 0; i<link.length; i++ ) {
    link[i].style.color = "blue";
}

//manipulate classes using classList

let head = document.querySelector("h1");
console.log(heading.classList);//check class of h1
console.log(head.classList.add("abc"));//add
console.log(head.classList.add("under"));
console.log(heading.classList);
console.log(head.classList.remove("abc"));//remove
console.log(heading.classList);
console.log(head.classList.contains("under"));//contain
console.log(head.classList.toggle("under"));//remove
console.log(head.classList.toggle("abc"));//add
console.log(heading.classList);

let h4 = document.querySelector("h4");
console.log(h4.parentElement);
console.log(h4.children);

let box = document.querySelector(".box");
console.log(box.children);
console.log(box.childElementCount);//kitne child hai

let img = document.querySelector("img");
console.log(img.previousElementSibling);
console.log(img.previousElementSibling.style);
// console.log(img.previousElementSibling.style = "red");


//adding element in a document

let newpara = document.createElement("p");
console.log(newpara);
console.log(newpara.innerText = " it is a new paragraph");
let body = document.querySelector("body");
console.log(body.appendChild(newpara));//insert newpara in body tag //here body is parent and newpara is child //append means last mein add kar dena
console.log(newpara.append("new line"));//additonal add 

let btn = document.createElement("button");
btn.innerHTML = "new button";
let p = document.querySelector("p");
p.insertAdjacentElement("afterbegin", btn);
p.insertAdjacentElement("beforebegin", btn);
p.insertAdjacentElement("beforeend", btn);
p.insertAdjacentElement("afterend", btn);

//remove method

body.removeChild(btn);
//or 
//btn.remove();//direct remove