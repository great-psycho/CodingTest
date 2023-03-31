import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] cutList = {};
        for (int i=0; i<commands.length; i++) {
            int[] a = commands[i];
            cutList = new int[a[1]-a[0]+1];
            for(int j=0; j<a[1]-a[0]+1; j++) {
                cutList[j] = array[j+a[0]-1];
            }
            Arrays.sort(cutList);
            answer[i] = cutList[a[2]-1];
        }
        return answer;
    }
}