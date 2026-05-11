
                                                              //Queue using array
                                            


// public class QueueB {
//     static int arr[];
//     static int size;
//     static int rear;

//     public QueueB(int n) {
//         arr = new int[n];
//         size = n;
//         rear = -1;
//     }

//     public boolean isEmpty() {
//         return rear == -1;
//     }

//     public boolean isFull() {
//         return rear == size - 1;
//     }

//     public void add(int data) {
//         if (isFull()) {
//             System.out.println("Queue is full");
//             return;
//         }
//         rear = rear + 1;
//         arr[rear] = data;
//     }

//     // O(n) remove method by shifting elements
//     public int remove() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         int front = arr[0];
//         // Shift elements to the left by one
//         for (int i = 0; i < rear; i++) {
//             arr[i] = arr[i + 1];
//         }
//         rear = rear - 1;
//         return front;
//     }

//     public void printQueue() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return;
//         }
//         for (int i = 0; i <= rear; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         QueueB q = new QueueB (5);
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);

//         System.out.print("Queue after adding elements: ");
//         q.printQueue();

//         System.out.println("Removed element: " + q.remove()); // 10
//         System.out.print("Queue after remove: ");
//         q.printQueue();

//         System.out.println("Removed element: " + q.remove()); // 20
//         System.out.print("Queue after remove: ");
//         q.printQueue();

//         q.add(60);
//         System.out.print("Queue after adding 60: ");
//         q.printQueue();
//     }
// }

// Output:

// Queue after adding elements: 10 20 30 40 50 
// Removed element: 10
// Queue after remove: 20 30 40 50 
// Removed element: 20
// Queue after remove: 30 40 50 
// Queue after adding 60: 30 40 50 60 



// Dry run of add() method with initial empty queue and size 5



// Queue size = 5
// Initial state:
// arr = [_, _, _, _, _]
// rear = -1 (empty queue)

// Adding elements step-by-step:
// Add 10:
// Check if rear == size - 1 → -1 == 4? No, proceed.
// Increment rear: rear = -1 + 1 = 0
// Insert: arr[0] = 10
// Array state: [10, _, _, _, _]

// Add 20:
// rear == size - 1 → 0 == 4? No.
// rear = 0 + 1 = 1
// arr[1] = 20
// Array: [10, 20, _, _, _]

// Add 30:
// rear == 4? No (rear = 1)
// rear = 2
// arr[2] = 30
// Array: [10, 20, 30, _, _]

// Add 40:
// rear = 3
// arr[3] = 40
// Array: [10, 20, 30, 40, _]

// Add 50:
// rear = 4
// arr[4] = 50
// Array: [10, 20, 30, 40, 50]

// Add 60:
// Check rear == size - 1 → 4 == 4 → Yes → Print Queue is full, reject insertion.




//dry run of remove() method with initial queue [10, 20, 30, 40, 50] and rear = 4

// Initial state:

// arr = [10, 20, 30, 40, 50]
// rear = 4 (index of last element)
// Queue elements = arr[0] to arr[rear]

// remove() call step-by-step:

// Check if empty: rear == -1?
// No, rear = 4, queue not empty.

// Store front element:
// front = arr[0] = 10

// Shift elements left by one:
// Loop from i = 0 to rear - 1 = 3

// i=0: arr[0] = arr[1] = 20 → arr = [20, 20, 30, 40, 50]
// i=1: arr[1] = arr[2] = 30 → arr = [20, 30, 30, 40, 50]
// i=2: arr[2] = arr[3] = 40 → arr = [20, 30, 40, 40, 50]
// i=3: arr[3] = arr[4] = 50 → arr = [20, 30, 40, 50, 50]

// Decrement rear:
// rear = 4 - 1 = 3

// Return front element:
// Returns 10

// State after remove:
// arr = [20, 30, 40, 50, 50] (last element is duplicate but ignored since rear = 3)
// rear = 3
// Queue elements now from arr[0] to arr[3] → [20, 30, 40, 50]

// Summary:

// remove() returns the front element 10.
// All elements shifted left by one to maintain queue order.
// Rear index updated to new last element.





                                                     //or



//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }

//         public static boolean isEmpty() {
//             return rear == -1;
//         }

//         //add function - O(1) time complexity

//         public static void add(int data) {
//             if (rear == size - 1) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear = rear + 1;
//             arr[rear] = data;
//         }

//         //remove function - O(n) time complexity

//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front = arr[0];
//            //Shift elements to the left by one
//             for (int i = 0; i < rear; i++) { 
//                 arr[i] = arr[i + 1];
//             }
//             rear = rear - 1;
//             return front;
//         }

//         //peek function - O(1) time complexity

//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
        

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


                                             //circular queue using array

//     static class Queue {
//     static int arr[];
//     static int size;
//     static int rear;
//     static int front;
    
//     Queue(int n) {
//         arr = new int[n];
//         size = n;
//         rear = -1;
//         front = -1;
//     }

//     public static boolean isEmpty() {
//         return rear == -1 && front == -1;
//     }

//     public static boolean isFull() {
//         return (rear + 1) % size == front;// when we increase rare by 1 and front is at the same position then queue is full ,,example - size = 5, rear = 4, front = 0, (rear + 1) % size = 0 == front
//     }

//     //add function - O(1) time complexity

//     public static void add(int data) {
//         if (isFull()) {
//             System.out.println("Queue is full");
//             return;
//         }
//         if (front == -1) {// when we add first element then front and rear both will point to the first element
//             front = 0;
//         }
//         rear = (rear + 1) % size;
//         arr[rear] = data;
//     }


//     //remove function - O(1) time complexity

//     public static int remove() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         int frontElement = arr[front];
//         if (front == rear) {// when we remove the last element then front and rear both will point to -1
//             front = -1;
//             rear = -1;
//         } else {
//             front = (front + 1) % size;
//         }
//         return frontElement;
//     }

//     //peek function - O(1) time complexity

//     public static int peek() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         return arr[front];
//     }
// }


// public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         System.out.println(q.remove());
//         q.add(7);
//         System.out.println(q.remove());
//         q.add(8);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }  
// }



                                                          //**Queue using linked list

// static class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// static class Queue {
//     static Node head = null;
//     static Node tail = null;

//     public static boolean isEmpty() {
//         return head == null && tail == null;
//     }

//     //add - O(1) time complexity
//     public static void add(int data) {
//         Node newNode = new Node(data);
//         if (isEmpty()) {
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }
     
//     //remove - O(1) time complexity
//     public static int remove() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         int frontData = head.data;
//         if (head == tail) { // only one element in the queue
//             head = tail = null;
//         } else {
//             head = head.next;
//         }
//         return frontData;
//     }

//     public static int peek() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         return head.data;
//     }
// }

// public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }  
// }


                                                  //Queue using JCF(Java Collections Framework)


// import java.util.*;
// public class QueueB {
//          public static void main(String args[]) {
//         Queue<Integer> q = new java.util.LinkedList<>();//
//         // Queue<Integer> q = new ArrayDeque<>(); // for better performance than LinkedList
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }  
// } 


                                                        //Queue using two stacks
                                                        
 
// import java.util.*;
// public class QueueB {
//  static class Queue {
//     static Stack<Integer> s1 = new Stack<>();
//     static Stack<Integer> s2 = new Stack<>();

//     public static boolean isEmpty() {
//         return s1.isEmpty() ;
//     }

//      //add - O(n) time complexity
//     public static void add(int data) {
//         while(!s1.isEmpty()) {
//             s2.push(s1.pop());
//         }
//         s1.push(data);

//         while(!s2.isEmpty()) {
//             s1.push(s2.pop());
//         }
//     }

//         //remove - O(1) time complexity
//     public static int remove() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
        
//         return s1.pop();
//     }

//     //peek - O(1) time complexity
//     public static int peek() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         return s1.peek();
//     }
// }

// public static void main(String[] args) {
//     Queue q = new Queue();
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);

//     while (!q.isEmpty()) {
//         System.out.println(q.peek());
//         q.remove();
//     }
// }
// }



                                                //stack using two queues


//   import java.util.*;
//   import java.util.LinkedList;
//   public class QueueB {
//     static class Stack {
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty() {
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         //push - O(1) time complexity
//         public static void push(int data) {
//            if (!q1.isEmpty()) {
//                 q1.add(data);
//             } else {
//                q2.add(data);
//             }
//         }

//         //pop - O(1) time complexity
//         public static int pop() {
//             if (isEmpty()) {
//                 System.out.println("Stack is empty");
//                 return -1;
//             }
//            int top = -1;
           
//            //case 1: when q1 is not empty
//            if (!q1.isEmpty()) {
//                while (!q1.isEmpty()) {
//                    top = q1.remove();
//                    if (q1.isEmpty()) {
//                        break;
//                    }
//                    q2.add(top);
//                }
//            } else { // case 2: when q2 is not empty
//                while (!q2.isEmpty()) {
//                    top = q2.remove();
//                    if (q2.isEmpty()) {
//                           break;
//                    }
//                    q1.add(top);
//                }
//            }
//               return top;
//         }

//         //peek - O(1) time complexity
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Stack is empty");
//                 return -1;
//             }
//            int top = -1;
           
//            //case 1: when q1 is not empty
//            if (!q1.isEmpty()) {
//                while (!q1.isEmpty()) {
//                    top = q1.remove();
//                      q2.add(top);
//                }
//            } else { // case 2: when q2 is not empty
//                while (!q2.isEmpty()) {
//                    top = q2.remove();
//                    q1.add(top);
//                }
//            }
//               return top;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
//         //output should be 5 4 3 2 1

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }                                              



    //Question- first non-repeating character in a stream of characters
    
    
    // import java.util.*;
    // import java.util.LinkedList;
    // public class QueueB {
    //     public static void printNonRepeating(String str) {
    //         int freq[] = new int[26]; // assuming only lowercase letters 'a' to 'z'
    //         Queue<Character> q = new LinkedList<>();

    //         for (int i = 0; i < str.length(); i++) {
    //             char ch = str.charAt(i);
    //             q.add(ch);
    //             freq[ch - 'a']++;// increment frequency of the character here ch-a means that we are converting the character to its corresponding index in the frequency array, where 'a' corresponds to index 0, 'b' to index 1, and so on. This allows us to easily update the frequency count for each character as we process the stream.

    //             while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
    //                 q.remove();
    //             }

    //             if (q.isEmpty()) {
    //                 System.out.print(-1 + " ");
    //             } else {
    //                 System.out.print(q.peek() + " ");
    //             }
    //         }
    //         System.out.println();
    //     }
       
    //     public static void main(String[] args) {
    //         String str = "aabccxb";
    //         printNonRepeating(str); // Output: a -1 b b b b x
    //     }
    // }



    //Question - interleave 2 halves of a queue with even length

    // import java.util.*;
    // import java.util.LinkedList;
    // public class QueueB {
    //     public static void interleaveQueue(Queue<Integer> q) {
    //       Queue<Integer> firstHalf = new LinkedList<>();
    //         int size = q.size();
            

    //         // Step 1: Dequeue the first half of the elements and enqueue them into the firstHalf queue
    //         for (int i = 0; i < size / 2; i++) {
    //             firstHalf.add(q.remove());
    //         }

    //         // Step 2: Interleave the elements from firstHalf and the remaining elements in q
    //         while (!firstHalf.isEmpty()) {
    //             q.add(firstHalf.remove()); // Add element from firstHalf
    //                 q.add(q.remove()); // Add element from second half (remaining in q)
                
    //         } 
    //     }

    //     public static void main(String[] args) {
    //         Queue<Integer> q = new LinkedList<>();
    //         q.add(1);
    //         q.add(2);
    //         q.add(3);
    //         q.add(4);
    //         q.add(5);
    //         q.add(6);

    //         System.out.println("Original Queue: " + q); // Output: [1, 2, 3, 4, 5, 6]
    //         interleaveQueue(q);
    //         System.out.println("Interleaved Queue: " + q); // Output: [1, 4, 2, 5, 3, 6]

    //         //or
    //         //interleave(q);
    //         //while (!q.isEmpty()) {
    //         //    System.out.print(q.remove() + " ");
    //         //}
    //        // System.out.println();
    //     }
    // }



                                                             //reverse queue using stack


// import java.util.*;
// import java.util.LinkedList;
// public class QueueB {   

//     public static void reverseQueue(Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>();

//         // Step 1: Dequeue all elements from the queue and push them onto the stack
//         while (!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         // Step 2: Pop all elements from the stack and enqueue them back into the queue
//         while (!s.isEmpty()) {
//             q.add(s.pop());
//         }
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         System.out.println("Original Queue: " + q); // Output: [1, 2, 3, 4, 5]
//         reverseQueue(q);
//         System.out.println("Reversed Queue: " + q); // Output: [5, 4, 3, 2, 1]
//     }
// }



                                                            //deque(double ended queue) 

           
                                                            
    //    import java.util.*;
    //    import java.util.LinkedList;
    //    public class QueueB {
    //        public static void main(String[] args) {
    //            Deque<Integer> dq = new LinkedList<>();
    //            dq.addFirst(1); // 1 
    //             dq.addFirst(2); // 2 1
    //             System.out.println(dq); //  [2, 1]


    //            dq.addLast(3);  //2 1 3
    //            dq.addLast(4);  // 2 1 3 4

    //            dq.removeFirst(); //  1 3 4
    //             dq.removeLast(); // 1 3
    //            System.out.println(dq); // 1 3

    //            System.out.println(dq.getFirst()); // 1
    //             System.out.println(dq.getLast()); // 3
         
    //        }
    //    }                                                     




                                                         //implementing stack using deque

//  import java.util.*;
//  import java.util.LinkedList;

//  public class QueueB {
//      static class Stack {
//          Deque<Integer> dq = new LinkedList<>();

//          public void push(int data) {
//              dq.addLast(data);
//          }

//          public int pop() {
//              return dq.removeLast();
//          }

//          public int peek() {
//              return dq.getLast();
//          }

//      }

//      public static void main(String[] args) {
//          Stack s = new Stack();//this stack is not of jcf , this stack is our above stack class 
//          s.push(1);
//          s.push(2);
//          s.push(3);
//          s.push(4);
//          s.push(5);

//         System.out.println(s.peek()); // 
//          System.out.println(s.pop()); // 5
//          System.out.println(s.pop()); // 4
//          System.out.println(s.peek()); // 3
//      }
//  }
 
 


                                                //implementing queue using deque


 import java.util.*;
 import java.util.LinkedList;
 
    public class QueueB {
        static class Queue {
            Deque<Integer> dq = new LinkedList<>();
    
            public void add(int data) {
                dq.addLast(data);
            }
    
            public int remove() {
                return dq.removeFirst();
            }
    
            public int peek() {
                return dq.getFirst();
            }
        }
    
        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
    
            System.out.println(q.peek()); // 1
            System.out.println(q.remove()); // 1
            System.out.println(q.remove()); // 2
            System.out.println(q.peek()); // 3
        }
    }