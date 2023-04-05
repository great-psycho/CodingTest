import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // 엔터 기준으로 쪼갬
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String b = st.nextToken();

            if (b.equals("push")) {
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (b.equals("pop")) {
                if (stack.size() == 0) {
                    bw.write(-1 + "\n");
                }else {
                    bw.write(stack.get(stack.size()-1)+ "\n");
                    stack.remove(stack.size()-1);
                }
            } else if (b.equals("size")) {
                bw.write(stack.size()+ "\n");
            } else if (b.equals("empty")) {
                int em = stack.size() == 0 ? 1:0;
                bw.write(em+ "\n");
            } else if (b.equals("top")) {
                int tem = stack.size() == 0 ? -1:stack.get(stack.size()-1);
                bw.write(tem+ "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}