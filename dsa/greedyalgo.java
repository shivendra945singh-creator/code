

                                               // Activity Selection Problem using Greedy Algorithm when end time is sorted 
                                              
// import java.util.ArrayList; //O(n)

// public class greedyalgo {
//     public static void main(String args[]) {
//         int start[] = {1, 3, 0, 5, 8, 5};
//         //end time basis sorted
//         int end[] = {2, 4, 6, 7, 9, 9};

//         int maxact = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         //1st activity
//         maxact = 1;
//         ans.add(0); 
//         int lastend = end[0];
//         for (int i = 1; i < end.length; i++) {
//             if (start[i] >= lastend) {
//                 //activity select
//                 maxact++;
//                 ans.add(i);
//                 lastend = end[i];
//             }
//         }
//         System.out.println("Maximum number of activities: " + maxact);
//        for ( int i= 0; i<ans.size(); i++) {
//             System.out.print("A" +ans.get(i) + " ");
//         }
//         System.out.println();
//     }
    
// }



                                            // Activity Selection Problem using Greedy Algorithm when end time is not sorted 

// import java.util.*;
// import java.util.ArrayList; //O(n)

// public class greedyalgo {
//     public static void main(String args[]) {
//         int start[] = {1, 3, 0, 5, 8, 5};
//         //end time basis  not sorted
//         int end[] = {2, 4, 6, 7, 9, 9};


//         //sorting
//         int activities[][] = new int[start.length][3];
//         for (int i = 0; i < start.length; i++) {
//             activities[i][0] = i; //activity number
//             activities[i][1] = start[i]; //start time
//             activities[i][2] = end[i]; //end time
//         }

//         // Comparator.comparingDouble(o -> o[2])) is a lambda function (shortform of big function or comparator) for sorting
//         // in java, comparator is an interface for sorting java objects

//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


//         //end time basis sorted
//         int maxact = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         //1st activity
//         maxact = 1;
//         ans.add(activities[0][0]); 
//         int lastend = activities[0][2];
//         for (int i = 1; i < end.length; i++) {
//             if (activities[i][1] >= lastend) {
//                 //activity select
//                 maxact++;
//                 ans.add(activities[i][0]);
//                 lastend = activities[i][2];
//             }
//         }
//         System.out.println("Maximum number of activities: " + maxact);
//        for ( int i= 0; i<ans.size(); i++) {
//             System.out.print("A" +ans.get(i) + " ");
//         }
//         System.out.println();
//     }
    
// }



                                                          // Fractional Knapsack Problem using Greedy Algorithm


// import java.util.Arrays;
// import java.util.Comparator;

// public class greedyalgo {
//         public static void main(String args[]) {
//             int value[] = {60, 100, 120};
//             int weight[] = {10, 20, 30};
//             int W = 50;
    
//           double ratio[][] = new double[value.length][2];
//           //0th col = idx; 1st col = ratio

//           for (int i = 0; i < value.length; i++) {
//               ratio[i][0] = i; //item number
//               ratio[i][1] = (double)value[i] / (double)weight[i]; //value to weight ratio
//           }

//           //ascending order
//           Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//             int capacity = W;
//             int finalvalue = 0;
//             for(int i = ratio.length - 1; i >= 0; i--) {
//                 int idx = (int)ratio[i][0];
//                 if ( capacity >= weight[idx]) {//include full item
//                     finalvalue += value[idx];
//                     capacity -= weight[idx];
//                 } else {
//                     //include fractional item
//                     finalvalue += ratio[i][1] * capacity;
//                     capacity = 0;
//                     break;
//                 }
//             }
//             System.out.println("final value: " + finalvalue);
//         }
        
//     }



                                        //minimum sum of absolute difference of pairs 

 import java.util.*;
 
 
    public class greedyalgo {
        public static void main(String args[]) {
            int A[] = {4,1,8,7};
            int B[] = {2, 3, 6,5};
    
            Arrays.sort(A);
            Arrays.sort(B);
    
            int minDiff= 0;

            for (int i = 0; i < A.length; i++) {
                minDiff += Math.abs(A[i] - B[i]);// Math.abs is a built-in function in java for absolute value
            }
            System.out.println("Minimum sum of absolute difference of pairs: " + minDiff);
        }
        
    }