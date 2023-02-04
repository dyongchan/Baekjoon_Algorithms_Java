package Baekjun.Baekjun_배열;

import java.util.Scanner;
import java.util.HashSet;


// Hashset 및 set(집합)을 활용하여 중복 제거

public class java06_나머지_Set {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i=0; i<10; i++) {
            int insert = scanner.nextInt();
            set.add(insert % 42);
        }

        System.out.print(set.size());
    }
}
