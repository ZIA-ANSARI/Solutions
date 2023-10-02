package Trees;
import Trees.TreeNode;

public class InvertBinaryTree {

    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(1);
        invertBinaryTree.invertTree(treeNode);
        System.out.println(treeNode.val);
        System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);
        System.out.println(treeNode.right.right.val);
        System.out.println(treeNode.depth(treeNode, 0));
    }

    public TreeNode invertTree(TreeNode root) {
        if(root != null){
        TreeNode tempLeft = root.left;
        TreeNode tempRight = root.right;
        TreeNode parent = root;

        
            parent.right = tempLeft;
            parent.left = tempRight;
            if(tempLeft != null)
            invertTree(tempLeft);
            if(tempRight!=null)
            invertTree(tempRight);
        }
        

        return root;
        
    }
    
}
