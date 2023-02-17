package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java03_알파벳찾기 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String insert = scanner.next();
        String[] arr_i = insert.split("");

        String compare = "abcdefghijklmnopqrstuvwxyz";
        String[] arr_c= compare.split("");

        for (int i=0; i<arr_c.length; i++) {
            int j = 0;
            int result = -1;

            while (j<arr_i.length) {
                if(arr_c[i].equals(arr_i[j])) {
                    result = j;
                    break;
                }
                j++;
            }
            System.out.print(result+" ");
        }
    }
}
