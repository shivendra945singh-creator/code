
                                           //print numbers from n to 1 in decreasing order
                                        


public class recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n- 1);
    }

    // public static void main(String args[]) {
    //     int n = 10;
    //     printDec(n);
    // }
    
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




    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n+" ");
    }

    // public static void main(String args[]) {
    //     int n = 10;
    //     printInc(n);
    // } 
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


    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;// base case: factorial of 0 or 1 is 1
        }
       int fnm1 = factorial(n - 1); // recursive call to find factorial of (n-1)
       int fn = n * fnm1; // calculate factorial of n using the result from the recursive call
       return fn; // return the factorial of n
    }

//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println("Factorial of " + n + " is: " + factorial(n));
//     }
// }                 




                                            //print sum of first n natural numbers



  
  // time complexity and space complexity: O(n)


    public static int  calsum(int n) {
        if (n == 1) {
            return 1; // base case: sum of first 1 natural number is 1
        }
        int snm1 = calsum(n - 1); // recursive call to find sum of first (n-1) natural numbers
        int sn = n + snm1; // calculate sum of first n natural numbers using the result from the recursive call
        return sn; // return the sum of first n natural numbers
    }

//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println("Sum of first " + n + " natural numbers is: " + calsum(n));
//     }  
// }                                       





                                                    //print Fibonacci series up to n terms




   // time complexity: O(2^n) and space complexity: O(n)


    public static int fib(int n) {
        if (n == 0) {
            return 0; // base case: Fibonacci of 0 is 0
        }
        if (n == 1) {
            return 1; // base case: Fibonacci of 1 is 1
        }
        int fnm1 = fib(n - 1); // recursive call to find Fibonacci of (n-1)
        int fnm2 = fib(n - 2); // recursive call to find Fibonacci of (n-2)
        int fn = fnm1 + fnm2; // calculate Fibonacci of n using the results from the recursive calls
        return fn; // return the Fibonacci of n
    }

//     public static void main(String args[]) {
//         int n = 26;
//         System.out.println("Fibonacci series up to " + 23 + " terms is:" + fib(n));
//           System.out.println("Fibonacci series up to " + 24 + " terms is:" + fib(n));
//              System.out.println("Fibonacci series up to " + 25 + " terms is:" + fib(n));
//                 System.out.println("Fibonacci series up to " + 26 + " terms is:" + fib(n));
//                    System.out.println("Fibonacci series up to " + 27 + " terms is:" + fib(n));
//     }   
// }   




                                               //check if an array is sorted or not



   // time complexity: O(n) and space complexity: O(n)


    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true; // base case: if we have reached the end of the array, it is sorted
        }
        if (arr[i] > arr[i + 1]) {
            return false; // if the current element is greater than the next element, the array is not sorted
        }
        return isSorted(arr, i + 1); // recursive call to check the rest of the array
    }

    // public static void main(String args[]) {
    //     int arr[] = {1, 2, 3, 4, 5};
    //     if (isSorted(arr, 0)) {
    //         System.out.println("The array is sorted.");
    //     } else {
    //         System.out.println("The array is not sorted.");
    //     }
    // }
}                                            




                                                       //or



  // time complexity: O(n) and space complexity: O(n)


    // public static boolean isSorted(int arr[], int i) {
    //     if (i == arr.length - 1) {
    //         return true; // base case: if we have reached the end of the array, it is sorted
    //     }
    //     if (arr[i] > arr[i + 1]) {
    //         return false; // if the current element is greater than the next element, the array is not sorted
    //     }
    //     return isSorted(arr, i + 1); // recursive call to check the rest of the array
    // }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5};
//         System.err.println(isSorted(arr, 0));
//     }
// }





                                             //find the firstoccurrence of an element in an array


   // time complexity: O(n) and space complexity: O(n)


    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1; // base case: i7f we have reached the end of the array without finding the key, return -1
        }
        if (arr[i] == key) {
            return i; // if the current element is equal to the key, return its index
        }
        return firstOcc(arr, key, i + 1); // recursive call to check the rest of the array
    }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 3,4,5};
//         int key = 3;
//         int result = firstOcc(arr, key, 0);
//         if (result != -1) {
//             System.out.println("The first occurrence of " + key + " is at index: " + result);
//         } else {
//             System.out.println(key + " not found in the array.");
//         }
//     }
// }                                       


                                                       //or


   // time complexity: O(n) and space complexity: O(n)


    // public static int firstOcc(int arr[], int key, int i) {
    //     if (i == arr.length) {
    //         return -1; // base case: if we have reached the end of the array without finding the key, return -1
    //     }
    //     if (arr[i] == key) {
    //         return i; // if the current element is equal to the key, return its index
    //     }
    //     return firstOcc(arr, key, i + 1); // recursive call to check the rest of the array
    // }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 3, 6};
//        System.err.println(firstOcc(arr, 3, 0));
// } 
// }




                                            // find the last occurrence of an element in an array




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


                                                                 //or



    // time complexity: O(n) and space complexity: O(n) 


//     public static int lastOcc(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1; // base case: if we have reached the end of the array without finding the key, return -1
//         }
//         int isFound = lastOcc(arr, key, i + 1); // recursive call to check the rest of the array
//         if (isFound ==-1 && arr[i] == key) {
//              return i; // if the current element is equal to the key and the key was not found in the rest of the array, return its index
//            // if the key was found in the rest of the array, return its index
//         }
        
//         return isFound; // if the key was not found in the current element or the rest of the array, return -1
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
    public static int power(int x, int n) {
        if (n == 0) {
            return 1; // base case: any number raised to the power of 0 is 1
        }
        
        return x * power(x, n - 1); // recursive call to find x raised to the power of (n-1) and multiply it by x to get x raised to the power of n
    }

    // public static void main(String args[]) {
        // int x = 2;
        // int n = 5;
//         System.out.println(x + " raised to the power of " + n + " is: " + power(x, n));
//     }
//  }  



                                             //find x raised to the power n (x^n) optimized



    // time complexity: O(log n) and space complexity: O(log n)
    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1; // base case: any number raised to the power of 0 is 1
        }
        int halfPower = optimizedPower(x, n / 2); // recursive call to find x raised to the power of (n/2)
        int halfPowerSq = halfPower * halfPower; // calculate x raised to the power of (n/2) squared

        //n is odd
        if (n % 2 != 0) { // if n is odd, multiply by x one more time
            halfPowerSq *= x;
        }
        return halfPowerSq; // return x raised to the power of n

    }

    // public static void main(String args[]) {
        // int x = 2;
        // int n = 5;
//         System.out.println(x + " raised to the power of " + n + " is: " + optimizedPower(x, n));
//     } 
// }                                          



                                               //tiling problem 




  public static int tilingProblem(int n) { //2xn board size and 2x1 tiles
    // base cases: if n is 0 or 1, there is only one way to tile the board
    if (n == 0 || n == 1) {
        return 1; // base case: there is one way to tile a 2x0 or 2x1 board
    }
    //vertical choice
    int fnm1 = tilingProblem(n - 1); // recursive call to find the number of ways to tile a 2x(n-1) board

    //horizontal choice
    int fnm2 = tilingProblem(n - 2); // recursive call to find the number of ways to tile a 2x(n-2) board

    int totalWays = fnm1 + fnm2; // calculate the number of ways to tile a 2xn board using the results from the recursive calls
    return totalWays; // return the number of ways to tile a 2xn board
      
  }  
  
  // public static void main(String[] args) {
    // int n = 5;
    // System.out.println("Number of ways to tile a 2x" + n + " board is: " + tilingProblem(n));
  // }
// }




                                         //remove duplicates in a string


 public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
    // base case: if we have reached the end of the string, print the new string and return
    if (idx == str.length()) {
        System.out.println(newStr);
        return;
    }
    //kaam
    char currChar = str.charAt(idx); // get the current character
    if (map[currChar - 'a'] == true) { // if the current character has already been seen, skip it
      //duplicate
        removeDuplicates(str, idx + 1, newStr, map);
    } else { // if the current character has not been seen, add it to the new string and mark it as seen
        map[currChar - 'a'] = true; // mark the current character as seen
        removeDuplicates(str, idx + 1, newStr.append(currChar), map); // recursive call to process the rest of the string
    } 
  }
  
    public static void main(String args[]) {
        String str = "aabbccaapnaaacollegeee";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
  // }

  
  