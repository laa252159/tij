package gl15.hw;//: generics/RandomList.java

import java.util.ArrayList;
import java.util.Random;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Rat;

public class RandomListEx6<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomListEx6<String> rsStrs = new RandomListEx6<String>();
        for (String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" ")) {
            rsStrs.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.print(rsStrs.select() + " ");
        }

        System.out.println();


        RandomListEx6<Integer> rsInts = new RandomListEx6<>();

        for (int i = 0; i < 10; i++) {
            rsInts.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(rsInts.select() + " ");
        }

        System.out.println();

        RandomListEx6<Pet> rsPets = new RandomListEx6<>();
        rsPets.add(new Mouse());
        rsPets.add(new Cat());
        rsPets.add(new Rat());
        rsPets.add(new Dog());

        for (int i = 0; i < 10; i++) {
            System.out.print(rsPets.select() + " ");
        }
    }
} /* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
