import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String S = br.readLine();
            int[] A = new int[S.length()]; // 배열 생성

            for(int i=0; i<S.length(); i++) { // 배열에 저장
                A[i] = Integer.parseInt(S.substring(i, i+1)); // i~i+1 까지 자르기
            }
            for(int i=0; i<S.length(); i++) {
                int Max=i; // 최댓값 인덱스
                for(int j=i+1; j<S.length(); j++) { // 값 순회
                    if(A[j] > A[Max]){
                        Max=j; // 값이 큰 인덱스 저장
                    }
                }
                if(A[i] < A[Max]) { // swap
                    int temp = A[i];
                    A[i] = A[Max];
                    A[Max] = temp;
                }
            }
            for(int i=0; i<S.length(); i++) {
                System.out.print(A[i]);
            }
        }
    }
}