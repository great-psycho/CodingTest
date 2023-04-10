import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(N));
    }
    public static int fibonacci(int x) {
        if (x<2) return x;
        return fibonacci(x-1) + fibonacci(x-2);
    }
}