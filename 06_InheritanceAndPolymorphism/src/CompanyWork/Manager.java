package CompanyWork;

public class Manager implements Employee{

    private final double salary = 60000 + (int) (Math.random() * 10000);

    private Company company;
    private final double generatedIncome = 115000 + Math.random() * 25001;

    @Override
    public double getMonthSalary(){
        return salary + (0.05 * generatedIncome);
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
        this.company.increaseIncome((int) generatedIncome);
    }

    @Override
    public void removeCompany() {
        this.company.decreaseIncome((int) generatedIncome);
        this.company = null;
    }


}


