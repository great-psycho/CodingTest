package Programmers.Lv0.점의위치구하기;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120841)
public class Solution {
    public int solution(int[] dot) {
        if (dot[0]>0 && dot[1]>0) {
            return 1;
        }else if (dot[0]<0 && dot[1]>0){
            return 2;
        }else if (dot[0]<0 && dot[1]<0){
            return 3;
        }else return 4;
    }

    public static void main(String[] args) {
        int[] dot = {2,-4};

        Solution solution = new Solution();
        int ANSWER = solution.solution(dot);
        System.out.println(ANSWER);
    }
}
