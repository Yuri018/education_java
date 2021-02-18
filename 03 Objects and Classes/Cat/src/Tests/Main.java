package Tests;

import Tests.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processor = new Processor();
        computer.processor.coreCount = 4;
        computer.processor.frequency = 200;

        System.out.println("Laptop " + computer.getName() + " весит " +
                computer.weight(computer.processor.frequency / computer.processor.coreCount) + " килограмм.");
    }
}
