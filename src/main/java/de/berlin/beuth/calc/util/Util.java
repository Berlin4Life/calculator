package de.berlin.beuth.calc.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Util {

   public static String readFileAsText(String fileName) throws IOException {
       Path fileNameAsPath = Path.of(fileName);
       String fileAsString = Files.readString(fileNameAsPath);

       return fileAsString;

    }
}
