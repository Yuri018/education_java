import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTests {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);

        Integer[] arrayNumbers = {1, 2, 3, 4, 5, 6};
        //kann man einen Stream von einem Array erhalten
        Arrays.stream(arrayNumbers).filter(n -> n % 2 == 0).forEach(System.out::println);

        Stream<String> streamString = Stream.of("ein", "zwei", "drei");
        streamString.sorted().forEach(System.out::println);

//        Stream.iterate(2, n -> n + 2).forEach(System.out::println);

        staff.stream().sorted(Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getName)).forEach(System.out::println);

        System.out.println("_____________________");

        //mit der Reduziermethode
        staff.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
        staff.stream()
                .map(e -> e.getSalary())
                .filter(s -> (s >= 100000 && s <= 130000))
                .reduce((s1, s2) -> s1 + s2)
                .ifPresent(System.out::println);
        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x, y)->x + " " + y);
        System.out.println(sentence);
    }
}
