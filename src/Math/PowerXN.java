package Math;

import static java.lang.Math.abs;

class PowerXN {
    public static void main(String[] args) {
        System.out.print(myPow(2.00000, -2));
    }

    public static double myPow(double x, int n) {
        if (n < 0) return pow2(1 / x, -n);
        else return pow2(x, n);
    }

    // way - iterative
    public static double pow1(double x, int power) {
        if (power == 0) return 1.0;
        double base = 1;
        while (power > 0) {
            if (power % 2 == 1) {
                base *= x;
            }
            x = x * x;
            power = power / 2;
        }
        return base;
    }

    // way 2 recursive
    public static double pow2(double x, int power) {
        if (power == 0) return 1.0;
        double y = pow2(x, power / 2);
        if (power % 2 == 0) {
            return y * y;
        } else {
            return y * y * x;
        }
    }
}