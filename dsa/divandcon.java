                    

                                                    //merge sort



//time complexity = O(nlogn) and space complexity = O(n) because we are using temp array to store sorted elements


// public class divandcon {


//     public static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }

//         public static void mergeSort(int arr[], int si, int ei) {
//         if (si >= ei) {// base case when there is only one element in the array or no element in the array
//             return;
//         }
//         int mid = si + (ei - si) / 2;// to avoid overflow of (si+ei)/2 when si and ei are large
//         mergeSort(arr, si, mid);// left part
//         mergeSort(arr, mid + 1, ei);// right part
//         merge(arr, si, mid, ei);// merge both left and right part
//     }

//     public static void merge(int arr[], int si, int mid, int ei) {
//         int temp[] = new int[ei - si + 1];// temp array to store sorted elements and for example left part (0,3)= 4elements and right(4,7)= 4 elements ->  7-0+1 = 8 elements in temp array
//         int i = si; // iterator for left part
//         int j = mid + 1; // iterator for right part
//         int k = 0; // iterator for temp arr

//         while (i <= mid && j <= ei) {
//             if (arr[i] < arr[j]) {
//                 temp[k] = arr[i];
//                 i++;
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         // left part
//         while (i <= mid) {
//             temp[k] = arr[i]; //or temp[k++] = arr[i++]
//             i++;
//             k++;
//         }

//         // right part
//         while (j <= ei) {
//             temp[k] = arr[j];//or temp[k++] = arr[j++]
//             j++;
//             k++;
//         }

//         // copy temp to original arr
//         for (k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 4, 1, 3, 2 , -2 };
//         mergeSort(arr, 0, arr.length - 1);
//         printarr(arr);
//     }
    
// }




                                          //or


//     public static void mergesort(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int mid = si + (ei - si) / 2;
//         mergesort(arr, si, mid);
//         mergesort(arr, mid + 1, ei);
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(int arr[], int si, int mid, int ei) {
//         int temp[] = new int[ei - si + 1];// temp array to store sorted elements and for example left(0,3)=4elements and right(4,7)= 4elements ->  7-0+1 = 8elements in temp array
//         int i = si; // iterator for left part
//         int j = mid + 1; // iterator for right part
//         int k = 0; // iterator for temp arr

//         while (i <= mid && j <= ei) {
//             if (arr[i] < arr[j]) {
//                 temp[k] = arr[i];
//                 i++;
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         // left part
//         while (i <= mid) {
//             temp[k] = arr[i];
//             i++;
//             k++;
//         }

//         // right part
//         while (j <= ei) {
//             temp[k] = arr[j];
//             j++;
//             k++;
//         }

//         // copy temp to original arr
//         for (k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 4, 1, 3, 2 , -2 };
//         mergesort(arr, 0, arr.length - 1);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
    
// }





                                                //Quick sort


 //average time complexity = O(nlogn) and worst case time complexity = O(n^2) and space complexity = O(1) because we are not using any extra space to store sorted elements   

// public class divandcon {

//  public static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }


//     public static void quicksort(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
         
//         int pidx = partition(arr, si, ei);//last element is pivot and we are partitioning the array around pivot and pidx is the index of pivot element after partitioning
//         quicksort(arr, si, pidx - 1);// left part
//         quicksort(arr, pidx + 1, ei);// right part
//     }

//     public static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei];// last element is pivot
//         int i = si - 1;// to keep track of the index of the last element
        
      

//         for (int j = si; j < ei; j++) {
//             if (arr[j] < pivot) {// if current element is smaller than pivot then we need to swap it with the element at index i+1 and increment i
//                 i++;
//                 // swap arr[i] and arr[j]
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         // swap arr[i+1] and arr[ei] to put pivot element in its correct position
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;

//         return i ;// return the index of pivot element after partitioning
//     }

//  public static void main(String[] args) {
//         int arr[] = { 5, 4, 1, 3, 2 , -2 };
//         quicksort(arr, 0, arr.length - 1);
//         printarr(arr);
//     }
// }


// dry run

// Initial array: [5, 4, 1, 3, 2, -2]

// 1) quicksort(arr, 0, 5)
// si = 0
// ei = 5
// Since si < ei, continue.

// Call: pidx = partition(arr, 0, 5)

// 2) partition(arr, 0, 5)
// Initial values
// pivot = arr[5] = -2
// i = si - 1 = -1
// loop j from 0 to 4
// Current array: [5, 4, 1, 3, 2, -2]

// Loop step by step
// j = 0
// arr[0] = 5
// condition: 5 < -2 → false
// No change.
// Array: [5, 4, 1, 3, 2, -2]

// j = 1
// arr[1] = 4
// condition: 4 < -2 → false
// No change.
// Array: [5, 4, 1, 3, 2, -2]

// j = 2
// arr[2] = 1
// condition: 1 < -2 → false
// No change.
// Array:[5, 4, 1, 3, 2, -2]

// j = 3
// arr[3] = 3
// condition: 3 < -2 → false
// No change.
// Array:[5, 4, 1, 3, 2, -2]

// j = 4
// arr[4] = 2
// condition: 2 < -2 → false
// No change.
// Array: [5, 4, 1, 3, 2, -2]

// Final pivot swap
// After loop:
// i = -1
// i++ → i = 0
// Now swap:

// arr[ei] = arr[5]
// arr[i] = arr[0]
// So swap -2 and 5

// Array becomes: [-2, 4, 1, 3, 2, 5]
// Return: pidx = 0

// 3) Recursive calls
// Now:
// quicksort(arr, 0, -1)   // left part
// quicksort(arr, 1, 5)    // right part
// Left part:
// si = 0, ei = -1
// si >= ei true → return

// 4) quicksort(arr, 1, 5)
// Current array: [-2, 4, 1, 3, 2, 5]
// Call partition:
// pidx = partition(arr, 1, 5)

// 5) partition(arr, 1, 5)
// Initial values
// pivot = arr[5] = 5
// i = 0
// j from 1 to 4
// Array: [-2, 4, 1, 3, 2, 5]

// Loop step by step
// j = 1
// arr[1] = 4
// 4 < 5 → true
// Increment i:

// i = 1
// Swap arr[1] and arr[1]
// No visible change.

// Array: [-2, 4, 1, 3, 2, 5]

// j = 2
// arr[2] = 1
// 1 < 5 → true
// Increment i:

// i = 2
// Swap arr[2] and arr[2]
// No visible change.

// Array: [-2, 4, 1, 3, 2, 5]

// j = 3
// arr[3] = 3
// 3 < 5 → true
// Increment i:

// i = 3
// Swap arr[3] and arr[3]
// No visible change.

// Array: [-2, 4, 1, 3, 2, 5]

// j = 4
// arr[4] = 2
// 2 < 5 → true
// Increment i:

// i = 4
// Swap arr[4] and arr[4]
// No visible change.

// Array: [-2, 4, 1, 3, 2, 5]
// Final pivot swap
// After loop:

// i = 4
// i++ → i = 5
// Swap:
// arr[5] with arr[5]
// No change.
// Return: pidx = 5

// 6) Recursive calls
// quicksort(arr, 1, 4)
// quicksort(arr, 6, 5)
// Right call:
// quicksort(arr, 6, 5) → base case, return

// 7) quicksort(arr, 1, 4)
// Current array: [-2, 4, 1, 3, 2, 5]
// Call:
// pidx = partition(arr, 1, 4)

// 8) partition(arr, 1, 4)
// Initial values
// pivot = arr[4] = 2
// i = 0
// j = 1 to 3
// Array: [-2, 4, 1, 3, 2, 5]
// Loop step by step
// j = 1
// arr[1] = 4
// 4 < 2 → false
// No change.

// j = 2
// arr[2] = 1
// 1 < 2 → true
// Increment i:

// i = 1
// Swap arr[1] and arr[2]

// Array becomes: [-2, 1, 4, 3, 2, 5]
// j = 3
// arr[3] = 3
// 3 < 2 → false
// No change.

// Final pivot swap
// i = 1
// i++ → i = 2
// Swap arr[2] and arr[4]
// Swap 4 and 2

// Array becomes: [-2, 1, 2, 3, 4, 5]
// Return: pidx = 2

// 9) Recursive calls
// quicksort(arr, 1, 1)
// quicksort(arr, 3, 4)
// quicksort(arr, 1, 1) → base case, return

// 10) quicksort(arr, 3, 4)
// Current array: [-2, 1, 2, 3, 4, 5]
// Call: pidx = partition(arr, 3, 4)

// 11) partition(arr, 3, 4)
// Initial values
// pivot = arr[4] = 4
// i = 2
// j = 3 to 3
// Array: [-2, 1, 2, 3, 4, 5]
// j = 3
// arr[3] = 3
// 3 < 4 → true
// Increment i:

// i = 3
// Swap arr[3] and arr[3]
// No change.

// Final pivot swap
// i = 3
// i++ → i = 4
// Swap arr[4] and arr[4]
// No change.

// Return: pidx = 4

// 12) Recursive calls
// quicksort(arr, 3, 3)
// quicksort(arr, 5, 4)
// Both are base cases, return.

// Final Sorted Array
// [-2, 1, 2, 3, 4, 5]

// Summary of pivot positions
// First pivot -2 placed at index 0
// Second pivot 5 placed at index 5
// Third pivot 2 placed at index 2
// Fourth pivot 4 placed at index 4



                                                //sorted and rotated array


public class divandcon {
    public static int search(int arr[], int tar, int si, int ei) {
        if(si > ei) {
            return -1;
        }

        //kaam
        int mid = si+(ei-si)/2; // or (si+ei)/2

        //case found
        if(arr[mid] == tar) {
            return mid;
        }

        //mid on line 1
        if(arr[si] <= arr[mid]) {
            //case a : left part 
            if(arr[si] <= tar && tar<= arr[mid]) {
                return search(arr, tar, si, mid-1);
            }else {
                //case b : right
                return search(arr,tar, mid+1, ei);
            }

        } else {//mid on line 2
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }else {
                //case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }


    public static void main (String args[]){
        int arr[]= {4,5,6,7,0,1,2};
        int target = 0;//output is 0 at index 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}                                                
