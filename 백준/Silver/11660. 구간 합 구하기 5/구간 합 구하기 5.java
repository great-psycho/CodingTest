import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] A = new int[N+1][N+1];
            int[][] B = new int[N+1][N+1];
            for(int i=1; i<=N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=1; j<=N; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int k=1; k<=N; k++) {
                for(int l=1; l<=N; l++) {
                    B[k][l] = B[k-1][l]+B[k][l-1]-B[k-1][l-1]+A[k][l];
                }
            }
            for(int i=0; i<M; i++) {
                st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());
                int result = B[x2][y2]-B[x1-1][y2]-B[x2][y1-1]+B[x1-1][y1-1];
                System.out.println(result);
            }

        }
    }
}