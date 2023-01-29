package Baekjun.Baekjun_배열;

import java.util.Scanner;

public class java04_최댓값 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int index = 0;

        int array[] = new int[9];

        for (int i=0; i<array.length; i++) {
            int insert = scanner.nextInt();
            array[i] = insert;
        }

        for (int j=0; j<array.length; j++) {
            if (max < array[j]) {
                max = array[j];

        }
            if (max == array[j]) {
                index = j+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
