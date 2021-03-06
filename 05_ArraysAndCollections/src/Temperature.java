public class Temperature {
    static final int PATIENT_COUNT = 30;
    static final float TEMP_MIN = 32.0f;
    static final float TEMP_MAX = 40.0f;
    static final float HEALTHY_TEMP_MIN = 36.2f;
    static final float HEALTHY_TEMP_MAX = 36.9f;

    public static void main(String[] args) {
        float[] temperatureArray = new float[PATIENT_COUNT];

        for (int i = 0; i < temperatureArray.length; i++) {
            temperatureArray[i] = (float) (Math.random() * (TEMP_MAX - TEMP_MIN) + TEMP_MIN);
        }
        System.out.println("Температуры пациентов: ");
        for (int i = 0; i < temperatureArray.length; i++) {
            System.out.printf("Пациент %d: %.1f\u00B0C; ",(i + 1), temperatureArray[i]);
        }
        System.out.printf("\n" + "Средняя температура: %.1f\u00B0C %n",
                averageTemperature(temperatureArray));
        System.out.println("Количество здоровых пациентов: " + getHealthyPatientsCount(temperatureArray));

    }
//Erstellen Sie eine Methode zum Ermitteln des Durchschnittswerts eines Arrays
    public static float averageTemperature(float[] temperature) {
        float sum = 0f;
        float averageTemp = 0f;
        for (float v : temperature) {
            sum += v;
            averageTemp = sum / temperature.length;
        }
        return averageTemp;
    }
//Erstellen Sie eine Methode zum Bestimmen der angegebenen
// Werte im Array und fassen Sie die Werte zusammen
    public static int getHealthyPatientsCount(float[] temperature){
        int healthyCount = 0;
        for (float v : temperature) {
            if (v >= HEALTHY_TEMP_MIN & v <= HEALTHY_TEMP_MAX) {
                healthyCount++;
            }
        }
        return healthyCount;
    }
}
