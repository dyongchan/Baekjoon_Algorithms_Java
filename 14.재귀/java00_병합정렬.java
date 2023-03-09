package Baekjun.Baekjun_재귀;

import java.util.Scanner;

public class java00_병합정렬 {

    public static void merge_sort(int[] A,int p,int r) {
        if(p < r) {
            int q = (p+r) / 2 ; // 정렬하고 싶은 배열를 절반으로 자르기 위한 값
            merge_sort(A,p,q); // 분할된 만큼의 배열을 다시 재귀 함수로 넣어 정렬
            merge_sort(A,q+1,r);
            merge(A,p,q,r); // 최종적으로 정렬된 배열들을 합병
        }

    }
    public static void merge(int[] A,int p, int q, int r) {

        int[] tmp = new int[A.length];

        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) { // 각각의 배열의 맨 앞 값을 비교하고 작은 값을 담는다.
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }
        while (i <= q) { // 남은 왼쪽 배열의 값을 담는다.
            tmp[t++] = A[i++];
        }
        while (j <= r) { // 남은 오른쪽 배열의 값을 담는다.
            tmp[t++] = A[j++];
        }
        i = p;
        t = 0;
        while (i <= r) { // 값 옮기기
            A[i++] = tmp[t++];
        }
    }


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        merge_sort(arr,0,arr.length-1);

    }
}
