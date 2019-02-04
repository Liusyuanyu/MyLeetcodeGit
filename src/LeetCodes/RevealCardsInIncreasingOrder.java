package LeetCodes;

import java.util.*;

public class RevealCardsInIncreasingOrder {

    public void ImplementFunction(){
//        int[] InputList = new int[]{17,13,11,2,3,5,7};
        int[] InputList = new int[]{2,13,3,11,5,17,7};

        int[] output = deckRevealedIncreasing(InputList);
//        int[] output = SampledeckRevealedIncreasing(InputList);
        return;
    }

    //With LinkedList
    public int[] deckRevealedIncreasing(int[] deck) {
//        List numlist = new LinkedList<Integer>();
        LinkedList<Integer> numlist = new LinkedList<Integer>();
        int count =0;
        int firstnum=0;
        int length = deck.length;
        int[] outputs = new int[length];
        Arrays.sort(deck);
        for (int ii =length-1 ; ii>=0;ii--){
            if (!numlist.isEmpty()){
                numlist.add(numlist.poll());
            }
            numlist.add(deck[ii]);
        }
//        int[] outputs = numlist.toArray(new int[deck.length]);
        for (int ii =length-1 ; ii>=0;ii--){
            outputs[ii] = numlist.pop();
        }
//        for (int num : numlist){
//            outputs[count++] = num;
//        }
        return outputs;
    }

    public int[] SampledeckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue=new LinkedList();
        for(int i=deck.length-1;0<=i;i--){
            if(!queue.isEmpty()) queue.add(queue.remove());
            queue.add(deck[i]);
        }
        Collections.reverse((List)queue);
        return new int[2];
//        return queue.stream().mapToInt(Integer::intValue).toArray();
    }

}
