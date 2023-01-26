package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java12_더하기사이클 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int insert = scanner.nextInt();

        int insert_1 = 0;
        int sum = 0;
        int sum_1 = 0;

        int new_insert = 0;

        int last_new_insert = insert;

        for(int i=0; i<insert; i++) {

            insert_1 = insert % 10;
            sum = insert / 10 + insert % 10;
            sum_1 = sum % 10 ;

            new_insert = (insert_1 * 10) + sum_1;

            insert = new_insert ;

            if (insert == last_new_insert) {
                System.out.print(i);
            }

        }
    }
}
