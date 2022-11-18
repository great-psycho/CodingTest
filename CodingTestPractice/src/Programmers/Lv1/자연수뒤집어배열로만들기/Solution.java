package Programmers.Lv1.자연수뒤집어배열로만들기;

import java.util.Arrays;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12932)
public class Solution {
    public int[] solution(long n) {
        String number = String.valueOf(n);
        int[] answer = new int[number.length()];
        int count = 0;
        while (n!=0){
            answer[count] = (int) (n%10);
            n /= 10;
            count ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 9999999999L;
        Solution solution = new Solution();
        int[] ANSWER = solution.solution(n);
        System.out.println(Arrays.toString(ANSWER));
    }
}
