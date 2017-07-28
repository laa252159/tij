package gl12.hw;

public class Ex1 {
    public static void main(String[] args) {
        try {
            throw new Exception("L");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally executed");
        }
    }

}
