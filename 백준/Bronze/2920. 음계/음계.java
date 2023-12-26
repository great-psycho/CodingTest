import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            String result = "mixed";
            int asc = 1;
            int desc = 8;
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0; i<8; i++) {
                int token = Integer.parseInt(st.nextToken());
                if (token == asc) {
                    result = "ascending";
                    asc++;
                    desc = 0;
                } else if(token == desc) {
                    result = "descending";
                    desc--;
                    asc = 0;
                } else {
                    result = "mixed";
                    asc = 0;
                    desc = 0;
                }
            }
            bw.write(result);
            bw.flush();
        }
    }
}