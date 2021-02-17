package ArithmeticSimulator;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static final int QUESTIONS_AMOUNT = 10;
    public static final int MIN_EXPRESSION_UNIT = 1;
    public static final int MAX_EXPRESSION_UNIT = 20;

    public static void main(String[] args) {

        Game game = new Game(generateQuestions(QUESTIONS_AMOUNT, MIN_EXPRESSION_UNIT, MAX_EXPRESSION_UNIT));

        while (game.hasNextQuestion()) {
            Question question = game.getNextQuestion();
            System.out.print(question.getExpression());
            question.setStudentsAnswer(new Scanner(System.in).nextInt());
        }

        System.out.println(game.getResult());

    }

    private static List<Question> generateQuestions(int questionsAmount, int min, int max) {
        List<Question> questions = new ArrayList<>();
        for (int i = 0; i < questionsAmount; i++) {
            ActionType actionType = ActionType.values()[(int) (Math.random() * ActionType.values().length)];
            questions.add(generateQuestion(actionType, min, max));

        }
        return questions;
    }

    private static Question generateQuestion(ActionType actionType, int min, int max) {
        int first = min + (int) (Math.random() * (max - min));
        int second = min + (int) (Math.random() * (max - min));

        if (actionType == ActionType.DIVISION) {
            Set<Integer> dividers = getSimpleDividers(first)
                    .stream()
                    .filter(d -> d > min)
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
