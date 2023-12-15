import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int n = Integer.parseInt(br.readLine());
            String result = "A";
            if (n<60) {
                result = "F";
            } else if (n<70) {
                result = "D";
            } else if (n<80) {
                result = "C";
            } else if (n<90) {
                result = "B";
            }
            bw.write(result);
            bw.flush();
        }
    }
}