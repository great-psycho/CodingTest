package Programmers.Lv1.평균구하기;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12944)
public class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int a : arr) answer += a;
        answer = answer/arr.length;
        return answer;
    }
    public static void main(String[] args){
        int[] n = {1,2,3,4};
        Solution solution = new Solution();
        double ANSWER = solution.solution(n);
        System.out.println(ANSWER);
    }
}
