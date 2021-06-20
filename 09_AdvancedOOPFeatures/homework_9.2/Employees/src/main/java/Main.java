import java.time.ZoneId;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static final String STAFF_TXT = "Employees/data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year
        return staff.stream()
                .filter(employee -> employee.getWorkStart()
                        .toInstant().atZone(ZoneId.systemDefault())
                        .toLocalDate().getYear() == year)
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }
}