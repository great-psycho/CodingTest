class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int lmax = 0;
        int rmax = 0;

        for (int[] a : sizes) {
            int k = 0;
            if(a[0]<a[1]){
                k = a[0];
                a[0] = a[1];
                a[1] = k;
            }
        }

        for (int[] b : sizes) {
            if (b[0] > lmax) {
                lmax = b[0];
            }
            if (b[1] > rmax) {
                rmax = b[1];
            }
        }
        answer = lmax*rmax;
        return answer;
    }
}