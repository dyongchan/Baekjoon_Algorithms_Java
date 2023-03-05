package Baekjun.Baekjun_반복문;


import java.io.*;
import java.util.StringTokenizer;

public class java11_합05 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while ((input = bf.readLine()) != null) {
            st = new StringTokenizer(input," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append('\n');
        }
        System.out.print(sb);
    }
}

