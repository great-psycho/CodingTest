class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tl = t.length();
        int pl = p.length();
        
        for(int i=0; i<=tl-pl; i++) {
            String s = t.substring(i, i+pl);
            if(Long.parseLong(s) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}