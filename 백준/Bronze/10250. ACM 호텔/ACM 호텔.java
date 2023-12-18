import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st;
            int count = Integer.parseInt(br.readLine());
            StringBuilder re = new StringBuilder();
            for(int i=0; i<count; i++) {
                st = new StringTokenizer(br.readLine());
                int H = Integer.parseInt(st.nextToken());
                int W = Integer.parseInt(st.nextToken());
                int N = Integer.parseInt(st.nextToken());

                int a = N/H; // 정수 1 2
                int b = H*a; // 호수 6 60
                int c = N-b; // 층수 4 12

                int result = H*100 + a;
                if (c != 0) {
                    result = c*100 + a+1;
                }

                re.append(result);

                if (i != count-1) {
                    re.append("\n");
                }
            }
            System.out.println(re);
        }
    }
}