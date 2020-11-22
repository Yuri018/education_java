package CompanyWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company one = new Company(0);

        List<Employee> operatorToHire = new ArrayList<>();//list of accepted employees of operators

        one.hire(new Operator());// receiving operators one at a time

        for (int i = 0; i < 179; i++) {
            operatorToHire.add(new Operator());// accepting list operators
        }
        one.hireAll(operatorToHire);
        System.out.println("Принято всего - " + one.getEmployeesByType(Operator.class).size() + " операторов");

        List<Employee> managerToHire = new ArrayList<>();//list of accepted employees managers

        one.hire(new Manager());//receiving managers one at a time

        for (int i = 0; i < 79; i++) {//receiving managers with a list
            managerToHire.add(new Manager());
        }
        one.hireAll(managerToHire);
        System.out.println("Принято всего - " + one.getEmployeesByType(Manager.class).size() + " менеджеров");


        one.hire(new TopManager());//accepting top managers one at a time
        List<Employee> topManagerToHire = new ArrayList<>();//list of accepted top managers
        for (int i = 0; i < 9; i++) {
            topManagerToHire.add(new TopManager());
        }
        one.hireAll(topManagerToHire);//accepting top managers with a list
        System.out.println("Принято всего - " + one.getEmployeesByType(TopManager.class).size() + " топменеджеров");

        System.out.println("Принято всего - " + one.getEmployees().size() + " сотрудников");

        System.out.printf("%s %.0f %s %n", "Доход компании ", one.getIncome(), "\u20bd");

        System.out.println("\nСписок самых высоких зарплат в компании");

        for (Employee employee : one.getTopSalaryStaff(15)) {
            System.out.printf("%.0f %s %n", employee.getMonthSalary(), "\u20bd");
        }

        System.out.println("\nСписок самых низких зарплат в компании");

        for (Employee employee : one.getLowestSalaryStaff(30)) {
            System.out.printf("%.0f %s %n", employee.getMonthSalary(), "\u20bd");
        }

        //list of employees to be dismissed by class
        List<Employee> employeeToFire = new ArrayList<>();
        employeeToFire.addAll(operatorToHire.subList(0, 90));
        employeeToFire.addAll(managerToHire.subList(0, 40));
        employeeToFire.addAll(topManagerToHire.subList(0, 5));
        for (Employee employee : employeeToFire) {
            one.fire(employee);
        }
        System.out.println("\nКоличество сотрудников после сокращения - " + one.getEmployees().size() + " человек");
        System.out.printf("\n%s %.0f %s %n", "Доход компании ", one.getIncome(), "\u20bd");
        System.out.println("\nСписок самых высоких зарплат в компании");

        for (Employee employee : one.getTopSalaryStaff(15)) {
            System.out.printf("%.0f %s %n", employee.getMonthSalary(), "\u20bd");
        }
        System.out.println("\nСписок самых низких зарплат в компании");

        for (Employee employee : one.getLowestSalaryStaff(30)) {
            System.out.printf("%.0f %s %n", employee.getMonthSalary(), "\u20bd");
        }
    }
}
