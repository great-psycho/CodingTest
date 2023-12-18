import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            String S = br.readLine();
            int index = Integer.parseInt(br.readLine());
            bw.write(S.charAt(index-1));
            bw.flush();
        }
    }
}