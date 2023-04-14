import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static boolean[] visited;
    static int[] arr;
    static int N, M;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        arr = new int[M];
        f(0);

        System.out.println(sb);
    }

    public static void f(int index) {
        if(index == M) {
            for(int i=0; i<M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i=1; i<=N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            arr[index] = i;
            f(index+1);
            visited[i] = false;
        }
    }
}