// public class varianddata {
//     public static void main(String args[]) {
//         System.out.print("Hello world");
//     }
// }



// public class varianddata {
//     public static void main(String args[]) {
//         System.out.print("Hello world");
//          System.out.print("Hello world");
//           System.out.print("Hello world");
//     }
// }


                                                            //or


// public class varianddata {
//     public static void main(String args[]) {
//         System.out.println("Hello world");  //line ka space
//          System.out.print("Hello world");
//           System.out.print("Hello world");
//     }
// }
                                                            //or

//       public static void main(String args[]) {
//         System.out.println("Hello world\nhello world");  //line ka space
//          System.out.print("Hello world");
//           System.out.print("Hello world\n");
//     }


                                                //variables in java


   //  public static void main(String[] args) {
            // int a = 10;
            // int b = 20;
            // int c = 30;
      
            // System.out.println(a);    //"a" karta toh sirf a print hota
            // System.out.println(b);
            // System.out.println(c);  
            // String name = "John";
            // System.out.println(name);


   //          a=50;
   //          System.out.println(a);
   //          a=b;
   //          System.out.println(a);
   //  }



                                                // sum of two numbers in java



//     public static void main(String[] args) {
//         int a=10;
//         int b=20;
//         int sum = a + b;
//         System.out.println(sum);
//     }




                                                   //inputs in java


// import java.util.*;
// public class varianddata {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     System.out.println(num);
//     float price = sc.nextFloat();
//     System.out.println(price);
//      String name = sc.next();  //.next() method se sirf ek word input hota hai
//      System.out.println(name);
//     String Name = sc.nextLine();  //.nextLine() method se pura line input hota hai
//      System.out.println(Name);
// }
// }








                                  // sum of two numbers in java using user input


// import java.util.*;
// public class varianddata {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         int a  = sc.nextInt();
//         int b = sc.nextInt();

//         int sum =  a + b;
//         System.out.println("The sum is: " + sum);
        
//     }
// }

    

                                               //or


// import java.util.*;
// public class varianddata {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number: ");
//         int a  = sc.nextInt();
//         System.out.print("Enter a number: ");
//         int b = sc.nextInt();

//         int sum =  a + b;
//         System.out.println("The sum is: " + sum);
        
//     }
// }




                                      // product of two numbers in java using user input


// import java.util.*;
// public class varianddata {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         int a  = sc.nextInt();
//         int b = sc.nextInt();

//         int product =  a * b;
//         System.out.println("The product is: " + product);
        
//     }
// }


                                                //or


// import java.util.*;
// public class varianddata {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: "); 
//         int a  = sc.nextInt();
//         System.out.print("Enter a number: ");
//         int b = sc.nextInt();

//         int product =  a * b;
//         System.out.println("The product is: " + product);
        
//     }
// }



                                      // area of circle in java using user input


// import java.util.*;
// public class varianddata {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the radius of the circle: ");
//     float r= sc.nextFloat();
//     float area = 3.14f * r * r;
//     System.out.println("The area of the circle is: " + area);
//     }
// }


                                                  // type casting in java


// public static void main(String[] args) {
//   float num1 = 10.5f;
//   int num2 = (int) num1;  // type casting
//   System.out.println(num2);


//   char ch = 'a';   //ascii value of 'a' is 97
//   char ch1 = 'A';   //ascii value of 'A' is 65
//   char ch3 = 'b' ;   //ascii value of 'b' is 98
//   int num3 =  ch;
//   int num4 = ch1;
//   int num5 = ch3;

//     System.err.println(num3); // type casting
//     System.out.println(num4);   
//     System.out.println(num5);
//     }



                                              // type permotation in java



//  public static void main(String[] args) {
    // char a = 'A';
    // char b = 'B';
    // System.out.println((int)a);  // type casting
    // System.out.println((int)b);  // type casting
    // System.out.println(b-a);  // type permotation
    // System.out.println(a);  //ye par a ki value A print hogi nha ki 65 print hogi kuki a ko char type me declare kiya hai

 //concept of type promotion in java

   //  int a = 10;
   //  float b = 20.5f;
   //  long c = 30;
   //  double d = 40.5;
   //  double answer = (a + b + c + d);  // here all values are converted to double type because double is the largest data type among them
   //  System.out.println(answer);


  
//    //concept of type promotion in java

//     byte b = 10;
//    //  byte a = b*2;  // here b*2 is int type while a is byte type so we cannot assign int value to byte variable without type casting
//     byte a = (byte)(b*2);  
//     System.out.println(a);
//  }
                                               



                                            //practice set of java

                                            //Q1

   // import java.util.*;
   // public class varianddata {
   //    public static void main(String[] args) {
   //      Scanner sc = new Scanner(System.in);
   //     System.out.print("Enter 1st number: ");
   //      int a = sc.nextInt();
   //      System.out.print("Enter 2nd number: ");
   //      int b = sc.nextInt(); 
   //      System.out.print("Enter 3rd number: ");
   //      int c = sc.nextInt();
   //      int average = (a + b + c) / 3;
   //      System.out.println("The average is: " + average);
      
    
   //  }
   // }
                                             

                                             //Q2


// import java.util.*;
// public class varianddata {
//       public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the side of the square: ");
//          int a = sc.nextInt();
//         int area = a * a;
//         System.out.println("The area of the square is: " + area);
//       }
//    }


                                             //Q3


   // import java.util.*;
   // public class varianddata {
   //       public static void main(String[] args) {
   //          Scanner sc = new Scanner(System.in);
   //          System.out.print("Enter the coast of a pencil: ");
   //          float a = sc.nextFloat();
   //          System.out.print("Enter the coast of a pen: ");
   //          float b = sc.nextFloat();
   //          System.out.print("Enter the coast of a eraser: ");
   //          float c = sc.nextFloat();
   //          float total = a + b + c;
   //          System.out.println("The total cost is: " + total);
   //       }
   //    }                      
   
   
                                                    //Q4


   //   public static void main(String[] args) {
   //      byte b = 4;
   //      char ch = 'a';
   //      short s = 512;
   //      int i = 1000;
   //       float f = 3.14f;
   //       double d = 99.995;

   //       double result = (f * b) + (i % ch) - (d * s);
   //       System.out.println("Result: " + result);
   //   }                                               




                                                    //Q5

   //  public static void main(String[] args) {
   //      int $ = 24;
   //      System.out.println($);
   //  }                                                
