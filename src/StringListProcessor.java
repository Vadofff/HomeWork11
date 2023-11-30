import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class StringListProcessor {
    static List<String> processStrings(List<String> inputStrings) {
        return inputStrings.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
}
}
