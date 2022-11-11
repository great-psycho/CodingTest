package Programmers.Lv0.피자나눠먹기3;

//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120816)
public class Solution {
    public int solution(int slice, int n) {
        int answer = (n%slice == 0) ? n/slice : n/slice+1;
        return answer;
    }

    public static void main(String[] args) {
        int slice = 7;
        int n = 10;

        Solution solution = new Solution();
        int ANSWER = solution.solution(slice, n);
        System.out.println(ANSWER);
    }
}
