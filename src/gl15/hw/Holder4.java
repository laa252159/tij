package gl15.hw;

public class Holder4<T> {
    T obj1;
    T obj2;
    T obj3;

    public Holder4(T obj1, T obj2, T obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public T getObj2() {
        return obj2;
    }

    public void setObj2(T obj2) {
        this.obj2 = obj2;
    }

    public T getObj3() {
        return obj3;
    }

    public void setObj3(T obj3) {
        this.obj3 = obj3;
    }

    public static void main(String[] args) {
        Holder4<Number> numbers = new Holder4<>(new Integer(1), new Long(2), new Double(3));
        System.out.println(numbers.getObj1());
        System.out.println(numbers.getObj2());
        System.out.println(numbers.getObj3());
    }
}
