public class TheActualImplementation implements TheInterface {
    int multiply(int multiplicant, int multiplier) {
        int product = 0;
        for(int i = 0; i <= multiplier; i++) {
            product += multiplicant;
        }
        return product;
    }
}