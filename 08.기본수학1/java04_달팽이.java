package Baekjun.Baekjun_기본수학1;

import java.util.Scanner;

public class java04_달팽이 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int length = scanner.nextInt();

        int day = (length - down) / (up - down);


        if ((length - down) % (up - down) != 0) {
            day = day - 1;

        }

        System.out.print(day);
    }
}
