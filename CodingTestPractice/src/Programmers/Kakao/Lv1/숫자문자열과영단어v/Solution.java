package Programmers.Kakao.Lv1.숫자문자열과영단어v;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/81301)
public class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<10; i++)s = s.replace(num[i], Integer.toString(i));
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        String s = "one4seveneightone"	;
        Solution solution = new Solution();
        int ANSWER = solution.solution(s);
        System.out.println(ANSWER);
    }
}
