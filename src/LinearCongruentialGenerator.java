import java.util.stream.Stream;
public class LinearCongruentialGenerator {
    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, xn -> (a * xn + c) % m);
    }
}