                                             // 01 print star pattern 



// public class pattern {

//     public static void main(String[] args) {

//                 for (int line =1; line<=4; line++) {   //outer loop
//                     for (int star =1; star<=line; star++) {   // inner loop
//                         System.out.print("* ");
//                     }
//                     System.out.println();
//                 }
//     }

// }

// dry run


// When line = 1
// star = 1 → 1 <= 1 ✅ → print *
// star = 2 → 2 <= 1 ❌ → exit inner loop → newline.
// When line = 2
// star = 1 → 1 <= 2 ✅ → print *
// star = 2 → 2 <= 2 ✅ → print *
// star = 3 → 3 <= 2 ❌ → exit inner loop → newline.




                                       // 02 print 10 star pattern





// public class pattern {

//     public static void main(String[] args) {

//                 for (int line =1; line<=10; line++) {
//                     for (int star =1; star<=line; star++) {
//                         System.out.print("* ");
//                     }
//                     System.out.println();
//                 }
//     }

// }





                              // 03 print reverse star pattern





// public class pattern {

//     public static void main(String[] args) {
//         int n=4;
//         for (int line =1; line<=n; line++) {
//             for (int star =1; star<=n-line+1; star++) {
//                   System.out.print("* ");
//             }
//             System.out.println();
//         }

               
//     }

// }




                                 // 04 print reverse star pattern with 10 lines




// public class pattern {

//     public static void main(String[] args) {
//         int n=10;
//         for (int line =1; line<=n; line++) {
//             for (int star =1; star<=n-line+1; star++) {
//                   System.out.print("* ");
//             }
//             System.out.println();
//         }

               
//     }

// }



  
                                         // 05 print number pattern




// public class pattern {

//     public static void main(String[] args) {
//         int n=4;
//         for( int line =1; line<=n; line++) {
//             for (int number =1; number<=line; number++) {
//                   System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }




                                      // 06 print number pattern with 10 lines





// public class pattern {

//     public static void main(String[] args) {
//         int n=10;
//         for( int line =1; line<=n; line++) {
//             for (int number =1; number<=line; number++) {
//                   System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }




                                            // 07 print character pattern


                                            

public class pattern {

    public static void main(String[] args) {
        int n=4;
        char ch='A';
        for( int line =1; line<=n; line++) {   // line ko i bhi let karsakte the
            for (int chars =1; chars<=line; chars++) {  //   chars ko j bhi let karsakte the
                   System.out.print(ch);
                   ch++;
            }
            System.out.println();
        }
    }
}