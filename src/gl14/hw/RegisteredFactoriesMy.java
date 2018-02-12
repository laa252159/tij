package gl14.hw;//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part2 {
  public String toString() {
    return getClass().getSimpleName();
  }
  static List<Class<? extends Part2>> partFactories =
    new ArrayList<Class<? extends Part2>>();
  static {
    // Collections.addAll() gives an "unchecked generic
    // array creation ... for varargs parameter" warning.
    partFactories.add(FuelFilter.class);
    partFactories.add(AirFilter.class);
    partFactories.add(CabinAirFilter.class);
    partFactories.add(OilFilter.class);
    partFactories.add(FanBelt.class);
    partFactories.add(PowerSteeringBelt.class);
    partFactories.add(GeneratorBelt.class);
  }
  private static Random rand = new Random(47);
  public static Part2 createRandom() {
    int n = rand.nextInt(partFactories.size());
    Part2 part2 = null;
    try {
      part2 =  partFactories.get(n).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    return part2;
  }
}

class Filter extends Part2 {}//

class FuelFilter extends Filter {
  // Create a Class Factory for each specific type:
  public static class Factory
  implements typeinfo.factory.Factory<FuelFilter> {
    public FuelFilter create() { return new FuelFilter(); }
  }
}

class AirFilter extends Filter {
  public static class Factory
  implements typeinfo.factory.Factory<AirFilter> {
    public AirFilter create() { return new AirFilter(); }
  }
}

class CabinAirFilter extends Filter {
  public static class Factory
  implements typeinfo.factory.Factory<CabinAirFilter> {
    public CabinAirFilter create() {
      return new CabinAirFilter();
    }
  }
}

class OilFilter extends Filter {
  public static class Factory
  implements typeinfo.factory.Factory<OilFilter> {
    public OilFilter create() { return new OilFilter(); }
  }
}

class Belt extends Part2 {}

class FanBelt extends Belt {
  public static class Factory
  implements typeinfo.factory.Factory<FanBelt> {
    public FanBelt create() { return new FanBelt(); }
  }
}

class GeneratorBelt extends Belt {
  public static class Factory
  implements typeinfo.factory.Factory<GeneratorBelt> {
    public GeneratorBelt create() {
      return new GeneratorBelt();
    }
  }
}

class PowerSteeringBelt extends Belt {
  public static class Factory
  implements typeinfo.factory.Factory<PowerSteeringBelt> {
    public PowerSteeringBelt create() {
      return new PowerSteeringBelt();
    }
  }
}

public class RegisteredFactoriesMy {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++)
      System.out.println(Part2.createRandom());
  }
} /* Output:
GeneratorBelt
CabinAirFilter
GeneratorBelt
AirFilter
PowerSteeringBelt
CabinAirFilter
FuelFilter
PowerSteeringBelt
PowerSteeringBelt
FuelFilter
*///:~
