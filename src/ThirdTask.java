import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        //Making Scanner
        Scanner scanner = new Scanner(System.in);

        //Asking user for seconds
        System.out.println("Please enter seconds: ");
        int totalSeconds = scanner.nextInt();

        //Closing Scanner
        scanner.close();

        // Calculating hours, minutes and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Formating result in the format "HH:MM:SS"
        String timeFormat = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        // Getting a result
        System.out.println("Converted time: " + timeFormat);
    }

}
