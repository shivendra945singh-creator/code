

                                           //lowest common ancestor in a binary tree

import org.w3c.dom.Node;

public class binarytree {
    public static Node lca2(Node root, int n1, int n2){
       
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);
       
        if(rightlca == null){//if rightlca is null then leftlca is lca
            return leftlca;
        }
        if(leftlca == null){//if leftlca is null then rightlca is lca
            return rightlca;
        }
        return root;
    }

    public static void main(String[] args) {
        /*      
                1
              /   \
             2     3
            / \   / \
           4   5 6   7
        
        
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;
      System.out.println("LCA of " + n1 + " and " + n2 + " is " + lca2(root, n1, n2).data);
    }
    
}
