
import java.util.*;
public class traversal {
    
    
    
    
   
    
    public class Node{
    
      int value;
      Node left;
      Node right;
    
      public Node(int value)
      {
       this.value = value; 
      }
    
      
    
      
    }
      Node root;
    
      public void insert(int value)
        {
            root = insertrec(root,value);
        }
    
      public Node insertrec(Node root,int value)
      {
        if(root == null)
        root = new Node(value);
          
        else if(value < root.value)
        {
          root.left = insertrec(root.left, value);
        }
    
        else if(value> root.value)
        {
          root.right = insertrec(root.right,value);
        }
    
        return root;
      }

      // these traversal techniques are type of depth first search traversal.
    
      public void inorder()
      {
        inorderrec(root);
      }
      public void inorderrec(Node root)
      {
        if(root == null)
          return;
        
        inorderrec(root.left);
        System.out.println(root.value);
        inorderrec(root.right);
      }
      
      public void preorder()
      {
          preorderrec(root);
      }
      
      public void preorderrec(Node root)
      {
          if(root == null)
          {
              return;
          }
          
          System.out.println(root.value);
          preorderrec(root.left);
          preorderrec(root.right);
      }
      
      public void postorder()
      {
          postorderrec(root);
      }
      
      public void postorderrec(Node root)
      {
          if(root == null)
          {
              return;
          }
          
          postorderrec(root.left);
          postorderrec(root.right);
          System.out.println(root.value);
      }
      public static void main(String[] args) {
        traversal Tree = new bst();
        Tree.insert(8);
        Tree.insert(7);
        Tree.insert(23);
    
        Tree.insert(15);
    
        Tree.insert(2);
        Tree.inorder();
        System.out.println();
        
        Tree.preorder();
            System.out.println();
            Tree.postorder();
    
    
        
      }
    
      
    
}


