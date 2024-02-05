package dev.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        writeOldway("./src/dev/files/test.txt");
//        readOldWay("./src/dev/files/test.txt");

//        writeNewWay("./src/dev/files/test.txt");
        readNewWay("./src/dev/files/stats.csv");

    }

    public static void writeOldway(String path) {
        File file = new File(path);

        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            for (int i = 0; i < 10; i++) {
                fos.write("Hello World!\n".getBytes());
//                Thread.sleep(10_000);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void readOldWay(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            int n = 0;
            String result = new String(fis.readAllBytes());
            System.out.print(result);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void writeNewWay(String path) {
        try {
            Files.write(Paths.get(path),
                    "Hello World1!\n".getBytes(),
                    StandardOpenOption.APPEND,
                    StandardOpenOption.CREATE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readNewWay(String path) {
        try {

            Files.readAllLines(Paths.get(path))
                    .stream()
                    .map(line -> line.split(","))
                    .map(Main::turnInStatistics)
                    .min(Comparator.comparing(Statistics::getVariable_code))
                    .ifPresent(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Statistics turnInStatistics(String[] st) {
        return new Statistics(
                st[0],
                st[1],
                st[2],
                st[3],
                st[4],
                st[5],
                st[6],
                st[7],
                st[8],
                st[9]
        );
    }
}
