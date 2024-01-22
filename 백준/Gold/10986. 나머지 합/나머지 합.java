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
            long[] a = new long[N];
            long[] b = new long[M];
            long answer = 0;

            st = new StringTokenizer(br.readLine());
            a[0] = Integer.parseInt(st.nextToken());
            for (int i=1; i<N; i++) {
                a[i] = a[i-1]+Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<N; i++) {
                int result = (int) (a[i]%M);
                if(result == 0) answer++;
                b[result]++;
            }

            for(int i=0; i<M; i++) {
                if(b[i]>1) {
                    answer = answer+(b[i]*(b[i]-1)/2);
                }
            }
            System.out.println(answer);
        }
    }
}