import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

public class bfs
{
    public List<List<Integer>> levelOrder(TreeNode root) { // leetcode
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
    Queue< TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int levelsize = queue.size();
        List<Integer> currentlevel = new ArrayList<>(levelsize);
        for(int i =0;i<levelsize;i++)
        {
            TreeNode currentNode = queue.poll();
            currentlevel.add(currentNode.val);
            if(currentNode.left != null)
            {
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null)
            {
                queue.offer(currentNode.right);
            }
        }
        result.add(currentlevel);
    }
    return result;
    }




   // find next node  of a given node  // not leetcode

    public TreeNode findsuccesor(TreeNode root,int key)
    {
        if(root == null)
        {
            return null;
        }
    Queue< TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int levelsize = queue.size();
       
            TreeNode currentNode = queue.poll();
            if(currentNode.left != null)
            {
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null)
            {
                queue.offer(currentNode.right);
            }

            if(curentnode.val = key)
            {
                break;
            }
        
       return queue.peek();
    }
    }

    public List<List<Integer>> zigzagtraversal (TrreNode root){

        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
    Deque< TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    boolean reverse = false;
    while(!queue.isEmpty()){
        int levelsize = queue.size();
        List<Integer> currentlevel = new ArrayList<>(levelsize);
        for(int i =0;i<levelsize;i++)
        {
            if(!reverse){
                TreeNode currentNode = queue.pollFirst();
                currentlevel.add(currentNode.val);
                if(currentNode.left != null)
                {
                    queue.addLast(currentNode.left);
                }
                if(currentNode.right != null)
                {
                    queue.add.Last(currentNode.right);
                }
            }
            if(reverse){
                TreeNode currentNode = queue.pollLast();
                currentlevel.add(currentNode.val);
                if(currentNode.right != null)
                {
                    queue.addFirst(currentNode.right);
                }
                if(currentNode.left != null)
                {
                    queue.addFirst(currentNode.left);
                }
               
            }

            reverse = !reverse;
            result.add(currentlevel);
           
        }

        return result;
       
    }
    }




    public List<List<Integer>> levelOrder2(TreeNode root) { // leetcode
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return ;
        }
    Queue< TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int levelsize = queue.size();
        List<Integer> currentlevel = new ArrayList<>(levelsize);
        for(int i =0;i<levelsize;i++)
        {
            TreeNode currentNode = queue.poll();
            currentlevel.add(currentNode.val);
            if(currentNode.left != null)
            {
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null)
            {
                queue.offer(currentNode.right);
            }
        }
        result.add(0,currentlevel);
    }
    return result;
    }


    //Populating Next Right Pointers in Each Node  // leetcode

    public Node connect(Node root){
        if(root == null) return null;
        Node leftmost = root;
        while(leftmost.left != null)
        {
            Node current = leftmost;
            while(current != null)
            {
                current.left.next = current.right; 
                if(current.next != null)
                {
                    current.left.next = current.next.left;
                }
                current = current.next;
            }
            leftmost = leftmost.left;

        }
        return root;
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
        {
            return ;
        }
    Queue< TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int levelsize = queue.size();
        List<Integer> currentlevel = new ArrayList<>(levelsize);
        for(int i =0;i<levelsize;i++)
        {
            TreeNode currentNode = queue.poll();
            if(i==levelsize-1)
            {
                result.add(currentnode.val);
            }
            currentlevel.add(currentNode.val);
            if(currentNode.left != null)
            {
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null)
            {
                queue.offer(currentNode.right);
            }
        }
        
    }
    return result;
    }

    public static void main(String[] args) {
        Tree bfs = new Tree();
        Tree.levelOrder(root);
        Tree.findsuccesor(root,6);
    }
}
