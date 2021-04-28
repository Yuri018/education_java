package Chapter2Incapsulation.Elevator;

public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown(){
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
    }
     public  void move(int floor){
        if (floor > (currentFloor + 1) && floor < (currentFloor - 1)) {
            System.out.println("Das ist falsch");
        } else {

        }
     }
}
