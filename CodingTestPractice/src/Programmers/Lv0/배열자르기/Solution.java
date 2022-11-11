package Programmers.Lv0.배열자르기;

import java.util.Arrays;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120833)
public class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        for(int i=0; i<num2-num1+1; i++){
            answer[i] = numbers[i+num1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int num1 = 2;
        int num2 = 3;

        Solution solution = new Solution();
        int[] ANSWER = solution.solution(numbers, num1, num2);
        System.out.println(Arrays.toString(ANSWER));
    }
}
