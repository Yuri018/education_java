package CompanyWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company one = new Company(0);
        List<Employee> operatorToHire = new ArrayList<>();
        for (int i = 0; i < 180; i ++){
            operatorToHire.add(new Operator());
        }
        one.hireAll(operatorToHire);

        List<Employee> managerToHire = new ArrayList<>();
        for (int i = 0; i < 80; i ++){
            managerToHire.add(new Manager());
        }
        one.hireAll(managerToHire);

        List<Employee> topManagerToHire = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            topManagerToHire.add(new TopManager());
        }
        one.hireAll(topManagerToHire);

        for (Employee employee: one.getTopSalaryStaff(2)){
            System.out.println(employee.getMonthSalary());
        }

        for (Employee employee: one.getLowestSalaryStaff(3)){
            System.out.println(employee.getMonthSalary());
        }

        List<Employee> employeeToFire = new ArrayList<>();
            employeeToFire.addAll(operatorToHire.subList(0, 90));
            employeeToFire.addAll(managerToHire.subList(0, 40));
            employeeToFire.addAll(topManagerToHire.subList(0, 5));
        for (Employee employee: employeeToFire){
            one.fire(employee);
        }

        for (Employee employee: one.getTopSalaryStaff(2)){
            System.out.println(employee.getMonthSalary());
        }

        for (Employee employee: one.getLowestSalaryStaff(3)){
            System.out.println(employee.getMonthSalary());
        }





    }

}
