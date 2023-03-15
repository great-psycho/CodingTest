class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long) Math.sqrt(n);
        answer = x*x==n? ((x + 1)*(x + 1)):-1;
        return answer;
    }
}