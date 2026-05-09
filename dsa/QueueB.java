
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
                                                        
 
import java.util.*;
public class QueueB {
 static class Queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        return s1.isEmpty() ;
    }

     //add - O(n) time complexity
    public static void add(int data) {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

        //remove - O(1) time complexity
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        
        return s1.pop();
    }

    //peek - O(1) time complexity
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }
}

public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);

    while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
    }
}
}
