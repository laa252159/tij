package gl12.hw;

public class Ex5 {
    private static boolean goAhead = true;

    public static void main(String[] args) {
        int i = 0;

        while(goAhead){
            goAhead = false;
            i++;
            if(i < 5){
                try{
                    throw new Exception("I < 5");
                } catch (Exception e){
                    System.out.println("i = " + i + " : " + e.getMessage());
                    goAhead = true;
                }

            }
        }
        System.out.println("WOW i = " + i);
    }
}
