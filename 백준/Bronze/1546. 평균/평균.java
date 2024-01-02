import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            String a = br.readLine();
            String[] b = a.split(" ");
            int max = 0;
            double sum = 0;

            for(String k : b) {
                max = Math.max(max, Integer.parseInt(k));
            }

            for(String f : b) {
                sum += (Double.parseDouble(f)/max)*100;
            }
            System.out.println(sum/count);
        }
    }
}