import java.util.Arrays;
import java.util.stream.Collectors;
public class ArrayProcessor {
     static String processArray(String[] inputArray) {
        // Об'єднуємо всі рядки у один рядок, використовуючи роздільник коми
        String concatenatedString = String.join(",", inputArray);

        // Розбиваємо рядок на числа, сортуємо їх і знову об'єднуємо у рядок
        String result = Arrays.stream(concatenatedString.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        return result;
    }
}
