class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.replace(" ", "_-");
        String[] s1 = s.split("-");
        String[][] s3 = new String[s1.length][];
        for(int i=0; i<s1.length; i++){
            s3[i] = s1[i].split("");
        }
        for(int j=0; j<s3.length; j++) {
            for(int i=0; i<s3[j].length; i++) {
                if (i % 2 == 0) {
                    answer += s3[j][i].toUpperCase();
                }else{
                    answer += s3[j][i].toLowerCase();
                }
            }
        }
        answer = answer.replace("_", " ");
        return answer;
    }
}