

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

//  import java.util.*; //O(nlogn) 
 
 
//     public class greedyalgo {
//         public static void main(String args[]) {
//             int A[] = {4,1,8,7};
//             int B[] = {2, 3, 6,5};
    
//             Arrays.sort(A);
//             Arrays.sort(B);
    
//             int minDiff= 0;

//             for (int i = 0; i < A.length; i++) {
//                 minDiff += Math.abs(A[i] - B[i]);// Math.abs is a built-in function in java for absolute value
//             }
//             System.out.println("Minimum sum of absolute difference of pairs: " + minDiff);
//         }
        
//     }



                                                       //maximum length of chain of pairs



//  import java.util.*; //O(nlogn) 
 
 
//     public class greedyalgo {
//         public static void main(String args[]) {
//             int pairs[][] = {{5, 24}, {15, 25}, {27, 40}, {50, 60}};
    
//             Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); //sort by end time
    
//             int chainLen = 1;
//             int chainEnd = pairs[0][1];//last selected pair end  //chain end
    
//             for (int i = 1; i < pairs.length; i++) {
//                 if (pairs[i][0] > chainEnd) { //if start of current pair is greater than end of last selected pair
//                     chainLen++;
//                     chainEnd = pairs[i][1]; //update last end to current pair's end
//                 }
//             }
//             System.out.println("Maximum length of chain of pairs: " + chainLen);
//         }
        
//     }                                                      




                                                  //indian coin change problem using greedy algorithm


//    import java.util.*;
//    import java.util.ArrayList; 
 
 
//     public class greedyalgo {
//         public static void main(String args[]) {
//             Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
            
    
//            Arrays.sort(coins, Comparator.reverseOrder());//sort in descending order and also we have to use Integer instead of int for sorting in reverse order because int is a primitive data type and cannot be used with Comparator.reverseOrder() which is a method for objects. Integer is a wrapper class for int and can be used with Comparator.reverseOrder().

//            int countofCoins = 0;
//            int amount = 12478;
//            ArrayList<Integer> ans = new ArrayList<>();


//            for (int i = 0; i < coins.length; i++) {
//                if (coins[i] <= amount) {
//                   while (coins[i] <= amount) {
//                        amount -= coins[i];
//                        countofCoins++;
//                        ans.add(coins[i]);
//                    }
//                }
//            }
//            System.out.println("Minimum number of coins required: " + countofCoins);
//            System.out.println("Coins used: " + ans);
//         }
//     }




                                                           //job sequencing problem



 import java.util.*;
 import java .util.ArrayList;
 
 public class greedyalgo {
     static class Job {
         int id;
         int deadline;
         int profit;

         //constructor
         public Job(int i, int d, int p) {
             id = i;
             deadline = d;
            profit = p;
         }
     }

     public static void main(String args[]) {
         int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

         ArrayList<Job> jobs = new ArrayList<>();

         for (int i = 0; i < jobsInfo.length; i++) {
             jobs.add(new Job(i , jobsInfo[i][0], jobsInfo[i][1])); 
         }

            //sort jobs by profit in descending order
            Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

            ArrayList<Integer> seq = new ArrayList<>();
            int time = 0;
            for ( int i = 0; i < jobs.size(); i++) {
                Job curr = jobs.get(i);
                if (time < curr.deadline) {
                    seq.add(curr.id);
                    time++;
                }
            }

            //print job sequence 
            System.out.println("max job: " + seq.size());
            for(int i = 0; i < seq.size(); i++) {
                System.out.print( seq.get(i) + " " );
            }
            System.out.println();
     }
 }