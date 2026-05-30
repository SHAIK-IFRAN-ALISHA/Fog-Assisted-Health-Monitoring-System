public class AlertService {

    public static void checkAlert(HealthRecord record) {

        boolean safe = FogNode.analyzeHealth(record);

        if (!safe) {

            System.out.println("\n⚠ ALERT GENERATED ⚠");
            System.out.println("Patient Requires Immediate Attention");

        } else {

            System.out.println("\nNo Alert Required");
            System.out.println("Patient Condition Stable");
        }
    }
}