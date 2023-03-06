class Solution {
    public int solution(int num) {
        int answer = -1;
        long lnum = (long) num;
        for (int i=0; i<500; i++) {
            if (lnum == 1) {
                answer = i;
                break;
            }else if (lnum%2 == 0){
                lnum = lnum/2;
            } else {
                lnum = lnum*3+1;
            }
        }
        return answer;
    }
}