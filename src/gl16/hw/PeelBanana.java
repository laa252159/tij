package gl16.hw;

import java.util.ArrayList;
import java.util.List;

public class PeelBanana {
    public static void main(String[] args) {
// Compile error:
//! Peel<Banana>[] a = new Peel<Banana>[10];
        List<Peel<Banana>> a =
                new ArrayList<Peel<Banana>>();
        for (int i = 0; i < 10; i++) {
            a.add(new Peel<Banana>(new Banana(i)));
        }
        for (Peel<Banana> p : a) {
            p.peel();
        }
    }
}

class Banana {
    private final int id;

    Banana(int id) {
        this.id = id;
    }

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Peel<T> {
    T fruit;

    Peel(T fruit) {
        this.fruit = fruit;
    }

    void peel() {
        System.out.println("Peeling " + fruit);
    }
}
