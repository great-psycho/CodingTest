
class Solution {
    public int solution(int a) {
        int answer = 0;
        int b = 6;
        answer = (a*b/gcd(a,b))/b;
        
        return answer;
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}