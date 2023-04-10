import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int count = N-1;

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<N; j++){
                int x = Integer.parseInt(st.nextToken());
                heap.offer(x);
            }
        }
        while (count>0){
            heap.poll();
            count--;
        }
        bw.write(heap.remove() + "\n");

        br.close();
        bw.close();
    }
}