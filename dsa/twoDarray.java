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





                                                         // found at cell


                                                         
                                                         
// import java.util.*;                          

// public class twoDarray {
//     public static boolean search(int matrix[][] , int key) { // if we use string[] args then error will come 
//        for(int i=0; i<matrix[0].length; i++) {
//         for(int j=0; j<matrix.length; j++) {
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


                                                        // spiral matrix code





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



                                                 // sum of diagonal elements 



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




public class twoDarray {

public static int diagonalsum(int matrix[][]) {  //O(n)
    int sum = 0;

    for(int i=0; i<matrix.length; i++) {
        // primary diagonal condition
        sum += matrix[i][i];
        // secondary diagonal condition
        if(i != matrix.length - 1 - i) // to avoid adding the middle element twice in case of odd-sized matrix
            sum += matrix[i][matrix.length - 1 - i];

            
    }

    return sum;
    
}

public static void main(String args []) {
    int matrix[][] = { {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};

    System.out.println("Sum of diagonal elements: " + diagonalsum(matrix));
}
}

