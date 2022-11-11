package Programmers.Lv0.편지;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120898)
public class Solution {
    public int solution(String message) {
        message.replaceAll(" ", "a");
        return message.length()*2;
    }

    public static void main(String[] args) {
        String message = "I love you~";

        Solution solution = new Solution();
        int ANSWER = solution.solution(message);
        System.out.println(ANSWER);
    }
}
