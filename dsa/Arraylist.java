import java.util.ArrayList;

public class Arraylist {
//     public static void main(String args[]) {
//         //className objectName = new ClassName();
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<Boolean> list3 = new ArrayList<>();
      
//        //add operation O(1)

//        list.add(1);// at oth index 1
//        list.add(2);// at 1th index 2
//        list.add(3);// at 2th index 3
//        list.add(4);// at 3th index 4
//        System.err.println(list);

       //or

//        list.add(1,10);//tc is O(n) and here at 1th index 10 is added and others elements shit accordingly
//            System.err.println(list);

//        //Get operation   - O(1)

//         int element = list.get(1);
//         System.out.println(element);

//        //Delete operation  - O(n)

//      list.remove(2);
//       System.out.println(list);

//       //set operation  - O(n)

//       list.set(3,15);//at3rd index number replace with 15 number 
//       System.err.println(list);

//       //contain - O(n)

//       System.out.println(list.contains(1));//chech number 1 is present or not
//       System.out.println(list.contains(17));//chech number 17 is present or not
//     }
// }


                                           //size of arraylist
                                        


//     public static void main(String args[]) {
//         //className objectName = new ClassName();
//        ArrayList<Integer> list = new ArrayList<>();
      
//        //add operation O(1)

//        list.add(1);// at oth index 1
//        list.add(2);// at 1th index 2
//        list.add(3);// at 2th index 3
//        list.add(4);// at 3th index 4

//        System.err.println(list.size()); 

//        //print the arraylist

//        for( int i = 0; i<list.size(); i++) {
//         System.out.print(list.get(i) +" ");
//        }


//     }
// }
            


                                                 //print reverse - O(n)


//    public static void main(String args[]) {
//         //className objectName = new ClassName();
//        ArrayList<Integer> list = new ArrayList<>();
      
//        //add operation O(1)

//        list.add(1);// at oth index 1
//        list.add(2);// at 1th index 2
//        list.add(3);// at 2th index 3
//        list.add(4);// at 3th index 4

//        //print the  reverse arraylist

//        for( int i = list.size()-1; i>=0; i--) {
//         System.out.print(list.get(i) +" ");
//        }


//     }
// }                                              

                                         //find maximum


// public static void main(String args[]) {
//         //className objectName = new ClassName();
//        ArrayList<Integer> list = new ArrayList<>();
      

//        list.add(16);
//        list.add(20);
//        list.add(32);
//        list.add(4);

//        int max = Integer.MIN_VALUE;

//        for( int i = 0; i<list.size(); i++) {
//           if(max < list.get(i)) {
//             max = list.get(i);
//           }
        
//        }
//         System.out.print(" max element = " + max);

//     }
// }


                                                 //or - O(n)


//    public static void main(String args[]) {
//         //className objectName = new ClassName();
//        ArrayList<Integer> list = new ArrayList<>();
      

//        list.add(16);
//        list.add(20);
//        list.add(32);
//        list.add(4);

//        int max = Integer.MIN_VALUE;

//        for( int i = 0; i<list.size(); i++) {
//           max = Math.max(max , list.get(i));
//           }
//           System.out.print(" max element = " + max);
//     }
      

// }


//dry run


// ArrayList list is created and initialized to empty.

// list.add(16); --> list = [16]

// list.add(20); --> list = [16, 20]

// list.add(32); --> list = [16, 20, 32]

// list.add(4); --> list = [16, 20, 32, 4]

// int max = Integer.MIN_VALUE;
// max = -2147483648 (smallest possible integer value)

// Iteration of for loop:
// i = 0
// list.get(0) = 16
// max = Math.max(-2147483648, 16) = 16

// i = 1
// list.get(1) = 20
// max = Math.max(16, 20) = 20

// i = 2
// list.get(2) = 32
// max = Math.max(20, 32) = 32

// i = 3
// list.get(3) = 4
// max = Math.max(32, 4) = 32

// End of loop:
// The maximum element found is 32



                                                  //swap 2 numbers
                                              

// public static void swap (ArrayList<Integer> list, int idx1, int idx2) {
//        int temp = list.get(idx1);
//        list.set(idx1, list.get(idx2));
//        list.set(idx2, temp);
// }

//  public static void main(String args[]) {
//         //className objectName = new ClassName();
//        ArrayList<Integer> list = new ArrayList<>();
      

//        list.add(16);
//        list.add(20);
//        list.add(32);
//        list.add(4);

//        int idx1 = 1, idx2 = 3;//here 1 and 3 is index
//        System.out.println(list);
//        swap(list, idx1, idx2);
//        System.out.println(list);
// }
//  }



                                    //Sorting an arraylist


// import java.util.ArrayList;
// import java.util.Collections;
// //or here we also write import java.util.*; in which above both 2 lines includes
// public class Arraylist {
//  public static void main(String args[]) {
//         //className objectName = new ClassName();
//        ArrayList<Integer> list = new ArrayList<>();
      

//        list.add(16);
//        list.add(20);
//        list.add(32);
//        list.add(4);

//        System.out.println(list);

       
//        Collections.sort(list);// for ascending order and collections is a class and collection is a interface and  .sort is a function
//        System.out.println(list);

//        Collections.sort(list, Collections.reverseOrder());//for descending order and Collections.reverseOrder() is a comparator is a function in java which define logic
//          System.out.println(list);
// }

// }


                                            //multidimensional arraylist


// public static void main (String args[]) {
//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//        list.add(1); list.add(2);
//        mainList.add(list);

//         ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(3); list2.add(4);
//        mainList.add(list2);

//        for(int i=0; i<mainList.size(); i++) {
//               ArrayList<Integer> currList = mainList.get(i);
//               for(int j= 0; j<currList.size(); j++) {
//                      System.out.print(currList.get(j) + " ");
//               }
//                System.out.println();
//        }
//         System.out.println(mainList);
//    }  
// }                                       


                                                        //or



//    public static void main (String args[]) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>(); 
//         ArrayList<Integer> list3 = new ArrayList<>();  
        
//         for(int i = 1; i<=5; i++) {
//               list1.add(i*1);
//               list2.add(i*2);
//               list3.add(i*3);
//         }


//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         System.out.println(mainList); 

//mainList is an ArrayList that contains 3 inner lists. 
// So, mainList.size() returns 3 because you added three separate lists to it.
//This size represents the number of inner ArrayLists stored inside the mainList


//nested loop 

//         for(int i = 0; i<mainList.size(); i++) {
//               ArrayList<Integer> currList = mainList.get(i);
//               for(int j = 0; j<currList.size();j++) {
//               System.out.print(currList.get(j) +" ");
//               }
//                System.out.println();
//         }
//   }
// }

//dry run

// When i=0:
// currList = [1, 2, 3, 4, 5]
// The inner loop prints: 1 2 3 4 5
// When i=1:
// currList = [2, 4, 6, 8, 10]
// Print: 2 4 6 8 10
// When i=2:
// currList = [3, 6, 9, 12, 15]
// Print: 3 6 9 12 15

// Summary:

// Outer loop picks each inner list one-by-one.
// Inner loop prints all elements of that inner list in a line.
// System.out.println() moves to next line after each inner list is printed.

 

                                            //container with most water (brute force)



// public static int storeWater(ArrayList<Integer> height ) {
//        int maxWater = 0;

//brute force - O(n^2)
       
//        for(int i = 0; i<height.size(); i++) {
//               for(int j= i+1; j<height.size(); j++) {
//                   int ht = Math.min(height.get(i), height.get(j)); 
//                   int width = j-i;
//                   int currWater = ht*width;
//                   maxWater = Math.max(maxWater, currWater);
//               }
//        }

//        return maxWater;
// }


// public static void main (String args[]) {
//         ArrayList<Integer> height = new ArrayList<>();
//          //1,8,6,2,5,4,8,3,7

//          height.add(1);
//           height.add(8);
//            height.add(6);
//             height.add(2);
//              height.add(5);
//               height.add(4);
//                height.add(8);
//                 height.add(3);
//                  height.add(7);

//                  System.out.println(storeWater(height));
//        }
// }

//dry rum

// Consider the list of heights:

// Index: 0 1 2 3 4 5 6 7 8
// Height: 1, 8, 6, 2, 5, 4, 8, 3, 7

// Let's take an example pair (i=1, j=8):
// height at 1 = 8
// height at 8 = 7
// width = 8 - 1 = 7
// The height used to calculate water is minimum of both heights: min(8,7) = 7
// Water area (capacity) = height * width = 7 * 7 = 49



                                              //container with most water (2 pointer approach)



//   public static int storeWater(ArrayList<Integer> height) {
//     int maxWater = 0; 
//     int lp = 0; // left pointer
//     int rp = height.size() - 1; // right pointer

//     while (lp < rp) {
//         // Calculate water area
//         int ht = Math.min(height.get(lp), height.get(rp));
//         int width = rp - lp;
//         int currWater = ht * width;
//         maxWater = Math.max(maxWater, currWater);

//         // Update pointer
//         if (height.get(lp) < height.get(rp)) {
//             lp++;
//         } else {
//             rp--;
//         }
//     }
//     return maxWater;  // <-- Return required here
// }
 
 
//  public static void main(String[] args) {
//      ArrayList<Integer> height = new ArrayList<>();

//         //1,8,6,2,5,4,8,3,7

//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);

//         System.out.println(storeWater(height));
//  }
// }
 

                                            //  pair sum - 1 (find if any pair in a sorted arraylist has a target sum )



//brute force - O(n^2)
//  public static boolean pairSum1 (ArrayList<Integer> list, int target) {

//        for(int i = 0; i<list.size(); i++){
//               for(int j = i+1; j<list.size(); j++) {
//                      if(list.get(i) + list.get(j) == target) {
//                             return true;
//                      }
//               }
//        }
//        return false;
// }

//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();

//        list.add(16);
//        list.add(20);
//        list.add(32);
//        list.add(4);
//        int target = 36;
//        System.out.println(pairSum1(list, target));
//    }      
//  }                                           



                                             //  pair sum - 1 (2 pointer approach) &  O(n)



  public static boolean pairSum1(ArrayList<Integer> list, int target) {
       int lp = 0;
       int rp = list.size()-1;

       while(lp != rp) {
              //case 1
              if(list.get(lp) + list.get(rp) == target) {
                     return true;
              }

          //case 2
         if(list.get(lp) + list.get(rp) < target) {
           lp++;
         }else{
              //case 3
              rp--;
         }
       }
   return false;
  }         
  
     public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();

       list.add(16);
       list.add(20);
       list.add(32);
       list.add(4);

       int target = 36;
       System.out.println(pairSum1(list, target));
    }      
 }       