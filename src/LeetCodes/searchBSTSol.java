package LeetCodes;

public class searchBSTSol {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode searchBSTRecursive(TreeNode root, int val) {

        if (root ==null)
            return null;
        else if(root.val==val)
            return  root;
        else if (root.val>val)
            return searchBSTRecursive(root.left,val);
        else
            return searchBSTRecursive(root.right,val);
//        return  root;
    }
    public TreeNode searchBSTLoop(TreeNode root, int val) {
        TreeNode temp = root;
        while(temp!=null){
            if (temp.val == val){
                return temp;
            }
            else if (temp.val>val){
                temp =temp.left;
            }
            else
                temp =temp.right;
        }
        return null;
    }

    public void ImplementFun(){
        TreeNode MainTree = new TreeNode(4);
        MainTree.left = new TreeNode(2);
        MainTree.right= new TreeNode(7);
        MainTree.left.left = new TreeNode(1);
        MainTree.left.right = new TreeNode(3);


//        TreeNode SOl = searchBSTRecursive(MainTree,2);
        TreeNode SOl22 = searchBSTLoop(MainTree,2);

        return;
    }
}
