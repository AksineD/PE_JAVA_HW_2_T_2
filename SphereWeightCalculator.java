import java.util.Scanner;

public class SphereWeightCalculator {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Print the radius : ");
        double R = scanner.nextDouble();

        System.out.print("Print the density: ");
        double D = scanner.nextDouble();

        double weight = (4.0 / 3.0) * PI * Math.pow(R, 3) * D;

        System.out.printf("The weight is %.2f%n", weight);

        scanner.close();
    }
}