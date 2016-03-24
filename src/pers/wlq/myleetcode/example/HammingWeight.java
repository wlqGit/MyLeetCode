package pers.wlq.myleetcode.example;

/**
 * Created by wulaiquan on 16/3/8.
 */
public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0) {
            if((n&1)!=0) count++;
            n=n>>1;
        }
        return count;
    }

    public static int hammingWeight1(int n) {
        int count = 0;
        int flag = 1;
        while(flag != 0) {
            if((n & flag) != 0) count++;
            flag = flag << 1;
        }
        return count;
    }
    public static int hammingWeight2(int n) {
        int count = 0;
        while(n!=0){
            n=(n-1)&n;
            count++;
        }
        return count;
    }



    public  static  void main(String[] args) {
        System.out.println(hammingWeight2(11));
    }
}
