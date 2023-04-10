import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }
    public static long factorial(long x) {
        if (x==0) return 1;
        return x * factorial(x-1);
    }
}