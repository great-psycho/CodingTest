class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int startNum = 0;
        while (true) {
            for (int i=0; i<num; i++) {
                answer[i] = i+startNum;
            }
            if (sum(answer) > total) {
                startNum --;
            } else if (sum(answer) < total) {
                startNum ++;
            } else if (sum(answer) == total) {
                break;
            }
        }
        return answer;
    }

    public int sum(int[] array) {
        int addAll = 0;
        for (int i : array) {
            addAll += i;
        }
        return addAll;
    }
}