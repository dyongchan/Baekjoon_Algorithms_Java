package Baekjun.Baekjun_약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class java03_약수의합 {
     public static void main(String args[]) throws IOException {
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

         while (true) {
             int N = Integer.parseInt(bf.readLine());
             int sum = 0;

             if (N == -1) {
                 break;
             } else {
                 ArrayList<Integer> arr = new ArrayList<>();

                 for (int i = 1; i < N; i++) {
                     if (N % i == 0) {
                         arr.add(i);
                     }
                 }

                 for(int i=0; i<arr.size(); i++) {
                     sum = sum + arr.get(i);
                 }

                 StringBuilder sb = new StringBuilder();

                 if (sum == N) {
                    for (int i=0; i<arr.size(); i++) {
                        if (i == arr.size()-1) {
                            sb.append(arr.get(i));
                        } else {
                            sb.append(arr.get(i)+" + ");
                        }
                    }
                    System.out.println(N+" = "+sb);
                 } else {
                     System.out.println(N+" is NOT perfect.");
                 }
             }

         }
     }
}
