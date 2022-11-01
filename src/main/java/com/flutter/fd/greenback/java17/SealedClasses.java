package com.flutter.fd.greenback.java17;

public class SealedClasses {

//    A sealed class imposes three important constraints on its permitted subclasses:
//
//    All permitted subclasses must belong to the same module as the sealed class.
//    Every permitted subclass must explicitly extend the sealed class.
//    Every permitted subclass must define a modifier: final, sealed, or non-sealed.


    public sealed interface FruitSealed permits AppleSealed, PearSealed, NutNotSealed {
    }

    public non-sealed class AppleSealed implements FruitSealed {
    }

    public final class PearSealed implements FruitSealed {
    }

    public abstract sealed class NutNotSealed implements FruitSealed permits Almond, Peanut {
    }

    public final class Almond extends NutNotSealed {
    }

    public non-sealed class Peanut extends NutNotSealed {
    }

    public class RoastedPeanut extends Peanut {
    }

//    if (vehicle instanceof Car car) {
//        return car.getNumberOfSeats();
//    } else if (vehicle instanceof Truck truck) {
//        return truck.getLoadCapacity();
//    } else {
//        throw new RuntimeException("Unknown instance of Vehicle");
//    }
}
