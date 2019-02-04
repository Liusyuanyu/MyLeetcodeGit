package LeetCodes;

public class maxIncreaseKeepingSkylineSol {
    public int maxIncreaseKeepingSkylineOLD(int[][] grid) {

        int i=0, ii=0;
        int Depth = grid.length;
        int Width = grid[0].length;
        int[] TopBottomMax = new int[Depth];
        int[] LeftRightMax = new int[Width];

        for (i = 0; i < Depth; i++) {
            for (ii = 0; ii < Width; ii++) {
                LeftRightMax[i] = Math.max(LeftRightMax[i], grid[i][ii]);
                TopBottomMax[ii] = Math.max(TopBottomMax[ii], grid[i][ii]);
            }
        }


//        //Find Max Left to Right
//        for (i=0; i < grid.length;i++){
//            LeftRightMax[i] = Integer.MIN_VALUE;
//            for (ii=0;ii< grid[0].length;ii++){
//                if (grid[i][ii] > LeftRightMax[i])
//                    LeftRightMax[i] = grid[i][ii];
//            }
//        }
//
//        //Find Max Top to bottom
//        for (i=0; i < grid[0].length;i++){
//            TopBottomMax[i] = Integer.MIN_VALUE;
//            for (ii=0;ii< grid.length;ii++){
//                if (grid[ii][i] > TopBottomMax[i])
//                    TopBottomMax[i] = grid[ii][i];
//            }
//        }
        int TotalSum = 0;
        int minNum = 0;
        for (i=0; i < grid.length;i++){
            for (ii=0;ii< grid[0].length;ii++){
                minNum = LeftRightMax[i]> TopBottomMax[ii]?TopBottomMax[ii]:LeftRightMax[i];
                TotalSum += minNum - grid[i][ii];
            }
        }
        return TotalSum;
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int i=0, ii=0;
//        int[] TopBottomMax = new int[grid.length];
//        int[] LeftRightMax = new int[grid[0].length];
        int[] TopBottomMax = findTopDownSkyline(grid);
        int[] LeftRightMax = findLeftRightSkyline(grid);
//        //Find Max Left to Right
//        for (i=0; i < grid.length;i++){
//            LeftRightMax[i] = Integer.MIN_VALUE;
//            for (ii=0;ii< grid[0].length;ii++){
//                LeftRightMax[i] = Math.max(LeftRightMax[i], grid[i][ii]);
//            }
//        }
//
//        //Find Max Top to bottom
//        for (i=0; i < grid[0].length;i++){
//            TopBottomMax[i] = Integer.MIN_VALUE;
//            for (ii=0;ii< grid.length;ii++){
//                TopBottomMax[i] = Math.max(TopBottomMax[i], grid[ii][i]);
//            }
//        }
        int TotalSum = 0;
        for (i=0; i < grid.length;i++){
            for (ii=0;ii< grid[0].length;ii++){
                TotalSum += (Math.min(LeftRightMax[i], TopBottomMax[ii]) - grid[i][ii]);
            }
        }
        return TotalSum;
    }
    private int[] findTopDownSkyline(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int j = 0; j < grid[0].length; j++) {
            result[j] = 0;
            for (int i = 0; i < grid.length; i++) {
                result[j] = Math.max(result[j], grid[i][j]);
            }
        }
        return result;
    }
    private int[] findLeftRightSkyline(int[][] grid) {
        int[] result = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            result[i] = 0;
            for (int j = 0; j < grid[i].length; j++) {
                result[i] = Math.max(result[i], grid[i][j]);
            }
        }
        return result;
    }


    public void ImplementFunction(){
//        Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
//        Output: 35
        int[][] GRid = new int[][]{
                { 3,0,8,4 },
                { 2,4,5,7 },
                { 9,2,6,3 },
                { 0,3,1,0 },
        };
//        maxIncreaseKeepingSkyline(GRid);
        maxIncreaseKeepingSkylineOLD(GRid);


    }

}
