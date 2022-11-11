package Programmers.Lv0.배열뒤집기;

import java.util.Arrays;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120821)
public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            answer[num_list.length-i-1] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        Solution solution = new Solution();

        int[] ANSWER =  solution.solution(num_list);
        System.out.println(Arrays.toString(ANSWER));
    }
}
