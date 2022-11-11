package Programmers.Lv0.최댓값만들기;

import java.util.Arrays;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120847)
public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }

    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9};

        Solution solution = new Solution();
        int ANSWER = solution.solution(numbers);
        System.out.println(ANSWER);
    }
}
