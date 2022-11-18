package Programmers.Lv1.수박수박수;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12922)
public class Solution {
    public String solution(int n) {
        String answer = "";
        if (n%2 == 0) answer += "수박".repeat(n/2);
        else answer += "수박".repeat(n/2) + "수";
        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        Solution solution = new Solution();
        String ANSWER = solution.solution(n);
        System.out.println(ANSWER);
    }
}
