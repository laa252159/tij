package gl13.hw;

import strings.Splitting;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(Splitting.knights);
        System.out.println(Splitting.knights.replaceAll("(?i)[aeyuio]", "_"));
    }
}
