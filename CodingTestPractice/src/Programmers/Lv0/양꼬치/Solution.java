package Programmers.Lv0.양꼬치;

// [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120830)
public class Solution {

    public int solution(int n, int k) {
        int answer = (n)*12000 + (k-(n/10))*2000;
        return answer;
    }

    public static void main(String[] args) {
        int n = 64;
        int k = 6;

        Solution solution = new Solution();

        int ANSWER = solution.solution(n,k);
        System.out.println(ANSWER);
    }
}
