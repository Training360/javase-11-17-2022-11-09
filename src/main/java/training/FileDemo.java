package training;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {

    public static void main(String[] args) {
        // File helyett Path típust használjunk
        String content = "Hello World";
        Path path = Path.of("index.txt");
        try {
            Files.writeString(path, content, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Can not write file", e);
        }

        try (var writer = Files.newBufferedWriter(path)) {
            writer.write("Hello World");
        } catch (IOException e) {
            throw new RuntimeException("Can not write file", e);
        }
    }
}
