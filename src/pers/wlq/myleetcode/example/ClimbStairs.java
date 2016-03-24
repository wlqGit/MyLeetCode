package pers.wlq.myleetcode.example;

/**
 * Created by wulaiquan on 16/3/8.
 */
public class ClimbStairs {
    public static  int climbStairs(int n){
        int count = 0;
        if(n==1)return 1;
        if(n==0)return 0;
        if(n==2)return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static  int climbStairs1(int n){
        int count = 0;
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 2;
        int i=3;
        int f1=1,f2=2,f3=0;
        while(i++<=n){
            f3=f2+f1;
            f1=f2;
            f2=f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs1(44));
    }
}
