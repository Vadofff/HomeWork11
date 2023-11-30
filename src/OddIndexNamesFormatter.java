import java.util.List;
public class OddIndexNamesFormatter {
    static String formatOddIndexNames(List<String> names) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i += 2) {
            result.append((i + 1)).append(". ").append(names.get(i));
            if (i < names.size() - 2) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}
