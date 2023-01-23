package Baekkjun;

import java.util.Scanner;

public class java_별찍기02 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i=0; i<a; i++) {

            for (int k=a-1; i<k; k--) {
                System.out.print(" ");
            }

            for (int j=0; j <= i; j++) {
                    System.out.print("*");
                }
            System.out.println();
            }
    }
}
