package CompanyWork;

public class Operator implements Employee{

    @Override
    public double getMonthSalary() {
        return 50000 + (int) (Math.random() * 10000);
    }

    @Override
    public void setCompany(Company company) {

    }

    @Override
    public void removeCompany() {

    }
}

