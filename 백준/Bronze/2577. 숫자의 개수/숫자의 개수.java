import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());

            long result = (long) a*b*c;

            String sre = String.valueOf(result);
            int zero = 0;
            int one = 0;
            int two = 0;
            int three = 0;
            int four = 0;
            int five = 0;
            int six = 0;
            int seven = 0;
            int eight = 0;
            int nine = 0;

            for(int i=0; i<sre.length(); i++){
                String w = String.valueOf(sre.charAt(i));
                if (w.equals("0")) {
                    zero++;
                }if (w.equals("1")) {
                    one++;
                }if (w.equals("2")) {
                    two++;
                }if (w.equals("3")) {
                    three++;
                }if (w.equals("4")) {
                    four++;
                }if (w.equals("5")) {
                    five++;
                }if (w.equals("6")) {
                    six++;
                }if (w.equals("7")) {
                    seven++;
                }if (w.equals("8")) {
                    eight++;
                }if (w.equals("9")) {
                    nine++;
                }
            }
            System.out.println(zero);
            System.out.println(one);
            System.out.println(two);
            System.out.println(three);
            System.out.println(four);
            System.out.println(five);
            System.out.println(six);
            System.out.println(seven);
            System.out.println(eight);
            System.out.println(nine);
        }
    }
}