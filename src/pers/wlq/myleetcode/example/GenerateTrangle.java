package pers.wlq.myleetcode.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wulaiquan on 16/3/9.
 */
public class GenerateTrangle {
    public static List<List<Integer>> generate(int numRows) {
        numRows+=1;

        List<List<Integer>> listList = new ArrayList<List<Integer>>();
        int[][] arr= new int[numRows][numRows];
        arr[1][1]=1;
        for(int i=2;i<numRows;i++){
            for(int j=1;j<=i;j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
        for(int i=1;i<numRows;i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j=1;j<=i;j++){
                list.add(arr[i][j]);
            }
            System.out.println(list);
            listList.add(list);
        }

        return listList;
    }

    public static void main(String[] args) {
        List<List<Integer>> listList = generate(5);
        System.out.println(listList);
    }
}
