package CompanyWork;

public class Operator implements Employee {

    private final double salary = 40000 + (int) (Math.random() * 10000);

    @Override
    public double getMonthSalary() {
        return salary;
    }

    @Override
    public void setCompany(Company company) {

    }

    @Override
    public void removeCompany() {

    }
}

