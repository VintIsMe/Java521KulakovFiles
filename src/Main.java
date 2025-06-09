import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskOne taskOne = new TaskOne();
        TaskTwo taskTwo = new TaskTwo();
        TaskThree taskThree = new TaskThree();

        // todo: Задание 1:
        //       Пользователь вводит с клавиатуры путь к файлу.
        //       Программа считывает содержимое файла.
        //       Программа анализирует содержимое файла и подсчитывает количество букв,
        //       чисел и знаков препинания.
        //       Программа выводит на экран количество букв, чисел и знаков препинания в файле.
/*
        // Создаем файл, с которым будем работать
        Path pathTask1 = Paths.get("fileTask1.txt");
        try {
            Files.createFile(pathTask1);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Don't worry, this file already exists, you may keep working");
        } catch (IOException e) {
            System.out.println("Sorry, something went wrong with the " + e.getMessage());
        }

        // Записываем в созданный файл строки, которые будем анализировать
        List<String> listOfLinesTaskTwo = Arrays.asList("There is no time to delay, 1 - yes; 2 - no.",
                "Here's your stuff, my friend, 5 pencils.",
                "He's got 4 cars, she's got 6 but toy ones and 1 real.");
        try {
            Files.write(pathTask1, listOfLinesTaskTwo, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Something went wrong with " + e.getMessage());
        }

        System.out.println("Input the path to the file");
        Path userPathToFile = Path.of(scanner.nextLine());
        if (userPathToFile.equals(pathTask1)) {
            try {
                List<String> linesTaskOne = Files.readAllLines(userPathToFile);
                taskOne.count(linesTaskOne);
            } catch (IOException e) {
                System.out.println("Something went wrong with " + e.getMessage());
            }
        } else {
            System.out.println("You either have input a wrong path or there is no such file");
        }
*/

        // todo: Задание 2:
        //       Пользователь с клавиатуры вводит путь к файлу, искомое слово и слово для замены.
        //       Программа открывает файл и ищет искомое слово в его содержимом.
        //       Если слово найдено, программа заменяет его на указанное слово.
        //       Программа подсчитывает количество произведенных замен.
        //       Программа выводит на экран отчет о количестве замен.


        // todo: меняю слово "gloomy" на слово "bright" три замены
/*
        // Создаем файл, с которым будем работать
        Path pathTask2 = Paths.get("fileTask2.txt");
        try {
            Files.createFile(pathTask2);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Don't worry, this file already exists, you may keep working");
        } catch (IOException e) {
            System.out.println("Sorry, something went wrong with the " + e.getMessage());
        }

        // Записываем в созданный файл строки, которые будем анализировать
        List<String> listOfLinesTaskTwo = Arrays.asList("She is a gloomy person.",
                "What a gloomy story he has told us.", "He took a gloomy view of everything.");
        try {
            Files.write(pathTask2, listOfLinesTaskTwo, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Something went wrong with " + e.getMessage());
        }

        System.out.println("Input a target word");
        String targetWord = scanner.nextLine();

        System.out.println("Input a word replacement");
        String wordReplacement = scanner.nextLine();

        System.out.println("Input the path to the file");
        Path userPathToFile = Path.of(scanner.nextLine());

        if (userPathToFile.equals(pathTask2)) {
            try {
                List<String> linesTaskTwo = Files.readAllLines(userPathToFile);
                taskTwo.replace(linesTaskTwo, targetWord, wordReplacement);
            } catch (IOException e) {
                System.out.println("Something went wrong with " + e.getMessage());
            }
        } else {
            System.out.println("You either have input a wrong path or there is no such file");
        }
 */

        // todo: Задание 3:
        //       Пользователь вводит с клавиатуры пути к четырем файлам.
        //       Программа открывает каждый из четырех файлов и считывает их содержимое.
        //       Программа записывает содержимое трех файлов в четвертый файл.
        //       Программа подсчитывает количество перенесенных байт.
        //       Программа выводит на экран отчет о количестве перенесенных байт.

        // Создаем файлы, с которыми будем работать
        Path pTask3One = Paths.get("fTask3One.txt");
        Path pTask3Two = Paths.get("fTask3Two.txt");
        Path pTask3Three = Paths.get("fTask3Three.txt");
        Path pTask3Four = Paths.get("fTask3Four.txt");
        try {
            Files.createFile(pTask3One);
            Files.createFile(pTask3Two);
            Files.createFile(pTask3Three);
            Files.createFile(pTask3Four);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Don't worry, this file already exists, you may keep working");
        } catch (IOException e) {
            System.out.println("Sorry, something went wrong with the " + e.getMessage());
        }

        // Записываем в созданный файл строки, которые будем анализировать
        List<String> list1TaskThree = Arrays.asList("1", "2", "3 ");
        List<String> list2TaskThree = Arrays.asList("4", "5", "6 ");
        List<String> list3TaskThree = Arrays.asList("7", "8", "9 ");
        List<String> list4TaskThree = Arrays.asList("10", "11", "12");
        try {
            Files.write(pTask3One, list1TaskThree, StandardCharsets.UTF_8);
            Files.write(pTask3Two, list2TaskThree, StandardCharsets.UTF_8);
            Files.write(pTask3Three, list3TaskThree, StandardCharsets.UTF_8);
            Files.write(pTask3Four, list4TaskThree, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Something went wrong with " + e.getMessage());
        }

        System.out.println("Input four paths to the files: ");
        Path userPathToFile1 = Path.of(scanner.nextLine());
        Path userPathToFile2 = Path.of(scanner.nextLine());
        Path userPathToFile3 = Path.of(scanner.nextLine());
        Path userPathToFile4 = Path.of(scanner.nextLine());

        if (userPathToFile1.equals(pTask3One) && userPathToFile2.equals(pTask3Two)
                && userPathToFile3.equals(pTask3Three) && userPathToFile4.equals(pTask3Four)) {
            try {
                List<String> lines1 = Files.readAllLines(pTask3One);
                List<String> lines2 = Files.readAllLines(pTask3Two);
                List<String> lines3 = Files.readAllLines(pTask3Three);
                List<String> lines4 = Files.readAllLines(pTask3Four);
                taskThree.writeAll(lines1, lines2, lines3, lines4);
            } catch (IOException e) {
                System.out.println("Something went wrong with " + e.getMessage());
            }
        } else {
            System.out.println("You either have input a wrong path or there is no such file");
        }
    }
}