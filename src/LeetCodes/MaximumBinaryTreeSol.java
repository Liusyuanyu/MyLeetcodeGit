package LeetCodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MaximumBinaryTreeSol {

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

    public void ImplementFunction(){
        int[] numarray = { 3,2,1,6,0,5 };
//        TreeNode result = constructMaximumBinaryTreeWithClone(numarray);
        TreeNode result = constructMaximumBinaryTree(numarray,0,numarray.length-1);

        return;
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if (start > end)
            return null;

        int MaxIndex = start;
        for (int i = start+1; i <= end; i++) {
            if (nums[MaxIndex]<nums[i]){
                MaxIndex = i;
            }
        }

        TreeNode root = new TreeNode (nums[MaxIndex]);
        root.left = constructMaximumBinaryTree (nums, start, MaxIndex-1);
        root.right = constructMaximumBinaryTree(nums, MaxIndex + 1, end);
        return root;
    }

    TreeNode constructMaximumBinaryTreeWithClone(int[] nums){
        int ArrayLength = nums.length;
        if (ArrayLength==1){
            TreeNode Root = new TreeNode(nums[0]);
            return Root;
        }

        int[] CloneNums = nums.clone();
        Arrays.sort(CloneNums);
        int MaxNum = CloneNums[ArrayLength-1];
        TreeNode Root = new TreeNode(MaxNum);

//        List list = Arrays.asList(nums);
//        int MaxIndex = list.indexOf(MaxNum);
//        int MaxIndex = ArrayUtils.indexOf(nums, 2);
        int MaxIndex =0;
        while (nums[MaxIndex++]!=MaxNum);

        MaxIndex--;
        if (MaxIndex==ArrayLength-1){
//            int[] LeftSub = Arrays.copyOfRange(nums,0, MaxIndex-1);
            int[] LeftSub = Arrays.copyOfRange(nums,0, MaxIndex);
            Root.left = constructMaximumBinaryTreeWithClone(LeftSub);
        }
        else if (MaxIndex==0){
//            int[] RightSub = Arrays.copyOfRange(nums,1, ArrayLength-1);
            int[] RightSub = Arrays.copyOfRange(nums,1, ArrayLength);
            Root.right = constructMaximumBinaryTreeWithClone(RightSub);
        }
        else {
            int[] LeftSub = Arrays.copyOfRange(nums,0, MaxIndex);
//            int[] RightSub = Arrays.copyOfRange(nums,MaxIndex+1, ArrayLength-1);
            int[] RightSub = Arrays.copyOfRange(nums,MaxIndex+1, ArrayLength);
            Root.right = constructMaximumBinaryTreeWithClone(RightSub);
            Root.left = constructMaximumBinaryTreeWithClone(LeftSub);
        }
        return Root;
    }

    TreeNode CodeCollection(int[] nums) {
        // Initializing array of integers
        Integer[] num = { 2, 4, 7, 5, 9 };
        int[] num3 = { 2, 4, 7, 5, 9 };

        int min = Collections.min(Arrays.asList(num));
        int max = Collections.max(Arrays.asList(num));

        int[] src = new int[] {1, 2, 3, 4, 5};
        int b1[] = Arrays.copyOfRange(src, 0, 2);

        int arr[] = {10, 324, 45, 90, 9808};
        int[] integers = new int[] { 20, 98, 12, 7, 35 };
//        int min2 = Arrays.stream(integers).min().getAsInt();

        List list = Arrays.asList(new Character[] { 'm', 'e', 'y' });
        System.out.println(list.indexOf('e'));

        return new TreeNode(0);
    }

}
