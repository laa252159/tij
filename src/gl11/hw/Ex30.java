package gl11.hw;

//import holding.InterfaceVsIterator;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Ex30 implements Collection{
    List<Pet> pets = Arrays.asList(Pets.createArray(8));
    public int size() { return pets.size(); }

    @Override
    public boolean isEmpty() {
        return pets.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return pets.contains(o);
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.size();
            }
            public Pet next() { return pets.get(index++); }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return pets.toArray();
    }

    @Override
    public boolean add(Object o) {
        return pets.add((Pet) o);
    }

    @Override
    public boolean remove(Object o) {
        return pets.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return pets.addAll(c);
    }

    @Override
    public void clear() {
        pets.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return pets.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return pets.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return containsAll(c);
    }

    @Override
    public Pet[] toArray(Object[] a) {
        return (Pet[])a;
    }

    public static void main(String[] args) {
//        Ex30 c = new Ex30();
//        InterfaceVsIterator.display(c);
//        InterfaceVsIterator.display(c.iterator());
    }

}
