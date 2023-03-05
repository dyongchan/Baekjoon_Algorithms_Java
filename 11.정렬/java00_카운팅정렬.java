package Baekjun.Baekjun_정렬;


import java.util.Scanner;

/*
Counting sort (카운팅 정렬)
수의 범위가 작을 때 사용하는 정렬이다.
정렬하고 싶은 배열의 크기에 특정 수의 범위만큼 수가 들어 있을 때 빠르게 정렬할 수 있다.

1. 정렬하고싶은 배열내에 값과 같은 인덱스의 counting 배열의 값을 증가시킨다.
2. counting 배열을 누적합시켜 인덱스의 크기가 커질수록 값이 커지게 한다.
3. 누적합에 대한 counting 인덱스의 값을 정렬하고싶은 배열의 뒤부터 확인하여(안정 정렬을 위해)
정렬하고싶은 배열의 값과 counting 인덱스의 값이 같을 때 해당 인덱스 내부값을 1씩 감소시켜
이 값으로 새로운 배열 result의 인덱스에 해당 인덱스의 값을 배치시킨다.

누적합 - 1 = 해당 값에 대한 새로운 정렬된 배열의 인덱스

 */


// 수의 범위가 작을 때 사용하는 counting sort

public class java00_카운팅정렬 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        int[] counting = new int[N];
        int[] result = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<counting.length; j++){
                if (arr[i] == j) {
                    counting[j]++;
                }
            }
        }

        for (int i = 1; i<counting.length; i++) {
            counting[i] = counting[i] + counting[i-1];
        }

        for(int i=arr.length-1; 0<=i; i--) {
            int num = arr[i];
            counting[num]--;
            result[counting[num]] = num;
            }


        for(int i = 0; i< result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
