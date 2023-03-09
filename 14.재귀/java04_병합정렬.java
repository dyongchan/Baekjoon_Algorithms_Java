package Baekjun.Baekjun_재귀;

import java.io.*;
import java.util.StringTokenizer;

public class java04_병합정렬 {

    static int[] tmp;
    static int cnt = 0;
    static int result = -1;
    static int ind = 0;
    public static void merge_sort(int[] A,int p,int r) {
        if(p < r) {
            int q = (p+r) / 2 ; // 정렬하고 싶은 배열를 절반으로 자르기 위한 값
            merge_sort(A,p,q); // 분할된 만큼의 배열을 다시 재귀 함수로 넣어 정렬
            merge_sort(A,q+1,r);
            merge(A,p,q,r); // 최종적으로 정렬된 배열들을 합병
        }
    }
    public static void merge(int[] A,int p, int q, int r) {


        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }

        }
        while (i <= q) {
            tmp[t++] = A[i++];
        }
        while (j <= r) {
            tmp[t++] = A[j++];

        }
        i = p;
        t = 0;
        while (i <= r) {
            cnt++;
            if(cnt == ind) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        ind =  Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        int[] arr = new int[N];

        tmp = new int[arr.length];

        for (int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr,0,arr.length-1);

        System.out.println(result);

    }
}
