import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskThree {

    public void writeAll(List<String> l1, List<String> l2, List<String> l3, List<String> l4) {

        // Превращаем список строк в одну строку
        String s1 = String.join(" ", l1);
        String s2 = String.join(" ", l2);
        String s3 = String.join(" ", l3);
        String s4 = String.join(" ", l4);

        String s234 = s2 + s3 + s4;
        String result = s1 + s234;
        Path path = Paths.get("fTask3Result.txt");
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Don't worry, this file already exists, you may keep working");
        } catch (IOException e) {
            System.out.println("Sorry, something went wrong with the " + e.getMessage());
        }

        try {
            Files.writeString(path, result);
            System.out.println("The number of bytes is - "
                    + Files.size(Paths.get("fTask3Result.txt")));
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
        System.out.println("The result is - " + result);
    }
}
