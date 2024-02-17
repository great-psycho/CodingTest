import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int N = Integer.parseInt(br.readLine()); // 5
            mData[] A = new mData[N]; // 10 1 5 2 3

            for(int i=0; i<N; i++) {
                A[i] = new mData(Integer.parseInt(br.readLine()), i); // (10,0), (1,1), (5,2), (2,3), (3,4)
            }
            Arrays.sort(A); // (1,1), (2,3), (3,4), (5,2), (10,0)
            int Max = 0;
            for(int i=0; i< N; i++) {
                if (Max < A[i].index - i) {
                    Max = A[i].index - i;
                }
            }
            System.out.println(Max + 1); // 마지막 swap이 안도는 for문도 계산
        }
    }
}
class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super(); // 부모의 생성자를 호출 하여 초기화
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}