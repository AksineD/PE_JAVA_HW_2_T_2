import java.util.Scanner;

public class SphereWeightCalculator {

    // Class constants
    private static final double MIN_RADIUS = 0.0; // A sphere cannot have a negative or zero radius
    private static final double MIN_DENSITY = 0.0; // Density cannot be negative or zero

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = getValidatedInput(scanner, "Enter the radius: ", MIN_RADIUS, "Radius must be greater than 0.");
        double density = getValidatedInput(scanner, "Enter the density: ", MIN_DENSITY, "Density must be greater than 0.");
        scanner.close();
        processAndDisplayResults(radius, density);
    }

    /**
     * This method calculates the weight of a sphere.
     *
     * @param radius  The radius of the sphere.
     * @param density The density of the sphere.
     * @return The calculated weight of the sphere.
     */
    private static double calculateSphereWeight(double radius, double density) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3) * density;
    }

    /**
     * This method validates user input with a defined minimum value.
     *
     * @param scanner      The scanner object used for reading input.
     * @param prompt       The message to display to the user.
     * @param minValue     The minimum acceptable value for the input.
     * @param errorMessage The error message displayed when invalid input is given.
     * @return The validated numeric input.
     */
    private static double getValidatedInput(Scanner scanner, String prompt, double minValue, String errorMessage) {
        double inputValue;

        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                inputValue = scanner.nextDouble();
                if (inputValue > minValue) {
                    return inputValue; // Valid input
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
        }
    }

    /**
     * Processes the input data (radius and density) to calculate the weight
     * and displays the result to the user.
     *
     * @param radius  The radius of the sphere.
     * @param density The density of the sphere.
     */
    private static void processAndDisplayResults(double radius, double density) {
        double weight = calculateSphereWeight(radius, density);
        displayResults(weight);
    }

    /**
     * Displays the calculated weight of the sphere.
     *
     * @param weight The weight of the sphere to display.
     */
    private static void displayResults(double weight) {
        System.out.printf("The weight is %.2f%n", weight);
    }
}