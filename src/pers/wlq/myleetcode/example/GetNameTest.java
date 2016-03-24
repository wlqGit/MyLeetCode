package pers.wlq.myleetcode.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
/**
 * Created by wulaiquan on 16/3/22.
 */
public class GetNameTest {


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //InputStream ips = GetNameTest.class.getResourceAsStream("/com/huawei/interview/info.txt");
        //用上一行注释的代码和下一行的代码都可以，因为info.txt与GetNameTest类在同一包下面，所以，可以用下面的相对路径形式

        Map results = new HashMap();
        InputStream ips = GetNameTest.class.getResourceAsStream("res/info.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(ips));
        String line = null;
        try {
            while ((line = in.readLine()) != null) {
                dealLine(line, results);
            }
            sortResults(results);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static class User {
        public String name;
        public Integer value;

        public User(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub

            //下面的代码没有执行，说明往treeset中增加数据时，不会使用到equals方法。
            boolean result = super.equals(obj);
            System.out.println(result);
            return result;
        }
    }

    private static void sortResults(Map results) {
        // TODO Auto-generated method stub
        TreeSet sortedResults = new TreeSet(
                (o1, o2) -> {
                    // TODO Auto-generated method stub
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    if (user1.value > user2.value) {
                        return -1;
                    } else if (user1.value < user2.value) {
                        return 1;
                    } else {
                        return user1.name.compareTo(user2.name);
                    }
                }
        );
        Iterator iterator = results.keySet().iterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            Integer value = (Integer) results.get(name);
            if (value >=1) {
                sortedResults.add(new User(name, value));
            }
        }

        printResults(sortedResults);
    }

    private static void printResults(TreeSet sortedResults) {
        Iterator iterator = sortedResults.iterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println(user.name + ":" + user.value);
        }
    }

    public static void dealLine(String line, Map map) {
        if (!"".equals(line.trim())) {
            String[] results = line.split(",");
            if (results.length == 3) {
                String name = results[1];
                Integer value = (Integer) map.get(name);
                if (value == null) value = 0;
                map.put(name, value + 1);
            }
        }
    }

}