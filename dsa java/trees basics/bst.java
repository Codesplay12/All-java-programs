import java.util.*;
public class bst {
    
    public class Node{
        private int data;
        private Node left;
        private Node right;
        private int height;

        public Node(int value)
        {
         this.value = value;
        }

        public int getvalue()
        {
            return value;
        }
    }
    private Node root;

    public bST(){

    }

    public int height(Node node)
    {
        if(Node  == null)
        {
            return -1;
        }
        return node.height;
    }
    public boolean isempty()
    {
        return root == null;
    }

    public void insert(int value)
    {

    }

    private Node insert(int value,Node node)
    {

        if(node == null)
        {
            node = new Node(value);
            retrurn node;
        }
        if(value< node.value)
        {
            node.left = insert(value,node.left);
        }

        if(value>node.value)
        {
            node.right = insert(value,node.right);
        }
        return node; 
    }
 public void display(Node node,String details)
 {
    if(node == null)
    return;
 }
   System.out.println(details + node.getvalue());
 display(node.left, "left child of " + node.getvalue()+" :");
 display(node.right, "right child of " + node.getvalue()+" :");


}
