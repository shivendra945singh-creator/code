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
                                    


  public class bitwisemanupulation {
    public static void oddoreven(int n) {
        int bitmask = 1; // in binary 0001
        if ((n & bitmask) == 0) { // if the last bit is 0, the number is even
            System.out.println(n + " is even number.");
        } else { // if the last bit is 1, the number is odd
            System.out.println(n + " is odd number.");
        }
     
    } 
    
    public static void main(String[] args) {
        oddoreven(45);// function call
        oddoreven(3); // function call
        oddoreven(8); // function call
    }
  }
