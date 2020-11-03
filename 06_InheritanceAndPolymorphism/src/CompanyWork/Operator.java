package CompanyWork;

public class Operator implements Employee{

    @Override
    public double gerMonthSalary() {
        return 50000 + (int) (Math.random() * 10000);
    }
}

