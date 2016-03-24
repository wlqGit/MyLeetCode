package pers.wlq.myleetcode.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wulaiquan on 16/3/10.
 */
public class PascalTriangle {
    public static  List<Integer> getRow(int rowIndex) {

        rowIndex+=2;

        List<Integer> listList = new ArrayList<>();
        if(rowIndex<=1)return listList;
        int[][] arr= new int[rowIndex][rowIndex];
        arr[1][1]=1;
        for(int i=2;i<rowIndex;i++){
            for(int j=1;j<=i;j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
        for (int j=1;j<rowIndex;j++){
            listList.add(arr[rowIndex-1][j]);
        }

        return listList;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
