package Programmers.Lv1.자릿수더하기;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12931)
public class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n != 0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 987;
        Solution solution = new Solution();
        int ANSWER = solution.solution(n);
        System.out.println(ANSWER);
    }
}
