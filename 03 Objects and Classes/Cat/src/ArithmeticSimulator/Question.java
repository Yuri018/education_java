package ArithmeticSimulator;

public class Question {
    private final int firstNumber;
    private final int secondNumber;
    private final ActionType actionType;
    private int studentsAnswer;

    public Question(int firstNumber, int secondNumber, ActionType actionType) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.actionType = actionType;
    }

    public void setStudentsAnswer(int studentsAnswer) {// метод для записи ответов студентов
        this.studentsAnswer = studentsAnswer;
    }

    public boolean isProper(){//метод проверки правильности ответа
        return studentsAnswer == getProperAnswer();
    }

    public int getProperAnswer() {// метод возвращает ответы
        switch (actionType){
            case ADDITION:
                return firstNumber + secondNumber;
            case SUBTRACTION:
                return firstNumber - secondNumber;
            case MULTIPLICATION:
                return firstNumber * secondNumber;
            case DIVISION:
                return firstNumber / secondNumber;
        }
        throw new RuntimeException("ActionType not existed");//вместо return возвращает Exception
    }

    public String getExpression(){
        return getFirstNumber() + getActionType().getSing() + getSecondNumber() + "=";
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public int getStudentsAnswer() {
        return studentsAnswer;
    }
}
