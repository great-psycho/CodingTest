import java.io.*;
import java.util.*;

public class Main {
    static int[] check = new int[4]; // 규칙
    static int[] my = new int[4]; // 현재 상태
    static int checkPass = 0; // 통과해야 할 규칙 수
    static int result = 0; // 결과 갯수

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            char[] A = new char[S]; // DNA 비밀번호

            A = br.readLine().toCharArray();
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<4; i++) { // 규칙 기록
                check[i] = Integer.parseInt(st.nextToken());
                if (check[i] == 0) checkPass++; // 나중에 4가 되면 result 증감 해줘야 하기 때문에 0일때는 미리 계산
            }

            for(int i=0; i<P; i++) {
                Add(A[i]);
            }

            if(checkPass == 4) result++;

            for(int i=P; i<S; i++) {
                int j = i-P;
                Add(A[i]); // 윈도우 마지막 인덱스 추가
                Remove(A[j]); // 윈도우 첫번째 인덱스 삭제
                if(checkPass == 4) result++;
            }
            System.out.println(result);
        }
    }

    private static void Add(char c) {
        switch(c) {
            case 'A':
                my[0]++;
                if(check[0] == my[0]) checkPass++;
                break;
            case 'C':
                my[1]++;
                if(check[1] == my[1]) checkPass++;
                break;
            case 'G':
                my[2]++;
                if(check[2] == my[2]) checkPass++;
                break;
            case 'T':
                my[3]++;
                if(check[3] == my[3]) checkPass++;
                break;
        }
    }

    private static void Remove(char c) {
        switch(c) {
            case 'A':
                if(check[0] == my[0]) checkPass--;
                my[0]--;
                break;
            case 'C':
                if(check[1] == my[1]) checkPass--;
                my[1]--;
                break;
            case 'G':
                if(check[2] == my[2]) checkPass--;
                my[2]--;
                break;
            case 'T':
                if(check[3] == my[3]) checkPass--;
                my[3]--;
                break;
        }
    }
}