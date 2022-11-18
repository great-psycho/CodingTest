package Programmers.Lv0.배열의유사도;

import java.util.Objects;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120903) +2
public class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i=0; i<s2.length;i++){
            for (String a : s1){
                if (Objects.equals(a, s2[i])) answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] s1 = {"a","b","c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        Solution solution = new Solution();
        int ANSWER = solution.solution(s1,s2);
        System.out.println(ANSWER);
    }
}
