class Solution {
    public String solution(String s) {
        String answer = "";
        String[] slength = s.split("");
        if(slength.length%2 ==0) {
            answer = slength[slength.length/2-1]+slength[slength.length/2];
        }else {
            answer = slength[slength.length/2];
        }
        return answer;
    }
}