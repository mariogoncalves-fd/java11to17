package com.flutter.fd.greenback.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;

public class TeeingCollectors {

    public static void main(String[] args) {

//        This collector has three arguments
//            — Two collectors and a Bi-function.

        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(summingDouble(i -> i),
                                           counting(),
                                           (sum, n) -> sum / n));

        System.out.println(mean);
    }
}
