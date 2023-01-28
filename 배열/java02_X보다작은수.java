package Baekjun.Baekjun_배열;

import java.util.Scanner;
import java.util.Arrays;

public class java02_X보다작은수 {
    public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int X = scanner.nextInt();

    int[] array = new int[N];

    for (int i=0; i<N; i++) {
        int insert = scanner.nextInt();
        array[i] = insert;
    }

    for (int i=0; i<array.length; i++) {
        if (array[i] < X) {
           System.out.print(array[i]+" ");
        }
    }
    }
}

