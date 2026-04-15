                                                           //use of while loop




// public class loops {
//     public static void main(String[] args) {
//     int counter =0;
//     while(counter <=10) {
//         System.out.println("hello world");
//         counter++;   // if we do not use counter ++ the hw print unlimited times
//     }
//     }
    
// }



                                                          //or



// public class loops {
//     public static void main(String[] args) {
//     int counter =0;
//     while(true) {      //here if we write while condition true then hw print unlimited times
//         System.out.println("hello world");
//         counter++;  // if we do not use counter ++ the hw print unlimited times
//     }
//     }
    
// }


                                                       // print number from 1 to n



// import java.util.*;

// public class loops {
//     public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int range =  sc.nextInt();
//         int counter = 1;
//         while (counter<=range) {
//         System.out.print(counter + " "  );
//         counter++;
        
//     }
    
// } 
// }       



                                                    //sum of first n natural numbers
                


// import java.util.*;

// public class loops {
//     public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int n =  sc.nextInt();
//         int sum =0;
//         int i = 1;
//         while (i<=n) {
//             sum +=i;   // sum=sum+i
//             i++;
//        }
//        System.out.println(" sum is " + sum);


        
//     }
    
// } 




                                                                //for loop


// public class loops {
//     public static void main(String[] args) {
//         for ( int i=1; i<=10; i++) {
//             System.out.println("hello world");

//         }
//     }
// }



   



                                                          //print square pattern


// public class loops {
//     public static void main(String[] args) {
//         for ( int line=1; line<=10; line++) {
//             System.out.println("****");

//         }
//     }
// }






                                                                  //or

                                              
// public class loops {
//     public static void main(String[] args) {
//         int line =1;
//         while(line<=4) {
//             System.out.println("****" );
//             line++;

//         }
//     }
// }
 


                                                        //print reverse of a number

// public class loops {
//     public static void main(String[] args) {
//         int n =10899;
//         while(n>0) {
//             int lastdigit = n%10;     //lastdigit print hoga
//             System.out.print(lastdigit );
//             n=n/10;       // last digit remove hoga

//         }
        
//     }
// }




                                                   // reverse the given number !!




// public class loops {
//     public static void main(String[] args) {
//         int n =10899;
//         int  rev =0;

//         while(n>0) {
//             int lastdigit = n%10;     //lastdigit print hoga
//             rev = (rev*10) + lastdigit;
//             n=n/10; 
//         }
//         System.out.println(rev);
        
//     }
// }



                                                       //do while loop




//   public class loops {
//     public static void main(String[] args) {
//         int counter =1;
//         do { 
//             System.out.println("hello world");
//             counter++;
            
//         } while (counter<=10);
//     }
//   }                                            
 
 
 



                                                         //break statement




//   public class loops {
//     public static void main(String[] args) {
//         for ( int i=1; i<=10; i++) {
//             if (i==3) {
//                 break;   //loop ki condition se exit
//             }
//             System.out.println(i);

//         }
//         System.out.print("i am out of the loop");
//     }
// }                                              




                                            //keep entering numbers till user enters a multiple of 10 by using do  while statement




// import java.util.*;

// public class loops {
//     public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number : ");
//        do { 
//         int n = sc.nextInt();
//         if(n %10 ==0) {
//             break;
//         }
//         System.out.println(n);
           
//        } while (true);


        
//     }
    
// } 



                                                //continue statement means  to skip an iteration



//     public class loops {
//     public static void main(String[] args) {
//         for ( int i=1; i<=10; i++) {
//             if (i==3) {
//                 continue;   // i=3 ko skip kar dege
//             }
//             System.out.print(i);

//         }
        
//     }
// }                                                 




                                       //display all numbers entered by users except multiple of 10 by using do  while statement with the help of continue




// import java.util.*;

// public class loops {
//     public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number : ");
//        do { 
//         int n = sc.nextInt();
//         if(n %10 ==0) {
//             continue;
//         }
//         System.out.println( "number was :" + n);
           
//        } while (true);  
//     }
    
// } 


                                                      // check a mumber is prime or not



// import java.util.*;

// public class loops {
//     public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" enter a number : ");
//         int n = sc.nextInt();
        

//         if (n == 2) {
//             System.out.println ( n +" is prime");
//         } else {
//             boolean isPrime = true;    //let a  number is always prime
//             for (int i = 2; i <=n-1; i++) {
//                 if(n % i ==0) {
//                     isPrime = false;  // composite number
//                 }
//             }


//             if (isPrime == true) {
//                 System.out.println(n + " is  a prime number ");
//             } else {
//                 System.out.println(n + " is not a prime number");
//             }
//         }
//     }

//     }




                                                        //or



// import java.util.*;

// public class loops {
//     public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" enter a number : ");
//         int n = sc.nextInt();
        

//         if (n == 2) {
//             System.out.println ( n +" is prime");
//         } else {
//             boolean isPrime = true;    //let a  number is always prime
//             for (int i = 2; i <=Math.sqrt(n); i++) {    // here i=2 to square root n and math.sqrt is use for taking root 
//                 if(n % i ==0) {
//                     isPrime = false;  // composite number
//                 }
//             }


//             if (isPrime == true) {
//                 System.out.println(n + " is  a prime number ");
//             } else {
//                 System.out.println(n + " is not a prime number");
//             }
//         }
//     }

//     }






                                                  // practise questions


                                                  // Q1


//  How many times 'Hello' is printed ?



// public class loops{
//     public static void main(String[]args){
//     for(int i=0; i<5; i++) {
//     System.out.println("Hello");
//     i+=2;
//     }
//     }
// }



                                                    //answer


   //Iteration 1: starts at i = 0. It prints "Hello". Then, i += 2 makes i = 2. Finally, the loop's own i++ runs, making i = 3.
   // Iteration 2: starts at i = 3. Since 3 < 5, it prints "Hello" again. Then, i += 2 makes i = 5. Finally, the loop's i++ runs, making i = 6.
   // Termination: The condition i < 5 is checked. Since 6 is not less than 5, the loop terminates.

   // Total "Hello" count: 2                                                 





                                                      // Q2


// Write a program to print the multiplication table of a number N, entered by the user.  



// import java.util.*;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int n = sc.nextInt();

//         for (int i=1; i<=10; i++) {
//             System.out.println(n + " x " + i + " = " + n*i);
//         }
//     }
// }



                                                          // Q3


  //What is wrong in the following program?

//   public class loops {
//   public static void main(String args[]) {

//   for(int i=0 ;i <=5 ; i++ ) {
//    System.out.println("i = "+i);
//   }
// System.out.println("i after the loop = " + i);
// }
// }                                                        



                                                          // answer


 //Scope Visibility: Your final print statement System.out.println("i after the loop = " + i); is trying to access i outside of the loop where it was defined. 
 // This will cause a compiler error: cannot find symbol: variable i.   
 
 







                                                             // Q4  !!


// Write a program that reads a set of integers, and then prints the sum of the even and odd integers



  import java.util.*;
  public class loops{
  public static void main(String[]args) {
  Scanner sc = new Scanner(System.in);
  int number;
  int choice;
  int evenSum=0;
  int oddSum=0;

  do {
    System.out.print("Enter the number : ");
    number=sc.nextInt();

  if(number%2==0) {
    evenSum+=number;
  }else{
    oddSum+=number;
  }
  
  System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
  choice=sc.nextInt();
  }while(choice==1);

  System.out.println("Sum of even numbers: "+evenSum);
  System.out.println("Sum of odd numbers: "+oddSum);

  }
  }                                                           



                                                         //##complete