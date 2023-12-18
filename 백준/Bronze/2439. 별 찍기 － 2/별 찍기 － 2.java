import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int index = Integer.parseInt(br.readLine());
            for(int k=0; k<=index; k++) {
                if(k != 0){
                    for(int i=index; i>k; i--) {
                        bw.write(" ");
                    }
                }
                for(int j=0; j<k; j++) {
                    bw.write("*");
                }
                if(k != index && k!=0){
                    bw.newLine();
                }
                bw.flush();
            }
        }
    }
}