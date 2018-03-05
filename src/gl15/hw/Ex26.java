package gl15.hw;

public class Ex26 {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
        numbers[1] = new Integer(1);
        System.out.println("numbers[1] = new Integer(1) DONE");
        try {
            numbers[0] = new Number() {
                @Override
                public int intValue() {
                    return 0;
                }

                @Override
                public long longValue() {
                    return 0;
                }

                @Override
                public float floatValue() {
                    return 0;
                }

                @Override
                public double doubleValue() {
                    return 0;
                }
            };
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
