import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> list = new HashSet<>();
        
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                list.add(numbers[i]+numbers[j]);
            }
        }
        answer = new int[list.size()];
        
        int count = 0;
        for(int k : list){
            answer[count] = k;
            count ++;
        }
        Arrays.sort(answer);
        return answer;
    }
}