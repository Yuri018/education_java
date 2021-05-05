package Chapter2Incapsulation.Elevator;

public class Elevator {

    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
        System.out.println("Вы на " + getCurrentFloor() + " этаже.");
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
        System.out.println("Вы на " + getCurrentFloor() + " этаже.");
    }

    public void move(int floor) {

        if (floor != (currentFloor + 1) || floor > maxFloor) {
            if (floor != (currentFloor - 1) || floor < minFloor) {
                printError();
            } else {
                moveDown();
            }
        } else {
            moveUp();
        }
    }

    public void printError() {
        System.out.println("Задан неверный этаж. Вы на " + currentFloor + " этаже.");
    }
}
