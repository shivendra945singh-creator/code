
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//         public static Node insert(Node root, int val) {
//             if (root == null) {
//                root = new Node(val);
//                 return root;
//             }
//             if (val < root.data) {
//                 //insert in left subtree
//                 root.left = insert(root.left, val);
//             } else if (val > root.data) {
//                 //insert in right subtree
//                 root.right = insert(root.right, val);
//             }
//             return root;
//         }

        // public static void inorder(Node root) {
        //     if (root == null) {
        //         return;
        //     }
        //     inorder(root.left);
        //     System.out.print(root.data + " ");
        //     inorder(root.right);
        // }

//         public static void main(String[] args) {
//             Node root = null;
//             int[] values = {5, 3, 7, 2, 4, 6, 8};

//             for(int i = 0; i < values.length; i++) {
//                 root = insert(root, values[i]);
//             }

//            inorder(root); 
//            System.out.println();
//         }
// }



                                           //search in a BST


//    public class bst {//O(H) where H is the height of the tree
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//         public static Node insert(Node root, int val) {
//             if (root == null) {
//                root = new Node(val);
//                 return root;
//             }
//             if (val < root.data) {
//                 //insert in left subtree
//                 root.left = insert(root.left, val);
//             } else if (val > root.data) {
//                 //insert in right subtree
//                 root.right = insert(root.right, val);
//             }
//             return root;
//         }

//         public static boolean search(Node root, int key) {
//             if (root == null) {
//                 return false;
//             }
//             if (root.data == key) {
//                 return true;
//             }
//             if (key < root.data) {
//                 return search(root.left, key);
//             } else {
//                 return search(root.right, key);
//             }
//         }

//         public static void main(String[] args) {
//             Node root = null;
//             int[] values = {5, 3, 7, 2, 4, 6, 8};

//             for(int i = 0; i < values.length; i++) {
//                 root = insert(root, values[i]);
//             }

//            System.out.println(search(root, 4)); // true
//            System.out.println(search(root, 10)); // false
//            //or
//            if(search(root, 4)) {
//                System.out.println("Found");
//            } else {
//                System.out.println("Not Found");
//            }
//         }  
// }   



                                             //delete a node in BST



// public class bst {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//         public static Node insert(Node root, int val) {
//             if (root == null) {
//                root = new Node(val);
//                 return root;
//             }
//             if (val < root.data) {
//                 //insert in left subtree
//                 root.left = insert(root.left, val);
//             } else if (val > root.data) {
//                 //insert in right subtree
//                 root.right = insert(root.right, val);
//             }
//             return root;
//         }

//         public static void inorder(Node root) {
//             if (root == null) {
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data + " ");
//             inorder(root.right);
//         }

//         public static Node delete(Node root, int key) {
//             if (root == null) {
//                 return null;
//             }
//             if (key < root.data) {
//                 root.left = delete(root.left, key);
//             } else if (key > root.data) {
//                 root.right = delete(root.right, key);
//             } else {
//                 //case 1 : no child
//                 if (root.left == null && root.right == null) {
//                     return null;
//                 }

//                 //case 2 : single child
//                 if (root.left == null) {
//                     return root.right;
//                 } else if (root.right == null) {
//                     return root.left;
//                 }
//                 //case 3 : two children
//                 Node IS = findInorderSuccessor(root.right);
//                 root.data = IS.data;
//                 root.right = delete(root.right, IS.data);
//             }
//             return root;
//         }

//         public static Node findInorderSuccessor(Node root) {//leftmost node in right subtree
//             while (root.left != null) {
//                 root  = root.left;
//             }
//             return root;
//         }

    

//         public static void main(String[] args) {
//             Node root = null;
//             int[] values = {8,5,3,1,4,6,10,11,14};

//             for(int i = 0; i < values.length; i++) {
//                 root = insert(root, values[i]);
//             }

//              inorder(root); //before deletion
//            System.out.println();

//            root = delete(root, 3); //deletes node with value 3
//             System.out.println();
          
//              inorder(root); //after deletion
          
//         }  
// }                                             




                                                //print in range


// public class bst {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//         public static Node insert(Node root, int val) {
//             if (root == null) {
//                root = new Node(val);
//                 return root;
//             }
//             if (val < root.data) {
//                 //insert in left subtree
//                 root.left = insert(root.left, val);
//             } else if (val > root.data) {
//                 //insert in right subtree
//                 root.right = insert(root.right, val);
//             }
//             return root;
//         }

//          public static void inorder(Node root) {
//             if (root == null) {
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data + " ");
//             inorder(root.right);
//         }



//         public static void printInRange(Node root, int k1, int k2) {
//             if (root == null) {
//                 return;
//             }
//             if (root.data >= k1 && root.data <= k2) {
//                 printInRange(root.left, k1, k2);
//                 System.out.print(root.data + " ");
//                 printInRange(root.right, k1, k2);
//             }
//             else if (root.data < k1) {
//                 printInRange(root.left, k1, k2);
//             }
//             else {
//                 printInRange(root.right, k1, k2);
//             }
//         }

//         public static void main(String[] args) {
//             Node root = null;
//             int[] values = {8,5,3,1,4,6,10,11,14};

//             for(int i = 0; i < values.length; i++) {
//                 root = insert(root, values[i]);
//             }


//             inorder(root); //prints all values in sorted order
//              System.out.println();

//              printInRange(root, 5, 12); // prints values between 5 and 12
//              System.out.println();
//         } 
// }                                              


                           
                                           //root to leaf path



// public class bst {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//         public static Node insert(Node root, int val) {
//             if (root == null) {
//                root = new Node(val);
//                 return root;
//             }
//             if (val < root.data) {
//                 //insert in left subtree
//                 root.left = insert(root.left, val);
//             } else if (val > root.data) {
//                 //insert in right subtree
//                 root.right = insert(root.right, val);
//             }
//             return root;
//         }

//          public static void printRootToLeaf(Node root, String path) {
//              if (root == null) {
//                  return;
//              }
//              path += root.data + " ";
//              if (root.left == null && root.right == null) {
//                  System.out.println(path);
//              }
//              printRootToLeaf(root.left, path);
//              printRootToLeaf(root.right, path);
//          }

//         public static void main(String[] args) {
//             Node root = null;
//             int[] values = {8,5,3,6,10,11,14};

//             for(int i = 0; i < values.length; i++) {
//                 root = insert(root, values[i]);
//             }

//               printRootToLeaf(root, ""); // prints all root to leaf paths
//               System.out.println();
//         }
//     }                                          




                                                       //or


//  public class bst {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//         public static Node insert(Node root, int val) {
//             if (root == null) {
//                root = new Node(val);
//                 return root;
//             }
//             if (val < root.data) {
//                 //insert in left subtree
//                 root.left = insert(root.left, val);
//             } else if (val > root.data) {
//                 //insert in right subtree
//                 root.right = insert(root.right, val);
//             }
//             return root;
//         }

//         public static void printpath (ArrayList <Integer> path) {//
//             for (int i = 0; i < path.size(); i++) {
//                 System.out.print(path.get(i) + " ->");
//             }
//             System.out.println("NULL");
//         }



// public static void printRootToLeaf(Node root, ArrayList<Integer> path) {//
//     if (root == null) {
//     return;
//     }


//     path.add(root.data);
//     if (root.left == null && root.right == null) {
//     printpath(path);
//     }

//     printRootToLeaf(root.left, path);
//     printRootToLeaf(root.right, path);
//     path.remove(path.size() - 1); //backtracking
//     }

//         public static void main(String[] args) {
//             Node root = null;
//             int[] values = {8,5,3,1,4,6,10,11,14};

//             for(int i = 0; i < values.length; i++) {
//                 root = insert(root, values[i]);
//             }

//               printRootToLeaf(root, new ArrayList<>()); // prints all root to leaf paths
          
//         }
// }




                                                    //valid BST


 
//  public class bst {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//         public static Node insert(Node root, int val) {
//             if (root == null) {
//                root = new Node(val);
//                 return root;
//             }
//             if (val < root.data) {
//                 //insert in left subtree
//                 root.left = insert(root.left, val);
//             } else if (val > root.data) {
//                 //insert in right subtree
//                 root.right = insert(root.right, val);
//             }
//             return root;
//         }

//         public static boolean isValidBST(Node root, Node min, Node max) {
//             if (root == null) {
//                 return true;
//             }
//             if (min != null && root.data <= min.data) {
//                 return false;
//             }
//             if (max != null && root.data >= max.data) {
//                 return false;
//             }
//             return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
//         }

//         public static void main(String[] args) {
//             Node root = null;
//             int[] values = {8,5,3,1,4,6,10,11,14};

//             /*

//             The tree structure will be as follows:
//                     8
//                    / \
//                   5   10
//                  / \    \
//                 3   6    11
//                / \         \
//               1   4         14
            
            
//             */

//             for(int i = 0; i < values.length; i++) {
//                 root = insert(root, values[i]);
//             }

//               System.out.println(isValidBST(root, null, null)); // true
//               System.out.println(isValidBST(root.left.right, null, null)); // true//node with value 4
//               System.out.println(isValidBST(root.left.right.right, null, null));
//               //or
//                 if (isValidBST(root, null, null)) {
//                     System.out.println("The tree is a valid BST");
//                 } else {
//                     System.out.println("The tree is not a valid BST");
//                 } 
//          }
//  }                                                   




                                                //mirror of a BST

// public class bst {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }


//         public static Node createMirror(Node root) { //O(N)
//             if (root == null) {
//                 return null;
//             }
//             Node leftMirror = createMirror(root.left);
//             Node rightMirror = createMirror(root.right);

//             root.left = rightMirror;
//             root.right = leftMirror;
//             return root;
//         }

//         public static void preorder(Node root) {
//             if (root == null) {
//                 return;
//             }
//             System.out.print(root.data + " ");
//             preorder(root.left);
//             preorder(root.right);
//          }

//         public static void main(String[] args) {
//            Node root = new Node(8);
//            root.left = new Node(5);
//            root.right = new Node(10);
//            root.left.left = new Node(3);
//            root.left.right = new Node(6);
//            root.right.right = new Node(11);

//            /*
//               The tree structure will be as follows:
//                      8
//                     / \
//                   5   10
//                  / \    \
//                 3   6    11

//                 mirror of the above tree will be:
//                      8
//                     / \
//                   10   5
//                  /    / \
//                 11   6   3
           
           
           
//            */

//                 System.out.println("Preorder traversal before mirroring:");
//                 preorder(root);
//                 System.out.println();
              
//                 System.out.println("Preorder traversal after mirroring:");
//                 root = createMirror(root);
//                 preorder(root);
//                 System.out.println();
//          }
// }                                          




                                              //sorted array to balanced BST



// public class bst {//O(N) where N is the number of elements in the array
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//         public static Node sortedArrayToBST(int[] arr, int start, int end) {
//             if (start > end) {
//                 return null;
//             }
//             int mid = start + (end - start) / 2;//or int mid = (start + end) / 2;
//             Node node = new Node(arr[mid]);
//             node.left = sortedArrayToBST(arr, start, mid - 1);
//             node.right = sortedArrayToBST(arr, mid + 1, end);
//             return node;
//         }

//         public static void preorder(Node root) {
//             if (root == null) {
//                 return;
//             }
//             System.out.print(root.data + " ");
//             preorder(root.left);
//             preorder(root.right);
//         }

       

//         public static void main(String[] args) {
//              int[] sortedArr = {1, 2, 3, 4, 5, 6, 7};

//              /*
//                 The balanced BST created from the sorted array will be:
//                  4
//                 / \
//                2   6
//               / \ / \
//              1  3 5  7
              
//              */

//              Node root = sortedArrayToBST(sortedArr, 0, sortedArr.length - 1);

//              System.out.println("Preorder traversal of the balanced BST:");
//              preorder(root); // should print the sorted array
//              System.out.println();
//           }
// }     




                                                         //convert bst to balanced bst



// import java.util.ArrayList;//O(N)

// public class bst {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//     public static void getInorder(Node root, ArrayList<Integer> inorder) {
//         if (root == null) {
//             return;
//         }
//         getInorder(root.left, inorder);
//         inorder.add(root.data);
//         getInorder(root.right, inorder);
//     }

//     public static Node sortedArrayToBST(ArrayList<Integer> inorder, int start, int end) {
//         if (start > end) {
//             return null;
//         }
//         int mid = start + (end - start) / 2;//or int mid = (start + end) / 2;
//         Node node = new Node(inorder.get(mid));
//         node.left = sortedArrayToBST(inorder, start, mid - 1);
//         node.right = sortedArrayToBST(inorder, mid + 1, end);
//         return node;
//     }

//     public static Node convertToBalancedBST(Node root) {
//         // Step 1: Store the elements of the BST in a sorted list using inorder traversal

//         ArrayList<Integer> inorder = new ArrayList<>();
//         getInorder(root, inorder);

//         // Step 2: Construct a balanced BST from the sorted list

//         return sortedArrayToBST(inorder, 0, inorder.size() - 1);
//         //or
//        // root = sortedArrayToBST(inorder, 0, inorder.size() - 1);
//        //return root;
//     }

//     public static void preorder(Node root) {
//         if (root == null) {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void main(String[] args) {
//          Node root = new Node(8);
//          root.left = new Node(6);
//          root.left.left = new Node(5);
//          root.left.left.left = new Node(3);

//          root.right = new Node(10);
//          root.right.right = new Node(11);
//          root.right.right.right = new Node(12);

//          /*
//             The unbalanced BST is:
//                  8
//                 / \
//                6   10
//               /     \
//              5     11
//             /        \
//            3         12

//              The balanced BST will be:
//                  8
//                 / \
//                5    11
//               / \   / \
//               3  6  10 12
//          */

//          System.out.println("Preorder traversal of the original BST:");
//          preorder(root);
//          System.out.println();

//          root = convertToBalancedBST(root);

//          System.out.println("Preorder traversal of the balanced BST:");
//          preorder(root); // should print the values in a balanced order
//          System.out.println();
//       }
// }                        





                                        //size of largest BST in a binary tree


public class bst {

      static class Node {
         int data;
         Node left, right;
   
         public  Node(int data) {
               this.data = data;
               this.left = null;
               this.right = null;
            
         }
      }


    static class Info {
        int size;
        int min;
        int max;
        boolean isBST;

         public Info(boolean isBST, int size, int min, int max) {
           this.isBST = isBST;
           this.min = min;
           this.max = max;
           this.size = size;

        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {

      if(root == null) {
         return new Info(isBST: true, size: 0,  Integer.MAX_VALUE,  Integer.MIN_VALUE);
      }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
         int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

         if(root.data<= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(isBST : false, size , min, max);
         }

         if(leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST , size);
            new Info(isBST : true, size , min, max);
         }

         return new Info(isBST : false, size , min, max);
        
    }


    public static void main(String[] args) {
         Node root = new Node(50);
         root.left = new Node(30);
         root.right = new Node(60);
         root.left.left = new Node(5);
         root.left.right = new Node(20);
         root.right.left = new Node(45);
         root.right.right = new Node(70);
         root.right.right.left = new Node(65);
         root.right.right.right = new Node(80);


       Info  info = largestBST(root);
         System.out.println("Size of the largest BST in the binary tree: " + maxBST); // should print 5
      }
}







                                        //or




// public class bst {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
           
//         }
//     }

//     static class Info {
//         int size; //size of the subtree
//         int min; //min value in the subtree
//         int max; //max value in the subtree
//         int ans; //size of largest BST in the subtree
//         boolean isBST; //whether the subtree is a BST or not

//         Info() {
//             size = 0;
//             min = Integer.MAX_VALUE;
//             max = Integer.MIN_VALUE;
//             ans = 0;
//             isBST = true;
//         }
//     }

//     public static Info largestBST(Node root) {
//         if (root == null) {
//             return new Info();
//         }
//         Info leftInfo = largestBST(root.left);
//         Info rightInfo = largestBST(root.right);

//         Info currInfo = new Info();
//         currInfo.size = leftInfo.size + rightInfo.size + 1;
//         currInfo.min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
//         currInfo.max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

//         if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min) {
//             currInfo.ans = currInfo.size;
//             currInfo.isBST = true;
//         } else {
//             currInfo.ans = Math.max(leftInfo.ans, rightInfo.ans);
//             currInfo.isBST = false;
//         }
//         return currInfo;
//     }

//     public static void main(String[] args) {
//          Node root = new Node(50);
//          root.left = new Node(30);
//          root.right = new Node(60);
//          root.left.left = new Node(5);
//          root.left.right = new Node(20);
//          root.right.left = new Node(45);
//          root.right.right = new Node(70);
//          root.right.right.left = new Node(65);
//          root.right.right.right = new Node(80);

//          /*
//              The binary tree is:
//                   5
//                  / \
//                 30   60
//                / \   / \
//               5  20 45 70
//                      / \
//                     65 80

//               The largest BST in this tree is:
//                   60
//                  / \
//                 45 70
//                    / \
//                   65 80

//               So the size of the largest BST is 5.
//           */

//           System.out.println("Size of the largest BST in the binary tree: " + largestBST(root).ans); // should print     
//     } 
// }

