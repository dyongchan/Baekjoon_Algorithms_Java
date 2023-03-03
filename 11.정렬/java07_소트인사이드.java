package Baekjun.Baekjun_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class java07_소트인사이드 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String str = String.valueOf(N);
        ArrayList<Integer> result = new ArrayList<>();


        String[] num = str.split("");

        for(int i=0; i<str.length(); i++) {
            result.add(Integer.valueOf(num[i]));
        }

        Collections.sort(result, Collections.reverseOrder());

        String res = "";

        for(int i =0; i<result.size(); i++) {
            res = res + String.valueOf(result.get(i));
        }

        System.out.println(Integer.valueOf(res));

    }
}