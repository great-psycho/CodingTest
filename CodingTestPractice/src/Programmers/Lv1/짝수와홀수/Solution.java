package Programmers.Lv1.짝수와홀수;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12937)
public class Solution {
    public String solution(int num) {
        String answer = (num%2==0)?"Even":"Odd";
        return answer;
    }

    public static void main(String[] args) {
        int num = 4;
        Solution solution = new Solution();
        String ANSWER = solution.solution(num);
        System.out.println(ANSWER);
    }
}
