package CompanyWork;

public class TopManager implements Employee {

    private Company company;


    @Override
    public double getMonthSalary() {
        double fixedSalary = 50000 + (int) (Math.random() * 10000);
        double bonus = fixedSalary * 1.5;
        if (company.getIncome() >= 10000000) {
            return fixedSalary + bonus;
        }
        return fixedSalary;
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
