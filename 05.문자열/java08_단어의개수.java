package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java08_단어의개수 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 1;

        String insert = scanner.nextLine();
        String[] str = insert.split("");

        for(int i=0; i<str.length; i++) {
            if (str[i].equals(" ")) {
                cnt++;
            }
        }
        if(str[0].equals(" ")) {
            cnt = cnt - 1;
        }
        if (str[str.length-1].equals(" ")) {
            cnt = cnt - 1;
        }
        System.out.print(cnt);
    }
}
