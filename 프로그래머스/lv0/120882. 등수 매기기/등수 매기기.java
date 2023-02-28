class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] average = new int[score.length];

        for (int i=0; i<score.length; i++) {
            average[i] = (score[i][0]+score[i][1])*5;
        }
        for (int i=0; i<average.length; i++) {
            int rank = 1;
            for (int j : average) {
                if(j > average[i]){
                    rank ++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}