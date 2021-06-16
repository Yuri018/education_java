import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
    }
    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        // eine variante
//        Collections.sort(staff, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getSalary().compareTo(o2.getSalary());
//            }
//        });
        //zweite variante mit lambda
        //Collections.sort(staff, (o1, o2) -> o1.getSalary()
        // .compareTo(o2.getSalary()));

        //dritte Kurzfassung
        // staff.sort(Comparator.comparing(Employee::getSalary));

//        staff.sort((o1, o2) ->
//        {
//            if (o1.getSalary().equals(o2.getSalary())){
//                return o1.getName().compareTo(o2.getName());
//            }else {
//                return o1.getSalary().compareTo(o2.getSalary());
//            }
//        });

        //Lösung mit Comparator.thenComparing
        staff.sort(Comparator.comparingInt(Employee::getSalary)
                .thenComparing(Employee::getWorkStart));

//        for (Employee employee : staff) {
//            System.out.println(employee);
//        }
        staff.forEach(System.out::println);

//        staff.forEach(employee -> {
//            int salary = employee.getSalary();
//            employee.setSalary(salary + 10000);
//        });
        staff.forEach(employee -> employee.setSalary(employee.getSalary() + 10000));

        System.out.println("------------------");
        staff.forEach(System.out::println);

        System.out.println("------------------");

        // wir machen variante mit Stream

        Stream<Employee> stream = staff.stream();
        stream.filter(employee -> employee.getSalary() >= 100000).forEach(System.out::println);

        //kurze variante
        System.out.println("------------------");
        staff.stream().filter(e -> e.getSalary() >= 110000).forEach(System.out::println);

        //Stream bekommen

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6);
        integerStream.filter(number -> number % 2 == 0).forEach(System.out::println);

        Integer[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers).forEach(System.out::println);
    }
}