package Baekjun.Algorithms_Basic.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java03_최소공배수 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine()," ");

            int gcd = 0;
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if(first == 1 || second == 1) {
                sb.append(first * second).append('\n');
            } else {
                if(first > second) {
                    for(int j=1; j<=second; j++) {
                        if(first % j == 0 && second % j == 0) {
                            gcd = j ;
                        }
                    }
                } else {
                    for(int j=1; j<=first; j++) {
                        if(first % j ==0 && second % j ==0) {
                            gcd = j ;
                        }
                    }
                }
                if (gcd == 1) {
                    sb.append(first * second).append('\n');
                } else {
                    int k=1;
                    while (true) {
                        int compare = gcd * k;
                        if(compare % first == 0 && compare % second == 0){
                            sb.append(compare).append('\n');
                            break;
                        }
                        k++;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
