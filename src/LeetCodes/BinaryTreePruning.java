package LeetCodes;

public class BinaryTreePruning {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public void ImplementFunction(){
//        TreeNode Tree = new TreeNode(1);
//        Tree.left = new TreeNode(0);
//        Tree.right = new TreeNode(1);
//
//        Tree.left.left = new TreeNode(0);
//        Tree.left.right= new TreeNode(0);
//
//        Tree.right.left =new TreeNode(0);
//        Tree.right.right= new TreeNode(1);

//        TreeNode Tree = new TreeNode(1);
//        Tree.left = new TreeNode(0);
//        Tree.right = new TreeNode(1);

//        TreeNode Tree = new TreeNode(1);
//        Tree.left = new TreeNode(1);
//        Tree.right = new TreeNode(0);
//
//        Tree.left.left = new TreeNode(1);
//        Tree.left.right= new TreeNode(1);
//        Tree.left.left.left= new TreeNode(0);
//        Tree.left.left.right= null;
//
//        Tree.right.left =new TreeNode(0);
//        Tree.right.right= new TreeNode(1);

        TreeNode Tree = new TreeNode(0);
        Tree.right = new TreeNode(0);

        Tree.right.left =new TreeNode(1);
        Tree.right.right= new TreeNode(1);
        Tree.right.left.right= new TreeNode(1);
        Tree.right.left.left= null;

        TreeNode result = pruneTree(Tree);

        return;

        //[0,null,0,1,1,null,1,null,1,null,null,null,null]
        //[0,null,0,1,1,null,1,null,1]

    }

    public TreeNode pruneTree(TreeNode root) {
        if (root==null)
            return null;

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.val==0 && root.left==null && root.right==null)
            return null;
        else return root;

    }


    public TreeNode pruneTreeWrong(TreeNode root) {
        if (root==null)
            return null;

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        int leftVal = root.left==null?0:root.left.val;
        int rightval = root.right==null?0:root.right.val;
        if (leftVal==1 || rightval==1){
            return root;
        }
        else if (root.val==1){
            return root;
        }
        else return null;

    }


}
