package CompanyWork;

import java.util.*;

public class Company {

    private double income;

    public Company(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    //метод найма одного сотрудника
    void hire(Employee employeeToHire) {
        employeeToHire.setCompany(this);
        employees.add(employeeToHire);
    }

    //метод найма списка сотрудников
    void hireAll(List<Employee> employeesToHire) {
        for (Employee x : employeesToHire) {
            x.setCompany(this);
        }
        employees.addAll(employeesToHire);
    }

    //метод увольнения сотрудника
    void fire(Employee employeeToFire) {
        employeeToFire.removeCompany();
        employees.remove(employeeToFire);

    }

    //список сотрудников с высокими зарплатами
    List<Employee> getTopSalaryStaff(int count) {
        employees.sort(new EmployeeComparator());
        if (count <= 0) {
            return new ArrayList<>();
        } else if (count > employees.size()) {
            return employees;
        }
        return employees.subList(0, count);
    }

    //список сотрудников с низкими зарплатами
    List<Employee> getLowestSalaryStaff(int count) {
        employees.sort(new EmployeeComparator());
        Collections.reverse(employees);
        if (count <= 0) {
            return new ArrayList<>();
        } else if (count > employees.size()) {
            return employees;
        }
        return employees.subList(0, count);
    }

    //метод расчета дохода компании
    public void increaseIncome(int newIncome) {
        income += newIncome;
    }

    //метод расчета дохода компании после увольнения
    public void decreaseIncome(int newIncome) {
        income -= newIncome;
    }

    //метод подсчета принятых сотрудников по классам
    public List<Employee> getEmployeesByType(Class<? extends Employee> clazz) {
        List<Employee> result = new ArrayList<>();
        for (Employee x : employees) {
            if (x.getClass().equals(clazz)) {
                result.add(x);
            }
        }
        return result;
    }

}
