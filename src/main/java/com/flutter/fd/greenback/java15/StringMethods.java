package com.flutter.fd.greenback.java15;

public class StringMethods {

    public static void main(String[] args) {
//        formatted();
//        stripIndent();
        translateEscapes();

    }

    public static void formatted() {
        String str = "1) %s 2) %s 3) %s ";
        String formatted = str.formatted("Java", "Python", "JavaScript");

        System.out.println(formatted);
    }

    public static void stripIndent() {
        System.out.println("   123".stripIndent());
        System.out.println("123   ".stripIndent());
        System.out.println("   12  3   ".stripIndent());
    }

    public static void translateEscapes() {
        String input = "Hey, \\n This is not normally a line break.";
        System.out.println(input);

        String output = input.translateEscapes();
        System.out.println(output);
    }
}
