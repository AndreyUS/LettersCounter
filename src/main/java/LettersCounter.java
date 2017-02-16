import java.util.TreeMap;
import java.util.stream.Collectors;

public class LettersCounter {

    private final String inputData;
    private String result;

    private LettersCounter(String inputData) {
        this.inputData = inputData;
    }

    public static LettersCounter create(final String inputData) {
        if (inputData == null) {
            throw new IllegalArgumentException("inputData can't be null");
        }
        return new LettersCounter(inputData);
    }

    public String count() {

        if (result != null) {
            return result;
        }

        result = inputData
                .codePoints()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, TreeMap::new))
                .entrySet()
                .stream()
                .map(entry -> entry.getKey().toString() + entry.getValue().toString())
                .collect(Collectors.joining(""));

        return result;
    }

}
