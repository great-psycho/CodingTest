import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] result;
    static int count = 2;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        graph = new ArrayList<>();
        result = new int[N+1];

        for (int i=0; i<=N; i++) graph.add(new ArrayList<>());

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        for (int i=1; i<=N; i++) Collections.sort(graph.get(i));

        visited[start] = true;
        result[start] = 1;
        dfs(start);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(result[i] + "\n");
        System.out.println(sb);

    }
    public static void dfs(int start) {
        for (int i : graph.get(start)) {
            if(!visited[i]){
                result[i] = count++;
                visited[i] = true;
                dfs(i);
            }
        }
    }
}