package Programmers.Lv1.핸드폰번호가리기_정규식;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12948)
public class Solution {
    public String solution(String phone_number) {
//        String answer = "";
//        String[] a = phone_number.split("");
//        for(int i=0; i<a.length-4; i++) a[i] = "*";
//        for(String b : a) answer += b;
//        return answer;
//        return phone_number.replaceAll(".(?=.{4})", "*");
        return phone_number.replaceAll(".(?=.{4})", "*");
        // 정규식 (전방탐색: ?= , 후방탐색: ?<=)
        // . 임의의 문자1개
        // () 문자 한개로 인식
        // ?= 앞을 의미 (?=. 문자 한개(.)의 앞부분을 가르킴)
        // {n} 횟수
        // ?=.{4} 뒤에 4개의 문자가 붙는 조건
        // .(?=.{4}) 뒤에 4개의 문자가 붙는 문자
        // 문제로 보면 0,1,0,3,3,3,3 총 7개의 문자가 해당된다.
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";
        Solution solution = new Solution();
        String ANSWER = solution.solution(phone_number);
        System.out.println(ANSWER);
    }
}
