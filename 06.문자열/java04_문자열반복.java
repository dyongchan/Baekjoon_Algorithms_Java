package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java04_문자열반복 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();

        for(int i=0; i<test_case; i++) {
            int insert_num = scanner.nextInt();

            String insert_S = scanner.next();
            String[] str = insert_S.split("");

            for(int j=0; j<str.length; j++) {
                int k=0;
                while (k<insert_num) {
                    System.out.print(str[j]);
                    k++;
                }
            }
            System.out.println();
        }
    }
}
