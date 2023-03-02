import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;

        for(int a : array) {
            if (map.containsKey(a)){
                count ++;
            } else {
                count = 1;
            }
            map.put(a, count);
        }

        int max = 0;
        int duplicate = 0;

        for (int a : map.values()) {
            if (a > max) {
                max = a;
                duplicate = 0;
            } else if (a == max) {
                duplicate = -1;
            }
        }

        for(int a : map.keySet()){
            if (map.get(a).equals(max)) {
                answer = a;
            }
        }

        if (duplicate < 0) {
            answer = -1;
        }
        return answer;
    }
}