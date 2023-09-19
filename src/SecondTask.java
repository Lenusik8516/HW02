import java.util.Scanner;


public class SecondTask {

    public static void main(String[] args) {


        // create scanner
        Scanner scanner =  new Scanner(System.in);

        // Ask user for height in metres
        System.out.println("Please enter height in metres:");
        double height = scanner.nextDouble();

        // Ask user for weight in kilograms
        System.out.println("Please enter weight in kilograms:");
        double weight = scanner.nextDouble();

        //closing scanner
        scanner.close();

        // Calculating BMI by formula
        double bmi = weight / (height * height);

        // Giving result
        System.out.println("BMI: " + bmi);
    }


}
