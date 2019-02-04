package LeetCodes;

import java.util.HashSet;

public class rangeSumBSTClass {
    HashSet<Integer> Intlist = new HashSet<Integer>();
    int Left =0;
    int Right =0;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int rangeSumBSTOLD(TreeNode root, int L, int R) {
        TreeNode small = searchLeftNodeRecursive(root,L);
        TreeNode Large = searchRightNodeRecursive(root,R);

//        rangeFindNodeRecursive(Large.left);
//        rangeFindNodeRecursive(Large.right);

        int sumNum =0;
        for (int num: Intlist){
            sumNum += num;
        }
        return sumNum;
    }

    public int rangeSumBSTOLD2(TreeNode root, int L, int R) {
        Intlist.clear();
        TreeNode temp = root;
        TreeNode Small=null;
        TreeNode Large=null ;
        Intlist.add(L);
        Intlist.add(R);

        while(temp !=null){//Left
            if (temp.val==L){
                Intlist.add(temp.val);
                Small=temp;
                break;
            }
            if (temp.val > L){
                if (temp.val < R)
                    Intlist.add(temp.val);
                temp = temp.left;
            }
            else{
                temp = temp.right;
            }
        }
        temp = root;
        while(temp !=null){//Right
            if (temp.val==R){
                Intlist.add(temp.val);
                Large=temp;
                break;
            }
            if (temp.val > R){
                temp = temp.left;
            }
            else{//big
                if (temp.val > L)
                    Intlist.add(temp.val);
                rangeFindLeftNodeRecursive(Large.left,L);
                temp = temp.right;
            }
        }
        if (Small!=null)
            rangeFindRightNodeRecursive(Small.right,R);
        if (Large!=null)
            rangeFindLeftNodeRecursive(Large.left,L);

        int sumNum =0;
        for (int num: Intlist){
            sumNum += num;
        }
        return sumNum;
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        HashSet<Integer> Intlist = new HashSet<Integer>();
//        TreeNode temp = root;
//        while(temp!=null){
//            if (temp.val==L){
//
//            }
//
//
//        }
//        searchBSTSol.searchBSTRecursive
//        return L+R+rangeSumRecursive(small.right) + rangeSumRecursive(Large.left);
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        Right = R;
        Left = L;
        Intlist.clear();
        InquiryNodes(root);
        int sumNum =0;
        for (int num: Intlist){
            sumNum += num;
        }
        return sumNum;
    }
    public void InquiryNodes(TreeNode node){
        if (node==null)return;
        if (node.val >= Left && node.val <= Right){
            Intlist.add(node.val);
        }
        InquiryNodes(node.left);
        InquiryNodes(node.right);
        return;
    }
    public TreeNode searchLeftNodeRecursive(TreeNode root, int val) {//Small
        if (root==null)
            return null;
        if(root.val==val){
            Intlist.add(val);
            return  root;
        }
        else if (root.val>val){
            Intlist.add(val);
            return searchLeftNodeRecursive(root.left,val);
        }
        else{
            return null;
        }
    }
    public TreeNode searchRightNodeRecursive(TreeNode root, int val) {//Small
        if (root==null)
            return null;
        if(root.val==val){
            Intlist.add(val);
            return  root;
        }
        else if (root.val>val){
            return null;
//            Intlist.add(val);
//            return searchBSTRecursive(root.left,val);
        }
        else{
            Intlist.add(val);
            return searchRightNodeRecursive(root.right,val);
        }
    }


    public void rangeFindLeftNodeRecursive(TreeNode node, int Num) {
        if (node==null)return;
        if (node.val > Num)
            Intlist.add(node.val);
        rangeFindLeftNodeRecursive(node.left,Num);
        rangeFindLeftNodeRecursive(node.right,Num);
    }
    public void rangeFindRightNodeRecursive(TreeNode node,int Num) {
        if (node==null)return;
        if (node.val < Num)
            Intlist.add(node.val);
        rangeFindRightNodeRecursive(node.left,Num);
        rangeFindRightNodeRecursive(node.right,Num);
    }
//    public int rangeSumRecursive(TreeNode node) {
//        if (node==null)return 0;
//        return node.val+ rangeSumRecursive(node.left) + rangeSumRecursive(node.right);
//    }

    public int BSTSumRecursive(TreeNode root, int L,int R) {
        if (root ==null)
            return 0;
        int val=0;
        if (root.val >= L && root.val <= R) val = root.val + BSTSumRecursive(root.left, L, R) + BSTSumRecursive(root.right, L, R);

        if (root.val < L) val = BSTSumRecursive(root.right, L, R);

        if (root.val > R) val = BSTSumRecursive(root.left, L, R);

        return val;

    }
    public void ImplementFunction(){
        TreeNode MainTree = new TreeNode(10);
        MainTree.left = new TreeNode(5);
        MainTree.right = new TreeNode(15);
        MainTree.left.left = new TreeNode(3);
        MainTree.left.right = new TreeNode(7);
        MainTree.right.left=null;
        MainTree.right.right = new TreeNode(18);

        int suum = rangeSumBST(MainTree,7,15);
        System.out.println("Sum: "+suum);

        TreeNode SecondTree = new TreeNode(10);
        SecondTree.left = new TreeNode(5);
        SecondTree.left.left = new TreeNode(3);
        SecondTree.left.right = new TreeNode(7);

        SecondTree.left.right.left = new TreeNode(6);
        SecondTree.left.right.right = null;
        SecondTree.left.left.left = new TreeNode(1);
        SecondTree.left.left.right = null;

        SecondTree.right = new TreeNode(15);
        SecondTree.right.left = new TreeNode(13);
        SecondTree.right.right = new TreeNode(18);

        suum = rangeSumBST(SecondTree,6,10);
        System.out.println("Sum: "+suum);

        suum = BSTSumRecursive(SecondTree,6,10);
        System.out.println("Sum: "+suum);


//        TreeNode ThirdTree =  null;
//        CreateBST(ThirdTree,25);
//        CreateBST(ThirdTree,16);
//        CreateBST(ThirdTree,34);
//        CreateBST(ThirdTree,13);
//        CreateBST(ThirdTree,22);
//        CreateBST(ThirdTree,31);
//        CreateBST(ThirdTree,37);
//        CreateBST(ThirdTree,10);
//        CreateBST(ThirdTree,19);
//        CreateBST(ThirdTree,28);

        TreeNode ThirdTree =  CreateBST(null,25);
        ThirdTree = CreateBST(ThirdTree,16);
        ThirdTree = CreateBST(ThirdTree,34);
        ThirdTree = CreateBST(ThirdTree,13);
        ThirdTree = CreateBST(ThirdTree,22);
        ThirdTree = CreateBST(ThirdTree,31);
        ThirdTree = CreateBST(ThirdTree,37);
        ThirdTree = CreateBST(ThirdTree,10);
        ThirdTree = CreateBST(ThirdTree,19);
        ThirdTree = CreateBST(ThirdTree,28);

        suum = rangeSumBST(ThirdTree,22,37);
        System.out.println("Sum: "+suum);

        suum = rangeSumBSTNew(SecondTree,6,10);
        System.out.println("Sum: "+suum);

        suum = rangeSumBSTNew(ThirdTree,22,37);
        System.out.println("Sum: "+suum);

//        [25,16,34,13,22,31,37,10,null,19,null,28]
//        22
//        37

    }

    int Sum=0;
    public int rangeSumBSTNew(TreeNode root, int L, int R) {
        Sum=0;
        GetSum (root, L, R);
        return Sum;
    }
    public void GetSum(TreeNode root, int L, int R){
        if (root ==null)
            return ;
        if (root.val >= L && root.val <= R){
            Sum += root.val;
            GetSum(root.left,L,R);
            GetSum(root.right,L,R);
        }

        if (root.val < L)GetSum(root.right, L, R);
        if (root.val > R)GetSum(root.left, L, R);

        return ;
    }


    public TreeNode CreateBST(TreeNode Tree, int Num){
        if (Tree==null){
            Tree = new TreeNode(Num);
//            return;
            return Tree;
        }
        TreeNode Temp = Tree;
        TreeNode PreNode = null;
        while (Temp!=null){
            if (Temp.val > Num){
                PreNode=Temp;
                Temp=Temp.left;
                if (Temp==null)
                    PreNode.left=new TreeNode(Num);
            }
            else{
                PreNode=Temp;
                Temp=Temp.right;
                if (Temp==null)
                    PreNode.right=new TreeNode(Num);
            }
        }
//        return ;
        return Tree;
    }
}
