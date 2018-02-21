package gl14.hw.instruments;

public class Piano implements Instrument {


    @Override
    public void play() {
        System.out.println("play piano");
    }

    @Override
    public void prepare() {
        System.out.println("prepare piano");
    }
}
