package LeetCodes;
import java.util.*;

public class IteratorforCombination {

//    public void ImplementFunction(){
//        IteratorforCombination("abc",2);
//    }

    public void ImplementFunction(){
        CombinationIterator("abc",2);
//        CombinationIterator("ABCDE",3);
    }

    List<String> combination;
//    Queue<String> combination;
    public void CombinationIterator(String characters, int combinationLength) {
//        combination=new LinkedList<>();
        combination=new ArrayList<>();
        allCombination(characters,combinationLength,"");
        Collections.sort(combination);
        System.out.println("--------------------------------------------------------");

        System.out.println(next());
        System.out.println(hasNext());
        System.out.println(next());
        System.out.println(hasNext());
        System.out.println(next());
        System.out.println(hasNext());
//        System.out.print(next());
//        System.out.print(hasNext());


        System.out.println("--------------------------------------------------------");
    }

    public String next() {
        String tmp = combination.get(0);
        combination.remove(0);
        return tmp;

//        return combination.poll();
    }

    public boolean hasNext() {
        return !combination.isEmpty();
    }

    public void allCombination(String str, int k, String accumulated){
        // 1. stop
        if(str.length() < k)
            return;
        if(k == 1)
            for(char s:str.toCharArray())
                combination.add(accumulated+s);

        // 3. add all elements in e to accumulated
        else if(str.length() == k){
            accumulated+=str;
            combination.add(accumulated);
        }
        // 4. for each element, call combination
        else if(str.length() > k)
            for(int ind = 0 ; ind < str.length() ; ind++)
                allCombination(str.substring(ind+1,str.length()), k-1,accumulated+str.charAt(ind));
    }


//    public void combination(List<String> e, int k, String accumulated){
//
//        // 1. stop
//        if(e.size() < k)
//            return;
//        // 2. add each element in e to accumulated
//        if(k == 1)
//            for(String s:e)
//                print(accumulated+s);
//
//            // 3. add all elements in e to accumulated
//        else if(e.size() == k){
//            for(String s:e)
//                accumulated+=s;
//            print(accumulated);
//        }
//        // 4. for each element, call combination
//        else if(e.size() > k)
//            for(int i = 0 ; i < e.size() ; i++)
//                combination(e.subList(i+1, e.size()), k-1, accumulated+e.get(i));
//
//    }
}

/*
 * Your IteratorforCombination object will be instantiated and called as such:
 * IteratorforCombination obj = new IteratorforCombination(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */