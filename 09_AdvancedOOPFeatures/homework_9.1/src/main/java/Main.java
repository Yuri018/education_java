import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
//        System.out.println(staff);
        sortBySalaryAndAlphabet(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        // eine variante
        Collections.sort(staff, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
        //zweite variante mit lambda
        //Collections.sort(staff, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));

        //dritte Kurzfassung
        // staff.sort(Comparator.comparing(Employee::getSalary));

        for (Employee employee: staff){
            System.out.println(employee);
        }
    }
}