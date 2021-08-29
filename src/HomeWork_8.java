import java.nio.charset.StandardCharsets;

public class HomeWork_8  {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = new String("s2");
        String s3 = new String(s2);

        char[] symbols = { 'A', 'B', 'C'};
        String s4 = new String(symbols);

        byte[] bytes = {65,66,64};
        String s5 = new String (bytes);
        String s6 = new String(bytes, StandardCharsets.UTF_16);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        String s7 = "Десять: " + (5 + 5);
        System.out.println(s7);

        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < 300000; i++) {
        sb.append("a");
        }
        long endTime = System.nanoTime();
        float result = (endTime - startTime) * 0.000000001f;
        System.out.println(result);
        new MyWindow();
    }
}
