package CompanyWork;

public class Manager implements Employee{

    @Override
    public double gerMonthSalary(){
        return (50000 + (int) (Math.random() * 10000)) + (0.05 * income());
    }

    public double income(){
        return 115000 + (int) (Math.random() * 25001);
    }

}


