package CompanyWork;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Operator operator = new Operator();
        System.out.println(operator.gerMonthSalary());
        System.out.println(manager.income());
        System.out.println(manager.gerMonthSalary());
    }

}
