package Trees;

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


    public void display(TreeNode treeNode){
        
    }

    public int depth(TreeNode root, int curr){
        int temp1 = 0;
        int temp2 = 0;
       
            if(root.left!= null){
                 temp1 = depth(root.left, curr+1);
            }
            if(root.right != null){
                 temp2 = depth(root.right, curr+1);
            }
        
        return Math.max(temp1, temp2);
    }
     }
