import java.io.*;

public class Main {
    static int[] dp;
    static int counta = 1;
    static int countb = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        fin(a);
        fibobottom(a);
        bw.write(counta + " ");
        bw.write(countb + " ");

        br.close();
        bw.close();
    }

    public static int fin(int n) {
        if (n<=2)return 1;
        counta++;
        return fin(n-1)+fin(n-2);
    }
    
    public static int fibobottom(int x) {
        dp = new int[x+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3; i<x+1; i++) {
            dp[i] = dp[i-1]+dp[i-2];
            countb++;
        }
        return dp[x];
    }
}