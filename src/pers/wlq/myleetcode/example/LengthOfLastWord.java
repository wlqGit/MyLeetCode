package pers.wlq.myleetcode.example;

/**
 * Created by wulaiquan on 16/3/18.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        String[] split = s.trim().split(" +");
        return (split[split.length-1].length());
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
    }
}
