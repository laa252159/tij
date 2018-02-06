package gl13.hw;

import java.util.Scanner;

public class Ch13Ex20 {

    public Ch13Ex20(String str) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(str);
            this.i = scanner.nextInt();
            this.f = scanner.nextFloat();
            this.d = scanner.nextDouble();
        } finally {
            scanner.close();
        }
    }

    private int i;
    private float f;
    private double d;

    public static void main(String[] args) {
        Ch13Ex20 sc20 = new Ch13Ex20("1 2.0 3");
        System.out.println(sc20);
    }

    @Override
    public String toString() {
        return String.format("Int : %s , Float : %s , Double : %s", i, f, d);
    }
}
