package pers.wlq.myleetcode.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wulaiquan on 16/3/18.
 */
public class Isomorphic {
    public static boolean isIsomorphic(String s,String t){
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set  = new HashSet<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc  =t.charAt(i);
            if(map.containsKey(sc)){
                if(tc!=map.get(sc))return false;
            }
            else{
                if(set.contains(tc))return false;
                map.put(sc,tc);
                set.add(tc);
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isIsomorphic("qqq","asd"));
    }
}
