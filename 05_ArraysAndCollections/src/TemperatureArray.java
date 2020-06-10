public class TemperatureArray {
    public static void main(String[] args) {
        double[] temperatureArray = new double[30];
        double sum = 0;
        double average = 0;
        double temp = 0;

//        System.out.println("Пациенты с нормальной температурой: ");
        for (int i = 0; i < temperatureArray.length; i++) {
            temperatureArray[i] = 32 + (Math.random() * 8);
            sum += temperatureArray[i];
            average = sum / temperatureArray.length;
//            if (temperatureArray[i] >= 36.2 && temperatureArray[i] <= 36.9){
//                System.out.printf("Пациент %d: %.1f\u00B0C; %n", (i + 1),temperatureArray[i]);
//            }
        }
        System.out.println("Температура каждого пациента: ");
        for (int i = 0; i < temperatureArray.length; i++) {
            System.out.printf("Пациент %d: %.1f\u00B0C; %n",(i + 1) , temperatureArray[i]);
            if (temperatureArray[i] >= 36.2 && temperatureArray[i] <= 36.9){
                System.out.println("Пациенты с нормальной температурой: ");
                System.out.printf("Пациент %d: %.1f\u00B0C; %n", (i + 1),temperatureArray[i]);
            }
        }
        System.out.printf("Средняя температура: %.1f\u00B0C %n", average);
//        System.out.printf("Здоровые пациенты %.1f\u00B0C; %n",temp);
    }
}
