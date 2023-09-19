import java.util.Scanner;

public class FirstTask {


    public static void main(String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);



        // Ask user for height and width
        System.out.println("Please enter the width of a rectangle: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the height of a rectangle: ");
        double height = scanner.nextDouble();

        // Calculate area
        double area = width * height;
        System.out.println("Are of a rectangle is " + area);

        // Calculate perimeter
        double perimeter = 2 * (width + height);
        System.out.println(" Perimeter of a rectangle is " + perimeter);

    }
}

