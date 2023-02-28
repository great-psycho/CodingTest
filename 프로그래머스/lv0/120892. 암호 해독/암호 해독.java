class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] word = cipher.split("");
        for (int i=code-1; i<word.length; i+=code) {
            answer.append(word[i]);
        }
        return answer.toString();
    }
}