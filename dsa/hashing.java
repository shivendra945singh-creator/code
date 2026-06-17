

                                                  //hashmap


// import java.util.HashMap;


// public class hashing {
//     public static void main (String args[]) {

//         //create a hash table
//         HashMap<String, Integer> hm = new HashMap<>();



//                                                      //hashmap operations


//         //insert - O(1)
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("USA", 50);
//         System.out.println(hm); //{USA=50, India=100, China=150}

//         //get - O(1)
//         // System.out.println(hm.get("China")); //150
//         // System.out.println(hm.get("USA")); //50
//         // System.out.println(hm.get("India")); //100
//         //or
//         int population = hm.get("India");
//         System.out.println(population); //100

//         System.out.println(hm.get("Russia")); //null because Russia is not present in the hash table
        

//         //containsKey - O(1)
//         // System.out.println(hm.containsKey("India")); //true
//         // System.out.println(hm.containsKey("Russia")); //false

//         //remove - O(1)

//         System.out.println(hm.remove("USA"));//50 print the value of USA and remove it from the hash table
//         System.out.println(hm);

//         //or

//         //  hm.remove("USA"); //remove USA and its value from the hash table
//         // System.out.println(hm); //{India=100, China=150}

//         //or

//         System.out.println(hm.remove("Canada")); //null because Canada is not present in the hash table

//         //size
//         System.out.println(hm.size()); //2 because we have removed USA from the hash table

//         //isEmpty
//         System.out.println(hm.isEmpty()); //false because we have 2 key-value pairs in the hash table

//         //clear
//         hm.clear(); //remove all key-value pairs from the hash table
//         System.out.println(hm); //{}

//     }
// }





                                                         //iteration on hashmap

// import java.util.HashMap;
//  import java.util.Set;
 
//  public class hashing {
//      public static void main (String args[]) {

//          HashMap<String, Integer> hm = new HashMap<>();

//          hm.put("India", 100);
//          hm.put("China", 150);
//          hm.put("USA", 50);

// //iterate
// Set<String> keys = hm.keySet(); //get all keys from the hash table
// System.out.println(keys); //[USA, India, China] //output is not in the order of insertion because hash table does not maintain the order of keys

//  }
// }     


                                                      //or



// import java.util.HashMap;
//  import java.util.Set;
 
//  public class hashing {
//      public static void main (String args[]) {

//          HashMap<String, Integer> hm = new HashMap<>();

//          hm.put("India", 100);
//          hm.put("China", 150);
//          hm.put("USA", 50);

// //iterate
// Set<String> keys = hm.keySet(); //get all keys from the hash table
// System.out.println(keys); //[USA, India, China] //output is not in the order of insertion because hash table does not maintain the order of keys

// for (String k : keys) {//foreach loop to iterate over the keys of the hash table or arrar or any data structure or  collection
//     System.out.println("keys=" + k + " " + "value=" + hm.get(k)); 

//  }
// } 
//  }    



                                                   //linked hashmap


//  import java.util.LinkedHashMap;
//  public class hashing {
//      public static void main (String args[]) {

//          LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

//          lhm.put("India", 100);
//          lhm.put("China", 150);
//          lhm.put("USA", 50);

//          System.out.println(lhm); //{India=100, China=150, USA=50} //output is in the order of insertion because linked hash table maintains the order of keys

//      }
//  }   
 
 

                                                    //tree hashmap


// import java.util.TreeMap;
// public class hashing {
//     public static void main (String args[]) {

//         TreeMap<String, Integer> tm = new TreeMap<>();

//         tm.put("India", 100);
//         tm.put("China", 150);
//         tm.put("USA", 50);
//         tm.put("indonesia", 200);

//         System.out.println(tm); //{China=150, India=100, Indonesia=200, USA=50} //output is in the sorted order(alphabetical) of keys because tree hash table maintains the sorted order of keys

//     }
// }        



                                                        //hashset


// import java.util.HashSet;
// public class hashing {
    
//     public static void main (String args[]) {

//         HashSet<String> hs = new HashSet<>();

//         hs.add("India");
//         hs.add("China");
//         hs.add("USA");
//         hs.add("India"); //duplicate value will not be added to the hash set

//         System.out.println(hs); //[USA, India, China] //output is not in the order of insertion because hash set does not maintain the order of elements

//         //contains
//         if(hs.contains("India")) {
//             System.out.println("India is present in the hash set");
//         } if(hs.contains("Russia")) {
//             System.out.println("Russia is present in the hash set");
//         }

//         //remove
//         hs.remove("USA");
//         System.out.println(hs); //[India, China] //output after removing "USA"

//         //size
//         System.out.println(hs.size()); //2 because we have removed "USA" from the hash set

//         //isEmpty
//         System.out.println(hs.isEmpty()); //false because we have 2 elements in the hash set

//         //clear
//         hs.clear(); //remove all elements from the hash set
//         System.out.println(hs); //[] //output after clearing the hash set

        

//     }
// }



                                                               //iteration on hashset(using iterator)


//  import java.util.HashSet;
//  import java.util.Iterator;
 
//  public class hashing {
//      public static void main (String args[]) {

//          HashSet<String> hs = new HashSet<>();

//          hs.add("India");
//          hs.add("China");
//          hs.add("USA");
//          hs.add("India"); //duplicate value will not be added to the hash set

//          System.out.println(hs); //[USA, India, China] //output is not in the order of insertion because hash set does not maintain the order of elements

//          //iterate
//          Iterator it = hs.iterator(); //create an iterator object to iterate over the hash set
//          while(it.hasNext()) { //while there is a next element in the hash set
//              System.out.println(it.next()); //print the next element in the hash set
//          }

//      }
//  }


                                                                   //iteration on hashset(using foreach loop)

 
//  import java.util.HashSet;
 
//  public class hashing {
//      public static void main (String args[]) {

//          HashSet<String> hs = new HashSet<>();

//          hs.add("India");
//          hs.add("China");
//          hs.add("USA");
//          hs.add("India"); //duplicate value will not be added to the hash set

//          System.out.println(hs); //[USA, India, China] //output is not in the order of insertion because hash set does not maintain the order of elements

//          //iterate using foreach loop
//          for (String s : hs) { //foreach loop to iterate over the elements of the hash set
//              System.out.println(s); //print the element in the hash set
//          }

//      }
//  }


                                                                //linked hashset

// import java.util.LinkedHashSet;                                                               
// public class hashing {
    
//     public static void main (String args[]) {

//         LinkedHashSet<String> lhs = new java.util.LinkedHashSet<>();


//         lhs.add("India");   
//         lhs.add("China");
//         lhs.add("USA");
//         System.out.println(lhs); //[India, China, USA] //output is in the order of insertion because linked hash set maintains the order of elements

//     }
// }




                                                                 //tree hashset


// import java.util.TreeSet;
// public class hashing {
    
//     public static void main (String args[]) {

//         TreeSet<String> ts = new TreeSet<>();
        
//         ts.add("India");
//         ts.add("China");    
//         ts.add("USA");
//         ts.add("Indonesia");
//         System.out.println(ts); //[China, India, Indonesia, USA] //output is in the sorted order(alphabetical) of elements because tree hash set maintains the sorted order of elements

//     }
// }



                                                          //count distinct elements in an array using hashset


// import java.util.HashSet; // O(n)
// public class hashing {
    
//     public static void main (String args[]) {

//         int arr[] = {1, 2, 3, 4, 5, 1, 2, 3};

//         HashSet<Integer> hs = new HashSet<>();

//         for (int i = 0; i < arr.length; i++) {
//             hs.add(arr[i]); //add elements of the array to the hash set
//         }

//         System.out.println("Distinct elements: " + hs.size()); // output is 5 because we have 5 distinct elements in the array

//     }
// }



                                                //count union and intersection elements of two arrays using hashset



// import java.util.HashSet; // O(n)


// public class hashing {
    
//     public static void main (String args[]) {

//         int arr1[] = {1, 2, 3, 4, 5};
//         int arr2[] = {4, 5, 6, 7, 8};

//         HashSet<Integer> hs = new HashSet<>();

//         //union
//         for (int i = 0; i < arr1.length; i++) {
//             hs.add(arr1[i]); //add elements of the first array to the hash set
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             hs.add(arr2[i]); //add elements of the second array to the hash set
//         }

//         System.out.println("Union elements: " + hs.size()); // output is 8 because we have 8 distinct elements in the union of two arrays


//         //intersection
//         hs.clear(); //clear the hash set to store only the elements of the first array
//         for (int i = 0; i < arr1.length; i++) {
//             hs.add(arr1[i]); //add elements of the first array to the hash set
//         }

//         int count = 0;
//         for (int i = 0; i < arr2.length; i++) {
//             if (hs.contains(arr2[i])) { //check if the element of the second array is present in the hash set
//                 count++; //increment count if the element is present in the hash set
//                 hs.remove(arr2[i]); //remove the element from the hash set to avoid counting duplicate elements in the second array
//             }
//         }
//         System.out.println("Intersection elements: " + count); // output is 2 because we have 2 common elements in both arrays
//     }
// }



                                                               //find itinerary from given list of tickets using hashmap



import java.util.HashMap; // O(n)
public class hashing {
    
    public static String getStartingPoint(HashMap<String, String> tickets) {//from to to data
        HashMap<String, String> reverseMap = new HashMap<>();//to to from data

        for (String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key), key); //create a reverse map to find the starting point of the itinerary
        }

        for (String key : tickets.keySet()) {
            if (!reverseMap.containsKey(key)) { //if the key is not present in the reverse map, then it is the starting point of the itinerary
                return key; //return the starting point of the itinerary
            }
        }
        return null; //return null if there is no starting point of the itinerary
    }


    public static void main (String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bangalore");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");


        String startingPoint = getStartingPoint(tickets);
        System.out.print( startingPoint);//print the starting point of the itinerary

        for(String key : tickets.keySet()) {
            
            System.out.print( " -> " + tickets.get(startingPoint));//print the next destination in the itinerary
            startingPoint = tickets.get(startingPoint); //update the starting point to the next destination
        }

        System.out.println(); //print a new line after printing the itinerary
    }
}



                                                                        //largest subarray with 0 sum using hashset
                                                                        


//  import java.util.HashMap; // O(n)
//  public class hashing {
    
//     public static void main (String args[]) {

//         int arr[] = {1, 2, -3, 3, 7, -7};

//         HashMap<Integer, Integer> map = new HashMap<>();

//         //(sum, index) //store the cumulative sum and its index in the hash map
//         int sum = 0;
//         int Length = 0;

//         for ( int j=0; j < arr.length; j++) {
//             sum += arr[j]; //calculate the cumulative sum of the elements of the array

//            if(map.containsKey(sum)) {
//                 Length = Math.max(Length, j - map.get(sum)); //update the maximum length of the subarray with 0 sum
//             } else {
//                 map.put(sum, j); //add the cumulative sum to the hash map
//             }
//         }

//         System.out.println("Largest subarray with 0 sum: " + Length); // output is 4 because we have a subarray with 0 sum from index 2 to index 5
//     }
//  }


                                                           //or



//  import java.util.HashSet; // O(n)
//  public class hashing {
    
//     public static void main (String args[]) {

//         int arr[] = {1, 2, -3, 3, 7, -7};

//         HashSet<Integer> hs = new HashSet<>();

//         int sum = 0;
//         int maxLength = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i]; //calculate the cumulative sum of the elements of the array

//             if (sum == 0) { //if the cumulative sum is 0, then we have found a subarray with 0 sum
//                 maxLength = i + 1; //update the maximum length of the subarray with 0 sum
//             } else if (hs.contains(sum)) { //if the cumulative sum is already present in the hash set, then we have found a subarray with 0 sum
//                 maxLength = Math.max(maxLength, i - hs.size()); //update the maximum length of the subarray with 0 sum
//             } else {
//                 hs.add(sum); //add the cumulative sum to the hash set
//             }
//         }

//         System.out.println("Largest subarray with 0 sum: " + maxLength); // output is 4 because we have a subarray with 0 sum from index 1 to index 4

//     }
//  }                                                                       

