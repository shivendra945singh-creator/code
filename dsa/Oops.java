



// public class Oops {
//     public static void main(String args[]) {

//         Pen pen1 = new Pen(); // created a pen object named pen1 //pen() is a constructor here
//         pen1.setcolor("blue"); // setting the color property of pen1
//         System.out.println("Pen color: " + pen1.color); // accessing the color property of pen1
        
//         pen1.setcolor("red"); // changing the color property of pen1
//         System.out.println("Pen color: " + pen1.color); // accessing the updated color property of pen1
//         //or
//         pen1.color = "green"; //  here we dont call function and directly accessing and changing the color property of pen1
//         System.out.println("Pen color: " + pen1.color); // accessing the updated color property of pen1

//         pen1.settip(5); // setting the tip property of pen1
//         System.out.println("Pen tip size: " + pen1.tip); // accessing the tip property of pen1  
        
//     }
// }


// class Pen { //pen blueprint

//     // properties
//     String color;
//     int tip;

//     //functions
//   void setcolor(String newcolor) {
//         color = newcolor;
        
//     }

//     void settip(int newtip) {
//         tip = newtip;
//     }
// }


// class Student {
//     String name;
//     int age;
//     float percentage;

//     void calculPercentage(int phy, int chem, int math) {
//         percentage = (phy + chem + math) / 3;
//     }
// }





                                              //constructor in java



// public class Oops {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//     }
// }        

//      class Student {
//          String name;
//          int roll;

//          Student() { //if we dont create a constructor , java automatically creates a default constructor for us but in that constructor ther is no initialization occur so if we want to set a initialization in constructor we need to create it manually 
                
//         System.out.println("Constructor IS called");

//          }
//     }





// public class Oops {
//     public static void main(String args[]) {
//         Student s1 = new Student("shivam");
//         System.out.println("Student name: " + s1.name); // accessing the name property of student class
//     }
// }        

//      class Student {
//          String name;
//          int roll;

//         Student(String name) {
//             this.name = name; // here we are initializing the name property of student class with the value passed in constructor
            
//         }
//     }



                                         //non -parameterized and parameterized constructor 
                   

// public class Oops {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         Student s2 = new Student("shivam");
//         Student s3 = new Student( 101);
//     }
// }        

//      class Student {
//          String name;
//          int roll;

//         Student() { //java ek constructor tabhi create karta hai jab hum khud se constructor create nahi karte hai , agar hum khud se constructor create karte hai to java default constructor ko create nahi karta hai
//             //agar me ye constructor ko comment kar deta hu orr baki 2 constructor ko comment nhi karta hu tho upper error ha jayega
//             System.out.println("Default Constructor IS called");
//         }

//         Student(String name) {
//             this.name = name; // here we are initializing the name property of student class with the value passed in constructor
//             System.out.println("Parameterized Constructor IS called");
//         }

//         Student(int roll) {
//             this.roll = roll; // here we are initializing the roll property of student class with the value passed in constructor
//             System.out.println("Parameterized Constructor IS called");
//         }
//     }


                                                          //copy constructor ++


//  public class Oops {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "shivam"; // changing the name property of s1
//         s1.roll = 101; // changing the roll property of s1
//         s1.password = "shivam123"; // changing the password property of s1


//         Student s2 = new Student(s1); // creating a new object s2 and passing the object s1 to the constructor of Student class
//         s2.password = "s2password"; // changing the password property of s2
//     }
// }


// class Student {
//     String name;
//     int roll;
//     String password;


//     Student(Student s1) { // copy constructor
//         this.name = s1.name; // here we are initializing the name property of student class with the value of name property of s1 object
//         this.roll = s1.roll; // here we are initializing the roll property of student class with the value of roll property of s1 object

//     }
// }




                                                        //inheritance 


//  public class Oops {
//     public static void main(String args[]) {
//         Fish shark = new Fish(); // creating a new object f1 of Fish class
//         shark.eat(); // calling the eat() method of Animal class using f1 object of Fish class
       
//     }
// }

// //base class
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eating...");
//     }

//     void sleep() {
//         System.out.println("sleeping...");
//     }
// }

// //derived class
// class Fish extends Animal {//extends keyword is used to inherit the properties and methods of Animal class in Fish class
//     int fins;

//     void swim() {
//         System.out.println("swimming...");
//     }
// }



                                         //multilevel inheritance



                                         
//  public class Oops {
//     public static void main(String args[]) {
//         Dog shiba = new Dog(); // creating a new object shiba of Dog class
//         shiba.eat(); // calling the eat() method of Animal class using shiba object of Dog class
//         shiba.walk(); // calling the walk() method of Mammels class using shiba object of Dog class
//         shiba.bark(); // calling the bark() method of Dog class using shiba object of Dog class
//         shiba.legs = 4; // accessing the legs property of Mammels class using shiba object of Dog class
//         System.out.println("Dog has " + shiba.legs + " legs"); 
//     }
// }

// //base class
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eating...");
//     }

//     void sleep() {
//         System.out.println("sleeping...");
//     }
// }

// class Mammels extends Animal { //derived class
//     int legs;

//     void walk() {
//         System.out.println("walking...");
//     }
// }

// class Dog extends Mammels { //derived class
//     String breed;

//     void bark() {
//         System.out.println("barking...");
//     }
// }



                                               //hierarchical inheritance

                                        
//  public class Oops {
//     public static void main(String args[]) {
//         Bird eagle = new Bird(); // creating a new object eagle of Bird class
//         eagle.eat(); // calling the eat() method of Animal class using eagle object of Bird class
//         eagle.walk(); // calling the walk() method of Mammels class using eagle object of Bird class
//         eagle.fly(); // calling the fly() method of Bird class using eagle object of Bird class
//         eagle.legs = 2; // accessing the legs property of Mammels class using eagle object of Bird class
//         System.out.println("Bird has " + eagle.legs + " legs"); 
//     }
// }

// //base class
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eating...");
//     }

//     void sleep() {
//         System.out.println("sleeping...");
//     }
// }

// class Mammels extends Animal { //derived class
//     int legs;

//     void walk() {
//         System.out.println("walking...");
//     }
// }

// class Bird extends Mammels { //derived class
//     String breed;

//     void fly() {
//         System.out.println("flying...");
//     }

//     class Fish extends Animal { //derived class
//         int fins;

//         void swim() {
//             System.out.println("swimming...");
//         }
//     }
// }



                                                      //method overloading


// public class Oops {
//     public static void main(String args[]) {
//         Calculator calc = new Calculator(); // creating a new object calc of Calculator class
//         System.out.println( calc.sum(2, 3)); // calling the sum() method of Calculator class using calc object of Calculator class
//         System.out.println( calc.sum((float) 2.5, (float) 3.5 )); // calling the sum() method of Calculator class using calc object of Calculator class
//         System.out.println( calc.sum(2, 3, 4)); // calling the sum() method of Calculator class using calc object of Calculator class
//     }
// }


// class Calculator { //Calculator class
//     int sum(int a, int b) { //method overloading 
//         return a + b;
//     }

//     double sum(double a, double b) { //method overloading
//         return a + b;
//     }

//     int sum(int a, int b, int c) { //method overloading
//         return a + b + c;
//     }
// }


                                              //method overriding


// public class Oops {
//     public static void main(String args[]) {
//         Dog d = new Dog(); // creating a new object dog of Dog class
//         d.sound(); // calling the sound() method of Dog class
//     }
// }

//         class Animal {
//             void sound() {
//                 System.out.println("Animal makes a sound");
//             }
//         }

//         class Dog extends Animal { //derived class
//             void sound() { //method overriding
//                 System.out.println("Dog barks");
//             }
//         }


                                   
                                   //Abstract class and abstract method


// public class Oops {
//     public static void main(String args[]) {
//             Horse h = new Horse(); // creating a new object h of Horse class
//             h.eat(); // calling the eat() method of Horse class
//             h.walk(); // calling the walk() method of Horse class

//             Chicken c = new Chicken(); // creating a new object c of Chicken class
//             c.eat(); // calling the eat() method of Chicken class
//             c.walk(); // calling the walk() method of Chicken class
//     }
// }

// abstract class Animal { //abstract class

//     void eat() { 
//         System.out.println("eating...");
//     }

//     abstract void walk(); //abstract method // here abstract method is a method without a body and it is declared in an abstract class and it is implemented in the class that extends the abstract class
//     //abstract walk() ki implementation derived class pe depend karegi na ki abstract class pe
// }

// class Horse extends Animal { //derived class
//     void walk() { //overriding the abstract method
//         System.out.println("Horse walks on 4 legs");
//     }
// }

// class Chicken extends Animal { //derived class
//     void walk() { //overriding the abstract method
//         System.out.println("Chicken walks on 2 legs");
//     }
// }



                                              //abstract class and abstract method with constructor


// public class Oops {
//     public static void main(String args[]) {
//             Horse h = new Horse(); // creating a new object h of Horse class
//             h.eat(); // calling the eat() method of Horse class
//             h.walk(); // calling the walk() method of Horse class

//             System.out.println( h.color); //by default color is brown because when we create an object of Horse class , firstly and always the constructor of Animal class is called and the color is initialized to brown
//             //if we want to change the color of horse we can use the changeColor() method of Horse class
//             //when we have derived class and base class and we create an object of derived class then firstly the constructor of base class is called and then the constructor of derived class is called
//     }
// }

// abstract class Animal { //abstract class
//     String color;

//     Animal() { //constructor
//         color = "brown";
//     }

//     void eat() { 
//         System.out.println("eating...");
//     }

//     abstract void walk(); //abstract method // here abstract method is a method without a body and it is declared in an abstract class and it is implemented in the class that extends the abstract class
//     //abstract walk() ki implementation derived class pe depend karegi na ki abstract class pe
// }

// class Horse extends Animal { //derived class

//     void changeColor() { //method to change color
//         color = "dark brown";
//     }

//     void walk() { //overriding the abstract method
//         System.out.println("Horse walks on 4 legs");
//     }
// }

// class Chicken extends Animal { //derived class

//     void changeColor() { //method to change color
//         color = "white";
//     }

//     void walk() { //overriding the abstract method
//         System.out.println("Chicken walks on 2 legs");
//     }
// }


                                                 //or




// public class Oops {
//     public static void main(String args[]) {
//        Mustang m = new Mustang(); //   animal constructor is called first and then horse constructor is called and then mustang constructor is called
//     }
// }

// abstract class Animal { //abstract class
//     String color;

//     Animal() { //constructor
//         System.out.println("Animal constructor is called");
//     }

//     void eat() { 
//         System.out.println("eating...");
//     }

//     abstract void walk(); //abstract method // here abstract method is a method without a body and it is declared in an abstract class and it is implemented in the class that extends the abstract class
//     //abstract walk() ki implementation derived class pe depend karegi na ki abstract class pe
// }

// class Horse extends Animal { //derived class

//     Horse() { //constructor
//         System.out.println("Horse constructor is called");
//     }

//     void changeColor() { //method to change color
//         color = "dark brown";
//     }

//     void walk() { //overriding the abstract method
//         System.out.println("Horse walks on 4 legs");
//     }
// }

// class Mustang extends Horse { //derived class

//     Mustang() { //constructor
//         System.out.println("Mustang constructor is called");
//     }

//     void changeColor() { //method to change color
//         color = "black";
//     }

//     void walk() { //overriding the abstract method
//         System.out.println("Mustang walks on 4 legs");
//     }
// }

// class Chicken extends Animal { //derived class

//     Chicken() { //constructor
//         System.out.println("Chicken constructor is called");
//     }

//     void changeColor() { //method to change color
//         color = "white";
//     }

//     void walk() { //overriding the abstract method
//         System.out.println("Chicken walks on 2 legs");
//     }
// }




                                                //Interface 

//  public class Oops {
//     public static void main(String args[]) {
//        Queen q = new Queen(); // creating a new object q of Queen class
//        q.moves(); // calling the moves() method of Queen class
//     }
// }

// interface ChessPlayer { //interface
//     void moves(); //abstract method // here abstract method is a method without a body and it is declared in an interface and it is implemented in the class that implements the interface
// }

// class Queen implements ChessPlayer { //implementing the interface //implements keyword is used to implement the interface in the class 
//     public void moves() { //overriding the abstract method
//         System.out.println("Queen can move in all directions");
//     }
// }

// class Rook implements ChessPlayer { //implementing the interface
//     public void moves() { //overriding the abstract method
//         System.out.println("Rook can move in straight lines");
//     }
// }

// class Pawn implements ChessPlayer { //implementing the interface
//     public void moves() { //overriding the abstract method
//         System.out.println("Pawn can move forward only");
//     }
// }


                                                 //or


// public class Oops {
//     public static void main(String args[]) {
//         bear b = new bear(); // creating a new object b of bear class
//         b.eatPlants(); // calling the eatPlants() method of bear class
//         b.eatMeat(); // calling the eatMeat() method of bear class
//     }
// }                                                 

// interface Herbivore { //interface
//     void eatPlants(); //abstract method // here abstract method is a method without a body and it is declared in an interface and it is implemented in the class that implements the interface
// }

// interface Carnivore { //interface
//     void eatMeat(); //abstract method // here abstract method is a method without a body and it is declared in an interface and it is implemented in the class that implements the interface
// }

// class bear implements Herbivore, Carnivore { //implementing the interface //implements keyword is used to implement the interface in the class 
//     public void eatPlants() { //overriding the abstract method
//         System.out.println("Bear can eat plants");
//     }

//     public void eatMeat() { //overriding the abstract method
//         System.out.println("Bear can eat meat");
//     }
// }



                                                                 //static keyword in java


public class Oops {
    public static void main(String args[]) {
        Student s1 = new Student(); // creating a new object s1 of Student class
        s1.schoolName = "ABC School"; //this schoolName property is static so it is shared among all the objects of the class and it is not specific to any object of the class //this schoolname is same  for all object 
        System.out.println("Student 1 school name: " + s1.schoolName); 

        Student s2 = new Student(); // creating a new object s2 of Student class
        System.out.println("Student 2 school name: " + s2.schoolName); 

         Student s3 = new Student(); // creating a new object s3 of Student class
         s3.schoolName = "XYZ School"; // changing the schoolName property of s3 //now this schoolname is become new schoolname for  all object  
         System.out.println("Student 3 school name: " + s3.schoolName); 
           System.out.println("Student 1 school name: " + s1.schoolName); 

    }
}

class Student { //Student class
    String name;
    int roll;
    static String schoolName; //static property // here static keyword is used to declare a property that is shared among all the objects of the class and it is not specific to any object of the class
    //static schoolname hai woh all objects ke liye same hai , agar humne s1 ke schoolname ko change kiya to woh s2 ke schoolname ko bhi change kar dega

    void setName(String name) { //method to set name
        this.name = name;
    }

    void getName() { //method to get name
        System.out.println("Student name: " + name);
    }
}