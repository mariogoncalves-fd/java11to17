package com.flutter.fd.greenback.textBlocks;

public class TextBlocks {
    private static void oldStyle() {
        final String text = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}\n";
        System.out.println(text);
    }

    private static void emptyBlock() {
        final String text = """
            """;
        System.out.println("||" + text + "||");
    }

    private static void jsonBlock() {
        final String text = """
            {
              "name": "John Doe",
              "age": 45,
              "address": "Doe Street, 23, Java Town"
            }
            """;
        System.out.println(text);
    }

    private static void jsonMovedBracketsBlock() {
        final String text = """
              {
                "name": "John Doe",
                "age": 45,
                "address": "Doe Street, 23, Java Town"
              }
            """;
        System.out.println(text);
        System.out.println("123");
    }

    private static void jsonMovedEndQuoteBlock() {
        final String text = """
              {
                "name": "John Doe",
                "age": 45,
                "address": "Doe Street, 23, Java Town"
              }
                   """;
        System.out.println(text);
    }
}
