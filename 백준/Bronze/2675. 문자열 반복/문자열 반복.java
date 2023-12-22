import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int times = Integer.parseInt(br.readLine());
            ArrayList<String> list = new ArrayList<>(times);

            for (int i=0; i<times; i++) {
                String word_list = br.readLine();
                list.add(word_list);
            }
            for (String k : list) {
                StringTokenizer st = new StringTokenizer(k);
                int count = Integer.parseInt(st.nextToken());
                String word = st.nextToken();
                String[] words = word.split("");

                for(int j=0; j<words.length; j++) {
                    for(int b=0; b<count; b++) {
                        bw.write(words[j]);
                    }
                }
                bw.newLine();
            }
        }
    }
}