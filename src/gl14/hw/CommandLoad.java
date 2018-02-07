package gl14.hw;

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}


class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class CommandLoad {
    static String pack = "gl14.hw.";
    public static void main(String[] args) throws Exception {
        for(String className : args){
            Class.forName(pack + className);
        }
    }
}
