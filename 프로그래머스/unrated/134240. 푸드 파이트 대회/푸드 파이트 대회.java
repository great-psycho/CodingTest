import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Stack<Integer> save = new Stack<>();
        
        for (int i=1; i<food.length; i++) {
            for (int j=0; j<food[i]/2; j++) {
                save.push(i);
                sb.append(i);
            }
        }
        sb.append("0");
        while (!save.isEmpty()) {
            sb.append(save.pop());
        }
        answer = String.valueOf(sb);
        return answer;
    }
}