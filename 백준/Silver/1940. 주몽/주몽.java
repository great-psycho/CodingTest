import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];

            for(int i=0; i<N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int count = 0;
            int i=0;
            int j=N-1;

            while (i < j) {
                if(arr[i]+arr[j] < M) {
                    i++;
                } else if(arr[i]+arr[j] > M) {
                    j--;
                } else if(arr[i]+arr[j] == M) {
                    i++;
                    j--;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}