package Baekjun.Baekjun_배열;

import java.util.Scanner;

public class java01_개수세기 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int array[] = new int[total];
        int i = 0;
        int k = 0;


        while (true) {
            int insert = scanner.nextInt();
            array[i] = insert;
            i++;
            if (i == total) {
                int compare_factor = scanner.nextInt();

                 for (int j=0; j<array.length; j++) {
                    if (array[j] == compare_factor) {
                        k++;
                    }
                }
                 System.out.print(k);
                 break;
            }
        }
    }
}

