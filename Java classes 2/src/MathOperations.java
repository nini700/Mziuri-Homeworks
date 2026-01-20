public class MathOperations {
    public static int calculateMultiples(int start, int end, int divisor) {
        if (start == end) {
            if (start % divisor == 0) {
                return start;
            }
            return 0;
        }
        if (start % divisor == 0) {
            return calculateMultiples(start + 1, end, divisor) + start;
        }
        return calculateMultiples(start + 1, end, divisor);
    }

    public static int sumNumbers(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumNumbers(num - 1);
    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }

    public static int zeroCount(int value) {
        if (value == 0) {
            return 1;
        }

        if (value % 10 == 0) {
            return 1 + zeroCount(value / 10);
        }
        if (value / 10 == 0) {
            return 0;
        }
        return zeroCount(value / 10);
    }

    public static void checkEvenOddZeros(int count) {
        if (count % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}