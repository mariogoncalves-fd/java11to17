package com.flutter.fd.greenback.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

    public static void main(String[] args) {
        numberFormatShort();
        numberFormatLong();
        numberFormatLongPt();

    }

    public static void numberFormatShort() {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));
    }

    public static void numberFormatLong() {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));
    }

    public static void numberFormatLongPt() {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.forLanguageTag("PT"), NumberFormat.Style.LONG);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));
    }
}
