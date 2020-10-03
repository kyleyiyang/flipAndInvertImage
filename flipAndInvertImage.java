class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0; i<A.length; i++) {
            int k = A[i].length;
            for(int j = 0; j < Math.floor(k/2); ++j) {
                if (A[i][j] == A[i][k-1-j]) {
                    A[i][j] = (A[i][j] + 1)%2;
                    A[i][k-1-j] = (A[i][k-1-j] + 1)%2;
                }
            }
            if (k%2 == 1) {
                int l = (int) Math.floor(k/2);
                 A[i][l] = (A[i][l] + 1)%2;
            }
        }
        return A;
    }
}
// faster and lower memory usage

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int k = A.length;
        int l = (int) Math.floor(k/2);
        for (int i=0; i<k; i++) {
            for(int j = 0; j < l; ++j) {
                if (A[i][j] == A[i][k-1-j]) {
                    A[i][j] = (A[i][j] + 1)%2;
                    A[i][k-1-j] = (A[i][k-1-j] + 1)%2;
                }
            }
            if (k%2 == 1) {
                 A[i][l] = (A[i][l] + 1)%2;
            }
        }
        return A;
    }
}
