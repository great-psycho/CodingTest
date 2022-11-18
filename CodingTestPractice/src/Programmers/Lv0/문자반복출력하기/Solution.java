package Programmers.Lv0.문자반복출력하기;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120825)
public class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        String[] strings = my_string.split("");
        for (String a : strings){
            for (int i=0; i<n; i++){
                answer.append(a);
            }
        }
        return answer.toString();
    }
//    public String solution(String my_string, int n) {
//        String answer = "";
//        String[] str = my_string.split("");
//        for(String a : str){
//            answer += a.repeat(n);
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        String my_string = "hello word";
        int n = 4;

        Solution solution = new Solution();
        String ANSWER = solution.solution(my_string, n);
        System.out.println(ANSWER);
    }
}
