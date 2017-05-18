package gl10.hw;


import java.util.Date;

public class Ex21 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();
        b.addU(a.u());
        b.addU(a.u());
        b.addU(a.u());
        b.addU(a.u());
        b.act();
//       b.addU(a.u());
//       b.act();
//       b.delete(0);
//       b.delete(3);

    }
}

interface Iterable {
    boolean end();

    void next();

    Object current();
}

interface U {
    void a();

    void b();

    void c();
}

class A {
    private int counter;

    private int getCounter() {
        return counter++;
    }

    public U u() {
        System.out.println(counter + "!!!" + new Date());
        return new U() {
            private int id = getCounter();

            public void a() {
               System.out.println("a" + id + new Date());
            }

            public void b() {
                System.out.println("b" + id + new Date());
            }

            public void c() {
                System.out.println("c" + id + new Date());
            }
        };
    }
}

class B {
    U[] us = new U[3];
    private int capacity = us.length;

    public void addU(U u) {
        if (capacity > 0) {
            for (int i = 0; i < us.length; i++) {
                if (us[i] == null) {
                    us[i] = u;
                }
            }
        }
    }

    public void delete(int position) {
        for (int i = 0; i < us.length; i++) {
            if (i == position - 1) {
                us[i] = null;
            }
        }
    }

    public void act() throws InterruptedException {
        for (U u : us) {
            u.a();
            Thread.currentThread().sleep(1000);
            u.b();
            Thread.currentThread().sleep(1000);
            u.c();
            Thread.currentThread().sleep(1000);
        }
    }

    class Iterator implements Iterable {
        public boolean end() {
            return false;
        }

        public void next() {
        }

        public Object current() {
            return null;
        }
    }

    public Iterable getIterator() {
        return new Iterator();
    }

}
