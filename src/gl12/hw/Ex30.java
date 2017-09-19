package gl12.hw;//: exceptions/Human.java
// Catching exception hierarchies.

class Annoyance extends RuntimeException {
}

class Sneeze extends Annoyance {
}

public class Ex30 {
    public static void main(String[] args) {
        // Catch the exact type:
        try {
            throw new RuntimeException(new Sneeze());
        } catch (RuntimeException re) {
            try {
                throw re.getCause();
            } catch (Sneeze s) {
                System.out.println("Caught Sneeze");
            } catch (Annoyance a) {
                System.out.println("Caught Annoyance");
            } catch (Throwable th) {
                System.out.println(th);
            }
        }
    }
} /* Output:
Caught Sneeze
Caught Annoyance
*///:~
