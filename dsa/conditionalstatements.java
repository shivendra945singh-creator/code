                                                      //if else statement in java


// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         if (age >= 18) {      //if if statement is true then it will execute the block of code inside the if statement and it will not check the else statement 
//             System.out.println("You are eligible to vote.");
//             if ( age<18 && age>=15) {
//                 System.out.println("You are not eligible to vote but you can learn about voting.");
//             }
//         } else {               // if if statement is false then it will execute the block of code inside the else statement
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }




                                                           //if if else statement in java


// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         if (age >= 18) {      //if if statement is true then it will execute the block of code inside the if statement and futher statement will also be checked
//             System.out.println("You are eligible to vote.");

//          }  if (age>=13 && age<18) {   // if the first if statement is true or false this if statement is also cheked 
//                 System.out.println("You are not eligible to vote but you can learn about voting.");
//             }else {               // if if statement is false then it will execute the block of code inside the else statement
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }








                                                   // check which number is greater in java


// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         if (num1 > num2) {
//             System.out.println(num1 + " is greater than  " + num2);
//         } else   {
//             System.out.println(num2 + " is greater than " + num1);
//         } 
//         }
//     }


                                        //or



// public class conditionalstatements {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 20;

//         if (num1 > num2) {
//             System.out.println(num1 + " is greater than  " + num2);
//         } else   {
//             System.out.println(num2 + " is greater than " + num1);
//         } 
//         }
//     }



                                            // check whether a number is even or odd in java

                                            

// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         if (num % 2 == 0) {            // if the number is divisible by 2 and its remainder is 0 then it is an even number otherwise it is an odd number
//             System.out.println(num + " is even number.");
//         } else {
//             System.out.println(num + " is odd number.");
//         }
       
//     }
// }






                                              //if else if statement in java




// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         if (age >= 18) {      //if if statement is true then it will execute the block of code inside the if statement and it will not check the further statement 
//             System.out.println("You are eligible to vote.");

//          } else if (age>=13 && age<18) {   // if the first if statement is false then it will check the else if statement and if it is true then it will execute the block of code inside the else if statement and it will not check the else statement
//                 System.out.println("You are not eligible to vote but you can learn about voting.");
//             }else {               // if if statement is false then it will execute the block of code inside the else statement
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }





                                                   //income tax calculator in java


//   import java.util.*;
//  public class conditionalstatements {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter your income: ");
//          double income = sc.nextDouble();
//          double tax;

//          if (income <= 250000) {
//              tax = 0;
//          } else if ( income>250000 && income <= 500000) {
//              tax = income  * 0.05;
//          }  else {
//              tax = income  * 0.3 ;
//          }

//          System.out.println("Your income tax is: " + tax);
//      }
//  }           


                                                 //check the largest of three numbers in java



//  import java.util.*;
//  public class conditionalstatements {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter first number: ");
//          int num1 = sc.nextInt();
//          System.out.print("Enter second number: ");
//          int num2 = sc.nextInt();
//          System.out.print("Enter third number: ");
//          int num3 = sc.nextInt();

//          if (num1 >= num2 && num1 >= num3) {
//              System.out.println(num1 + " is the largest number.");
//          } else if (num2 >= num1 && num2 >= num3) {
//              System.out.println(num2 + " is the largest number.");
//          } else {
//              System.out.println(num3 + " is the largest number.");
//          }
//      }
//  }                                                



                                              //or

// import java.util.*;
//  public class conditionalstatements {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter first number: ");
//          int num1 = sc.nextInt();
//          System.out.print("Enter second number: ");
//          int num2 = sc.nextInt();
//          System.out.print("Enter third number: ");
//          int num3 = sc.nextInt();

//          if (num1 >= num2 && num1 >= num3) {
//              System.out.println(num1 + " is the largest number.");
//          } else if (num2 >= num3) {
//              System.out.println(num2 + " is the largest number.");
//          } else {
//              System.out.println(num3 + " is the largest number.");
//          }
//      }
//  }     


                                               //or


// public static void main(String[] args) {
    
//     int num1 = 10;
//     int num2 = 20;
//     int num3 = 30;

//     if (num1 >= num2 && num1 >= num3) {
//         System.out.println(num1 + " is the largest number.");
//     } else if (num2 >= num3) {
//         System.out.println(num2 + " is the largest number.");
//     } else {
//         System.out.println(num3 + " is the largest number.");
//     }
// }



                                             //ternary operator in java



// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         String result = (num1 > num2) ? (num1 + " is greater than " + num2) : (num2 + " is greater than " + num1);
//         System.out.println(result);
//     }
// } 



                                             //check whether a number is even or odd using ternary operator in java
    



// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         String result = (num % 2 == 0) ? (num + " is even number.") : (num + " is odd number.");
//         System.out.println(result);
//     }
// }




                                            //check a student is pass or fail using ternary operator in java



//   import java.util.*;
//  public class conditionalstatements {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter marks: ");
//          int marks = sc.nextInt();

//          String result = (marks >= 40) ? "Pass" : "Fail";
//          System.out.println("The student is: " + result);
//      }
//  }          
 
 
                                             //or



//  public class conditionalstatements {
//      public static void main(String[] args) {
//          int marks = 40;

//          String result = (marks >= 40) ? "Pass" : "Fail";
//          System.out.println("The student is: " + result);
//      }
//  }   



                                            //switch case statement in java



// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" enter a number ");
//         int number = sc.nextInt();       // int num and switch num must be same 

//         switch (number) {
//             case 1:
//                 System.out.println("samosa");
//                 break;   //if case 1 is true and we not use break statement then all cases below case 1 will also be executed until it finds a break statement 
//             case 2:
//                 System.out.println("burger");
//                 break;
//             case 3:
//                 System.out.println("pizza");
//                 break;
//             default:
//                 System.out.println(" we realize we are just dreaming");
//         }

       
//     }
// }


                                                   //another example of switch case statement in java



//   import java.util.*;
//  public class conditionalstatements {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter a day of the week (1-7): ");
//          int day = sc.nextInt();

//          switch (day) {
//              case 1:
//                  System.out.println("Monday");
//                  break;
//              case 2:
//                  System.out.println("Tuesday");
//                  break;
//              case 3:
//                  System.out.println("Wednesday");
//                  break;
//              case 4:
//                  System.out.println("Thursday");
//                  break;
//              case 5:
//                  System.out.println("Friday");
//                  break;
//              case 6:
//                  System.out.println("Saturday");
//                  break;
//              case 7:
//                  System.out.println("Sunday");
//                  break;
//              default:
//                  System.out.println("Invalid input! Please enter a number between 1 and 7.");
//          }
//      }
//  }      



                                                    //calculator using switch case statement in java




// import java.util.*;
// public class conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();
//         System.out.print("Enter an operator (+, -, *, /): ");
//         char operator = sc.next().charAt(0);   // sc.next se sirf string (word) hi le pate lekin .charAt(0) se hum char ko inut le sakte hai
//         switch (operator) {
//             case '+': System.out.println("Result: " + (num1 + num2));
//                 break;
//             case '-':System.out.println("Result: " + (num1 - num2));
//                 break;
//             case '*':System.out.println("Result: " + (num1 * num2));
//                 break;
//             case '/': System.out.println("Result: " + (num1 / num2));
//                 break;
//             default:
//                 System.out.println("Invalid operator! Please enter one of the following: +, -, *, /");
//         }

 
//     } 
// }     



                                                    


                                                   



                                                