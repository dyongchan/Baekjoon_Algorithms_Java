package Baekjun.Baekjun_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class java03_커트라인 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrL = new ArrayList<Integer>();

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i =0; i<N; i++) {
            int x = scanner.nextInt();
            arrL.add(x);
        }

        Collections.sort(arrL);

        System.out.print(arrL.get(N-K));
    }

}
