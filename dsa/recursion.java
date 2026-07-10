
                                      //print numbers from n to 1 in decreasing order
                                        


//   public class recursion {
//     public static void printDec(int n) {
//         if (n == 1) {
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printDec(n- 1);
//     }

//     public static void main(String args[]) {
//         int n = 10;
//         printDec(n);
//     }
    
// }



// Dry Run for n = 10

// Step-by-step execution:

// Main method calls printDec(10).
// Since n != 1, it prints 10 and calls printDec(9).
// printDec(9) prints 9 and calls printDec(8).
// This continues until printDec(1) is called.

// Call Stack Behavior

// When n = 1:

// Condition if (n == 1) is true → prints 1 with a newline and returns.
// The recursion then unwinds, but there’s no more printing after the recursive call, so nothing else is printed.

// Execution Order

// Copy code
// printDec(10) → prints "10 "
// printDec(9)  → prints "9 "
// printDec(8)  → prints "8 "
// ...
// printDec(2)  → prints "2 "
// printDec(1)  → prints "1\n"
// Final Output

// Copy code
// 10 9 8 7 6 5 4 3 2 1



                                          //print numbers from 1 to n in increasing order




    // public static void printInc(int n) {
    //     if (n == 1) {
    //         System.out.print(n + " ");
    //         return;
    //     }
    //     printInc(n - 1);
    //     System.out.print(n+" ");
    // }

    // public static void main(String args[]) {
    //     int n = 10;
    //     printInc(n);
    // } 



//dry run

// Step-by-step execution:

// Main method calls printInc(10).
// Since n != 1, it calls printInc(9) before printing anything.
// printInc(9) calls printInc(8).
// This continues until printInc(1) is called.

// Call Stack Behavior
// When n = 1:

// Condition if (n == 1) is true → prints 1 and returns.
// Now the stack starts unwinding:

// Returning to printInc(2) → prints 2
// Returning to printInc(3) → prints 3
// ...
// Returning to printInc(10) → prints 10


// Execution Order

// Copy code
// printInc(10)
//  └── printInc(9)
//       └── printInc(8)
//            └── ...
//                 └── printInc(1) → prints "1 "
//            prints "2 "
//       prints "3 "
//  ...
// prints "10 "
// Final Output

// Copy code
// 1 2 3 4 5 6 7 8 9 10




                                               // find factorial of N

                                                  


// time complexity and space complexity: O(n)



// public class recursion {
//     public static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;// base case: factorial of 0 or 1 is 1
//         }
//        int fnm1 = factorial(n - 1); // recursive call to find factorial of (n-1)
//        int fn = n * fnm1; // calculate factorial of n using the result from the recursive call
//        return fn; // return the factorial of n
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println("Factorial of " + n + " is: " + factorial(n));
//     }
// }         


// dry run

// Code logic
// factorial(0) or factorial(1) returns 1
// Otherwise it calls factorial(n - 1) and multiplies by n

// Dry run step by step
// Call 1:
// factorial(5)

// 5 is not 0 or 1
// calls factorial(4)
// Call 2:
// factorial(4)

// 4 is not 0 or 1
// calls factorial(3)
// Call 3:
// factorial(3)

// 3 is not 0 or 1
// calls factorial(2)
// Call 4:
// factorial(2)

// 2 is not 0 or 1
// calls factorial(1)
// Call 5:
// factorial(1)

// base case reached
// returns 1

// Returning back through recursion
// Back to factorial(2)
// fnm1 = 1
// fn = 2 * 1 = 2
// returns 2

// Back to factorial(3)
// fnm1 = 2
// fn = 3 * 2 = 6
// returns 6

// Back to factorial(4)
// fnm1 = 6
// fn = 4 * 6 = 24
// returns 24

// Back to factorial(5)
// fnm1 = 24
// fn = 5 * 24 = 120
// returns 120

// Final output
// Factorial of 5 is: 120




                                            //print sum of first n natural numbers



  
  // time complexity and space complexity: O(n)


    // public static int  calsum(int n) {
    //     if (n == 1) {
    //         return 1; // base case: sum of first 1 natural number is 1
    //     }
    //     int snm1 = calsum(n - 1); // recursive call to find sum of first (n-1) natural numbers
    //     int sn = n + snm1; // calculate sum of first n natural numbers using the result from the recursive call
    //     return sn; // return the sum of first n natural numbers
    // }

//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println("Sum of first " + n + " natural numbers is: " + calsum(n));
//     }  
// }                                       





                                                             //print Fibonacci series up to n terms




   // time complexity: O(2^n) and space complexity: O(n)

// public class recursion{
//     public static int fib(int n) {
//         if (n == 0) {
//             return 0; // base case: Fibonacci of 0 is 0
//         }
//         if (n == 1) {
//             return 1; // base case: Fibonacci of 1 is 1
//         }
//         int fnm1 = fib(n - 1); // recursive call to find Fibonacci of (n-1) term
//         int fnm2 = fib(n - 2); // recursive call to find Fibonacci of (n-2) term
//         int fn = fnm1 + fnm2; // calculate Fibonacci of n using the results from the recursive calls
//         return fn; // return the Fibonacci of n
//     }

//     public static void main(String args[]) {
//         int n = 26; //n is the number of terms in the Fibonacci series to be printed
//         System.out.println("Fibonacci series up to " + 23 + " terms is:" + fib(n));
//           System.out.println("Fibonacci series up to " + 24 + " terms is:" + fib(n));
//              System.out.println("Fibonacci series up to " + 25 + " terms is:" + fib(n));
//                 System.out.println("Fibonacci series up to " + 26 + " terms is:" + fib(n));
//                    System.out.println("Fibonacci series up to " + 27 + " terms is:" + fib(n));
//     }   
// }   




                                                          //check if an array is sorted or not


// time complexity: O(n) and space complexity: O(n)

// public class recursion{
//     public static boolean isSorted(int arr[], int i) {
//         if (i == arr.length - 1) {
//             return true; // base case: if we have reached the end of the array, it is sorted
//         }
//         if (arr[i] > arr[i + 1]) {
//             return false; // if the current element is greater than the next element, the array is not sorted
//         }
//         return isSorted(arr, i + 1); //  return true or false what it get //recursive call to check the rest of the array
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5};
//         if (isSorted(arr, 0)) { //if issrted is true then this print
//             System.out.println("The array is sorted.");
//         } else {
//             System.out.println("The array is not sorted.");
//         }
//     }
// }                                            




                                                                      //or



  // time complexity: O(n) and space complexity: O(n)

// public class recursion{
//     public static boolean isSorted(int arr[], int i) {
//         if (i == arr.length - 1) {
//             return true; // base case: if we have reached the end of the array, it is sorted
//         }
//         if (arr[i] > arr[i + 1]) {
//             return false; // if the current element is greater than the next element, the array is not sorted
//         }
//         return isSorted(arr, i + 1); // recursive call to check the rest of the array
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5};
//         System.err.println(isSorted(arr, 0));//start checking from the first index (0) of the array
//     }
// }





                                         //find the firstoccurrence of an element in an array


   // time complexity: O(n) and space complexity: O(n)

//  public class recursion{
//     public static int firstOcc(int arr[], int key, int i) {
//         if (i == arr.length ) {
//             return -1; // base case: if we have reached the end of the array without finding the key, return -1
//         }
//         if (arr[i] == key) {
//             return i; // if the current element is equal to the key, return its index
//         }
//         return firstOcc(arr, key, i + 1); // recursive call to check the rest of the array
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 3 ,4 ,5};
//         int key = 3;
//         int result = firstOcc(arr, key, 0);
//         if (result != -1) {
//             System.out.println("The first occurrence of " + key + " is at index: " + result);
//         } else {
//             System.out.println(key + " not found in the array.");
//         }
//     }
// }      



//why we use arr.length instead of arr.length-1

// int arr[] = {1, 2, 3, 4, 3, 4, 5};
// arr.length = 7
// last index = arr.length - 1 = 6
// So 5 is at index 6, which is arr.length - 1, not arr.length.

// Important
// arr.length = total number of elements = 7
// valid indexes = 0 to 6
// So index 6 is the last valid index.

// Why i == arr.length is used in base case
// When i becomes 7, that means:

// all indexes 0 to 6 have already been checked
// now there is nothing left to check
// so return -1


                                                                           //or


   // time complexity: O(n) and space complexity: O(n)

//  public class recursion{
//     public static int firstOcc(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1; // base case: if we have reached the end of the array without finding the key, return -1
//         }
//         if (arr[i] == key) {
//             return i; // if the current element is equal to the key, return its index
//         }
//         return firstOcc(arr, key, i + 1); // recursive call to check the rest of the array
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 3, 6};
//        System.out.println(firstOcc(arr, 3, 0));
// } 
// }




                                         // find the last occurrence of an element in an array




                                         
//time complexity: O(n) and space complexity: O(n) 

//  public class recursion{
//     public static int lastOcc(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1; // base case: if we have reached the end of the array without finding the key, return -1
//         }
//         int isFound = lastOcc(arr, key, i + 1); // recursive call to check the rest of the array
//         if (isFound ==-1 && arr[i] == key) {
//              return i; 
          
//         }
        
//         return isFound; 
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 3, 6};
//      System.out.println(lastOcc(arr, 3, 0));
//     }
// }


// dry run

// Array:

// int arr[] = {1, 2, 3, 4, 5, 3, 6};
// Key : 3

// Recursive calls going forward
// The function keeps calling itself until i == arr.length.

// Call stack:
// lastOcc(arr, 3, 0)
// lastOcc(arr, 3, 1)
// lastOcc(arr, 3, 2)
// lastOcc(arr, 3, 3)
// lastOcc(arr, 3, 4)
// lastOcc(arr, 3, 5)
// lastOcc(arr, 3, 6)
// lastOcc(arr, 3, 7) → base case

// Base case
// When i == arr.length:

// if (i == arr.length) {
//     return -1;
// }
// So:

// lastOcc(arr, 3, 7) returns -1

// Unwinding the recursion
// Now the calls return backward.


// Call at i = 7
// lastOcc(arr, 3, 7)
// i == arr.length
// returns -1

// Call at i = 6
// lastOcc(arr, 3, 6)
// This line runs:
// int isFound = lastOcc(arr, 3, 7);
// So:
// isFound = -1
// Now:

// arr[6] = 6
// 6 == 3 → false
// So it returns: -1

// Call at i = 5
// lastOcc(arr, 3, 5)
// This line runs:
// int isFound = lastOcc(arr, 3, 6);
// And lastOcc(arr, 3, 6) returned -1
// So:
// isFound = -1

// Now:
// arr[5] = 3
// 3 == 3 → true
// isFound == -1 → true
// So it returns: 5

// Call at i = 4
// lastOcc(arr, 3, 4)
// This line runs:

// int isFound = lastOcc(arr, 3, 5);
// And lastOcc(arr, 3, 5) returned 5

// So now:

// isFound = 5

// 4) Returning to lastOcc(arr, 3, 3)
// isFound = 5
// returns 5

// 5) Returning to lastOcc(arr, 3, 2)
// isFound = 5
// arr[2] = 3, but isFound != -1, so it does not overwrite
// returns 5

// 6) Returning to lastOcc(arr, 3, 1)
// isFound = 5
// returns 5

// 7) Returning to lastOcc(arr, 3, 0)
// isFound = 5
// returns 5

// Final output :5

                                                                    //or


    // time complexity: O(n) and space complexity: O(n) 


//     public static int lastOcc(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1; // base case: if we have reached the end of the array without finding the key, return -1
//         }
//         int isFound = lastOcc(arr, key, i + 1); // recursive call to check the rest of the array
//         if (isFound != -1) {
//             return isFound; // if the key was found in the rest of the array, return its index
//         }
//         if (arr[i] == key) {
//             return i; // if the current element is equal to the key, return its index
//         }
//         return -1; // if the key was not found in the current element or the rest of the array, return -1
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 3, 6};
//         int key = 3;
//         int result = lastOcc(arr, key, 0);
//         if (result != -1) {
//             System.out.println("The last occurrence of " + key + " is at index: " + result);
//         } else {
//             System.out.println(key + " not found in the array.");
//         }
//     }
// }   


                                                                          //or



  // time complexity: O(n) and space complexity: O(n) 


//     public static int lastOcc(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1; // base case: if we have reached the end of the array without finding the key, return -1
//         }
//         int isFound = lastOcc(arr, key, i + 1); // recursive call to check the rest of the array
//         if (isFound != -1) {
//             return isFound; // if the key was found in the rest of the array, return its index
//         }
//         if (arr[i] == key) {
//             return i; // if the current element is equal to the key, return its index
//         }
//         return -1; // if the key was not found in the current element or the rest of the array, return -1
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 3, 6};
//      System.err.println(lastOcc(arr, 3, 0));
//     }
// }





                                                               //find x raised to the power n (x^n)



    // time complexity: O(n) and space complexity: O(n)


    // public static int power(int x, int n) {
    //     if (n == 0) {
    //         return 1; // base case: any number raised to the power of 0 is 1
    //     }
    //     int xnm1 = power(x, n - 1); // recursive call to find x raised to the power of (n-1)
    //     int xn = x * xnm1; // calculate x raised to the power of n using the result from the recursive call
    //     return xn; // return x raised to the power of n
    // }

//     public static void main(String args[]) {
//         int x = 2;
//         int n = 5;
//         System.out.println(x + " raised to the power of " + n + " is: " + power(x, n));
//     }
//  }      


                                                                        //or



//   //  time complexity: O(n) and space complexity: O(n)


//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1; // base case: any number raised to the power of 0 is 1
//         }
//         int xnm1 = power(x, n - 1); // recursive call to find x raised to the power of (n-1)
//         int xn = x * xnm1; // calculate x raised to the power of n using the result from the recursive call
//         return xn; // return x raised to the power of n
//     }

//     public static void main(String args[]) {
//         System.out.println( power(2, 5));
//     }
//  }  


                                                                         //or


   // time complexity: O(n) and space complexity: O(n)


    // public static int power(int x, int n) {
    //     if (n == 0) {
    //         return 1; // base case: any number raised to the power of 0 is 1
    //     }
        
    //     return x * power(x, n - 1); // recursive call to find x raised to the power of (n-1) and multiply it by x to get x raised to the power of n
    // }

    // public static void main(String args[]) {
        // int x = 2;
        // int n = 5;
//         System.out.println(x + " raised to the power of " + n + " is: " + power(x, n));
//     }
//  }  



                                                           //find x raised to the power n (x^n) optimized



    // time complexity: O(log n) and space complexity: O(log n)
    // public static int optimizedPower(int x, int n) {
    //     if (n == 0) {
    //         return 1; // base case: any number raised to the power of 0 is 1
    //     }
    //     int halfPower = optimizedPower(x, n / 2); // recursive call to find x raised to the power of (n/2)
    //     int halfPowerSq = halfPower * halfPower; // calculate x raised to the power of (n/2) squared

    //     //n is odd
    //     if (n % 2 != 0) { // if n is odd, multiply by x one more time
    //         halfPowerSq *= x;
    //     }
    //     return halfPowerSq; // return x raised to the power of n

    // }

    // public static void main(String args[]) {
        // int x = 2;
        // int n = 5;
//         System.out.println(x + " raised to the power of " + n + " is: " + optimizedPower(x, n));
//     } 
// }                                          



                                                                      //tiling problem 



// public class recursion {
//   public static int tilingProblem(int n) { //2xn board size and 2x1 tiles
//     // base cases: if n is 0 or 1, there is only one way to tile the board
//     if (n == 0 || n == 1) {
//         return 1; // base case: there is one way to tile a 2x0 or 2x1 board
//     }
//     //vertical choice
//     int fnm1 = tilingProblem(n - 1); // recursive call to find the number of ways to tile a 2x(n-1) board

//     //horizontal choice
//     int fnm2 = tilingProblem(n - 2); // recursive call to find the number of ways to tile a 2x(n-2) board

//     int totalWays = fnm1 + fnm2; // calculate the number of ways to tile a 2xn board using the results from the recursive calls
//     return totalWays; // return the number of ways to tile a 2xn board
      
//   }  
  
//   public static void main(String[] args) {
//     int n = 5;
//     System.out.println("Number of ways to tile a 2x" + n + " board is: " + tilingProblem(n));
//   }
// }

//dry run

// Dry run for tilingProblem(5)

// Call 1: tilingProblem(5)
// n is not 0 or 1
// Need:
// fnm1 = tilingProblem(4)
// fnm2 = tilingProblem(3)

// Call 2: tilingProblem(4)
// n is not 0 or 1
// Need:
// fnm1 = tilingProblem(3)
// fnm2 = tilingProblem(2)

// Call 3: tilingProblem(3)
// n is not 0 or 1
// Need:
// fnm1 = tilingProblem(2)
// fnm2 = tilingProblem(1)

// Call 4: tilingProblem(2)
// n is not 0 or 1
// Need:
// fnm1 = tilingProblem(1)
// fnm2 = tilingProblem(0)

// Call 5: tilingProblem(1)
// Base case
// Returns 1

// Call 6: tilingProblem(0)
// Base case
// Returns 1

// Now go back to tilingProblem(2):

// fnm1 = 1
// fnm2 = 1
// totalWays = 1 + 1 = 2
// Returns 2

// Back to tilingProblem(3):

// fnm1 = tilingProblem(2) = 2
// fnm2 = tilingProblem(1) = 1
// totalWays = 2 + 1 = 3
// Returns 3

// Back to tilingProblem(4):

// fnm1 = tilingProblem(3) = 3
// fnm2 = tilingProblem(2) = 2
// totalWays = 3 + 2 = 5
// Returns 5

// Back to tilingProblem(5):

// fnm1 = tilingProblem(4) = 5
// fnm2 = tilingProblem(3) = 3
// totalWays = 5 + 3 = 8
// Returns 8

// Final Output : Number of ways to tile a 2x5 board is: 8
// Call tree summary
// tilingProblem(5)
// = tilingProblem(4) + tilingProblem(3)
// = (tilingProblem(3) + tilingProblem(2)) + (tilingProblem(2) + tilingProblem(1))
// = ...
// = 8

// Values by n
// tilingProblem(0) = 1
// tilingProblem(1) = 1
// tilingProblem(2) = 2
// tilingProblem(3) = 3
// tilingProblem(4) = 5
// tilingProblem(5) = 8


                                                       //or




// public class recursion {
//   public static int tilingProblem(int n) { //2xn board size and 2x1 tiles
//     // base cases: if n is 0 or 1, there is only one way to tile the board
//     if (n == 0 || n == 1) {
//         return 1; // base case: there is one way to tile a 2x0 or 2x1 board
//     }

//     return  tilingProblem(n - 1) + tilingProblem(n - 2);
      
//   }  
  
//   public static void main(String[] args) {
//     int n = 5;
//     System.out.println("Number of ways to tile a 2x" + n + " board is: " + tilingProblem(n));
//   }
// }


//dry run 

// Code logic
// tilingProblem(n) = tilingProblem(n - 1) + tilingProblem(n - 2)

// Base cases:
// tilingProblem(0) = 1
// tilingProblem(1) = 1

// Dry run
// 1) tilingProblem(5)
// n is not 0 or 1
// So it calls:
// tilingProblem(4)
// tilingProblem(3)

// 2) tilingProblem(4)
// n is not 0 or 1
// So it calls:
// tilingProblem(3)
// tilingProblem(2)

// 3) tilingProblem(3)
// n is not 0 or 1
// So it calls:
// tilingProblem(2)
// tilingProblem(1)

// 4) tilingProblem(2)
// n is not 0 or 1
// So it calls:
// tilingProblem(1)
// tilingProblem(0)

// 5) tilingProblem(1)
// Base case
// Returns 1

// 6) tilingProblem(0)
// Base case
// Returns 1

// Now go back to tilingProblem(2):

// tilingProblem(1) = 1
// tilingProblem(0) = 1
// Return 1 + 1 = 2

// Back to tilingProblem(3):

// tilingProblem(2) = 2
// tilingProblem(1) = 1
// Return 2 + 1 = 3

// Back to tilingProblem(4):

// tilingProblem(3) = 3
// tilingProblem(2) = 2
// Return 3 + 2 = 5

// Back to tilingProblem(5):

// tilingProblem(4) = 5
// tilingProblem(3) = 3
// Return 5 + 3 = 8

// Final output : Number of ways to tile a 2x5 board is: 8

// Recursion tree
// tilingProblem(5)
// ├── tilingProblem(4)
// │   ├── tilingProblem(3)
// │   │   ├── tilingProblem(2)
// │   │   │   ├── tilingProblem(1) = 1
// │   │   │   └── tilingProblem(0) = 1
// │   │   │   => 2
// │   │   └── tilingProblem(1) = 1
// │   │   => 3
// │   └── tilingProblem(2)
// │       ├── tilingProblem(1) = 1
// │       └── tilingProblem(0) = 1
// │       => 2
// │   => 5
// └── tilingProblem(3)
//     ├── tilingProblem(2)
//     │   ├── tilingProblem(1) = 1
//     │   └── tilingProblem(0) = 1
//     │   => 2
//     └── tilingProblem(1) = 1
//     => 3
// => 8



                                         //remove duplicates in a string



// public class recursion {
//  public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
//     // base case: if we have reached the end of the string, print the new string and return
//     if (idx == str.length()) {
//         System.out.println(newStr);
//         return;
//     }
//     //kaam
//     char currChar = str.charAt(idx); // get the current character
//     if (map[currChar - 'a'] == true) { // if the current character has already been seen, skip it
//       //duplicate
//         removeDuplicates(str, idx + 1, newStr, map);
//     } else { // if the current character has not been seen, add it to the new string and mark it as seen
//         map[currChar - 'a'] = true; // mark the current character as seen
//         removeDuplicates(str, idx + 1, newStr.append(currChar), map); // recursive call to process the rest of the string
//     } 
//   }
  
//     public static void main(String args[]) {
//         String str = "aabbccaapnaaacollegeee";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
//    }

//dry run  
   
// In Java, when you create a boolean array, all elements are automatically set to false.

// So : boolean map[] = new boolean[26];
// creates: [false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]
// In your code
// removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
// Here:

// new boolean[26] creates an array of 26 booleans
// all values start as false
// false means: character not seen yet
// true means: character already seen

// Example
// Before processing anything:

// map[0] for 'a' = false
// map[1] for 'b' = false
// map[2] for 'c' = false
// So when first 'a' comes:

// if (map[currChar - 'a'] == true)
// becomes:

// if (map[0] == true)
// which is:

// if (false == true)
// So it goes to else, adds 'a', and makes map[0] = true.

//note
// map[0] is not the value 'a'.
// map[0] is a boolean that tells whether 'a' has been seen.

// What map[0] means
// map[0] = status of 'a'
// false = 'a' not seen yet
// true = 'a' already seen
// So initially:

// map[0] = false
// That means this condition:

// if (map[0] == true)
// becomes:

// if (false == true)
// which is false, so the if block does not run.

// Why else runs first
// Because 'a' is not seen initially.

// So for first 'a':

// map[0] = false
// condition fails
// program goes to else
// marks it as seen:
// map[0] = true;
// Then next time 'a' comes
// Now:

// map[0] = true
// So:

// if (map[0] == true)
// becomes:

// if (true == true)
// Now the if block runs, and that 'a' is skipped.

// Important difference
// 'a' is a character
// map[0] is a boolean
// They are not the same.

// map[0] just stores whether 'a' was already found.





                                                        //friend pairing problem


// public class recursion {
//   public static int friendPairing(int n) {
//     // base case: if there are 1 or 2 friends, there is only one or 2 way to pair them
//     if (n == 1 || n == 2) {
//         return n; 
//     }
//     // choice 1: the first friend remains single, so we need to pair the remaining (n-1) friends
//     int single = friendPairing(n - 1); // recursive call for the case where the first friend remains single

//     // choice 2: the first friend pairs up with any of the remaining (n-1) friends, so we need to pair the remaining (n-2) friends
//     int pairUp = (n - 1) * friendPairing(n - 2); // recursive call for the case where the first friend pairs up with another friend

//     int totalWays = single + pairUp; // calculate the total number of ways to pair n friends using the results from the recursive calls
//     return totalWays; // return the total number of ways to pair n friends
    
// }  
//     public static void main(String args[]) {
//         int n = 3;
//         System.out.println("Number of ways to pair " + n + " friends is: " + friendPairing(n));
//     }
// }       


                                              // or


// public class recursion {
//   public static int friendPairing(int n) {
//     // base case: if there are 1 or 2 friends, there is only 1 or 2 way to pair them
//     if (n == 1 || n == 2) {
//         return 1; 
//     }
    
//     return friendPairing(n - 1) + (n - 1) * friendPairing(n - 2); // recursive calls for both choices: single and pair up
// }
//     public static void main(String args[]) {
//         int n = 3;
//         System.out.println("Number of ways to pair " + n + " friends is: " + friendPairing(n));
//     }

// }


                                              //binary string problem
                                    //(print all binary string of size n without consecutive ones)



                                    
// public class recursion {
//     public static void printBinaryString(int n , int lastplace, String str) {
//         //base case
//         if(n==0) {
//             System.out.println(str);
//             return;
//         }

//         if(lastplace ==0) {
//             printBinaryString(n-1, 0, str+"0");
//             printBinaryString(n-1, 1, str+"1");
//         }else {//if(lastplace ==1)
//              printBinaryString(n-1, 0, str+"0");
//         }
//     }

//         public static void main(String args[]) {
//         printBinaryString(3, 0, "");//all posiblities of 3 digit numbers in which no 1 consecutive number not occur
//     }
// }



// Dry run

// Initial call : printBinaryString(3, 0, "")
// Since n != 0 and lastplace == 0, it makes 2 calls:
// printBinaryString(2, 0, "0")
// printBinaryString(2, 1, "1")

// 1) Call: printBinaryString(2, 0, "0")
// n != 0, lastplace == 0, so again 2 calls:
// printBinaryString(1, 0, "00")
// printBinaryString(1, 1, "01")

// 1.1) Call: printBinaryString(1, 0, "00")
// n != 0, lastplace == 0, so 2 calls:
// printBinaryString(0, 0, "000")
// printBinaryString(0, 1, "001")

// 1.1.1) Call: printBinaryString(0, 0, "000")
// Base case reached: 000

// 1.1.2) Call: printBinaryString(0, 1, "001")
// Base case reached: 001

// 1.2) Call: printBinaryString(1, 1, "01")
// Since lastplace == 1, only one call is allowed:
// printBinaryString(0, 0, "010")

// 1.2.1) Call: printBinaryString(0, 0, "010")
// Base case reached: 010

// 2) Call: printBinaryString(2, 1, "1")
// Since lastplace == 1, only one call is allowed:
// printBinaryString(1, 0, "10")

// 2.1) Call: printBinaryString(1, 0, "10")
// n != 0, lastplace == 0, so 2 calls:
// printBinaryString(0, 0, "100")
// printBinaryString(0, 1, "101")

// 2.1.1) Call: printBinaryString(0, 0, "100")
// Base case reached: 100

// 2.1.2) Call: printBinaryString(0, 1, "101")
// Base case reached: 101

// Final output
// 000
// 001
// 010
// 100
// 101

                                                                         //or

// public class recursion {
//     public static void printBinaryString(int n , int lastplace, String str) {
//         //base case
//         if(n==0) {
//             System.out.println(str);
//             return;
//         }

//         //kaam
//         printBinaryString( n-1, 0, str+"0");

//         if(lastplace == 0) {
//             printBinaryString(n-1 , 1, str+"1");
//         }
//     }

//     public static void main(String args[]) {
//         printBinaryString(3, 0, "");//all posiblities of 3 digit numbers in which no 1 consecutive number not occur
//     }
// }



