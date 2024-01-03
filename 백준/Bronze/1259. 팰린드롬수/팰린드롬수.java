import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            List<String> list = new ArrayList<>();

            while(true) {
                String k = br.readLine();
                if(k.equals("0")) {
                    break;
                }
                list.add(k);
            }

            for(String a : list) {
                String[] sl1 = a.split("");
                int lng = sl1.length;
                int count = lng/2;
                String result = "yes";
                for(int i=0; i<count; i++) {
                    if(sl1[i].equals(sl1[lng-i-1])) {
                        result = "yes";
                    } else {
                        result = "no";
                        break;
                    }
                }
                System.out.println(result);
            }
        }
    }
}