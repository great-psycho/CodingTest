package Programmers.Lv0.문자열뒤집기;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120822)
public class Solution {
    public String solution(String my_string) {
        String answer = new StringBuffer(my_string).reverse().toString();
        return answer;
    }

    public static void main(String[] args){
        String my_string = "jaron";
        Solution solution = new Solution();

        String ANSWER = solution.solution(my_string);
        System.out.println(ANSWER);
    }
}
