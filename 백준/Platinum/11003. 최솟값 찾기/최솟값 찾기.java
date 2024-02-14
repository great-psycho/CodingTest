import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 데이터
            int L = Integer.parseInt(st.nextToken()); // 윈도우 길이
            st = new StringTokenizer(br.readLine());
            Deque<Node> mydeque = new LinkedList<>(); // 덱

            for(int i=0; i<N; i++) { // 데이터 만큼 반복
                int now = Integer.parseInt(st.nextToken()); // 현재 다루는 값

                while (!mydeque.isEmpty() && mydeque.getLast().value > now) { // 덱이 비어 있지 않거나, 마지막 값이 현재 값보다 큰 경우
                    mydeque.removeLast(); // 마지막 값 제거
                }
                mydeque.addLast(new Node(now,i)); // 값 추가
                
                if(mydeque.getFirst().index <= i-L) { // 윈도우 길이를 벗어난 첫번째 값 삭제
                    mydeque.removeFirst();
                }
                bw.write(mydeque.getFirst().value + " ");
            }
            bw.flush();
            bw.close();
        }
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}