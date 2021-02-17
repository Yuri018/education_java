package ArithmeticSimulator;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static final int QUESTIONS_AMOUNT = 10;
    public static final int MIN_EXPRESSION_UNIT = 1;
    public static final int MAX_EXPRESSION_UNIT = 20;

    public static void main(String[] args) {

        Game game = new Game(generateQuestions());

        while (game.hasNextQuestion()) {
            Question question = game.getNextQuestion();
            System.out.print(question.getExpression());
            question.setStudentsAnswer(new Scanner(System.in).nextInt());
        }

        System.out.println(game.getResult());

    }

    private static List<Question> generateQuestions() {
        List<Question> questions = new ArrayList<>();
        for (int i = 0; i < Main.QUESTIONS_AMOUNT; i++) {
            ActionType actionType = ActionType.values()[(int) (Math.random() * ActionType.values().length)];
            questions.add(generateQuestion(actionType));

        }
        return questions;
    }

    private static Question generateQuestion(ActionType actionType) {
        int first = Main.MIN_EXPRESSION_UNIT + (int) (Math.random() * (Main.MAX_EXPRESSION_UNIT - Main.MIN_EXPRESSION_UNIT));
        int second = Main.MIN_EXPRESSION_UNIT + (int) (Math.random() * (Main.MAX_EXPRESSION_UNIT - Main.MIN_EXPRESSION_UNIT));

        if (actionType == ActionType.DIVISION) {
            Set<Integer> dividers = getSimpleDividers(first)
                    .stream()
                    .filter(d -> d > Main.MIN_EXPRESSION_UNIT)
                    .collect(Collectors.toSet());
            second = new ArrayList<>(dividers).get((int) (Math.random() * dividers.size()));
        }

        return new Question(first, second, actionType);
    }

    private static Set<Integer> getSimpleDividers(int first) {
        Set<Integer> dividers = new HashSet<>();
        dividers.add(1);
        dividers.add(first);

        for (int i = 2; i <= first / 2; i++) {
            if (first % i == 0) {
                dividers.add(i);
            }
        }
        return dividers;
    }

}
