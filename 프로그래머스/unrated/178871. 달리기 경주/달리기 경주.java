import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> namemap = new HashMap<>();
        HashMap<Integer, String> rankmap = new HashMap<>();
        
        for (int i=0; i<players.length; i++) {
            namemap.put(players[i], i);
            rankmap.put(i, players[i]);
        }
        
        for (int j=0; j<callings.length; j++) {
            String keep = "";
            int low = namemap.get(callings[j]); 
            int hight = low-1;
            
            keep = rankmap.get(hight);
            
            rankmap.put(low, keep);
            rankmap.put(hight, callings[j]);
            
            namemap.put(callings[j], hight); 
            namemap.put(keep, low); 
        }
        
        for (int k=0; k<rankmap.size(); k++) {
            answer[k] = rankmap.get(k); 
        }
        
        return answer;
    }
}