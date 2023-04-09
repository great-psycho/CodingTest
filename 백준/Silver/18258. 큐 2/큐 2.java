import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] queue = new int[n];
        int front = 0;
        int rear = 0;


        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();

            switch (a) {
                case "push":
                    queue[rear++] = Integer.parseInt(st.nextToken());
                    break;
                case "pop":
                    if (front == rear) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue[front] + "\n");
                        front++;
                    }
                    break;
                case "size":
                    bw.write(rear-front + "\n");
                    break;
                case "empty":
                    int k = front == rear ? 1:0;
                    bw.write(k + "\n");
                    break;
                case "front":
                    if (front == rear){
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue[front] + "\n");
                    }
                    break;
                case "back":
                    if (front == rear){
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue[rear-1] + "\n");
                    }
                    break;
            }
        }
        br.close();
        bw.close();
    }
}