import java.util.*;

class Solution
{
    public int solution(String s)
    {
        String[] b = s.split("");
        Stack<String> stack = new Stack<>();
        for (String a : b) {
            if (!stack.isEmpty() && stack.peek().equals(a)) {
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}