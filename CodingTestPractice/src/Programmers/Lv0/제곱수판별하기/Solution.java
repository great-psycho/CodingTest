package Programmers.Lv0.제곱수판별하기;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120909)
public class Solution {
    public int solution(int n) {

        int answer = 0;
        int a = (int) Math.sqrt(n);

        if (n == a*a){
            answer = 1;
        }else {
            answer = 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 144;
        Solution solution = new Solution();

        int ANSWER = solution.solution(n);
        System.out.println(ANSWER);
    }
}
