package Programmers.Lv0.옷가게할인받기;
//[문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/120818) +12점
public class Solution {
    public int solution(int price) {
        int answer = price;

        if(price>=500000){
            answer = (int) (price*0.8);
        }else if(price>=300000){
            answer = (int) (price*0.9);
        }else if(price>=100000){
            answer = (int) (price*0.95);
        }
        return answer;
    }

    public static void main(String[] args) {
        int price = 600000;

        Solution solution = new Solution();
        int ANSWER = solution.solution(price);
        System.out.println(ANSWER);
    }
}
