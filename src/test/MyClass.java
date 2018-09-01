package test;

public class MyClass implements Cloneable{
    class NonStaticClass {
        private int a;
        class D {
            class R{
                class T{
                    class Y{
                        class W{

                        }
                    }
                }
            }
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Faf
    private MyClass makeClone() {
        try {
            return (MyClass) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.makeClone());


    }
}
