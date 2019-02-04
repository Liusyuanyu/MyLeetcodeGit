package LeetCodes;

public class MergeTwoBinaryTrees {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mergeTreeFast(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null){
            return null;
        }
        else if (t1==null && t2!=null){
            return  t2;
        }
        else if (t1!=null && t2==null){
            return  t1;
        }
        else{ //if (t1!=null&&t2!=null)
            t1.val +=t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right= mergeTrees(t1.right, t2.right);
            return  t1;
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
         if(t1==null && t2==null){
             return null;
         }
         else if (t1==null && t2!=null){
             TreeNode NewHostTree = new TreeNode(t2.val);
//             NewHostTree.val=t2.val;
//             NewHostTree.left= null;
             NewHostTree.left= mergeTrees(t2.left,null);
             NewHostTree.right= mergeTrees(null, t2.right);
//             NewHostTree.right= mergeTrees(null, t2.right);
//             NewHostTree.right= mergeTrees(t2.left, t2.right);
             return  NewHostTree;
         }
         else if (t1!=null && t2==null){
             TreeNode NewHostTree = new TreeNode(t1.val);
//             TreeNode NewHostTree = new TreeNode(-1);
//             NewHostTree.val=t1.val;
             NewHostTree.left = mergeTrees(t1.left, null);
             NewHostTree.right= mergeTrees(null,t1.right);
//             NewHostTree.right= mergeTrees(t1.right,null);
//             NewHostTree.right = null;
             return  NewHostTree;
         }
         else if (t1!=null&&t2!=null){
             TreeNode NewHostTree = new TreeNode(t1.val + t2.val);
//             NewHostTree.val=t1.val + t2.val;
             NewHostTree.left = mergeTrees(t1.left, t2.left);
             NewHostTree.right= mergeTrees(t1.right, t2.right);
//             NewHostTree.left = mergeTrees(t1.left, t1.right);
//             NewHostTree.right= mergeTrees(t2.left, t2.right);
             return  NewHostTree;
         }
         return  null;
    }

    public void MergeTwoBinaryTreesTest(){
        TreeNode FirstTree = new TreeNode(1);
        FirstTree.left = new TreeNode(3);
        FirstTree.right = new TreeNode(2);
        FirstTree.left.left = new TreeNode(5);
        FirstTree.left.right = null;
        FirstTree.left.left.left = null;
        FirstTree.left.left.right = null;

        TreeNode SecondTree = new TreeNode(2);
        SecondTree.left = new TreeNode(1);
        SecondTree.right = new TreeNode(3);
        SecondTree.left.left = null;
        SecondTree.left.right = new TreeNode(4);
        SecondTree.left.right.left = null;
        SecondTree.left.right.right = null;
        SecondTree.right.left = null;
        SecondTree.right.right = new TreeNode(7);
        SecondTree.right.right.left= null;
        SecondTree.right.right.right = null;


//        TreeNode NewHostTree = mergeTrees(FirstTree,SecondTree);
        TreeNode NewHostTree = mergeTreeFast(FirstTree,SecondTree);

        return;

    }


}
