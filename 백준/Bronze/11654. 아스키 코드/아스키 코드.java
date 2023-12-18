import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                InputStream i = System.in;
        ) {
            int asc = i.read();
            System.out.println(asc);
        }
    }
}