                                            // sorting means arrange in an order




                            //   bubble sort means large element come to the end of array by swapping with adjacent elements


                                   // ##time complexity of bubble sort , insertion sort, selection sort is O(n square)




// public class basicsortingalgo {
//     public static void bubblesort(int arr[]) {
//         for(int turn=0; turn<arr.length-1; turn++) { //loop run from i =0 to n-2 (3 turns)
//             for (int j=0; j<arr.length-1-turn; j++) {
//                 if(arr[j] > arr[j+1]) {
//                   //swap
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//                 }

//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//             for(int i=0; i<arr.length; i++) {
//                 System.err.print( arr[i] +" ");
//             }
//             System.err.println();
//     }

//     public static void main(String[] args) {
//             int arr[] = {4,8,7,1,2};
//             bubblesort(arr);
//             printArr(arr);
//     }
// }

                                                                         


// dry run


//     Initial array:
// [4, 8, 7, 1, 2]

// Outer loop iteration 1 (turn=0):
// Inner loop runs for j = 0 to 3 (length-1-turn = 4)
// j=0: compare 4 and 8 → 4 < 8, no swap
// j=1: compare 8 and 7 → 8 > 7, swap → array becomes [4, 7, 8, 1, 2]
// j=2: compare 8 and 1 → 8 > 1, swap → array becomes [4, 7, 1, 8, 2]
// j=3: compare 8 and 2 → 8 > 2, swap → array becomes [4, 7, 1, 2, 8]

// Outer loop iteration 2 (turn=1):
// Inner loop runs for j = 0 to 2
// j=0: compare 4 and 7 → no swap
// j=1: compare 7 and 1 → swap → [4, 1, 7, 2, 8]
// j=2: compare 7 and 2 → swap → [4, 1, 2, 7, 8]

// Outer loop iteration 3 (turn=2):
// Inner loop runs for j = 0 to 1
// j=0: compare 4 and 1 → swap → [1, 4, 2, 7, 8]
// j=1: compare 4 and 2 → swap → [1, 2, 4, 7, 8]

// Outer loop iteration 4 (turn=3):
// Inner loop runs for j = 0 to 0
// j=0: compare 1 and 2 → no swap
// Final sorted array:
// [1, 2, 4, 7, 8]



                              // selection sort means pick the smallest (from unsorted) put it at the beginning





// public class basicsortingalgo {
//     public static void selectionsort(int arr[]) {
//         for(int i=0; i<arr.length-1;  i++) {
//             int minposition = i;
//             for (int j=i+1; j<arr.length; j++) {//at this loop we find minimum element index  from unsorted part of array
//                 if(arr[minposition] > arr[j]) {
//                     minposition = j;
//                 }
//             }
//                     //swap
//                     int temp = arr[minposition];//here we are swapping the minimum element with the first element(i) 
//                         arr[minposition] = arr[i];
//                         arr[i] = temp;
                        
//                 }

//   }

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
    
            

//         public static void main(String[] args) {
//             int arr[] = {4,8,7,1,2};
//           selectionsort(arr);
//             printArr(arr);
        
//         }
//     }




// dry run


//     Outer loop i = 0
// minposition = 0, value = 4
// Compare with j=1 (8): 4 < 8, no change
// Compare with j=2 (7): 4 < 7, no change
// Compare with j=3 (1): 1 < 4, update minposition = 3
// Compare with j=4 (2): 2 < 1? no
// Swap elements at indices 0 and 3:
// Array becomes: [1, 8, 7, 4, 2]

// Outer loop i = 1
// minposition = 1, value = 8
// Compare with j=2 (7): 7 < 8, update minposition = 2
// Compare with j=3 (4): 4 < 7, update minposition = 3
// Compare with j=4 (2): 2 < 4, update minposition = 4
// Swap elements at indices 1 and 4:
// Array becomes: [1, 2, 7, 4, 8]

// Outer loop i = 2
// minposition = 2, value = 7
// Compare with j=3 (4): 4 < 7, update minposition = 3
// Compare with j=4 (8): 8 < 4? no
// Swap elements at indices 2 and 3:
// Array becomes: [1, 2, 4, 7, 8]

// Outer loop i = 3
// minposition = 3, value = 7
// Compare with j=4 (8): 8 < 7? no
// No swap needed, array stays [1, 2, 4, 7, 8]

// Final sorted array:
// [1, 2, 4, 7, 8]




                                //insertion sort means pick an element(from unsorted part) & place in the right position in sorted part





// public class basicsortingalgo {
//     public static void insertionsort(int arr[]) {
//         for(int i=1; i<arr.length;  i++) {
//             int curr = arr[i];
//             int prev = i-1;

//             //finding out the correct position to insert
//             while(prev >=0 && arr[prev] > curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//                 }

//                 //insertion
//                 arr[prev+1] = curr;
        
//         }
//     }
                   

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
    
            

//         public static void main(String[] args) {
//             int arr[] = {4,8,7,1,2};
//           insertionsort(arr);
//             printArr(arr);
        
//         }
// }



// dry run

// Initial array
// [4, 8, 7, 1, 2]

// i = 1
// curr = 8
// prev = 0
// Check:

// arr[0] = 4 > 8? No
// Insert curr at prev + 1 = 1

// Array stays:
// [4, 8, 7, 1, 2]

// i = 2
// curr = 7
// prev = 1
// Check:

// arr[1] = 8 > 7? Yes → shift 8 right
// Array: [4, 8, 8, 1, 2]
// prev = 0
// arr[0] = 4 > 7? No
// Insert 7 at prev + 1 = 1

// Array becomes:
// [4, 7, 8, 1, 2]

// i = 3
// curr = 1
// prev = 2
// Check:

// arr[2] = 8 > 1? Yes → shift
// [4, 7, 8, 8, 2]
// prev = 1
// arr[1] = 7 > 1? Yes → shift
// [4, 7, 7, 8, 2]
// prev = 0
// arr[0] = 4 > 1? Yes → shift
// [4, 4, 7, 8, 2]
// prev = -1
// Insert 1 at index 0

// Array becomes:
// [1, 4, 7, 8, 2]

// i = 4
// curr = 2
// prev = 3
// Check:

// arr[3] = 8 > 2? Yes → shift
// [1, 4, 7, 8, 8]
// prev = 2
// arr[2] = 7 > 2? Yes → shift
// [1, 4, 7, 7, 8]
// prev = 1
// arr[1] = 4 > 2? Yes → shift
// [1, 4, 4, 7, 8]
// prev = 0
// arr[0] = 1 > 2? No
// Insert 2 at index 1

// Final array:
// [1, 2, 4, 7, 8]





                                          // inbuilt sorting function


// import java.util.Arrays;

// public class basicsortingalgo {
                   

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
    
            

//         public static void main(String[] args) {
//         int arr[] = {4,8,7,1,2};
//         Arrays.sort(arr);// inbuilt sorting function //here sorting will be in ascending order //output will be [1, 2, 4, 7, 8]
//         Arrays.sort(arr, 0, 3);//inbuilt sorting function // sort from index 0 to 2 //output will be [4, 7, 8, 1, 2]
//         printArr(arr);
        
//         }
// }


                                                     // inbuilt sorting function



// import java.util.Arrays;
// import java.util.Collections;//for descending order we have to import Collections class and use reverse order function of that class
// public class basicsortingalgo {
   
                   
//     public static void printArr(Integer arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
    
            

//         public static void main(String[] args) {
//             Integer arr[] = {4,8,7,1,2};
//             Arrays.sort(arr, Collections.reverseOrder());// inbuilt sorting function //reverse order function works on Integer arrays not int //here sorting will be in descending order //output will be [8, 7, 4, 2, 1]
//            Arrays.sort(arr, 0, 3, Collections.reverseOrder());//inbuilt sorting function // sort from index 0 to 2 in reverse order //output will be [8, 7, 4, 1, 2]
//             printArr(arr);
        
//         }
// }




                                           // counting sorting




public static void countingsort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }
    int count[] = new int [largest+1];
    for (int i =0; i<arr.length; i++) {
        count[arr[i]]++;
    }

    //sorting
    int j=0;
    for(int i=0; i<count.length; i++) {
        while(count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
}           

public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++) {
    System.out.print(arr[i]+" ");
    }
    System.out.println();
    
}

public static void main(String[] args) {
    int arr[] = {1,1,4,5,7,3,2,5,6,};
    countingsort(arr);
    printArr(arr);
}
      

//dry run

// Initial array
// arr = {1, 1, 4, 5, 7, 3, 2, 5, 6}

// Step 1: Find the largest element
// Loop through the array:

// max = 1
// max = 1
// max = 4
// max = 5
// max = 7
// max = 7
// max = 7
// max = 7
// max = 7
// So:

// largest = 7

// Step 2: Create count array
// count = new int[largest + 1] = new int[8]

// Initial count array:

// count = {0, 0, 0, 0, 0, 0, 0, 0}


// Step 3: Count frequencies
// You created:

// int count[] = new int[largest + 1];
// Since the largest number is 7, the count array has indexes:

// 0 1 2 3 4 5 6 7
// At first:

// count = {0, 0, 0, 0, 0, 0, 0, 0}
// Now go through arr one by one.

// First element = 1
// count[1]++
// So count becomes:

// {0, 1, 0, 0, 0, 0, 0, 0}
// Second element = 1
// Again:

// count[1]++
// Now:

// {0, 2, 0, 0, 0, 0, 0, 0}
// Third element = 4
// count[4]++
// Now:

// {0, 2, 0, 0, 1, 0, 0, 0}
// Fourth element = 5
// count[5]++
// Now:

// {0, 2, 0, 0, 1, 1, 0, 0}
// Fifth element = 7
// count[7]++
// Now:

// {0, 2, 0, 0, 1, 1, 0, 1}
// Sixth element = 3
// count[3]++
// Now:

// {0, 2, 0, 1, 1, 1, 0, 1}
// Seventh element = 2
// count[2]++
// Now:

// {0, 2, 1, 1, 1, 1, 0, 1}
// Eighth element = 5
// count[5]++
// Now:

// {0, 2, 1, 1, 1, 2, 0, 1}
// Ninth element = 6
// count[6]++
// Final count array:

// {0, 2, 1, 1, 1, 2, 1, 1}


// What does this mean?
// This means:

// 0 appears 0 times
// 1 appears 2 times
// 2 appears 1 time
// 3 appears 1 time
// 4 appears 1 time
// 5 appears 2 times
// 6 appears 1 time
// 7 appears 1 time
// Step 4: Rebuild the sorted array
// Now we take the numbers from the count array and put them back into arr in order.

// We use:

// int j = 0;
// for(int i = 0; i < count.length; i++) {
//     while(count[i] > 0) {
//         arr[j] = i;
//         j++;
//         count[i]--;
//     }
// }
// i = 0
// count[0] = 0
// So nothing is written.

// i = 1
// count[1] = 2
// So write 1 two times into arr.

// Current array becomes:

// {1, 1, _, _, _, _, _, _, _}
// i = 2
// count[2] = 1
// Write 2 one time:

// {1, 1, 2, _, _, _, _, _, _}
// i = 3
// count[3] = 1
// Write 3:

// {1, 1, 2, 3, _, _, _, _, _}
// i = 4
// count[4] = 1
// Write 4:

// {1, 1, 2, 3, 4, _, _, _, _}
// i = 5
// count[5] = 2
// Write 5 two times:

// {1, 1, 2, 3, 4, 5, 5, _, _}
// i = 6
// count[6] = 1
// Write 6:

// {1, 1, 2, 3, 4, 5, 5, 6, _}
// i = 7
// count[7] = 1
// Write 7:

// {1, 1, 2, 3, 4, 5, 5, 6, 7}
// Final sorted array
// {1, 1, 2, 3, 4, 5, 5, 6, 7}