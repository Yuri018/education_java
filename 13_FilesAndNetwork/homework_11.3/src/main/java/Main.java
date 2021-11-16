public class Main {

    public static final String PATH_TO_FILE = "files/movementList.csv";

    public static void main(String[] args) {

        Movements movements = new Movements(PATH_TO_FILE);
        System.out.println("Сумма расходов: " + movements.getExpenseSum() + " руб.");
        System.out.println("Сумма доходов: " + movements.getIncomeSum() + " руб.");
        movements.groupExpense();

    }
}
