                                                     
                                                     
                                                     
                                                     // matrix(rows and columns)


//  import java.util.*;                          

// public class twoDarray {
//     public static void main(String args []) { // if we use string[] args then error will come 
//         int matrix[][] = new int[3][3]; // [] [] is for 2D array, 3 is no of rows and 3 is no of columns
//         int n = matrix.length; // no of rows
//         int m = matrix[0].length; // no of columns

//         // input
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n; i++) { // for rows
//             for(int j=0; j<m; j++) { // for columns
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // output
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
    
// }


//dry run 

// int matrix[][] = new int[3][3];
// int n = matrix.length;       // number of rows = 3
// int m = matrix[0].length;    // number of columns = 3

// Step 1: Initializing matrix
// Creates a 3x3 matrix (a 2D array) with all elements default to 0.
// matrix =
// 0 0 0
// 0 0 0
// 0 0 0

// Step 2: Input elements into matrix

// for(int i=0; i<n; i++) {
//     for(int j=0; j<m; j++) {
//         matrix[i][j] = sc.nextInt();
//     }
// }
// For each row i from 0 to 2:
// For each column j from 0 to 2, read an integer input and store it in matrix[i][j].
// Assuming input is:

// 1 2 3
// 4 5 6
// 7 8 9
// Dry-run for input:

// i	j	Action	matrix state after change
// 0	0	matrix[0][0] = 1	1 0 0
// 0	1	matrix[0][1] = 2	1 2 0
// 0	2	matrix[0][2] = 3	1 2 3
// 1	0	matrix[1][0] = 4	1 2 3<br>4 0 0
// 1	1	matrix[1][1] = 5	1 2 3<br>4 5 0
// 1	2	matrix[1][2] = 6	1 2 3<br>4 5 6
// 2	0	matrix[2][0] = 7	1 2 3<br>4 5 6<br>7 0 0
// 2	1	matrix[2][1] = 8	1 2 3<br>4 5 6<br>7 8 0
// 2	2	matrix[2][2] = 9	1 2 3<br>4 5 6<br>7 8 9

// Step 3: Output elements

// for(int i=0; i<n; i++) {
//     for(int j=0; j<m; j++) {
//         System.out.print(matrix[i][j] + " ");
//     }
//     System.out.println();
// }
// Loop over rows i and columns j to print all matrix elements with a space.
// After each row, print a new line.

// Output:

// 1 2 3 
// 4 5 6 
// 7 8 9 





                                                         // found at cell


                                                         
                                                         
// import java.util.*;                          

// public class twoDarray {
//     public static boolean search(int matrix[][] , int key) { // if we use string[] args then error will come 
//        for(int i=0; i<matrix.length; i++) {
//         for(int j=0; j<matrix[0].length; j++) {
//             if(matrix[i][j] == key) {
//                 System.out.println("found at cell (" + i + "," + j + ")");
//                 return true;
//             }
//         }
//     }
                                                      
//            System.out.println(" key not found");
//            return false;
//             }
      
       
//         public static void main (String args[]) {
//             int matrix[][] = new int [3][3];
//             int n = matrix.length; // no of rows
//             int m = matrix[0].length; // no of columns

//             // input
//             Scanner sc = new Scanner(System.in);
//             for(int i=0; i<n; i++) { // for rows
//                 for(int j=0; j<m; j++) { // for columns
//                     matrix[i][j] = sc.nextInt();
//                 }
//             }
            
//             // output
//             for(int i=0; i<n; i++) {
//                 for(int j=0; j<m; j++) {
//                     System.out.print(matrix[i][j] + " ");
//                 }
//                 System.out.println();
//             }
//             search(matrix,  5);
//         }
//     }




                                                        // **spiral matrix code





// public class twoDarray {

// public static void printspiral(int matrix[][]) {
//     int startrow = 0;
//     int endrow = matrix.length-1;
//     int startcol = 0;
//     int endcol = matrix[0].length-1;

//     while(startrow <= endrow && startcol <= endcol) {
//         // top
//         for(int j=startcol; j<=endcol; j++) { //here row is fixed and column is changing
//             System.out.print(matrix[startrow][j] + " "); // here matrix[startrow][j] means value at row startrow and column j 
//         }
//         // right
//         for(int i=startrow+1; i<=endrow; i++) { // here column is fixed and row is changing
//             System.out.print(matrix[i][endcol] + " ");
//         }
//         // bottom
//         for(int j=endcol-1; j>=startcol; j--) { // here row is fixed and column is changing in reverse order
//             if(startrow == endrow) { // to avoid duplicate printing of the same row
//                 break;
//             }
//             System.out.print(matrix[endrow][j] + " ");
//         }
//         // left
//         for(int i=endrow-1; i>startrow; i--) { // here column is fixed and row is changing in reverse order
//             if(startcol == endcol) { // to avoid duplicate printing of the same column
//                 break;
//             }
//             System.out.print(matrix[i][startcol] + " ");
//         }
//         startrow++;
//         endrow--;
//         startcol++;
//         endcol--;
//     }
//     System.out.println();
// }

// public static void main(String args []) {
//     int matrix[][] = {
//         {1, 2, 3, 4},
//         {5, 6, 7, 8},
//         {9, 10, 11, 12},
//         {13, 14, 15, 16}
//     };
//     printspiral(matrix);
// }
// }




//dry run

// Initialization:
// startrow = 0
// endrow = 3 (index of last row)
// startcol = 0
// endcol = 3 (index of last column)

// First while loop iteration: (startrow=0, endrow=3, startcol=0, endcol=3)
// Top row loop (row 0, cols 0 to 3):
// Print: 1 2 3 4
// Right column loop (col 3, rows 1 to 3):
// Print: 8 12 16
// Bottom row loop (row 3, cols 2 to 0):
// Since startrow != endrow, print 15 14 13
// Left column loop (col 0, rows 2 to 1):
// Since startcol != endcol, print 9 5
// Update indices:
// startrow = 1
// endrow = 2
// startcol = 1
// endcol = 2

// Second while loop iteration: (startrow=1, endrow=2, startcol=1, endcol=2)
// Top row loop (row 1, cols 1 to 2):
// Print: 6 7
// Right column loop (col 2, rows 2 to 2):
// Print: 11
// Bottom row loop (row 2, cols 1 to 1):
// Since startrow != endrow, loop runs once:
// Print: 10
// Left column loop (col 1, rows 1 to 1):
// Loop does not run because i > startrow condition fails (i starts at endrow-1=1 and needs to be >1).
// No print here.
// Update indices:
// startrow = 2
// endrow = 1 (loop ends as startrow > endrow)
// startcol = 2
// endcol = 1

// Loop ends because startrow > endrow and/or startcol > endcol.
// Final printed output (spiral order):
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 





                                                 // sum of diagonal elements 


//brute force approach

// public class twoDarray {

// public static int diagonalsum(int matrix[][]) { //O(n^2)
//     int sum = 0;
//     for(int i=0; i<matrix.length; i++) {
//         for(int j=0; j<matrix[0].length; j++) {
//             // primary diagonal condition
//             if(i == j) {
//                 sum += matrix[i][j];
//             }
//             // secondary diagonal condition 
//             else if(i + j == matrix.length - 1) {
//                 sum += matrix[i][j];
//             }
//         }
//     }
//     return sum;
// }

// public static void main(String args []) {
//     int matrix[][] = {
//         {1, 2, 3},
//         {4, 5, 6},
//         {7, 8, 9}
//     };
//     System.out.println("Sum of diagonal elements: " + diagonalsum(matrix));
// }
// }


// In your current code, the reason 5 (the middle element) is not added twice is because of the else if statement you used for the secondary diagonal condition.
// In a 3x3matrix, the middle element at position (1, 1) satisfies both conditions:
// Primary Diagonal: i == j or(1 == 1)
// Secondary Diagonal: i + j == {matrix.length} - 1 , (1 + 1 == 2).
// How the if-else if Logic Works:
// When the loop hits the middle element matrix[1][1], it checks the first if(i == j).Since 1 == 1 is true, it executes sum += matrix[i][j] and then skips the entire else if block.
// The code moves on to the next iteration of the loop without ever checking the secondary diagonal condition for that specific cell.
                                               



                                                         //or




// public class twoDarray {

// public static int diagonalsum(int matrix[][]) {  //O(n)
//     int sum = 0;

//     for(int i=0; i<matrix.length; i++) {
//         // primary diagonal condition
//         sum += matrix[i][i];
//         // secondary diagonal condition
//         if(i != matrix.length - 1 - i) // to avoid adding the middle element twice in case of odd-sized matrix
//             sum += matrix[i][matrix.length - 1 - i]; // here matrix.length - 1 - i gives j value

            
//     }

//     return sum;
    
// }

// public static void main(String args []) {
//     int matrix[][] = { {1, 2, 3, 4},
//         {5, 6, 7, 8},
//         {9, 10, 11, 12},
//         {13, 14, 15, 16}};

//     System.out.println("Sum of diagonal elements: " + diagonalsum(matrix));
// }
// }






                                                   //search in sorted matrix


//  public class twoDarray {//O(n+m) time complexity 
// public static boolean search(int matrix[][], int key) {
//  int row = 0;
//    int col = matrix[0].length - 1; // start from top right corner
   
//   while(row < matrix.length && col >= 0) {
//        if(matrix[row][col] == key) {
//      System.out.println("Found at cell (" + row + "," + col + ")");
//      return true;
//     }

//     else if( key < matrix[row][col] ) {
//     col--; // move left
//      }
//      else {
//      row++; // move down
//      }
//      }
//       System.out.println("Key not found");
//          return false;
//      } 
                 
//     public static void main(String args[]) {
//     int matrix[][] = {
//      {1, 2, 3, 4},
//       {5, 6, 7, 8},
//       {9, 10, 11, 12},
//      {13, 14, 15, 16}
//      };
//      int key = 12;
//       search(matrix, 12);

//        }
//    }