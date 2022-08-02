package com.flutter.fd.greenback;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Main {
    public static void main(final String[] args) {
        /*
        Enhanced Switch
        New instanceof
        Type Inference (var)
        Records
        v - Text Blocks
        Sealed Classes
        of for Collections
        Meaningful NullPointerException
        System.out.println("Hello world!");
         */


        //Preview
        //Pattern Matching for switch – like instanceof for switch; switch is an expression and can be assigned
        Object o = new Object();

/*        String result = switch (o) {
            case null -> null;
            case 0 -> throw new RuntimeException("Cannot be 0"); // Special cases
            case Integer i && i > 0 -> "Positive number";
            case Integer i -> "Negative number"; // 0 and positive numbers handled by above rules
            case String s -> s;
            case Point p -> p.toString();
            case int[] ia -> "Array length" + ia.length;
            default -> "Something else";
        };

        String formatted = switch (o) {
            case Integer i && i > 10 -> String.format("a large Integer %d", i);
            case Integer i -> String.format("a small Integer %d", i);
            case Long l    -> String.format("a Long %d", l);
            default        -> o.toString();
        };*/


        // string indent and transform
        final String text = "Hello World!";
        text.indent(4);
        text.indent(-2);
        text.transform(value -> new StringBuilder(value).delete(6, 12).toString());

        // Collectors teeing
        Stream.of(1, 2, 3, 4).
                collect(Collectors.teeing(
                        Collectors.minBy(Integer::compareTo),
                        Collectors.maxBy(Integer::compareTo),
                        (min, max) -> min.get() + max.get()
                ));

        // Stream toList
        Stream.of("a", "b", "c").collect(Collectors.toList());
        Stream.of("a", "b", "c").toList();

    }

}
