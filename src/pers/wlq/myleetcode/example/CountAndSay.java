package pers.wlq.myleetcode.example;

/**
 * Created by wulaiquan on 16/3/18.
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        if(n==0)return "";
        if(n==1)return "1";
        String str = countAndSay(n-1);
        char last = str.charAt(0);
        StringBuffer sb = new StringBuffer();
        int cnt = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==last)cnt++;
            else {
                sb.append(cnt);
                sb.append(last);
                last = str.charAt(i);
                cnt=1;
            }
        }
        sb.append(cnt);
        sb.append(last);
        return sb.toString();
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            System.out.println(countAndSay(i));
        }
    }

}
