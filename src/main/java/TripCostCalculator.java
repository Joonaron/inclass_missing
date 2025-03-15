
import java.util.Scanner;

public class TripCostCalculator {
    public static void main(String[] args) {
        double distance = getDistance();
        double fuelPrice = getFuelPrice();
        double totalCost = calculateTotalCost(distance, fuelPrice);
        displayTotalCost(totalCost);
    }

    private static double getDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance to travel (in kilometers): ");
        double distance = scanner.nextDouble();
        return distance;
    }

    private static double getFuelPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fuel price per liter: ");
        double fuelPrice = scanner.nextDouble();
        return fuelPrice;
    }

    public static double calculateTotalCost(double distance, double fuelPrice) {
        double fuelConsumptionRate = 5.0 / 100.0;
        double totalFuelNeeded = distance * fuelConsumptionRate;
        return totalFuelNeeded * fuelPrice;
    }

    private static void displayTotalCost(double totalCost) {
        System.out.printf("The total cost of the trip is: %.2f%n", totalCost);
    }
}
