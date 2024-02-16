import java.io.*;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int N = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) -> { // 음수 -> 스왑
                int first_abs = Math.abs(o1); // 절댓값
                int second_abs = Math.abs(o2); // 절댓값
                if(first_abs == second_abs)
                    return o1>o2 ? 1:-1; //o1<o2 인 경우 스왑
                else
                    return first_abs - second_abs; // first_abs < second_abs 음수인 경우 스왑 한다.
            });

            for(int i=0; i<N; i++) {
                int re = Integer.parseInt(br.readLine());
                if(re == 0) {
                    if(queue.isEmpty())
                        System.out.println("0");
                    else
                        System.out.println(queue.poll()); // 최솟값 출력
                } else {
                   queue.add(re); // 값 추가
                }
            }
        }
    }
}