package Baekjun.Baekjun_함수;

// n과 n의 각 자리수를 더하는 함수를 이용하여 생성자가 없는 셀프넘버를 출력

public class java02_셀프넘버 {

    public static int d(int insert) {
        int sum = 0;
        sum = insert;

        while (insert != 0) {
            sum = sum + insert % 10;
            insert = insert / 10;
        }

        return sum;
    }

    public static void main(String args[]) {

        boolean[] arr = new boolean[10001];

        for(int i=1; i<10001; i++) {
            int n = d(i); // i값이 생성자가 되는 값 출력
            if (n<10001) {
                arr[n] = true; // 해당하는 값의 상태를 변경
            }
        }
        for(int i=1; i<10001; i++){
            if(arr[i] == false) {
                System.out.println(i);
            }
        }
    }
}

// 연산자의 우선순위에 유의
// boolean 배열을 이용하여 i(인덱스)에 해당하는 배열의 위치의 상태를 변경
