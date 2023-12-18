import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int result = 0;
            int index = Integer.parseInt(br.readLine());
            String st = br.readLine();
            String[] aa = st.split("");
            for(int i=0; i<index; i++) {
                result += Integer.parseInt(String.valueOf(aa[i]));
            }
            System.out.println(result);
        }
    }
}