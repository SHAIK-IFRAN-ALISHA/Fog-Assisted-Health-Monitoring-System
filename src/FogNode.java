public class FogNode {

    public static boolean analyzeHealth(HealthRecord record) {

        if (record.getTemperature() > 38.0 ||
            record.getHeartRate() > 100 ||
            record.getBloodPressure() > 140 ||
            record.getGlucoseLevel() > 180) {

            return false;
        }

        return true;
    }

    public static void processHealthData(HealthRecord record) {

        boolean safe = analyzeHealth(record);

        System.out.println("\n===== FOG ANALYSIS =====");

        if (safe) {
            System.out.println("STATUS : SAFE");
        } else {
            System.out.println("STATUS : UNSAFE");
        }
    }
}