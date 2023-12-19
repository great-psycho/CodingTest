import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = -1000001;
            int min = 1000001;

            for(int i=0; i<count; i++){
                int num = Integer.parseInt(st.nextToken());
                if (num>max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(min + " " + max);
        }
    }
}