package gl12.hw;

import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        Random random = new Random();
        int var;
            for (int i = 0 ; i < 20 ; i++){
                try {
                    var = random.nextInt(3);
                    generate(var);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
    }

    private static void generate(int var) throws Exception{
        switch (var){
            case 0 : throw new MyExOne("1 :)");
            case 1 : throw new MyExTwo("2 :(");
            case 2 : throw new MyExThree("3 :[");

        }
    }
}

class MyExOne extends Exception {
    public MyExOne(String str) {
        super(str);
    }
}


class MyExTwo extends Exception {
    public MyExTwo(String str) {
        super(str);
    }
}


class MyExThree extends Exception {
    public MyExThree(String str) {
        super(str);
    }
}
