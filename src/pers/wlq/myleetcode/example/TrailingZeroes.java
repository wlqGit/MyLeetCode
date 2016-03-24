package pers.wlq.myleetcode.example;

/**
 * Created by wulaiquan on 16/3/10.
 */
public class TrailingZeroes {
    public static int trailingZeroes(int n) {
        if (n < 5) return 0;
        int c = 0;
        while (n / 5 != 0) {
            n /= 5;
            c += n;
        }
        return c;
    }

    public static void main(String[] args) {

        System.out.println(trailingZeroes(30));
    }
}
