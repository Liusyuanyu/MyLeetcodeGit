package LeetCodes;
import java.util.ArrayList;
import java.util.List;

public class DeleteNodesAndReturnForest {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    private List<TreeNode> ansRoots;

    public DeleteNodesAndReturnForest(){

    }

    public void testFun(){
        TreeNode FirstTree = new TreeNode(1);
        FirstTree.left = new TreeNode(2);
        FirstTree.right = new TreeNode(3);
        FirstTree.left.left = new TreeNode(4);
        FirstTree.left.right = new TreeNode(5);
        FirstTree.right.left = new TreeNode(6);
        FirstTree.right.right = new TreeNode(7);

        int[] del = new int[]{3,5};

        delNodes(FirstTree, del);
    }
//    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
//        ansRoots = new ArrayList<>();
////        List<Integer> nums =Arrays.stream(to_delete).boxed().collect(Collectors.toList());
////        root = process(root, nums);
//        root = process(root, to_delete);
//        if(root!=null){
//            ansRoots.add(root);
//        }
//        return ansRoots;
//    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ansRoots = new ArrayList<>();
        root = process(root, to_delete);
        if(root!=null){
            ansRoots.add(root);
        }
        return ansRoots;
    }

    public TreeNode process(TreeNode root, int[] to_delete){
        if(root==null)
            return null;
        root.left = process(root.left,to_delete);
        root.right = process(root.right,to_delete);
        if(!isTarget(root.val,to_delete) ){
            return root;
        }
        if(root.left!=null){
            ansRoots.add(root.left);
        }
        if(root.right!=null){
            ansRoots.add(root.right);
        }
        return null;
    }

    public boolean isTarget(int target, int[] del_list) {
        if(del_list == null || del_list.length == 0) {
            return false;
        }
        for (int num: del_list){
            if(target == num) return true;
        }
        return false;
    }

//    public TreeNode process(TreeNode root, List<Integer> to_delete){
//        if(root==null)
//            return null;
//
//        if(to_delete.contains(root.val) ){
//            if(root.left!=null){
//                ansRoots.add(root.left);
//            }
//            if(root.right!=null){
//                ansRoots.add(root.right);
//            }
//            to_delete.remove(to_delete.indexOf(root.val));
//            if(!to_delete.isEmpty()){
//                process(root.left,to_delete);
//                process(root.right,to_delete);
//            }
//            return null;
//        }
//        else{
//            root.left = process(root.left,to_delete);
//            root.right = process(root.right,to_delete);
//            return root;
//        }
//    }



//    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
//        List<TreeNode> res = new ArrayList<>();
//
//        return res;
//    }


}
