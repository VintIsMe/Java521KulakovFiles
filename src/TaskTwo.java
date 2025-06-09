import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {

    int numberOfReplacements = 0;

    public void replace(List<String> lines, String target, String replacement) {

        // Объединяем строки списка в одну строку
        String string = String.join(" ", lines);
        String modifiedString = " ";

        // Создаем образец регулярного выражения для поиска слова
        Pattern patternWord = Pattern.compile("gloomy", Pattern.CASE_INSENSITIVE);

        // Создаем объект класса Matcher для поиска совпадений шаблона с текстом
        Matcher matcherWord = patternWord.matcher(string);
        while (matcherWord.find()) {
            modifiedString = string.replaceAll(target, replacement);
            numberOfReplacements++;
        }
        // Выводим текс до замены
        System.out.println(string);
        // Выводим текс после замены
        System.out.println(modifiedString);
        // Выводим информацию о проделанной методом работе
        System.out.println("The word '" + target + "' has been replaced with the word '"
                + replacement + "' " + numberOfReplacements + " times");
    }
}
