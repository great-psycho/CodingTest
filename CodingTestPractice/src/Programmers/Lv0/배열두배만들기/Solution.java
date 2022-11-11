package Programmers.Lv0.배열두배만들기;

import java.util.Arrays;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120809)
public class Solution {
    public int[] solution(int[] numbers) {
        for (int i=0; i<numbers.length; i++)numbers[i] = numbers[i]*2;
        return numbers;
    }
    public static void main(String[] args){
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};

        Solution solution = new Solution();
        int[] ANSWER = solution.solution(numbers);
        System.out.println(Arrays.toString(ANSWER));
    }
}
