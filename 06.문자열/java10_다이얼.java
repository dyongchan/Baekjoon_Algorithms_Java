package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java10_다이얼 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        String insert = scanner.next();
        String[] arr_i = insert.split("");

        String Dial = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] arr_D = Dial.split("");

        for(int i=0; i< arr_i.length; i++) {
            int j = 0;
            while (j < arr_D.length) {
                if(arr_i[i].equals(arr_D[j])) {
                    if(j <= 2) {
                        result = result + 3;
                    } else if (2 < j && j <= 5) {
                        result = result + 4;
                    } else if (5 < j && j <= 8) {
                        result = result + 5;
                    } else if (8 < j && j <= 11) {
                        result = result + 6;
                    } else if (11 < j && j <= 14) {
                        result = result + 7;
                    } else if (14 < j && j <= 18) {
                        result = result + 8;
                    } else if (18 < j && j <= 21) {
                        result = result + 9;
                    } else if (21 < j && j <= 25) {
                        result = result + 10;
                    }
                }
                j++;
            }
        }
        System.out.print(result);
    }
}
