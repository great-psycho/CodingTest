import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
        String answer = "";
        String pattern = "[A-Z]";
        String bstr = "";
        String sstr = "";
        for (String str : s.split("")) {
            if (Pattern.matches(pattern, str)){
                bstr = bstr.concat(str);
            } else {
                sstr = sstr.concat(str);
            }
        }
        sstr = Stream.of(sstr.split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
        bstr = Stream.of(bstr.split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
        answer = sstr.concat(bstr);
        return answer;
    }
}