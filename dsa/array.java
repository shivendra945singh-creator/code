// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int marks[] = new int[100];   //array

//         //  // input

//         System.err.print("enter a number :");
//         marks[0] = sc.nextInt();    // 0 means 0th index value
//         System.err.print("enter a number :");
//         marks[1] = sc.nextInt();
//         System.err.print("enter a number :");
//         marks[2] = sc.nextInt();

//         //output

//         System.err.println("phy : " + marks[0]);
//         System.err.println("chem: " + marks[1]);
//         System.err.println("math : " + marks[2]);
        

//         marks[2] = 100;   // for update
//          System.err.println("math : " + marks[2]);
        

//          marks[2] = marks[2] + 1;   // for update
//          System.err.println("math : " + marks[2]);
        

//          int average = (marks[0] +marks[1] + marks[2] / 3 );
//          System.out.println("average is :" + average );


//         System.out.println("lenght of array = " + marks.length);  // .lenght is used for find array lenght and  here marks is funcition name 

//     }
    
// }




                                      //array as functional arguments



// public class array {
//     public static void update(int marks[] ) {
        
//      for (int i = 0; i<marks.length; i++) {   // here i is index and i<marks.length means i go to last element
//          marks[i] = marks[i] + 5;

//      }
//     }
//     public static void main(String[] args) {
//         int marks[] = {97,98,99};
//         update(marks);  //call function
        

              // print our function
//         for (int i = 0; i<marks.length; i++) {
//            System.out.println(marks[i] + ""); 
//         }
//         System.out.println();
//     }
    
// }



                                                  //or error occur

// public class array {
//     public static void update(int marks[] , int nonchangable ) {
//         nonChangable = 10;
//      for (int i = 0; i<marks.length; i++) {
//          marks[i] = marks[i] + 1;

//      }
//     }
//     public static void main(String[] args) {
//         int marks[] = {97,98,99};
//         int nonChangable = 5;
//         update(marks , nonChangable);
//         System.err.println(nonChangable);


//         for (int i = 0; i<marks.length; i++) {
//            System.out.println(marks[i] + ""); 
//         }
//         System.out.println();
//     }
    
// }




                                               // liner search
                                               
                                  //##time complexity for liner search is bigo(n) or O(n)
                                  


// public class array {
//     public static int linersearch (int numbers[] , int key ) {
        
//      for (int i = 0; i<numbers.length; i++) {
//         if (numbers[i]== key) {
//             return i;
//         }
//     }

//     return -1;
// }

// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10,12,14,16};
//     int key = 10;

//     int index = linersearch(numbers, key);
//     if (index==-1) {
//         System.err.println("not found");
//     } else {
//         System.err.println("key is at index " + index);
//     }
// }
// }




                                              // find largest number in a array




// public class array {
//     public static int getLargest( int numbers[]) {
//         int largest = Integer.MIN_VALUE;     // in java, - infinity = Integer.MIN_VALUE

//         for ( int i=0; i<numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1,2,6,8,7};
//         System.err.println("largest value is : " + getLargest(numbers));
//     }
// }






                                                    //  find smallest number in a array





// public class array {
//     public static int smallest( int numbers[]) {
//         int smallest = Integer.MAX_VALUE;   //in java, + infinity = Integer.MAX_VALUE

//         for ( int i=0; i<numbers.length; i++) {
//             if (smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
//         return smallest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1,2,6,8,7};
//         System.err.println("smallest value is : " + smallest(numbers));
//     }
// }






                                              //binary search 



 // ## prerequisite (means prerquirement)- sorted array (means array in ascending or decending order)

 //## binary search time complexity is always lesser than linear search

 // ## time complexity of binary search is bigologn or O(log n)





//  public class array {
//  public static int binarysearch (int numbers[] , int key ) {
//     int start = 0, end = numbers.length-1;

//     while(start <= end) {
//         int mid = (start + end ) / 2;

//         if (numbers[mid] == key) {
//             return mid;
//         }
//         if (numbers[mid] < key) {
//             start = mid+1;   // for right part
//         } else {
//             end = mid-1;      // for left part
//         }
//     }
//     return -1;
// }

// public static void main(String[] args) {
//     int numbers[]= {2,4,6,8,10,12,14};
//     int key = 10;

//     System.out.println("index for key is : "  + binarysearch(numbers,key));
    
// }
//  }



// dry run

 // ##Index:   0   1   2   3   4    5    6
//    Value:   2   4   6   8   10   12   14


// 🔹 Binary Search Steps (key = 10)
// Start = 0, End = 6
// Mid = (0 + 6) / 2 = 3
// Value = 8
// Since 10 > 8 → go right
// Start = 4, End = 6
// Mid = (4 + 6) / 2 = 5
// Value = 12
// Since 10 < 12 → go left
// Start = 4, End = 4
// Mid = (4 + 4) / 2 = 4
// Value = 10 ✅ found




                                                      // reverse an array




// public class array {
//     public static void reverse( int numbers[]) {
//         int first = 0, last = numbers.length-1;

//         while(first<last) {


//             //swape
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//         }

//         public static void main(String[] args) {
//             int numbers[] = {2,4,6,8,10};

//                 reverse(numbers);

//                 //print
//                 for(int i=0; i<numbers.length; i++) {
//                     System.err.print(numbers[i] + " ");
//                 }
//                 System.err.println();
            
//         }
//     }





                                                 // pairs in an array

    // ## time complexity for this is O(n square)



// public class array {
//     public static void printpairs( int numbers[]) {
//         for (int i =0; i<numbers.length; i++) {
//             int current = numbers[i];
//             for (int j = i+1; j<numbers.length; j++) {
//               System.err.print(" (" + current + "," + numbers[j] + ")");
//             }
//             System.err.println();
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printpairs(numbers);
//     }
//     }


                                                     //or

                                                     //## total pairs formula = n(n-1)/2 where n is n elements


// public class array {
//     public static void printpairs( int numbers[]) {
//         int tp = 0; // tp is total pairs
//         for (int i =0; i<numbers.length; i++) {
//             int current = numbers[i];
//             for (int j = i+1; j<numbers.length; j++) {
//               System.err.print(" (" + current + "," + numbers[j] + ")");
//               tp++;
//             }
//             System.err.println();
//         }
//         System.err.println("total pairs = " + tp);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printpairs(numbers);
//     }
//     }


                                                     //print subarrays

                                      // (subarrays is a contionues part of array)





// public class array {
//     public static void printSubarrays( int numbers[]) {
      
//         for (int i =0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 for ( int k = start; k<=end; k++) {
//                     System.err.print(numbers[k]+" ");   // subarray
//                 }
//                 System.err.println();
//             }
//             System.err.println();
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printSubarrays(numbers);
//     }
//     }

                                  


                                                         //or


// ## total subarray pairs = n(n+1)/2


// public class array {
//     public static void printsubarrays( int numbers[]) {
//      int  tp = 0;
//         for (int i =0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 for ( int k = start; k<=end; k++) {
//                     System.err.print(numbers[k]+" ");
//                 }
//                 tp++;
//                 System.err.println();
//             }
//             System.err.println();
//         }
//         System.err.println("total subarrays = " + tp);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printsubarrays(numbers);
//     }
//     }




                                           // maximum  subarry sum



//## here 3 nested loops are used like for, for, for, so time complexity is O(n cube) which is bad time compexity



// public class array {
//     public static void maxsubarraysum( int numbers[]) {
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;

      
//         for (int i =0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 currsum = 0;
//                 for ( int k = start; k<=end; k++) {
//                     currsum += numbers[k];  // subarray sum
//                 }
//                 System.err.println(currsum);
//                 if (maxsum < currsum) {
//                     maxsum = currsum;
//                 }
//             }
            
//         }
//         System.err.println("max sum = " + maxsum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxsubarraysum(numbers);
//     }
//     }