package Baekkjun.Baekkjun_입출력과사칙연산;

import java.util.Scanner;

public class java08_chess {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt(); // 1 king
        int Q = scanner.nextInt(); // 1 queen
        int R = scanner.nextInt(); // 2 rocks
        int B = scanner.nextInt(); // 2 bishops
        int Kn = scanner.nextInt(); // 2 knights
        int P = scanner.nextInt(); // 8 pawns

        int king = 1 - K;
        int queen = 1 - Q;
        int rocks = 2 - R;
        int bishops = 2 - B;
        int knights = 2 - Kn;
        int pawns = 8 - P;

        System.out.print(king+" "+queen+" "+rocks+" "+bishops+" "+knights+" "+pawns);
    }
}
