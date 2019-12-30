import LeetCodes.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

//        int[] numlist= new int[]{0,1,2,3,2,5,6,7};
        int[] numlist= new int[]{0,5,2,3,4,5,6,5};
//        int[] numlist= new int[]{0,1,2,3,4,5,6,7};
//        int[] numlist= new int[]{0,1,2,3,4,5,6,7};

//        System.out.println("Repeat  num:" + FindRepeatNumber(numlist));


//        MergeTwoBinaryTrees MTBTClass = new MergeTwoBinaryTrees();
//        MTBTClass.MergeTwoBinaryTreesTest();
//        DIStringMatch DSMClass = new DIStringMatch();
//
//        DSMClass.diStringMatch("IDID");
//        DSMClass.diStringMatch("III");
//        DSMClass.diStringMatch("DDI");


//        int[] A = new int[4];
//        A[0] = 0;
//        A[1] = 2;
//        A[2] = 1;
//        A[3] = 0;
//        PeakIndexInAMountainArray PIIMClass = new PeakIndexInAMountainArray();
//        System.out.println("Number   :  " + PIIMClass.peakIndexInMountainArray(A));

//
//        NumberofRecentCalls NRCClass = new NumberofRecentCalls();
//        System.out.println("Number   :  " + NRCClass.ping(1));
//        System.out.println("Number   :  " + NRCClass.ping(100));
//        System.out.println("Number   :  " + NRCClass.ping(3001));
//        System.out.println("Number   :  " + NRCClass.ping(3002));

//        searchBST();
//        rangeSumBST();


//        ImplementmaxIncreaseKeepingSkyline();

//        ImplementEncodeNDecodeTinyURL();

//        ImplementRevealCards();

//        ImplementMaximumBinaryTree();
//        ImplementFindandReplacePattern();

//        ImplementFindandminAddToMakeValid();

//        ImplementBinaryTreePrune();

//        implementDeleteNodesAndReturnForest();


        implementCombinationIterator();
    }


//    public static int FindRepeatNumber(int[] Input){
//        int[] numlist= new int[10000];
//        for(int num : Input){
//            if (numlist[num]++ ==1){
//                return  num;
//            }
//        }
//        return -1;
//    }
//
//    public static void searchBST(){
//        searchBSTSol Testclass = new searchBSTSol();
//        Testclass.ImplementFun();
//    }
//
//    public static void  rangeSumBST(){
//        rangeSumBSTClass TestClass = new rangeSumBSTClass();
//        TestClass.ImplementFunction();
//    }
//
//    public  static void ImplementmaxIncreaseKeepingSkyline(){
//        maxIncreaseKeepingSkylineSol TestClass = new maxIncreaseKeepingSkylineSol();
//        TestClass.ImplementFunction();
//
//    }
//    public  static void ImplementEncodeNDecodeTinyURL(){
//        EncodeNDecodeTinyURL TestClass = new EncodeNDecodeTinyURL();
//        TestClass.ImplementFun();
//    }

    public static void ImplementRevealCards(){
        RevealCardsInIncreasingOrder TestClass = new RevealCardsInIncreasingOrder();
        TestClass.ImplementFunction();
    }

    public static void ImplementMaximumBinaryTree(){
        MaximumBinaryTreeSol TestClass = new MaximumBinaryTreeSol();
        TestClass.ImplementFunction();
    }

    public static void  ImplementFindandReplacePattern(){
        FindandReplacePatternSol TestClass = new FindandReplacePatternSol();
        TestClass.ImplementFunction();
    }

    public static void  ImplementFindandminAddToMakeValid(){
        MinimumAddtoMakeParenthesesValidSol TestClass = new MinimumAddtoMakeParenthesesValidSol();
        TestClass.ImplementFunction();
    }


    public static void ImplementBinaryTreePrune(){
        BinaryTreePruning TestClass = new BinaryTreePruning();
        TestClass.ImplementFunction();
    }

    public static void implementDeleteNodesAndReturnForest(){
        DeleteNodesAndReturnForest testClass = new DeleteNodesAndReturnForest();
        testClass.testFun();
    }

    public static void implementCombinationIterator(){
        IteratorforCombination testClass = new IteratorforCombination();
        testClass.ImplementFunction();
    }
}
