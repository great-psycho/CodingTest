import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int N = Integer.parseInt(br.readLine()); // 수열 크기
            int[] A = new int[N]; // 원소를 담는 수열
            int[] result = new int[N]; // 정답 원소 수열

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++) { // A[] = {3,5,2,7}
                A[i] = Integer.parseInt(st.nextToken());
            }

            Stack<Integer> stack = new Stack<>();

            stack.push(0); // 첫 원소 채우기 0
            for(int i=1; i<N; i++) {
                while (!stack.empty() && A[stack.peek()] < A[i]) { // 비어 있지 않고 Top 인덱스(0)의 값랑 비교
                    result[stack.pop()] = A[i]; // result[0] = 5 , stack = []
                }
                stack.push(i); // stack = [1]
            }
            while (!stack.empty()) { // stack 이 비어 있지 않으면 -1로 채우기
                result[stack.pop()] = -1;
            }
            for(int i=0; i<N; i++) {
                bw.write(result[i]+" ");
            }
            bw.write("\n");
            bw.flush();
        }
    }
}