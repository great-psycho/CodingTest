import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int a: arr){
            if (a%divisor == 0) {
                arrList.add(a);
            }
        }
        answer = new int[arrList.size()];
        for (int i=0; i<arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        if(arrList.size()==0) {
            answer = new int[1];
            answer[0] = -1;
        }
        Arrays.sort(answer);

        return answer;
    }
}