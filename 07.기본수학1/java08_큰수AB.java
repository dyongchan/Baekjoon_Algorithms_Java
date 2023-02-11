package Baekjun.Baekjun_기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class java08_큰수AB {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String A =  scanner.next();
        String B =  scanner.next();

        BigInteger bigInteger = new BigInteger(A);
        BigInteger bigInteger1 = new BigInteger(B);

        System.out.print(bigInteger.add(bigInteger1));
    }
}
