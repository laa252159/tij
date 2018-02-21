package gl14.hw.instruments;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    List<Instrument> instruments = Arrays.asList(new Gitar(), new Flute(), new Piano());

    public static void main(String[] args) {
        MainClass mc = new MainClass();
        for(Instrument instrument : mc.instruments){
            instrument.prepare();
            instrument.play();
        }
    }
}
