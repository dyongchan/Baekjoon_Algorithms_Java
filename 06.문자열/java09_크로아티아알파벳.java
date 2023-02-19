package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java09_크로아티아알파벳 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int cnt =0;

        String insert = scanner.nextLine();

        String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0; i<str.length; i++) {
            if(insert.contains(str[i])) {
                insert = insert.replace(str[i],"1");
            }
        }
        System.out.print(insert.length());
    }
}
