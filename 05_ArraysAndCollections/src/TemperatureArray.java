public class TemperatureArray {
    public static void main(String[] args) {
        double[] temperatureArray = new double[30];
        double sum = 0;
        double average = 0;
        double temp = 0;

        for (int i = 0; i < temperatureArray.length; i++) {
            temperatureArray[i] = 32 + (Math.random() * 8);
//            temperatureArray[i] = temp;
            sum += temperatureArray[i];
            average = sum / temperatureArray.length;
            if (temperatureArray[i] >= 36.2 && temperatureArray[i] <= 36.9){
                temp = temperatureArray[i];
//                System.out.printf("Здоровые пациенты %d: %.1f\u00B0C;", (i + 1),temperatureArray[i]);
            }
        }
        for (int i = 0; i < temperatureArray.length; i++) {
            System.out.printf("Пациент %d: %.1f\u00B0C; %n",(i + 1) , temperatureArray[i]);
        }
        System.out.printf("Средняя температура: %.1f\u00B0C %n", average);
        System.out.println(temp);
    }
}
