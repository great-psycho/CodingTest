import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i=0; i<N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x>0) {
                heap.add(x);
            } else {
                Integer ans = heap.poll();
                bw.write((ans==null? 0:ans) + "\n");
            }
        }
        br.close();
        bw.close();
    }
}