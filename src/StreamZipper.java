import java.util.stream.Stream;
public class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        return Stream.concat(first, second)
                .filter(e -> first.iterator().hasNext() && second.iterator().hasNext())
                .flatMap(e -> Stream.of(first.iterator().next(), second.iterator().next()));
    }
}
