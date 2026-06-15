

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


import java.util.TreeSet;
public class hashing {
    
    public static void main (String args[]) {

        TreeSet<String> ts = new TreeSet<>();
        
        ts.add("India");
        ts.add("China");    
        ts.add("USA");
        ts.add("Indonesia");
        System.out.println(ts); //[China, India, Indonesia, USA] //output is in the sorted order(alphabetical) of elements because tree hash set maintains the sorted order of elements

    }
}