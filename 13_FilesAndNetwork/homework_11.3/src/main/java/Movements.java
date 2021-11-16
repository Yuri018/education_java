import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Movements {

    public List<Double> income = new ArrayList<>();
    public List<Double> expense = new ArrayList<>();
    public List<String> groupName = new ArrayList<>();

    public Movements(String pathMovementsCsv) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathMovementsCsv));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                int indexOf = line.indexOf("MCC");
                if (fragments.length == 1 && indexOf > 0) {
                    String fragmentSearch = line.substring(indexOf);
                    fragmentSearch = fragmentSearch.substring(fragmentSearch.indexOf(",") + 1);

                    //Получаем Приход
                    String incomeString;
                    if (fragmentSearch.charAt(0) != '"') {
                        incomeString = fragmentSearch.substring(0, fragmentSearch.indexOf(","));
                    } else {
                        incomeString = fragmentSearch.substring(1, fragmentSearch.indexOf("\","));
                        incomeString = incomeString.replaceAll(",", ".");
                    }
                    income.add(Double.parseDouble(incomeString));

                    //Получаем Расход
                    String expenseString;
                    if (fragmentSearch.charAt(fragmentSearch.length() - 1) != '"') {
                        expenseString = fragmentSearch.substring(fragmentSearch.lastIndexOf(",") + 1);
                    } else {
                        expenseString = fragmentSearch.substring(fragmentSearch.indexOf(",\"") + 2, fragmentSearch.length() - 1);
                        expenseString = expenseString.replaceAll(",", ".");
                    }
                    expense.add(Double.parseDouble(expenseString));

                    //Получаем название организации
                    String lineUnfit = line.replace("/", "\\");
                    int indexBeginName = lineUnfit.lastIndexOf("\\");
                    if (indexBeginName > 0) {
                        lineUnfit = lineUnfit.substring(indexBeginName);
                        int indexEndName = lineUnfit.indexOf("   ");
                        String name = lineUnfit.substring(1, indexEndName);
                        groupName.add(name);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getExpenseSum() {
        return expense.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public double getIncomeSum() {
        return income.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public void groupExpense() {
        double sum = 0;
        System.out.println("Суммы расходов по организациям: ");

        //Формируем уникальный список организаций
        ArrayList<String> organizations = (ArrayList<String>) groupName.stream()
                .distinct()
                .collect(Collectors.toList());

        for (String organization : organizations) {
            for (int i = 0; i < groupName.size(); i++) {
                if (organization.equals(groupName.get(i))) {
                    sum = sum + expense.get(i);
                }
            }
            System.out.println(organization + "   " + sum + " руб.");
            sum = 0;
        }
    }
}
