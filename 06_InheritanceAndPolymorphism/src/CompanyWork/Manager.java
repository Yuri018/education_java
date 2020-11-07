package CompanyWork;

public class Manager implements Employee{

    private Company company;
    private double generatedIncome = 115000 + Math.random() * 25001;

    @Override
    public double getMonthSalary(){
        double fixedSalary = 50000 + (int) (Math.random() * 10000);
        return fixedSalary + (0.05 * company.getIncome());
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
        this.company.increaseIncome(generatedIncome);
    }

    @Override
    public void removeCompany() {
        this.company.decreaseIncome(generatedIncome);
        this.company = null;
    }


}


