package ArithmeticSimulator;

import java.util.List;

public class Game {
    private final List<Question> questions;
    int currentQuestion;

    public Game(List<Question> questions) {
        this.questions = questions;
    }

    public boolean hasNextQuestion(){
        return currentQuestion < questions.size();
    }
    public Question getNextQuestion() {
        return questions.get(currentQuestion++);
    }

    public boolean isOver() {
        return !hasNextQuestion();
    }

    public String getResult() {
        if (!isOver()) {
            return "Игра не завершена! Результаты можно получить после ответов на все вопросы ";
        }

        StringBuilder result = new StringBuilder();

        for (Question q : questions) {
            String answer = q.getExpression() + q.getStudentsAnswer();
            answer += q.isProper() ? " - верно!" : " - неверно! правильный ответ: " + q.getProperAnswer();
            result.append(answer).append("\n");
        }

        return result.toString();
    }
}

