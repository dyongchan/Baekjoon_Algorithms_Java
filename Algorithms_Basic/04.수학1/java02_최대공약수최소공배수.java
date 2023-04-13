package Baekjun.Algorithms_Basic.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java02_최대공약수최소공배수 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        StringBuilder sb = new StringBuilder();


        int num_1 = Integer.parseInt(st.nextToken());
        int num_2 = Integer.parseInt(st.nextToken());

        int gcd = 0;
        int mcm = 0;

        if (num_1 > num_2) {
            for (int i = 1; i <= num_2; i++) {
                if (num_1 % i == 0 && num_2 % i == 0) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 1; i <= num_1; i++) {
                if (num_1 % i == 0 && num_2 % i == 0) {
                    gcd = i;
                }
            }
        }

        int j = 1;
        while (true) {
            int compare = gcd * j;
            if(compare % num_1 == 0 && compare % num_2 == 0) {
                mcm = compare;
                break;
            }
            j++;
        }

        sb.append(gcd).append('\n').append(mcm);

        System.out.println(sb);

    }
}
