public class Temperature {
    static final int PATIENT_COUNT = 30;
    static final float TEMP_MIN = 32.0f;
    static final float TEMP_MAX = 40.0f;
    static final float HEALTHY_TEMP_MIN = 36.2f;
    static final float HEALTHY_TEMP_MAX = 36.9f;

    public static void main(String[] args) {
        float[] temperatureArray = new float[PATIENT_COUNT];
        float tempAverage = 0;
        int tempHealthy = 0;
        float sum = 0;

        for (int i = 0; i < temperatureArray.length; i++) {
            temperatureArray[i] = (float) (Math.random() * (TEMP_MAX - TEMP_MIN) + TEMP_MIN);
            if (temperatureArray[i] >= HEALTHY_TEMP_MIN & temperatureArray[i] <= HEALTHY_TEMP_MAX){
                tempHealthy++;
            }
            sum += temperatureArray[i];
            tempAverage = sum / temperatureArray.length;
        }
        System.out.println("Температуры пациентов: ");
        for (int i = 0; i < temperatureArray.length; i++) {
            System.out.printf("Пациент %d: %.1f\u00B0C; ",(i + 1), temperatureArray[i]);
        }
        System.out.printf("\n" + "Средняя температура: %.1f\u00B0C %n", tempAverage);
        System.out.println("Количество здоровых пациентов: " + tempHealthy);
    }


}
