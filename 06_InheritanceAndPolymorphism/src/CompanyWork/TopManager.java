package CompanyWork;

public class TopManager implements Employee {

    private Company company;

    private final double salary = 30000 + (int) (Math.random() * 10000);


    @Override
    public double getMonthSalary() {
        double bonus = salary * 1.5;
        if (company.getIncome() >= 10000000) {
            return salary + bonus;
        }
        return salary;
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public void removeCompany() {
        setCompany(null);
    }
}
