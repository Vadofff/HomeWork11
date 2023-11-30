import java.util.List;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        // Завдання 1

        List<String> names = List.of("Ivan", "John", "Peter", "Alice", "Bob");
        String formattedNames = OddIndexNamesFormatter.formatOddIndexNames(names);
        System.out.println(formattedNames);

        // Завдання 2

        List<String> inputStrings = List.of("apple", "banana", "orange", "grape", "kiwi");
        List<String> processedStrings = StringListProcessor.processStrings(inputStrings);
        processedStrings.forEach(System.out::println);

        // Завдання 3

        String[] inputArray = {"1, 2, 0", "4, 5"};
        String processedResult = ArrayProcessor.processArray(inputArray);
        System.out.println(processedResult);

        // Завдання 4
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        // Генеруємо стрім випадкових чисел
        Stream<Long> randomStream = LinearCongruentialGenerator.generateRandomStream(42, a, c, m);

        // Обмежуємо стрім та виводимо перші 10 значень
        randomStream.limit(10).forEach(System.out::println);

        // Завдання 5
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4);
        Stream<Integer> secondStream = Stream.of(5, 6, 7);

        Stream<Integer> zippedStream = StreamZipper.zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }
}