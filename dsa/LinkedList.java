
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

    //add first operation  - O(1)

    public void addFirst(int data) {

        //step 1 -  create new nodes

        //classname objectname = new classname (constructor me data pass kardiya)
        Node newNode = new Node(data);

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
       
        ll.addLast(3);
        
        ll.addLast(4);
        ll.add(2,9); //at index 2 add 9 value

        ll.print();
        
    }
}
