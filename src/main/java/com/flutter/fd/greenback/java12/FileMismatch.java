package com.flutter.fd.greenback.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatch {

    static Path createTempPath(String fileName) throws IOException {
        Path tempPath = Files.createTempFile(fileName, ".txt");
        tempPath.toFile().deleteOnExit();

        return tempPath;
    }

    public static void main(String[] args) throws IOException {
        Path filePath1 = createTempPath("test1");
        Path filePath2 = createTempPath("test2");
        Path filePath3 = createTempPath("test3");

        Files.writeString(filePath1, "Life is a progress, and not a station.");
        Files.writeString(filePath2, "Life is a progress, and not a station.");
        Files.writeString(filePath3, "Life is a progress, it's not a station.");

        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println("File1 x File2 = " + mismatch); // match

        mismatch = Files.mismatch(filePath1, filePath3);
        System.out.println("File1 x File3 = " + mismatch); // mismatch
    }


}
