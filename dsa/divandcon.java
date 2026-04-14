                    

                                                    //merge sort



//time complexity = O(nlogn) and space complexity = O(n) because we are using temp array to store sorted elements


public class divandcon {


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





                                                //quick sort


 //average time complexity = O(nlogn) and worst case time complexity = O(n^2) and space complexity = O(1) because we are not using any extra space to store sorted elements   



 public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
         
        int pidx = partition(arr, si, ei);//last element is pivot and we are partitioning the array around pivot and pidx is the index of pivot element after partitioning
        quicksort(arr, si, pidx - 1);// left part
        quicksort(arr, pidx + 1, ei);// right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];// last element is pivot
        int i = si - 1;// to keep track of the index of the last element
        
      

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {// if current element is smaller than pivot then we need to swap it with the element at index i+1 and increment i
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // swap arr[i+1] and arr[ei] to put pivot element in its correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i ;// return the index of pivot element after partitioning
    }

 public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 , -2 };
        quicksort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}

