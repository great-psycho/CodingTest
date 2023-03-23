class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        long k = 0;
        while (n != 0) {
            k += n%3;
            n = n/3;
            k *= 10;
        }
        while (k > 0) {
            k = k/10;
            answer += k%10*count;
            count *= 3;
        }
        return answer;
    }
}