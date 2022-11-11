package Programmers.Lv0.특정문자제거하기;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120826)
public class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }

    public static void main(String[] args) {
        String my_String = "abcdef";
        String letter = "f";

        Solution solution = new Solution();
        String ANSWER = solution.solution(my_String, letter);
        System.out.println(ANSWER);
    }
}
