// BufferedReader 와 BufferedWriter의 사용


package Baekjun.Baekjun_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;
import java.util.StringTokenizer;

public class java05_빠른합 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st;

        for(int i=0; i<N; i++) {
         st = new StringTokenizer(bf.readLine()," ");
         bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }

        bf.close();

        bw.flush();
        bw.close();

    }
}


