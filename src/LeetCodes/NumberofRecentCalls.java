package LeetCodes;

import java.util.LinkedList;

public class NumberofRecentCalls {

//    private ArrayList<Integer> list;
    private LinkedList<Integer> list;
    public NumberofRecentCalls() {
        list = new LinkedList<Integer>();
    }

    public int ping(int t) {
        list.add(t);
        int time = t - 3000;
        while (time > list.getFirst())
            list.remove();
        return list.size();
}




//    private int[] times;
//    private int index;
//    private int size;
//    int mid;
//    private int start;
//    private int end;
//    private int delay;
//
//    public NumberofRecentCalls() {
//        times = new int[10000];
//        size =0;
//        index=0;
//        int mid=0;
//    }
//
//    public int ping(int t) {
//        times[size]=t;
//        size++;
//        start=index;
//        end = size;
//        delay = t-3000;
//        while (start<end){
//            mid = (start+end)/2;
//            if (times[mid] < delay){
//                start = mid+1;
//            }
//            else
//                end=mid;
//        }
//        index=start;
//        return size-start;
//    }



//    public NumberofRecentCalls() {
//        times = new int[10000];
//        watermark = 0;
//        size = 0;
//    }
//
//    public int ping(int t) {
//        times[size] = t;
//        size ++;
//        watermark = binarySearch(t-3000, watermark, size);
//        return size - watermark;
//    }
//
//    private int binarySearch(int t, int start, int end) {
//        int lo = start, hi = end;
//        while (lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//
//            if (times[mid] < t) {
//                lo = mid + 1;
//            } else {
//                hi = mid;
//            }
//        }
//        return lo;
//    }


}
