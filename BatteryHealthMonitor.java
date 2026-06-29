import java.util.Scanner;
public class BatteryHealthMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mobileName;
        int batteryPercentage;
        int choice;
       
        System.out.println("\n   ***** Welcome to BATTERY HEALTH MONITORING SYSTEM *****");

        System.out.print("\nEnter Mobile Name: ");
        mobileName = sc.nextLine();

        System.out.print("\nEnter Battery Percentage (0-100): ");
        batteryPercentage = sc.nextInt();

        do {

            System.out.println("\n  ****** Battery Health Dashboard ******");
            System.out.println("\n1. View Device Information");
            System.out.println("2. Check Battery Status");
            System.out.println("3. Charging Recommendation");
            System.out.println("4. Estimate Charging Time");
            System.out.println("5. Battery Care Tips");
            System.out.println("6. Exit Application");
            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n------ Mobile Information ------");
                    System.out.println("\nMobile Name        : " + mobileName);
                    System.out.println("\nBattery Percentage : " + batteryPercentage + "%");
                    break;

                case 2:

                    System.out.println("\n------ Battery Status ------");

                    if (batteryPercentage >= 0 && batteryPercentage <= 20) {
                        System.out.println("\nCritical");
                    } else if (batteryPercentage <= 40) {
                        System.out.println("\nLow Battery");
                    } else if (batteryPercentage <= 80) {
                        System.out.println("\nNormal");
                    } else if (batteryPercentage <= 100) {
                        System.out.println("\nFully Charged");
                    } else {
                        System.out.println("\nInvalid Battery Percentage!");
                    }

                    break;

                case 3:

                    System.out.println("\n------ Charging Recommendation ------");

                    if (batteryPercentage < 20) {
                        System.out.println("\nCharge Immediately.");
                    } else if (batteryPercentage <= 80) {
                        System.out.println("\nBattery is Healthy.");
                        System.out.println("\nNo Need to Charge.");
                    } else if (batteryPercentage <= 100) {
                        System.out.println("\nStop Charging.");
                        System.out.println("\nBattery is Already Charged.");
                    } else {
                        System.out.println("\nInvalid Battery Percentage!");
                    }

                    break;

                case 4:

                    System.out.println("\n------ Charging Time Estimation ------");

                    if (batteryPercentage >= 80 && batteryPercentage <= 100) {
                        System.out.println("\nBattery already reached 80%.");
                    } else if (batteryPercentage >= 0 && batteryPercentage < 80) {

                        int time = 80 - batteryPercentage;

                        System.out.println("\nEstimated Charging Time : " + time + " Minutes");

                    } else {
                        System.out.println("\nInvalid Battery Percentage!");
                    }

                    break;

                case 5:

                    System.out.println("\n------ Battery Care Tips ------");
                    System.out.println("1. Keep battery between 20% and 80%.");
                    System.out.println("2. Avoid overnight charging.");
                    System.out.println("3. Use the original charger.");
                    System.out.println("4. Avoid excessive heat.");
                    System.out.println("5. Reduce screen brightness.");
                    System.out.println("6. Close background applications.");
                    break;

                case 6:

                    System.out.println("\nThank You for Using Battery Health Monitoring System!\n");
                    break;

                default:

                    System.out.println("\nInvalid Choice! Please try again.\n");
            }

        } while (choice != 6);

        sc.close();
    }
}