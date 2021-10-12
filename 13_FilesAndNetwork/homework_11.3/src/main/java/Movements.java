import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Movements {

//    private String operation;
    private Double expense = 0.0;
    private Double income = 0.0;

    public Movements(String pathMovementsCsv) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathMovementsCsv));
            for (String line : lines) {
                line = line.replaceAll("\"", "");
//                String s = removeLastComma(line);

                String[] fragments = line.split(",");
                if (Objects.equals(fragments[0], "Тип счёта")){
                    continue;
                }
                if (fragments.length != 8) {
                    System.out.println("Wrong line: " + line);
                }


                expense += Double.parseDouble(fragments[6]);
                System.out.println(expense);
                income += Double.parseDouble(fragments[7]);
//                System.out.println(income);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(getExpenseSum());
//        System.out.println(getIncome());

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

//    public String getOperation() {
//        return operation;
//    }

    public Double getExpense() {
        return expense;
    }

    public Double getIncome() {
        return income;
    }
    public String removeLastComma(String s){
        int i = s.lastIndexOf(',');
        char point = '.';
        return s.substring(0, i) + point + s.substring(i + 1);
    }
}

