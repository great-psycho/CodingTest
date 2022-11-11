package Programmers.Lv0.짝수홀수개수;
// [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120824)
public class Solution {
    public int[] solution(int[] num_list) {

        int a = 0;
        int b = 0;

        for(int num : num_list) {
            if(num%2 == 0){
                a++;
            }else {
                b++;
            }
        }

        int[] answer = {a, b};
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        Solution solution = new Solution();

        int[] ANSWER =  solution.solution(num_list);
        System.out.println(ANSWER);
    }
}




