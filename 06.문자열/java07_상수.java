package Baekjun.Baekjun_문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class java07_상수 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int result1 = 0;
        int result2 = 0;
        int result = 0;

        String num1 = scanner.next();
        String[] arr1 = num1.split("");
        ArrayList<Integer> arr1_r = new ArrayList<>();

        String num2 = scanner.next();
        String[] arr2 = num2.split("");
        ArrayList<Integer> arr2_r = new ArrayList<>();

        for(int i=2; 0<=i; i--) {
            arr1_r.add(Integer.valueOf(arr1[i]));
            arr2_r.add(Integer.valueOf(arr2[i]));
        }
        result1 = (arr1_r.get(0) * 100) + (arr1_r.get(1) * 10) + (arr1_r.get(2));
        result2 = (arr2_r.get(0) * 100) + (arr2_r.get(1) * 10) + (arr2_r.get(2));

        if(result1 < result2) {
            result = result2;
        }else  {
            result = result1;
        }

        System.out.print(result);
    }
}
