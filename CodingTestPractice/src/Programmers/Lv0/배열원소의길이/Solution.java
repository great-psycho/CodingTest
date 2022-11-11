package Programmers.Lv0.배열원소의길이;

import java.util.Arrays;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120854)
public class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0; i< strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;

//        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }

    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};

        Solution solution = new Solution();
        int[] ANSWER = solution.solution(strlist);
        System.out.println(Arrays.toString(ANSWER));
    }
}
