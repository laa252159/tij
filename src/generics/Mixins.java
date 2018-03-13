package generics;//: generics/Mixins.java

import java.util.*;

interface TimeStamped {
    long getStamp();
}

class TimeStampedImp implements TimeStamped {
    private final long timeStamp;

    public TimeStampedImp() {
        timeStamp = new Date().getTime();
    }

    public long getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered {
    long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public long getSerialNumber() {
        return serialNumber;
    }
}

interface Basic {
    public void set(String val);

    public String get();
}

class BasicImp implements Basic {
    private String value;

    public void set(String val) {
        value = val;
    }

    public String get() {
        return value;
    }
}

interface Coloreded {
    String color();
}

class ColorodedImpl implements Coloreded {
    final static String[] colors = {"RED", "WHITE", "YELLOW"};

    @Override
    public String color() {
        return colors[new Random().nextInt(3)];
    }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered, Coloreded {
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber =
            new SerialNumberedImp();
    private ColorodedImpl ci = new ColorodedImpl();
    public long getStamp() {
        return timeStamp.getStamp();
    }

    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }

    public String color() {
        return ci.color();
    }
}

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        System.out.println(mixin1.get() + " " +
                mixin1.getStamp() + " " + mixin1.getSerialNumber() + " " + mixin1.color());
        System.out.println(mixin2.get() + " " +
                mixin2.getStamp() + " " + mixin2.getSerialNumber() + " " + mixin1.color());
    }
} /* Output: (Sample)
test string 1 1132437151359 1
test string 2 1132437151359 2
*///:~
