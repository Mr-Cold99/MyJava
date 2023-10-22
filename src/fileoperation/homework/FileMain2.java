package fileoperation.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import  java.nio.file.Files;

public class FileMain2 {
    public static void main(String[] args) throws IOException {


        try(Scanner scanner = new Scanner(System.in)) {
            String con = scanner.nextLine();
            Files.write(Path.of("test3.txt"), con.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        /// я не дуже зрозумів процес створення і запису в файл






        if (Files.exists(Path.of("test3.txt"))) {
            try {
                List<String> lines = Files.readAllLines(Path.of("test3.txt"), StandardCharsets.UTF_8);

                for (String line : lines) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
