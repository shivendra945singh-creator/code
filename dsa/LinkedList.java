

public class LinkedList {
    public static class Node {
        //blueprint
        int data;
        Node next;

      //constructor
        public  Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;//by defeault java initilize this value as 0

    //add first operation  - O(1)

    public void addFirst(int data) {

        //step 1 -  create new nodes

        //classname objectname = new classname (constructor me data pass kardiya)
        Node newNode = new Node(data);
        size++;

        //when linkedlist is empty
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head

        newNode.next = head; //link

        //step3 - head = newNode

        head = newNode;

    }

    //add last operation - O(1)

        public void addLast (int data) {
            Node newNode = new Node(data);
             size++;
            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // add in mid of linkedlist - O(n)


        public void add(int idx, int data) {
            if(idx == 0) {
                addFirst(data);
                return;
            }
            
            Node  newNode = new Node(data);
             size++;
            Node temp = head;
            int i = 0;

            while( i< idx-1) {
                temp = temp.next;
                i++;
            }

            //when i= idx-1; then temp = previous
            newNode.next = temp.next;
            temp.next = newNode;
        }

        //remove first in  linkedlist

        public int removeFirst() {
            //case 1
            if(size == 0) {
                System.out.println("ll is empty");
                //case 2
            }else if (size == 1 ) {
                 int value = head.data;
                 head = tail = null;
                 size = 0;
                 return value;
                }
                //case 3
            int value = head.data;
            head = head.next;
            size --;
            return value;

        }



         //remove last in linkedlist

        public int removeLast() {
            //case 1
            if(size == 0) {
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
                //case 2
            }else if (size == 1 ) {
                 int value = head.data;
                 head = tail = null;
                 size = 0;
                 return value;
                }
                //case 3
                //previous : i = size -2
           Node previous = head;
           for(int i = 0; i< size-2; i++) {
            previous = previous.next;
           }

           int value = previous.next.data;//tail data
           previous.next = null;
           tail = previous;
           size--;
           return value;
        }
    
        //print a linkedlist

     public  void print() {

        //base case

        if(head == null) {
            System.err.println("ll is empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.err.print( temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
     } 


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       
        ll.addFirst(2);
        
        ll.addFirst(1);
       
        ll.addLast(4);
        
        ll.addLast(5);
        ll.add(2,3); //at index 2 add 9 value

        ll.print();
        //  System.out.println(ll.size);

         ll.removeFirst();
         ll.print();

         ll.removeLast();
         ll.print();
         System.out.println(ll.size);
    }
}
