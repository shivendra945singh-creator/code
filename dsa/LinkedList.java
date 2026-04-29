import org.w3c.dom.Node;

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


        //iterative search - O(n)


    public int itrSearch (int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if( temp.data == key) {//key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;//when key is not found
    }


    //recursive search - O(n)

    public int helper(Node head, int key) {
        if(head== null) {
            return -1;

        }

        if(head.data==key) {
            return 0;

        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key) {
    return helper(head, key);
    }


    //reverse a linkedlist

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while ( curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    //***find and remove nth node from end 

    public void deleteNthkfromEnd (int n ) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while ( temp!= null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz) {
            head = head.next; // remove first
        }

        //sz-n
        int i = 1;
        int itofind = sz-n;
        Node prev = head;
        while(i < itofind) {
            prev = prev.next;
            i++;
        }
    

    prev.next = prev.next.next;
    return;
}





//check if a linkedlist is a palindrome 

//slow - fast appraoch

public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while ( fast != null && fast.next!= null) {
        slow = slow.next; //+1
        fast = fast.next.next;//+2
    }
    return slow; //slow is my midnode
}

public boolean checkPalindrome() {
    if( head == null || head.next== null) {
        return true;
    }
    //step 1 - find mid
    Node  midNode = findMid(head);

    //step 2 - reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr != null ){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node right = prev; //right half head
    Node left = head;

    //step 3 - check left half & right half
    while(right != null) {
        if(left.data != right.data) {
            return false;
        }
        left = left.next;
        right = right.next;
    }

    return true;
}


    
        //print a linkedlist - O(n)

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

        ll.print();//1->2->3->4->5
        //  System.out.println(ll.size);

        //  ll.removeFirst();
        //  ll.print();

        //  ll.removeLast();
        //  ll.print();

        //  System.out.println(ll.size);

        //  System.out.println(ll.itrSearch(3)); //3 is a number not index
        //   System.out.println(ll.itrSearch(10));

        //   System.out.println(ll.recSearch(3));//3 is a number not index
        //   System.out.println(ll.recSearch(10));

        // ll.reverse();
        // ll.print();

        // ll.deleteNthkfromEnd(1);//1st node from last
        // ll.print();


          ll.addFirst(1);
        
        ll.addFirst(2);
       
        ll.addLast(2);

        ll.print();//1->2->2
         System.out.println(ll.checkPalindrome());


    }
}
