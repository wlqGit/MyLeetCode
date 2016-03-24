package pers.wlq.myleetcode.example;

/**
 * Created by wulaiquan on 16/3/8.
 */
public class HappyNumber {
    public  static boolean  HappyNumber(int n){
        int sum=0;
        if(n==1)return true;
        while(n!=0){
            sum+=Math.pow(n%10,2);
            n=n/10;
        }
        return HappyNumber(sum);
    }


    public static boolean isPowerOfThree(int n) {
        double res = Math.log(n)/Math.log(3);
        return Math.abs(res - Math.rint(res))< 0.0000000001;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(0));
    }
}
