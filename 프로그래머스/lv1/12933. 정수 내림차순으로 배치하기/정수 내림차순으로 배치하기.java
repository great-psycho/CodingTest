import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sanswer = new StringBuilder();
        String num = String.valueOf(n);
        String[] numList = num.split("");
        Arrays.sort(numList, Collections.reverseOrder());
        for(String a : numList) {
            sanswer.append(a);
        }
        answer = Long.parseLong(String.valueOf(sanswer));
        return answer;
    }
}