import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            double n0 = Double.parseDouble(st.nextToken());
            double n1 = Double.parseDouble(st.nextToken());
            System.out.println(n0/n1);
        }
    }
}