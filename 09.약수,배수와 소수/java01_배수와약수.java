package Baekjun.Baekjun_약수배수소수;

import java.util.Scanner;

public class java01_배수와약수 {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N_1 = scanner.nextInt();
            int N_2 = scanner.nextInt();

            if (N_1 == 0 && N_2 == 0) {
                break;
            } else {
                if (N_2 % N_1 == 0) {
                    System.out.println("factor");
                } else if (N_1 % N_2 == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            }
        }

    }
}
