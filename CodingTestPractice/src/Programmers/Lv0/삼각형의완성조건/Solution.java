package Programmers.Lv0.삼각형의완성조건;

import java.util.Arrays;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120889)
public class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[0]+sides[1] > sides[2]) return 1;
        else return 2;
    }

    public static void main(String[] args) {
        int[] sides = {3,6,9};

        Solution solution = new Solution();
        int ANSWER = solution.solution(sides);
        System.out.println(ANSWER);
    }
}
