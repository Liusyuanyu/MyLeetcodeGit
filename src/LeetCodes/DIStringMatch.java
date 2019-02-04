package LeetCodes;

public class DIStringMatch {
    public void diStringMatch(String S) {
        int lenght = S.length();
        int Little =0, Largest = lenght;
        int[] output = new int[lenght+1];

        for(int n=0; n<lenght; n++){
            if( S.charAt(n)=='I'){
                output[n] = Little++;
            }
            else {
                output[n] = Largest--;
            }
        }
        output[lenght]=Little;


        for (int num: output
             ) {
            System.out.print(num +" ");
        }
        System.out.print("\n");
    }


}
