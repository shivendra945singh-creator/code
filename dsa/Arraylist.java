// import java.util.ArrayList;

// public class Arraylist {
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

       
//        Collections.sort(list);//ascending order
//        System.out.println(list);
//  }
// }