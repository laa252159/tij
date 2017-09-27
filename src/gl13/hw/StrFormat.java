package gl13.hw;

public class StrFormat {
    private int i;
    private float f;
    private long l;
    private double d;

    public StrFormat(int i, float f, long l, double d){
        this.i = i;
        this.f = f;
        this.l = l;
        this.d = d;
    }
    @Override
    public String toString(){
        return String.format("int i = %d float f = %f long l = %d double d = %f", i, f, l, d);
    }

    public static void main(String[] args) {
        StrFormat strFormat = new StrFormat(1, 1.2f, 10, 10.1);
        System.out.println(strFormat);
    }
}
