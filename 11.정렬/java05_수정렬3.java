package Baekjun.Baekjun_정렬;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java05_수정렬3 {
    public static void main(String[] args) throws IOException {

        int[] cnt = new int[10001];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        for (int i=0; i<N; i++) {
            int n = Integer.parseInt(bf.readLine());
            cnt[n]++;
        }
        bf.close();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<cnt.length; i++) {
            while (cnt[i]-- > 0) {
                sb.append(i).append('\n');
            }
        }
        
        System.out.print(sb);
    }
}