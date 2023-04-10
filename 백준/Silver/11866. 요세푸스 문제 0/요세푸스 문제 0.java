import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i=1; i<N+1; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder("<");
        while (!queue.isEmpty()){
            for(int i=0; i<K; i++) {
                if (i == K-1) {
                    sb.append(queue.poll());
                    sb.append(", ");
                } else {
                    queue.offer(queue.poll());
                }
            }
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");

        System.out.println(sb);

        br.close();
    }
}