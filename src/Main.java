import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Patient> patients =
                new ArrayList<>();

        while (true) {

            System.out.println("\n===== FOG ASSISTED IOT HEALTH MONITORING SYSTEM =====");

            System.out.println("1. Register Patient");
            System.out.println("2. Monitor Health");
            System.out.println("3. Display All Patients");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Patient ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age =
                            Integer.parseInt(sc.nextLine());

                    System.out.print("Disease: ");
                    String disease =
                            sc.nextLine();

                    Patient patient =
                            new Patient(id,
                                    name,
                                    age,
                                    disease);

                    patients.add(patient);

                    System.out.println(
                            "Patient Registered Successfully");

                    break;

                case 2:

                    if (patients.isEmpty()) {

                        System.out.println(
                                "No Patients Registered");

                        break;
                    }

                   System.out.print("Enter Temperature: ");
double temperature =
        Double.parseDouble(sc.nextLine());

System.out.print("Enter Heart Rate: ");
int heartRate =
        Integer.parseInt(sc.nextLine());

System.out.print("Enter Blood Pressure: ");
int bloodPressure =
        Integer.parseInt(sc.nextLine());

System.out.print("Enter Glucose Level: ");
double glucoseLevel =
        Double.parseDouble(sc.nextLine());

HealthRecord record =
        new HealthRecord(
                temperature,
                heartRate,
                bloodPressure,
                glucoseLevel);

record.displayRecord();

FogNode.processHealthData(record);

AlertService.checkAlert(record);

                    break;

                case 3:

                    if (patients.isEmpty()) {

                        System.out.println(
                                "No Patient Data Available");

                    } else {

                        for (Patient p : patients) {

                            System.out.println(
                                    p);
                        }
                    }

                    break;

                case 4:

                    System.out.println(
                            "System Shutdown");
                            sc.close();

                    return;

                default:

                    System.out.println(
                            "Invalid Choice");
            }
        }
    }
}