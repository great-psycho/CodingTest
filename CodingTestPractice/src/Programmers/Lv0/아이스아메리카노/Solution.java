package Programmers.Lv0.아이스아메리카노;

import java.util.Arrays;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120819)
public class Solution {
    public int[] solution(int money) {
        int max = money/5500;
        int change = money - (max*5500);
        int[] answer = {max, change};

        return answer;
    }
    public static void main(String[] args){
        int money = 11000;

        Solution solution = new Solution();
        int[] ANSWER = solution.solution(money);
        System.out.println(Arrays.toString(ANSWER));
    }
}
