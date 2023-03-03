import java.util.Objects;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        String upper = s.toUpperCase();
        for (String a : upper.split("")) {
            if (Objects.equals(a, "P")) {
                count ++;
            }else if(Objects.equals(a, "Y")) {
                count --;
            }
        }
        return answer = count == 0 ;
    }
}