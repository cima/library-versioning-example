public class TheActualImplementation implements TheInterface {
    int multiply(int multiplicant, int multiplier) {
        return multiplicant * multiplier;
    }

    int add(int base, int addition) {
        return base + addition;
    }

    int sum(int first, int second) {
        int summary = first;
        for(int i = 0; i <= second; i++){
            summary += 1;
        }
        return summary;
    }
}