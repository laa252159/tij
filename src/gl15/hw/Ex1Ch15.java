package gl15.hw;

import generics.Holder3;
import typeinfo.pets.Hamster;
import typeinfo.pets.Manx;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Rodent;

public class Ex1Ch15 {
    public static void main(String[] args) {
        Pet hamster = new Hamster();
        Manx manx = new Manx();
        Rodent mouse = new Mouse();

        Holder3<Pet> pet1 = new Holder3<>(hamster);
        Holder3<Pet> pet2 = new Holder3<>(manx);
        Holder3<Pet> pet3 = new Holder3<>(mouse);
        System.out.println(pet1.get());
        System.out.println(pet2.get());
        System.out.println(pet3.get());

    }
}
