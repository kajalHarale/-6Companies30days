public class Rect {
    public boolean isRectangleCover(int[][] rectangles) {
        int blox = Integer.MAX_VALUE, bloy = Integer.MAX_VALUE, trix = Integer.MIN_VALUE, triy = Integer.MIN_VALUE;
        for (int i = 0; i < rectangles.length; i ++) {
            int[] rect = rectangles[i];
            if (!(rect[0] > blox || rect[1] > bloy)) {
                blox = rect[0];
                bloy = rect[1];
            }
            if (!(rect[2] < trix || rect[3] < triy)) {
                trix = rect[2];
                triy = rect[3];
            }
        }

        System.out.println(blox + ", " + bloy + " : " + trix + ", " + triy);
        boolean[][] covered = new boolean[trix - blox][triy - bloy];
        for (int i = 0; i < rectangles.length; i ++) {
            int[] rect = rectangles[i];
            for (int m = rect[0] - blox; m < rect[2] - blox; m ++) {
                for (int n = rect[1] - bloy; n < rect[3] - bloy; n ++) {
                    if (m < 0 || m >= covered.length || n < 0 || n >= covered[0].length) {
                        System.out.println("out of bound");
                        return false;
                    }
                    if (covered[m][n] == true) {
                        return false;
                    }
                    covered[m][n] = true;
                }
            }
        }
        for (int i = 0; i < covered.length; i ++) {
            for (int j = 0; j < covered[0].length; j ++) {
                if (covered[i][j] == false) {
                    return false;
                }
            }
        }
        return true;
    }
}