package pers.wlq.myleetcode.example;

/**
 * Created by wulaiquan on 16/3/18.
 */
public class ReverseBit {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        for (int i = 0; i < 31; i++) {
            reverse = (n & 1) | reverse;
            reverse = reverse << 1;
            n = n >> 1;
        }
        reverse = (n & 1) | reverse;
        return reverse;
    }

    public static void main(String[] args) {
        ReverseBit test = new ReverseBit();
        System.out.println(test.reverseBits(43261596));
    }
}

