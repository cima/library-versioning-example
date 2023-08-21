public class TheActualImplementation implements TheInterface {
    int multiply(int multiplicant, int multiplier) {
        return multiplicant * multiplier;
    }

    int add(int base, int addition) {
        int sum = base;
        for(int i = 0; i <= addition; i++){
            sum += 1;
        }
        return sum;
    }
}