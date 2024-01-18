import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int question = Integer.parseInt(st.nextToken());
            long[] list = new long[count+1];

            st = new StringTokenizer(br.readLine());

            for(int i=1; i<=count; i++){
                list[i] = Integer.parseInt(st.nextToken()) + list[i-1];
            }

            for(int j=0; j<question; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                System.out.println(list[b]-list[a-1]);
            }
        }
    }
}