import java.io.*;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];

            for(int i=0; i<N; i++) {
                A[i] = Integer.parseInt(br.readLine());
            }
            for(int i=0; i<N-1; i++) {
                for(int j=0; j<N-1-i; j++) {
                    if(A[j] > A[j+1]) {
                        int tem = A[j+1];
                        A[j+1] = A[j];
                        A[j] = tem;
                    }
                }
            }
            for(int i=0; i<N; i++) {
                System.out.println(A[i]);
           }
        }
    }
}