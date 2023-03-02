import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int i =0;
        while (true) {
            String num = String.valueOf(i);
            if (i%3 == 0 || num.contains("3")){
                i++;
                continue;
            }
            list.add(i);
            i++;
            if (list.size() == n) {
                break;
            }
        }

        answer = list.get(n-1);

        return answer;
    }
}