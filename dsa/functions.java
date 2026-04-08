

                                       //functions in java


// public class functions {

//     public static void printhelloworld() {    //  calling function starts here , calling function name is anything but we let a question related name 
//          System.out.println("Hello World");
//          System.out.println("Hello World");
//          System.out.println("Hello World");

//     }


//     public static void main(String args []) {  // this is main function during code run compilor comes here , main is the main function
//      printhelloworld();                           // function call here
//     }
// }





                                                   //or

// public class functions {

//     public static int  printhelloworld() {    //  calling function starts here , calling function name is anything but we let a question related name 
//          System.out.println("Hello World");
//          System.out.println("Hello World");
//          System.out.println("Hello World");

//          return 3;

//     }


//     public static void main(String args []) {  // this is main function during code run compilor comes here , main is the main function
//      printhelloworld();                           // function call here
//     }
// }



                         
                         
                         
                         
                         
                         
                                     //functions in java



// import java.util.*;
// public class functions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int a  = sc.nextInt();
//         System.out.print("Enter a number: ");
//         int b = sc.nextInt();

//         int sum =  a + b;
//         System.out.println("The sum is: " + sum);
        
//     }
// }





                                               // or

                   

// import java.util.*;
// public class functions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int a  = sc.nextInt();
//         System.out.print("Enter a number: ");
    
//         int b = sc.nextInt();

//         int sum =  a + b;
//         System.out.println("The sum is: " + sum);
        
//     }
// }


                                               // factorial of a number in java




//  public class functions {

// public static int factorial(int n) {
//     int f = 1;

//     for (int i = 1; i <= n; i++) {
//         f = f * i;
//     }
//     return f;  // final f value 
// }public static void main(String[] args) {
//     System.out.println(factorial(25));
// }
//  }




                                            // boinomial coefficient in java


//  public class functions {

// public static int factorial(int n) {
//     int f = 1;

//     for (int i = 1; i <= n; i++) {
//         f = f * i;
//     }
//     return f;
// }


// public static int bincoeff(int n, int r) {
//     int factn = factorial(n);
//     int factr = factorial(r);
//     int factnr = factorial(n-r);

//     int bincoeff = factn / (factr * factnr);
//     return bincoeff;
// }

    
// public static void main(String args []) {  
//     System.out.println(bincoeff(10, 2));
// }
//  }




                                         // function overloading in java with different number of parameters


    //## function overloading is the multiple functions with the same name but different parameters ( means types of parameters or number of parameters )



// //func to add two numbers in java
// public static int sum (int a, int b) {  // inta and int b are parameters(means input of function)
//     return a + b;
// }

// //func to add three numbers in java
// public static int sum (int a, int b, int c) {
//     return a + b + c;
// }

// public static void main(String[] args) {
//     System.out.println(sum(2, 3));
//     System.out.println(sum(2, 5, 4));
// }




                                      // function overloading in java with different data types




// //func to add two numbers in java
// public static int sum (int a, int b) {
//     return a + b;
// }

// //func to add two float numbers in java
// public static float sum (float a, float b) {
//     return a + b;
// }

// //func to add three float numbers in java
// public static float sum (float a, float b, float c) {
//     return a + b + c;
// }

// public static void main(String[] args) {
//     System.out.println(sum(2, 3));
//     System.out.println(sum(2.5f, 5.5f, 4.5f));
//     System.out.println(sum(2.5f, 5.5f));
// }


                            // function to check if a number is prime or not in java



// public static  boolean isprime(int n) {
//     boolean isprime = true;
//     for (int i = 2; i <= n-1; i++) {
//         if (n % i == 0) {                         //if this conditon is true then print false and if not then print true
//             isprime = false;
//             break;
//         }
//     }
//     return isprime;              // this isprime is belongs to true
// }

// public static void main(String args[]) {
//  System.out.println(isprime(28));
// }
   

                                            // or



//   public static  boolean isprime(int n) {
//     for (int i = 2; i <= n-1; i++) {
//         if (n % i == 0) {
//             return false;  //not a prime number
//         }
//     }
//     return true;
// }

// public static void main(String args[]) {
//  System.out.println(isprime(28));
// }                                          



                                           // or



// //only for 2
//  public static  boolean isprime(int n) {
    
//     //corner cases
//     //2
//     if(n==2) {
//         return true;            // if our input is 2 then return true and below code will not be executed
//     }
    
//     for (int i = 2; i <= n-1; i++) {
//         if (n % i == 0) {
//             return false;
//         }
//     }
//     return true;
// }

// public static void main(String args[]) {
//  System.out.println(isprime(2));
// }                                          


                                




                                  // function to print prime numbers in a range in java




// //only for 2
//  public static  boolean isprime(int n) {
    
//     //corner cases
//     //2
//     if(n==2) {
//         return true;            // if our input is 2 then return true and below code will not be executed
//     }
    
//     for (int i = 2; i <= n-1; i++) {
//         if (n % i == 0) {
//             return false;
//         }
//     }
//     return true;
// }

// public static void primesinrange(int n) {
//     for (int i = 2; i <= n; i++) {
//         if (isprime(i)) {
//             System.out.print(i + " ");
//         }
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     primesinrange(20);  //2 to 20 ke beech ke prime numbers print karne ke liye
// }





  

                                // function to convert binary to decimal in java




// public static void bintodec(int binnum) {
//     int mynum =binnum;
//     int pow =0;
//     int decnum = 0;

//     while(binnum> 0) {
//         int lastdigit = binnum % 10;
//         decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
//         pow++;
//         binnum = binnum / 10;
//     }

//     System.out.println("Decimal of " + mynum + " = " + decnum);
// }

// public static void main(String[] args) {
//  bintodec(111);   
// }






                                            // function to convert decimal to binary in java




// public static void dectobin(int n) {
//     int mynum = n;
//     int binnum = 0;
//     int pow = 0;

//     while(n > 0) {
//         int rem = n % 2;
//         binnum = binnum + (rem * (int)Math.pow(10, pow));
//         pow++;
//         n = n / 2;
//     }

//     System.out.println("Binary of " + mynum + " = " + binnum);
// }

// public static void main(String[] args) {
//     dectobin(7);   
// }
        
