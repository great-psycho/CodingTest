import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            if (b>0){
                stack.push(b);
                answer +=b;
            } else {
                answer -= stack.pop();
            }
        }
        bw.write(answer+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}