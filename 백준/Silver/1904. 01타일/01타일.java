import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int[] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[1000001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<dp.length; i++){
            dp[i] = -1;
        }
        System.out.println(f(n));
    }
    public static int f(int n) {
        if(dp[n] == -1){
            dp[n] = (f(n-1) + f(n-2)) % 15746;
        }
        return dp[n];
    }
}