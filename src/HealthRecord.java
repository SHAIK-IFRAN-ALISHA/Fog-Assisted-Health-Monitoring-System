public class HealthRecord {

    private double temperature;
    private int heartRate;
    private int bloodPressure;
    private double glucoseLevel;

    public HealthRecord(double temperature,
                        int heartRate,
                        int bloodPressure,
                        double glucoseLevel) {

        this.temperature = temperature;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.glucoseLevel = glucoseLevel;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public double getGlucoseLevel() {
        return glucoseLevel;
    }

    public void displayRecord() {

        System.out.println("Temperature    : " + temperature + " °C");
        System.out.println("Heart Rate     : " + heartRate + " bpm");
        System.out.println("Blood Pressure : " + bloodPressure + " mmHg");
        System.out.println("Glucose Level  : " + glucoseLevel + " mg/dL");
    }
}