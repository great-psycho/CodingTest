package Programmers.Lv0.피자나눠먹기;

// [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120814)
public class Solution {
    public int solution(int n) {
        int answer = 1;
        if(n%7 == 0){
            answer -= 1;
        }
        answer += n/7;

//        int answer = (n%7==0) ? n/7 : n/7 + 1;
        return answer;
    }

    public static void main(String[] args) {
        int n = 30;
        Solution solution = new Solution();

        int ANSWER = solution.solution(n);
        System.out.println(ANSWER);
    }
}
