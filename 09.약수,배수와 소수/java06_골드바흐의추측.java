package Baekjun.Baekjun_기본수학2;

import java.util.Scanner;

public class java06_골드바흐의추측 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int test_case = scanner.nextInt();

        boolean[] arr = new boolean[10001];
        for(int j=2; j<Math.sqrt(arr.length); j++) {
            for (int k=j*j; k<arr.length; k=k+j) {
                arr[k] = true;
            }
        }
        arr[0] = true;
        arr[1] = true;

        for(int i=0; i<test_case; i++) {
            int insert = scanner.nextInt();
            int retsult1 = insert / 2;
            int retsult2 = insert / 2;
            while (true) {
                    if(arr[retsult1] != false || arr[retsult2] != false) {
                        retsult1--;
                        retsult2++;
                    }
                    if(arr[retsult1] == false && arr[retsult2] == false) {
                        System.out.println(retsult1+" "+retsult2);
                        break;
                    }
            }
        }
    }
}
