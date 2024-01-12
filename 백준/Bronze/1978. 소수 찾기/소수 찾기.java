import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int n = 1000;
            boolean[] a = new boolean[n+1];

            for(int i=0; i<a.length; i++) {
                a[i] = true;
            }
            a[0] = a[1] = a[1000] = false;

            for(int j=2; j<n; j++) {
                if(a[j]){
                    for(int k=j*j; k<n; k+=j) {
                        a[k] = false;
                    }
                }
            }
            
            int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;
            
            for (int l=0; l<count; l++) {
                if(a[Integer.parseInt(st.nextToken())]) result ++;
            }
            System.out.println(result);
        }
    }
}