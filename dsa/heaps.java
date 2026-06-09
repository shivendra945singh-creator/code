
                                       //priority queue in JCF


// import java.util.PriorityQueue;

// public class heaps {


//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         pq.add(3);//O(log n)
//         pq.add(1);
//         pq.add(2);
//         System.out.println(pq.peek()); // Output: 1 (the smallest element)
//         System.out.println(pq.poll()); // Output: 1 (removes the smallest element)
//         System.out.println(pq.peek()); // Output: 2 (the next smallest element)


        
//     }
    
// }


                                                 //or




// import java.util.PriorityQueue;
// public class heaps {


//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         pq.add(3);//O(log n)
//         pq.add(1);
//         pq.add(2);
//         pq.add(4);


//          while (!pq.isEmpty()) {
//             System.out.println(pq.peek()); // O(1)
//             pq.remove(); // O(log n)
//         }
    
//     }

// }



                                                      //or in descending order


//pq give sorting order by deafault in ascending order but we can change it by using comparator



// import java.util.PriorityQueue;
// import java.util.*;
// public class heaps {


//     public static void main(String args[]) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//comparator is used to change the default sorting order of the priority queue

//         pq.add(3);//O(log n)
//         pq.add(1);
//         pq.add(2);
//         pq.add(4);


//          while (!pq.isEmpty()) {
//             System.out.println(pq.peek()); // O(1)
//             pq.remove(); // O(log n)
//         }
    
//     }

// }


                                                        //pq for objects



// import java.util.PriorityQueue;

// public class heaps {

//     static class Student implements Comparable<Student> {
//         String name;
//         int rank;

//         public Student(String name, int rank) {
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override
//         public int compareTo(Student s2) {
//             return this.rank - s2.rank; // Sort by rank in ascending order
//         }
//     }

//     public static void main(String[] args) {
//         PriorityQueue<Student> pq = new PriorityQueue<>();

//         pq.add(new Student("Alice", 22));
//         pq.add(new Student("Bob", 20));
//         pq.add(new Student("Charlie", 21));

//         while (!pq.isEmpty()) {
//             // Student student = pq.poll(); // O(log n)
//             // System.out.println(student.name + " - " + student.rank);
//             //or
//             System.out.println(pq.peek().name + " - " + pq.peek().rank); // O(log n) 
//             pq.remove();
//         }
//     }
// }                                                      


                                                       //or

                                                       

// import java.util.PriorityQueue;

// public class heaps {

//     static class Student implements Comparable<Student> {
//         String name;
//         int rank;

//         public Student(String name, int rank) {
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override
//         public int compareTo(Student other) {
//             return Integer.compare(this.rank, other.rank); // Sort by rank
//         }
//     }

//     public static void main(String[] args) {
//         PriorityQueue<Student> pq = new PriorityQueue<>();

//         pq.add(new Student("Alice", 22));
//         pq.add(new Student("Bob", 20));
//         pq.add(new Student("Charlie", 21));

//         while (!pq.isEmpty()) {
//             Student student = pq.poll(); // O(log n)
//             System.out.println(student.name + " - " + student.rank);
//         }
//     }
// }                                                      




                                                       //insert in heap



 import java.util.ArrayList;

 public class heaps {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {

            arr.add(data);// add the new element at the last index of the array list
            int x = arr.size() - 1; // x is child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) { // O(log n)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // x = par;
                // par = (x - 1) / 2;
            }
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);

         /* 
              2
            /  \
           3    4
          / \   / 
          5 10 1


         */


        System.out.println(h.arr); // Output: [1,3,2,5,10,4] (the heap property is maintained)
    }
 }
 
 