package Baekjun.Algorithms_Basic.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java02_단어뒤집기 {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            String str = bf.readLine();
            String[] arr = str.split(" ");

            for(int j=0; j<arr.length; j++) {
                StringBuffer sf = new StringBuffer(arr[j]);
                    sf.reverse();
                    String factor = sf.toString();
                if (j == arr.length -1) {
                    sb.append(factor).append(" ").append('\n');
                } else {
                    sb.append(factor).append(" ");
                }
            }
        }
        System.out.print(sb);
    }
}
