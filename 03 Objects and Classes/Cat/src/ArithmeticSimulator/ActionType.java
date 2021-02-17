package ArithmeticSimulator;

public enum ActionType { // фиксированный набор объектов
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private final String sing;

    ActionType(String sing) {
        this.sing = sing;
    }

    public String getSing() {
        return sing;
    }
}
