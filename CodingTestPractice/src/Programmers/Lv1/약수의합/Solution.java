package Programmers.Lv1.약수의합;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12928)
public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++){
            if(n%i == 0)answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        Solution solution = new Solution();
        int ANSWER = solution.solution(n);
        System.out.println(ANSWER);
    }
}
