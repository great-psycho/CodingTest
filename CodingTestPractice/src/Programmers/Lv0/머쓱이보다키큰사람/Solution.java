package Programmers.Lv0.머쓱이보다키큰사람;
// [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120585)
public class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int a : array){
            if(a> height) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {149,180,192,170};
        int height = 167;

        Solution solution = new Solution();

        int ANSWER =  solution.solution(array, height);
        System.out.println(ANSWER);
    }
}
