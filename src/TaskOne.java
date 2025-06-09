import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {

    public void count(List<String> lines) {
        int letter = 0;
        int number = 0;
        int punctuation = 0;

        // Объединяем строки списка в одну строку
        String string = String.join(" ", lines);

        // Создаем образцы регулярных выражений для анализа символов текста
        // Ищем буквы
        Pattern patternLetter = Pattern.compile("[A-Za-z]");
        // Ищем цифры
        Pattern patternNumber = Pattern.compile("\\d");
        // Ищем знаки препинания
        Pattern patternPunctuation = Pattern.compile("\\p{Punct}");

        Matcher matcherLetter = patternLetter.matcher(string);
        Matcher matcherNumber = patternNumber.matcher(string);
        Matcher matcherPunctuation = patternPunctuation.matcher(string);
        while (matcherLetter.find()) {
            letter++;
            // Метод group() возвращает символы, которые попали в выборку
//            System.out.println(matcherLetter.group());
        }
        while (matcherNumber.find()) {
            number++;
//            System.out.println(matcherNumber.group());
        }
        while (matcherPunctuation.find()) {
            punctuation++;
//            System.out.println(matcherPunctuation.group());
        }
        System.out.println("Letters - " + letter + "; numbers - " + number + "; punctuation - "
                + punctuation);
    }
}
