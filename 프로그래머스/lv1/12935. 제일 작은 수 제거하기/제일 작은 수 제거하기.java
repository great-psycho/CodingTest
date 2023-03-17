class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for (int j : arr) {
            if (j <= min) {
                min = j;
            }
        }
        int k = 0;
        for (int j : arr) {
            if (j != min) {
                answer[k] = j;
                k++;
            }
        }
        if (arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}