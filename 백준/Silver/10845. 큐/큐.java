import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> queue = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            if (a.equals("push")) {
                queue.add(Integer.parseInt(st.nextToken()));
            } else if (a.equals("pop")) {
                if (queue.size() ==0 ){
                    bw.write(-1 + "\n");
                } else {
                    bw.write(queue.get(0) + "\n");
                    queue.remove(0);
                }
            } else if (a.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (a.equals("empty")) {
                int k = queue.isEmpty()? 1:0;
                bw.write(k + "\n");
            } else if (a.equals("front")) {
                if (queue.size() == 0 ){
                    bw.write(-1 + "\n");
                } else {
                    bw.write(queue.get(0) + "\n");
                }
            } else if (a.equals("back")) {
                if (queue.size() == 0 ){
                    bw.write(-1 + "\n");
                } else {
                    bw.write(queue.get(queue.size()-1) + "\n");
                }
            }
        }
        br.close();
        bw.close();
    }
}