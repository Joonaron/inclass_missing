import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorPublicTest {
    @Test
    void testCalculateTripCostPublic() {
        double distance = 100.0;
        double fuelPrice = 2.0;
        // Expected cost = (distance * (5 / 100.0)) * fuelPrice
        double expectedCost = distance * 5.0 / 100.0 * fuelPrice;

        // Directly calling the public method

        double result = TripCostCalculator.calculateTotalCost(distance, fuelPrice);

        assertEquals(expectedCost, result, 1e-6);
    }
}