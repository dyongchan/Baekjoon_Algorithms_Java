package Baekjun.Baekjun_함수;

// n개의 정수가 포함된 배열에서 정수 n개의 합을 모두 더하는 메소드 생성

public class java01_N개의합 {


    public static long sum(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        java01_N개의합 test1 = new java01_N개의합();

        int[] arr = {1,2,3,4,5};

        System.out.print(sum(arr));
    }
}

