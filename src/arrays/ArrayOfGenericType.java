package arrays;//: arrays/ArrayOfGenericType.java
// Arrays of generic types won't compile.

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenericType<T> {
    T[] array; // OK

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        List<T> list = new ArrayList<T>();
        //! array = new T[size]; // Illegal
        array = (T[]) new Object[size]; // "unchecked" Warning
    }
    // Illegal:
    //! public <U> U[] makeArray() { return new U[10]; }
} ///:~
