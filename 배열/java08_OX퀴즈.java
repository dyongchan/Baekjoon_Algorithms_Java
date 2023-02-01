package Baekjun.Baekjun_배열;

import java.util.Scanner;

public class java08_OX퀴즈 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();

        String[] arr = new String[0];

        int sum = 0;
        int result = 0;

        for(int i=0; i<test_case; i++) {
            String insert = scanner.next();
            arr = insert.split("");
            result = 0;
            sum = 0;

            for(int j=0; j<arr.length; j++){
                if (arr[j].equals("O")) {
                    result++;
                    sum = sum + result;
                }  else {
                    result = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
// sum을 통하여 합을 더하는 방식