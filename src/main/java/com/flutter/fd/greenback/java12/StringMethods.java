package com.flutter.fd.greenback.java12;

public class StringMethods {

    public static void main(String[] args) {
//        whenPositiveArgument_thenReturnIndentedString();
//        whenNegativeArgument_thenReturnReducedIndentedString();
//        whenTransformUsingLamda_thenReturnTransformedString();
        whenTransformUsingParseInt_thenReturnInt();

    }

    public static void whenPositiveArgument_thenReturnIndentedString() {
        String multilineStr = "This is\na multiline\nstring.";
        String outputStr = "   This is\n   a multiline\n   string.\n";

        String postIndent = multilineStr.indent(3);

        System.out.println(outputStr);
        System.out.println(postIndent);
    }

    public static void whenNegativeArgument_thenReturnReducedIndentedString() {
        String multilineStr = "   This is\n   a multiline\n   string.";
        String outputStr = " This is\n a multiline\n string.\n";

        String postIndent = multilineStr.indent(-2);

        System.out.println(outputStr);
        System.out.println(postIndent);
    }

    public static void whenTransformUsingLamda_thenReturnTransformedString() {
        String result = "hello".transform(input -> input + " world!");
        System.out.println(result);
    }

    public static void whenTransformUsingParseInt_thenReturnInt() {
        int result = "42".transform(Integer::parseInt);

        System.out.println(result + 10);
    }
}
