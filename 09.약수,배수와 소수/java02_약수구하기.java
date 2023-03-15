package Baekjun.Baekjun_약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class java02_약수구하기 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=1; i<=a; i++) {
            if (a % i == 0){
                arr.add(i);
            }
        }
        bf.close();
        if((b-1) < arr.size()) {
            System.out.print(arr.get(b-1));
        } else {
            System.out.print(0);
        }
    }
}
