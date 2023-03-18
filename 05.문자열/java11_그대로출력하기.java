package Baekjun.Baekjun_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java11_그대로출력하기 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        while ((str = bf.readLine()) != null) {
            System.out.println(str);
        }
    }
}
