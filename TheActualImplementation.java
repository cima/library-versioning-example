public class TheActualImplementation implements TheInterface {
    int multiply(int multiplicant, int multiplier) {
        return multiplicant * multiplier;
    }

    int add(int base, int addition) {
        return base + addition;
    }

    int sum(int first, int second) {
        if (first & 0x80000000 && second & 0x80000000) {
            throw new IllegalArgumentException("Addition would result in an overflow.");
        }

        return add(first, second);
    }
}