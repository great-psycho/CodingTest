import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static long[] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        dp = new long[101];

        for(int i=0; i<dp.length; i++) dp[i]=-1;

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for(int j=0; j<n; j++) {
            sb.append(f(Integer.parseInt(br.readLine()))).append("\n");
        }
        System.out.println(sb);
    }
    public static long f(int n) {
        if(dp[n] == -1) {
            dp[n] = (f(n-1) + f(n-5));
        }
        return dp[n];
    }
}