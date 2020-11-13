package CompanyWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company one = new Company(0);

        List<Employee> operatorToHire = new ArrayList<>();

        one.hire(new Operator());// прием операторов по одному

        for (int i = 0; i < 179; i ++){
            operatorToHire.add(new Operator());// прием операторов списком
        }
        one.hireAll(operatorToHire);
        System.out.println("Принято всего - " + one.getEmployeesByType(Operator.class).size() + " операторов");

        List<Employee> managerToHire = new ArrayList<>();

        managerToHire.add(new Manager());//прием менеджеров по одному

        for (int i = 0; i < 79; i ++){//прием менеджеров списком
            managerToHire.add(new Manager());
        }
        one.hireAll(managerToHire);
        System.out.println("Принято всего - " + managerToHire.size() + " менеджеров");

        List<Employee> topManagerToHire = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            topManagerToHire.add(new TopManager());
        }
        one.hireAll(topManagerToHire);
        System.out.println("Принято списком - " + topManagerToHire.size() + " топменеджера");

        System.out.println("Всего принято - " + one.getEmployees().size() + " сотрудников");

        System.out.println("___________________");

        for (Employee employee: one.getTopSalaryStaff(15)){
            System.out.println(employee.getMonthSalary());
        }
        System.out.println("___________________");

        for (Employee employee: one.getLowestSalaryStaff(30)){
            System.out.println(employee.getMonthSalary());
        }
        System.out.println("___________________");

        List<Employee> employeeToFire = new ArrayList<>();
            employeeToFire.addAll(operatorToHire.subList(0, 90));
            employeeToFire.addAll(managerToHire.subList(0, 40));
            employeeToFire.addAll(topManagerToHire.subList(0, 5));
        for (Employee employee: employeeToFire){
            one.fire(employee);
        }
        System.out.println("Всего осталось - " + one.getEmployees().size() + " сотрудников");

        for (Employee employee: one.getTopSalaryStaff(15)){
            System.out.println(employee.getMonthSalary());
        }
        System.out.println("___________________");

        for (Employee employee: one.getLowestSalaryStaff(30)){
            System.out.println(employee.getMonthSalary());
        }





    }

}
