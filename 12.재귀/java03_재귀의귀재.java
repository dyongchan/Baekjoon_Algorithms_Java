package Baekjun.Baekjun_재귀;

import java.util.Scanner;

public class java03_재귀의귀재 {
    static int cnt = 0;

    public static int recul(String s, int l, int r) {
        cnt ++;

        if (l >= r) {
            return 1;
        }
        else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        }
        else {
            return recul(s, l+1 ,r-1);
        }
    }
    public static int ispal(String s) {
        cnt = 0;
        return recul(s,0,s.length()-1);
    }
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        for (int i = 0; i<test; i++ ) {
            String N = scanner.next();
            System.out.println(ispal(N)+" "+cnt);

        }
    }
}
