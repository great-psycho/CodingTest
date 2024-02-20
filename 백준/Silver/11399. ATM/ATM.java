import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] A = new int[N];
            int[] S = new int[N];

            for(int i=0; i<N; i++) {
                A[i] = Integer.parseInt(st.nextToken()); // 3 1 4 3 2
            }
            for(int i=1; i<N; i++) { // A 배열 전체 순회
                int in_point = i; // 삽입 위치
                int in_val = A[i]; // 삽입 value
                for(int j=i-1; j>=0; j--) {
                    if(A[j] < A[i]){ // 앞의 값이 더 작으면 삽입 위치 저장
                        in_point = j+1;
                        break;
                    }
                    if(j==0) in_point = 0;
                }
                for(int j=i; j>in_point; j--) { // 삽입 위치 까지 값들 뒤로 밀기
                    A[j] = A[j-1];
                }
                A[in_point] = in_val; // 값 넣기
            }
            S[0] = A[0];
            for(int i=1; i<N; i++) {
                S[i] = S[i-1]+A[i]; // 합 배열 만들기
            }

            int sum =0;
            for(int i=0; i<N; i++) {
                sum += S[i];
            }
            System.out.println(sum);
        }
    }
}