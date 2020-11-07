package CompanyWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {


    private double income;

    public Company(double income) {
        this.income = income;
    }

    List<Employee> employees = new ArrayList<>();

    //переменная класса Company, содержит количество сотрудников
//    int count;

    //метод найма одного сотрудника
    void hire(Employee employeeToHire) {
        employeeToHire.setCompany(this);
        employees.add(employeeToHire);
    }
    //метод найма списка сотрудников
    void hireAll(List<Employee> employeesToHire) {
        for (Employee x: employeesToHire){
            x.setCompany(this);
        }
        employees.addAll(employeesToHire);
    }
    //метод увольнения сотрудника
    void fire(Employee employeeToFire) {
        //желательна проверка наличия сотрудника в списке сотрудников
        employeeToFire.removeCompany();
        employees.remove(employeeToFire);

    }
    public double getIncome(){
        return income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    List<Employee> getTopSalaryStaff(int count){
        employees.sort(new EmployeeComparator());
        if (count <= 0){
           return new ArrayList<>();
        }else if (count > employees.size()){
            return employees;
        }
        return employees.subList(0, count);
    }
    List<Employee> getLowestSalaryStaff(int count){
        employees.sort(new EmployeeComparator());
        Collections.reverse(employees);
        if (count <= 0){
            return new ArrayList<>();
        }else if (count > employees.size()){
            return employees;
        }
        return employees.subList(0, count);
    }

    public void increaseIncome(double newIncome){
        income += newIncome;
    }

    public void decreaseIncome(double newIncome){
        income -= newIncome;
    }

}
