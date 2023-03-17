class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            int x = b;
            b = a;
            a = x;
        }
        for(int i=a; i<b+1; i++) {
            answer += i;
        }
        return answer;
    }
}