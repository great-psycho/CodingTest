import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] arr;
    static int N, M;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        f(0);

        System.out.println(sb);
    }

    public static void f(int depth) {
        //인덱스가 마지막 위치에 도달하면 수열 sb에 저장
        if(depth == M) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append('\n');
            return;
        }
        // 1부터 ~ N개의 수를 선택
        for(int i=1; i<=N; i++) {
            arr[depth] = i; //해당 위치에 i를 넣는다.
            f(depth+1); //위치를 1증가 시키고 재귀
        }
    }
}