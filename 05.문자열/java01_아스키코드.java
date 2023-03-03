package Baekjun.Baekjun_문자열;

import java.util.Scanner;

//  0 ~ 9 = 48 ~ 57
// A ~ Z = 65 ~ 90
// a ~ z = 97 ~ 122

public class java01_아스키코드 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String insert  = scanner.nextLine();

        String[] arr = new String[62];
        String N = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        arr = N.split("");

        for (int i=0; i<arr.length; i++) {
            
            if (arr[i].equals(insert)) {
              if(0<= i && i<=9) {
                  System.out.println(i+48);
              } else if (9< i && i< 36) {
                  System.out.println(i+55);
              } else {
                  System.out.println(i+61);
              }
            }
        }
    }
}
