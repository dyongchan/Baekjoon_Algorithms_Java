package Baekjun.Baekjun_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class java09_좌표정렬02 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;

        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            } // 두 번째 인자의 오름차순 정렬 -> 첫 번째 인자의 오름차순 정렬 조건
        });

        for(int i=0; i<N; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);


        }
    }
}
