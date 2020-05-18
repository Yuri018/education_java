public class TemperatureArray {
    public static void main(String[] args) {
        double[] temperatureArray = new double[30];
        double sum = 0;
        double average = 0;

        for (int i = 0; i < temperatureArray.length; i++) {
            double temp = 32 + (Math.random() * 8);
            temperatureArray[i] = temp;
            sum += temperatureArray[i];
            average = sum / temperatureArray.length;
        }
        for (int i = 0; i < temperatureArray.length; i++) {
            System.out.printf("Пациент %d: %.1f\u00B0C; %n",(i + 1) , temperatureArray[i]);
        }
        System.out.printf("Средняя температура: %.1f\u00B0C", average);
    }
}
