public class TemperatureArray {
    public static void main(String[] args) {
        double[] temperatureArray = new double[30];

        for (int i = 0; i < temperatureArray.length; i++) {
            double temp = 32 + (Math.random() * 8);
            temperatureArray[i] = temp;
        }
        for (int i = 0; i < temperatureArray.length; i++) {
//            System.out.println(temperatureArray[i]);
            System.out.printf("Температура пациента %d: %.1f %n",(i + 1) , temperatureArray[i]);
        }
    }
}
