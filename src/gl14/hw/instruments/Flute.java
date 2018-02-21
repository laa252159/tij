package gl14.hw.instruments;

public class Flute implements Instrument {
    @Override
    public void play() {
        System.out.println("play flute");
    }

    @Override
    public void prepare() {
        clearSpitValve();
    }

    private void clearSpitValve(){
        System.out.println("clear spit valve");
    }
}
