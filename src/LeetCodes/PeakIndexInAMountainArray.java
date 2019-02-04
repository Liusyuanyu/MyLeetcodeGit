package LeetCodes;

public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int smallest =0;
        int Largest =A.length;
        int mid =0;

        while(smallest +1 < Largest){
            mid = (smallest + Largest) /2;
            if (A[mid] > A[mid-1])
                smallest = mid;
            else //A: mid < mid -1
                Largest = mid -1;
        }
        return A[smallest]>A[Largest]?smallest:Largest;
    }
}
