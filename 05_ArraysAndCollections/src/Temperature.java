public class Temperature {
    static final int PATIENT_COUNT = 30;
    static final float TEMP_MIN = 32.0f;
    static final float TEMP_MAX = 40.0f;
    static final float HEALTHY_TEMP_MIN = 36.2f;
    static final float HEALTHY_TEMP_MAX = 36.9f;

    public static void main(String[] args) {
        float[] temperatureArray = new float[PATIENT_COUNT];
        float tempAverage = 0;
        float tempHealthy = 0;
        float value = 0;

        for (int i = 0; i < temperatureArray.length; i++) {

            value = (float) (Math.random() * (TEMP_MAX - TEMP_MIN) + TEMP_MIN);
            temperatureArray[i] = value;
//            System.out.printf("Пациент %d: %.1f\u00B0C; %n", (i + 1), value);

        }
        System.out.println("Температура каждого пациента: ");
        for (int i = 0; i < temperatureArray.length; i++) {
            System.out.printf("Пациент %d: %.1f\u00B0C; %n",(i + 1), temperatureArray[i]);
        }
    }


}
