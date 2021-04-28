package Chapter2Incapsulation;

public class GearBox {
    /**
     * 0 - neutral
     * -1 - rear
     * 1-6 - go
     */
    private int maxGear = 6;
    private int minGear = 1;
    private int gear = 0;

    public void shirtUp() {// метод не позволяет увеличивать значение скорости более 6
        gear = gear < maxGear ? gear + 1 : gear;
    }

    public void shiftDown() {//метод не позволяет уменьшать значение скорости на несколько значений вниз
        gear = gear > minGear ? gear - 1 : gear;
    }

    public void switchRear() {//метод переключения задней передачи, только с первой передачи
        gear = (gear > 1) ? gear : -1;
    }

    public void switchNeutral() {
        gear = 0;
    }
    public int getCurrentGear() {
        return gear;
    }
}
