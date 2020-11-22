package CompanyWork;

import java.util.*;

public class Company {

    private double income;
    private final List<Employee> employees = new ArrayList<>();

    public Company(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    //method of hiring a single employee
    public void hire(Employee employeeToHire) {
        employeeToHire.setCompany(this);
        employees.add(employeeToHire);
    }

    //method for hiring a list of employees
    public void hireAll(List<Employee> employeesToHire) {
        for (Employee listOfNewEmployees : employeesToHire) {
            hire(listOfNewEmployees);
        }
    }

    //method for dismissing an employee
    public void fire(Employee employeeToFire) {
        employeeToFire.removeCompany();
        employees.remove(employeeToFire);

    }

    //list of employees with high salaries
    List<Employee> getTopSalaryStaff(int count) {
        employees.sort(new EmployeeComparator());
        if (count <= 0) {
            return Collections.emptyList();
        } else if (count > employees.size()) {
            return employees;
        }
        return employees.subList(0, count);
    }

    //list of employees with low salaries
    List<Employee> getLowestSalaryStaff(int count) {
        employees.sort(new EmployeeComparator().reversed());
        if (count <= 0) {
            return Collections.emptyList();
        } else if (count > employees.size()) {
            return employees;
        }
        return employees.subList(0, count);
    }

    //method for calculating company revenue
    public void increaseIncome(int newIncome) {
        income += newIncome;
    }

    //method for calculating the company's income after dismissal
    public void decreaseIncome(int newIncome) {
        income -= newIncome;
    }

    //the method of calculation adopted by employees in classes
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
