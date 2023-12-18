import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int num = Integer.parseInt(br.readLine());
            for (int i=1; i<10; i++) {
                int x = num*i;
                System.out.printf("%d * %d = %d%n", num, i, x);
            }
        }
    }
}