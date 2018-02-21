package gl14.hw.instruments;

public class Gitar implements Instrument {

    @Override
    public void play() {
        System.out.println("Play gitar");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare gitar");
    }
}
