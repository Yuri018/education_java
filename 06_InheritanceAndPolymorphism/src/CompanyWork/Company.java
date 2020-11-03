package CompanyWork;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> employees = new ArrayList<>();

    //переменная класса Company, содержит количество сотрудников
    int count;

    //метод найма одного сотрудника
    int hire() {
        return count++;
    }
    //метод найма списка сотрудников
    int hireAll() {
        return 0;
    }
    //метод увольнения сотрудника
    int fire() {
        return count--;
    }


}
