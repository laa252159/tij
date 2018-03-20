package gl16.hw;

public class Gl16Ex8 {
    public static void main(String[] args) {
        Object[] objects = new Integer[4];
        objects[0] = new Integer(1);
//!        objects[1] = new String("");
//!        objects[2] = new Double(1);

        Integer[] integers = (Integer[])objects;

        Object[] objects2 = new Object[4];
        objects2[0] = new Integer(1);
        objects2[1] = new String("");
        objects2[2] = new Double(1);

        for(Object obj : objects2){
            if(obj != null){
                System.out.println(obj.getClass().getSimpleName());
            }
        }

    }
}
