// public class bitwisemanupulation {
//     public static void main(String[] args) {
//         int a = 5; // in binary 0101
//         int b = 6; // in binary 0110

//         // bitwise AND
//         int andResult = a & b; // 0101 & 0110 = 0100 (4 in decimal)
//         System.out.println("Bitwise AND: " + andResult);

//         // bitwise OR
//         int orResult = a | b; // 0101 | 0110 = 0111 (7 in decimal)
//         System.out.println("Bitwise OR: " + orResult);

//         // bitwise XOR
//         int xorResult = a ^ b; // 0101 ^ 0110 = 0011 (3 in decimal)
//         System.out.println("Bitwise XOR: " + xorResult);

//         // bitwise NOT
//         int notResult = ~a; // ~0101 = 1010 (in two's complement, this is -6 in decimal)
//         System.out.println("Bitwise NOT: " + notResult);

//         // left shift
//         int leftShiftResult = a << 1; // 0101 << 1 = 1010 (10 in decimal)
//         System.out.println("Left Shift: " + leftShiftResult);

//         // right shift
//         int rightShiftResult = a >> 1; // 0101 >> 1 = 0010 (2 in decimal)
//         System.out.println("Right Shift: " + rightShiftResult);

//     }
    
// }



                                    ///check a number is even or odd using bitwise operator
                                    


//   public class bitwisemanupulation {
//     public static void oddoreven(int n) {
//         int bitmask = 1; // in binary 0001
//         if ((n & bitmask) == 0) { // if the last bit is 0, the number is even
//             System.out.println(n + " is even number.");
//         } else { // if the last bit is 1, the number is odd
//             System.out.println(n + " is odd number.");
//         }
     
//     } 
    
//     public static void main(String[] args) {
//         oddoreven(45);// function call
//         oddoreven(3); // function call
//         oddoreven(8); // function call
//     }
//   }



                                                     //get ith bit of a number using bitwise operator


//  public class bitwisemanupulation {
//     public static int getithbit(int n, int i) {
//         int bitmask = 1 << i; // create a bitmask by left shifting 1 by i positions
//         if ((n & bitmask) == 0) { // if the result is 0, the ith bit is 0
//             return 0;
//         } else { // if the result is not 0, the ith bit is 1
//             return 1;
//         }
//     }

//     public static void main(String[] args) {
//         int n = 5; // in binary 0101
//         int i = 2; // we want to get the 2nd bit (counting from 0)
//         int result = getithbit(n, i); // function call
//         System.out.println("The " + i + "th bit of " + n + " is: " + result);
//     }
// }  




//dry run



// Imagine the number 1 in an 8-bit binary format:00000001 When you use 1 << i, you are telling the computer to move that 1 to the left by i positions, filling the empty spots on the right with 0s.
// Expression       Binary Result
// 1 << 0          00000001 
// 1 << 1          00000010
// 1 << 2          00000100 
// 1 << 3          00001000 

// The key is the expression 1 << i.

// Binary of 5: 0101

// Creating the Mask (1 << 2): We take 1 (0001) and shift it left twice to get 0100.

// The AND Operation (n & bitmask):

// Plaintext
//   0101 (n = 5)
// & 0100 (mask)
//   ----
//   0100 (result = 4)

// 2. The Condition
// In your code, you check if ((n & bitmask) == 0).

// In this case, the result is 4, which is not 0.

// Therefore, the function enters the else block and returns 1.

// Conclusion: The 2nd bit of 5 is indeed 1




                                                        //set ith bit of a number using bitwise operator 
                                                        
                                                        
//    public class bitwisemanupulation {
//     public static int setithbit(int n, int i) {
//         int bitmask = 1 << i; // create a bitmask by left shifting 1 by i positions
//         return n | bitmask; // set the ith bit by performing a bitwise OR with the bitmask
//     }

//     public static void main(String[] args) {
//         int n = 5; // in binary 0101
//         int i = 1; // we want to set the 1st bit (counting from 0)
//         int result = setithbit(n, i); // function call
//         System.out.println("After setting the " + i + "th bit of " + n + ", the result is: " + result);
//     }
// }                     




                                                        //clear ith bit of a number using bitwise operator



//  public class bitwisemanupulation {
//     public static int clearithbit(int n, int i) {
//         int bitmask = ~(1 << i); // create a bitmask by left shifting 1 by i positions and then negating it
//         return n & bitmask; // clear the ith bit by performing a bitwise AND with the bitmask
//     }

//     public static void main(String[] args) {
//         int n = 5; // in binary 0101
//         int i = 0; // we want to clear the 0th bit (counting from 0)
//         int result = clearithbit(n, i); // function call
//         System.out.println("After clearing the " + i + "th bit of " + n + ", the result is: " + result);
//     }
// }                                                       



                                                        //clear last i bits of a number using bitwise operator


//  public class bitwisemanupulation {
//     public static int clearlastibits(int n, int i) {
//         int bitmask = (~0 << i); // create a bitmask by negating 0 (which gives all bits as 1) and then left shifting it by i positions
//         return n & bitmask; // clear the last i bits by performing a bitwise AND with the bitmask
//     }

//     public static void main(String[] args) {
//         int n = 29; // in binary 11101
//         int i = 3; // we want to clear the last 3 bits (counting from 0)
//         int result = clearlastibits(n, i); // function call
//         System.out.println("After clearing the last " + i + " bits of " + n + ", the result is: " + result);
//     }  
// }   




//dry run

// 1. The Input
// n = 29: In binary, this is 00011101.
// i = 3: You want to clear the last 3 bits (positions 0, 1, and 2).

// 2. Creating the Bitmask
// ~0 is essentially all 1s in binary (11111111).
// ~0 << 3 shifts those 1s to the left by 3, filling the right side with 0s.
// Bitmask = 11111000 (which is 24 in decimal, as we calculated earlier).

// 3. The Bitwise AND Operation
// Now,the code performs n & bitmask:

//  Variable         BinaryDecimal
//     n           00011101 (29)
//     bitmask      11111000 (24)
//     Result        00011000 (24)


                                          //check if a number is power of 2 using bitwise operator


//   public class bitwisemanupulation {
//     public static boolean isPowerOfTwo(int n) {
//         if (n <= 0) {
//             return false; // Power of 2 must be greater than 0
//         }
//         return (n & (n - 1)) == 0; // A power of 2 has only one bit set
//     }

//     public static void main(String[] args) {
//         int n = 16; // Example number
//         boolean result = isPowerOfTwo(n); // function call
//         System.out.println(n + " is a power of 2: " + result);
//     } 
// }           


//dry run

// How it Works
// In binary, every power of 2 has exactly one bit set (the value 1) and all other bits are 0.
// Decimal     Binary


// 2           0010
// 4           0100
// 8           1000
// 16          0001 0000




                                                   //or



//   public class bitwisemanupulation {
//     public static boolean isPowerOfTwo(int n) {

//         return (n & (n - 1)) == 0; // A power of 2 has only one bit set
//     }

//     public static void main(String[] args) {
//         int n = 16; // Example number
//         boolean result = isPowerOfTwo(n); // function call
//         System.out.println(n + " is a power of 2: " + result);
//     } 
// }       



                                                   //count set bits(1) in a number using bitwise operator



                                                                                               