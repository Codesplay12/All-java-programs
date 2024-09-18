import javax.swing.tree.TreeNode;

public class diameteroftree {

    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                this.right = right;
    }

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    int height(TreeNode node)
    {
        if(node == null)
        {
            return 0;


        }

        int leftheight = height(node.left);
        int rightheight = height(node.right);

        int dia = leftheight + rightheight + 1;
        diameter = Math.max(diameter,dia);

        return Math.max(leftheight , rightheight)+1;
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
        {
            return null;
        }

        TreeNode left = invertTree(root.left);
         TreeNode right = invertTree(root.right);

         root.left = right;
         root.right = left;

         return root;
    }
}
