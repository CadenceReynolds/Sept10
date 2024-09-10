public class greatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDenominator(25, 15));
        System.out.println(getGreatestCommonDenominator(12, 30));
        System.out.println(getGreatestCommonDenominator(9, 18));
        System.out.println(getGreatestCommonDenominator(81, 153));

    }

    private static int getGreatestCommonDenominator(int first, int second) {
        if (first < 10) {
            return -1;
        } else if (second < 10) {
            return -1;
        }

        int gcd = 1;
        int smallest =0;
        if (first <= second) {
            smallest = first;
        } else {
            smallest = second;
        }

        for (int i = 1; i <= smallest; i++) //i cannot be 0 is you cannot mod by 0.
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        return gcd;

    }
}
