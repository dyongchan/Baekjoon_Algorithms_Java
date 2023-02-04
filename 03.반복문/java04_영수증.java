package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java04_영수증 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int sort = scanner.nextInt();
        int sum = 0;

        for (int i=0; i<sort; i++) { // 물건의 종류의 수만큼 돈다
            int money = scanner.nextInt();
            int kind = scanner.nextInt();

            int aggregate = money * kind;
            sum = sum + aggregate;
        }

        if (sum == total) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
