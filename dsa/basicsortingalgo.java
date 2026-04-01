//                                 sorting means arrange in an order




//                                 bubble sort means large element come to the end of array by swapping with adjacent elements


//                        ##time complexity of bubble sort , insertion sort, selection sort is O(n square)




// public class basicsortingalgo {
//     public static void bubblesort(int arr[]) {
//         for(int turn=0; turn<arr.length-1; turn++) {
//             for (int j=0; j<arr.length-1-turn; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     //swap
//                     int temp = arr[j];
//                         arr[j] = arr[j+1];
//                         arr[j+1] = temp;
//                 }

//                 }
//             }
//         }

//         public static void printArr(int arr[]) {
//             for(int i=0; i<arr.length; i++) {
//                 System.err.print( arr[i] +" ");
//             }
//             System.err.println();
//         }

//         public static void main(String[] args) {
//             int arr[] = {4,8,7,1,2};
//             bubblesort(arr);
//             printArr(arr);
//         }
//     // }


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



//                                            selection sort means pick the smallest (from unsorted) put it at the beginning





// public class basicsortingalgo {
//     public static void selectionsort(int arr[]) {
//         for(int i=0; i<arr.length-1;  i++) {
//             int minposition = i;
//             for (int j=i+1; j<arr.length; j++) {
//                 if(arr[minposition] > arr[j]) {
//                     minposition = j;
//                 }
//             }
//                     //swap
//                     int temp = arr[minposition];
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




                                //insertion sort means pick an element(from unsorted part) & place in the right in sorted part





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

// i = 1 (curr = 8)
// prev = 0
// Check if arr[prev] > curr → 4 > 8? No → no shift
// Insert 8 at prev+1 = 1 (already there)
// Array: [4, 8, 7, 1, 2]
// i = 2 (curr = 7)
// prev = 1
// Check if arr[prev] > curr → 8 > 7? Yes → shift arr[2] = arr[1] → [4, 8, 8, 1, 2]
// prev = 0
// Check arr[prev] > curr → 4 > 7? No → stop
// Insert 7 at prev+1 = 1
// Array: [4, 7, 8, 1, 2]
// i = 3 (curr = 1)
// prev = 2
// Check if arr[prev] > curr → 8 > 1? Yes → shift → [4, 7, 8, 8, 2]
// prev = 1
// Check if arr[prev] > curr → 7 > 1? Yes → shift → [4, 7, 7, 8, 2]
// prev = 0
// Check if arr[prev] > curr → 4 > 1? Yes → shift → [4, 4, 7, 8, 2]
// prev = -1 stop
// Insert 1 at prev+1 = 0
// Array: [1, 4, 7, 8, 2]
// i = 4 (curr = 2)
// prev = 3
// Check if arr[prev] > curr → 8 > 2? Yes → shift → [1, 4, 7, 8, 8]
// prev = 2
// Check if arr[prev] > curr → 7 > 2? Yes → shift → [1, 4, 7, 7, 8]
// prev = 1
// Check if arr[prev] > curr → 4 > 2? Yes → shift → [1, 4, 4, 7, 8]
// prev = 0
// Check if arr[prev] > curr → 1 > 2? No → stop
// Insert 2 at prev+1 = 1
// Array: [1, 2, 4, 7, 8]
// Final Sorted Array: [1, 2, 4, 7, 8]





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



public static void printArr(int[] args) {
    for(int i=0; i<arr.length; i++) {
    System.err.print(arr[i]+" ");
    }
    System.err.println();
    
}


public static void main(String[] args) {
    int arr[] = {1,1,4,5,7,3,2,5,6,};
    countingsort(arr);
    printArr(arr);
}

          //s  pp     kk       