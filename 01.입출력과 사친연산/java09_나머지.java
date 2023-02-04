package Baekkjun.Baekkjun_입출력과사칙연산;

import java.util.Scanner;

public class java09_나머지 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int a = (A+B)%C;
        int b = ((A%C)+(B%C))%C;
        int c = (A*B)%C;
        int d = ((A%C)*(B%C))%C;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
