public class backtracking {//time compexity and space compexity is O(n)
//     public static void changeArr (int arr[], int i , int val) {
//         //base case
//         if (i == arr.length) {
//             printArr(arr);
//             return;
//         }
//         //recursion
//         arr[i] = val;
//         changeArr(arr, i+1, val+1);//function call setup
//         arr[i] = arr[i] - 2;//backtracking  setup
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i<arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }

//     public static void main (String args[]) {
//         int arr[] = new int[5];
//         changeArr(arr,0,1);
//         printArr(arr);
//     }
        
//  }


                                //find subsets


// public static void findSubsets(String str, String ans, int i) {
// //base case
// if(i==str.length()) {
//     if(ans.length()==0) {
//     System.out.println("null");
// }else{
//     System.out.println(ans);
// }
// return;
// }

// //yes choice
// findSubsets(str, ans+str.charAt(i), i+1);
// //no choice
// findSubsets(str, ans, i+1);
// }


// public static void main(String args[]) {
//     String str = "abc";
//     findSubsets(str,"",0);
// }
// }



                                           //find permutation



//time complexity is O(n*n!)
// public static void findPermutation(String str, String ans) {
//     //base case
//     if(str.length()==0) {
//         System.out.println(ans);
//         return;
//     }
//     //recursion
//     for(int i=0; i<str.length(); i++) {
//         char curr = str.charAt(i);
//         //"abcde" => "ab" + "de" = "abde"
//        String Newstr = str.substring(0,i) + str.substring(i+1);
//        findPermutation(Newstr, ans+curr);
//     }
// }

// public static void main(String args[]) {
//     String str = "abc";
//     findPermutation(str, "");
// }
// }



                                  //n Queens without attack


// public static void nQueens(char board[][], int row) {
//     //base
//     if(row == board.length) {
//         printBoard(board);
//         return;
//     }
//     //column loop
//     for(int j=0; j<board.length; j++) {
//         board[row][j] ='Q';
//         nQueens(board, row+1);//function call
//         board[row][j] = 'X';//backtracking step
//     }
// }

// public static void printBoard(char board[][]) {
//     System.out.println("---------chess board--------");
//     for(int i=0; i<board.length; i++) {
//         for(int j=0; j<board.length; j++) {
//             System.out.print(board[i][j] + " ");
//         }
//         System.out.println();
//     }  
// }

// public static void main (String args[]) {
//     int n=2;
//     char board[][] = new char[n][n];
//     //initialize
//     for(int i=0; i<n; i++) {
//         for(int j=0; j<n; j++) {
//             board[i][j] ='X';
//         }
//     }
//     nQueens(board,0);
// }
// }


                                                             //n Queens with attack


// //time complexity is O(n!)
// public static boolean isSafe(char board[][], int row, int col) {

// //vertical up
//     for(int i=row-1; i>=0; i--) {
//         if(board[i][col] == 'Q') {
//         return false;
//          }
//     }

// //diag left up
//     for(int i= row-1, j=col-1; i>=0 && j>=0; i--, j--) {
//         if(board[i][j] == 'Q') {
//             return false;
//         }
//     }

// //diag right up
//     for(int i = row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
//          if(board[i][j] == 'Q') {
//         return false;
//         }
//     }
//    return true;


// }
                                 
// public static void nQueens(char board[][], int row) {
//     //base
//     if(row == board.length) {
//         printBoard(board);
//         return;
//     }
//     //column loop
//     for(int j=0; j<board.length; j++) {
//         if(isSafe(board, row, j)) {
//            board[row][j] ='Q';
//         nQueens(board, row+1);//function call
//         board[row][j] = 'X';//backtracking step 
//         }
      
//     }
// }

// public static void printBoard(char board[][]) {
//     System.out.println("---------chess board--------");
//     for(int i=0; i<board.length; i++) {
//         for(int j=0; j<board.length; j++) {
//             System.out.print(board[i][j] + " ");
//         }
//         System.out.println();
//     }  
// }

// public static void main (String args[]) {
//     int n=4;
//     char board[][] = new char[n][n];
//     //initialize
//     for(int i=0; i<n; i++) {
//         for(int j=0; j<n; j++) {
//             board[i][j] ='X';
//         }
//     }
//     nQueens(board,0);
// }
// }


                                             //n Queens with attack(print count ways)

                                            




// //time complexity is O(n!)
// public static boolean isSafe(char board[][], int row, int col) {

// //vertical up
//     for(int i=row-1; i>=0; i--) {
//         if(board[i][col] == 'Q') {
//         return false;
//          }
//     }

// //diag left up
//     for(int i= row-1, j=col-1; i>=0 && j>=0; i--, j--) {
//         if(board[i][j] == 'Q') {
//             return false;
//         }
//     }

// //diag right up
//     for(int i = row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
//          if(board[i][j] == 'Q') {
//         return false;
//         }
//     }
//    return true;


// }
                                 
// public static void nQueens(char board[][], int row) {
//     //base
//     if(row == board.length) {
//         count++;
//         return;
//     }
//     //column loop
//     for(int j=0; j<board.length; j++) {
//         if(isSafe(board, row, j)) {
//            board[row][j] ='Q';
//         nQueens(board, row+1);//function call
//         board[row][j] = 'X';//backtracking step 
//         }
      
//     }
// }

// public static void printBoard(char board[][]) {
//     System.out.println("---------chess board--------");
//     for(int i=0; i<board.length; i++) {
//         for(int j=0; j<board.length; j++) {
//             System.out.print(board[i][j] + " ");
//         }
//         System.out.println();
//     }
// }

//  static int count = 0;

// public static void main (String args[]) {
//     int n=4;
//     char board[][] = new char[n][n];
//     //initialize
//     for(int i=0; i<n; i++) {
//         for(int j=0; j<n; j++) {
//             board[i][j] ='X';
//         }
//     }
//     nQueens(board,0);
//     System.err.println("totoal numbers of ways to solve n queens is : " + count);
// }
// }



                                           //N Queens print only 1 solution
                                    




//time complexity is O(n!)
// public static boolean isSafe(char board[][], int row, int col) {

// //vertical up
//     for(int i=row-1; i>=0; i--) {
//         if(board[i][col] == 'Q') {
//         return false;
//          }
//     }

// //diag left up
//     for(int i= row-1, j=col-1; i>=0 && j>=0; i--, j--) {
//         if(board[i][j] == 'Q') {
//             return false;
//         }
//     }

// //diag right up
//     for(int i = row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
//          if(board[i][j] == 'Q') {
//         return false;
//         }
//     }
//    return true;


// }
                                 
// public static boolean  nQueens(char board[][], int row) {
//     //base
//     if(row == board.length) {
//         count++;
//         return true;
//     }
//     //column loop
//     for(int j=0; j<board.length; j++) {
//         if(isSafe(board, row, j)) {
//            board[row][j] ='Q';
//          if(nQueens(board, row+1)) {
//                 return true;
//             }
//             board[row][j]  ='X';//backtracking call
//         }
//     }
//     return false;
// }

// public static void printBoard(char board[][]) {
//     System.out.println("---------chess board--------");
//     for(int i=0; i<board.length; i++) {
//         for(int j=0; j<board.length; j++) {
//             System.out.print(board[i][j] + " ");
//         }
//         System.out.println();
//     }
// }

//  static int count = 0;

// public static void main (String args[]) {
//     int n=4;
//     char board[][] = new char[n][n];
//     //initialize
//     for(int i=0; i<n; i++) {
//         for(int j=0; j<n; j++) {
//             board[i][j] ='X';
//         }
//     }
//    if( nQueens(board,0)) {
//            System.err.println(" solution is possible " );
//            printBoard(board);
//     }else{
//             System.err.println(" solution is not possible ");
//         }
// }
    
// }


                                             //grid ways

//(find number of ways to reach from (0,0) to (n-1, m-1) in a nXm grid. allowed moves only right or down)
// time complexity is O(2^n+m) which is very bad


public static int gridWays(int i, int j, int n, int m) {
    //base case
    if(i == n-1 && j == m-1) {// condition for last cell
        return 1;
    } else if ( i==n || j== n ) {//boundary cross condition
        return 0;
    }

    int w1 = gridWays (i+1, j, n, m);
    int w2 = gridWays (i, j+1, n, m);
       return w1 + w2;
}

public static void main(String[] args) {
    int n = 3, m = 3;
    System.err.println(gridWays(0,0,n,m));
}
    
}

