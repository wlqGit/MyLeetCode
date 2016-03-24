package pers.wlq.myleetcode.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wulaiquan on 16/3/18.
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] strArr = str.trim().split(" +");
        if(pattern.length()!=strArr.length)return false;
        Map<Character,String> map  = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(strArr[i]))return false;
            }
            else{
                if(set.contains(strArr[i]))return false;
                else{
                    map.put(pattern.charAt(i),strArr[i]);
                    set.add(strArr[i]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat ss dog"));
    }
}
