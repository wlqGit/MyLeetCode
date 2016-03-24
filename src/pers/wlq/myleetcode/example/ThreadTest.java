package pers.wlq.myleetcode.example;

/**
 * Created by wulaiquan on 16/3/22.
 */
public class ThreadTest {
    private int j;
    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        Inc inc = tt.new Inc();
        Dec dec = tt.new Dec();
        for(int i=0;i<2;i++){
            Thread t1 = new Thread(inc);
            t1.start();

            Thread t2 = new Thread(dec);
            t2.start();
        }
    }

    private synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc:"+j);
    }
    private synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec"+j);
    }
    class Inc implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<100;i++){
                inc();
            }
        }
    }
    class Dec implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<100;i++){
                dec();
            }
        }
    }
}
