import java.util.Comparator;
import java.util.List;

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
        //Collections.sort(staff, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));

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
        staff.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));

        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }
}