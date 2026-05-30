public class THICalculator {

    public static double calculateTHI(double temperature,
                                      double humidity) {

        return temperature
                - ((0.55 - 0.0055 * humidity)
                * (temperature - 14.5));
    }

    public static void displayTHI(double temperature,
                                  double humidity) {

        double thi =
                calculateTHI(temperature, humidity);

        System.out.println("\n===== THI ANALYSIS =====");
        System.out.println("Temperature : " + temperature);
        System.out.println("Humidity    : " + humidity);
        System.out.println("THI Value   : "
                + String.format("%.2f", thi));

        if (thi > 27) {

            System.out.println(
                    "Heat Stress Detected");

        } else {

            System.out.println(
                    "Normal Environmental Condition");
        }
    }
}