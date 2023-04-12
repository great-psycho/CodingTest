import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] result;
    static int count = 2;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        graph = new ArrayList<>();
        result = new int[N+1];

        for (int i=0; i<=N; i++) graph.add(new ArrayList<>()); // 정점 갯수만큼 리스트 크기 및 리스트 넣기

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        for (int i=1; i<=N; i++) graph.get(i).sort(Comparator.reverseOrder());

        queue = new LinkedList<>();
        queue.offer(start);
        result[start] = 1;
        visited[start] = true;
        bfs(queue.poll());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(result[i] + "\n");
        System.out.println(sb);

    }

    public static void bfs(int n) {
        for (int i : graph.get(n)) {
            if(!visited[i]) {
                queue.offer(i);
                visited[i]= true;
                result[i] = count++;
            }
        }
        if(queue.isEmpty())return;
        bfs(queue.poll());
    }
}