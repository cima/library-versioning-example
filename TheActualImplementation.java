public class TheActualImplementation implements TheInterface {
    int multiply(int multiplicant, int multiplier) {
        return multiplicant * multiplier;
    }

    int sum(int first, int second) {
        if (first & 0x80000000 && second & 0x80000000) {
            throw new IllegalArgumentException("Addition would result in an overflow.");
        }

        return first + second;
    }

    int square(int root) {
        return root * root;
    }

    int square(int root) {
        return root * root;
    }
}