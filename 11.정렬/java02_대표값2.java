package Baekjun.Baekjun_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class java02_대표값2{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int result = 0;

        for(int i=0; i<5; i++) {
            int insert = scanner.nextInt();
            arr[i] = insert;
            result = result + arr[i];
        }

        Arrays.sort(arr);

        System.out.println(result/arr.length);
        System.out.println(arr[2]);

    }

}
