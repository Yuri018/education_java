import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Movements {

    private String operation;
    private Double expense;
    private Double income;

    public Movements(String pathMovementsCsv) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathMovementsCsv));
            for (String line : lines) {
                String[] fragments = line.split(",");
                if (fragments.length != 8) {
                    System.out.println("Wrong line: " + line);
                }
                expense = Double.parseDouble(fragments[7]);
                income = Double.parseDouble(fragments[8]);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(getExpenseSum());
        System.out.println(income);

    }

    public double getExpenseSum() {
        List<Double> expenseList = new ArrayList<>();
        expenseList.add(getExpense());
        return expenseList.stream()
                .mapToDouble(value -> value)
                .sum();
    }

    public double getIncomeSum() {
        List<Double> incomeSum = new ArrayList<>();
        incomeSum.add(getIncome());
        return incomeSum.stream()
                .mapToDouble(value -> value)
                .sum();
    }

    public String getOperation() {
        return operation;
    }

    public Double getExpense() {
        return expense;
    }

    public Double getIncome() {
        return income;
    }
}
