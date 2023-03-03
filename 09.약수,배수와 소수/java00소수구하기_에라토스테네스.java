package Baekjun.Baekjun_기본수학2;

// 에라토스테네스의 체 : 특정수를 나눈 수의 몫과 나눈 수중 하나는 특정 수의 제곱근 보다 작다.
// 2부터 특정 수의 제곱근 전까지의 수를 제거해주면 소수가 나온다.
public class java00소수구하기_에라토스테네스 {
    public static void main(String args[]) {

        boolean arr[] = new boolean[10001];

        arr[0] = true;
        arr[1] = true;

        // false의 인덱스를 출력한다.
        // false = 소수 / true = 제거된 배수

        for(int i=2; i< Math.sqrt(arr.length); i++) {
            for (int j=i; j*i<arr.length; j++) {
                arr[i*j] = true;
            }
        }
        for (int i=2; i<arr.length; i++) {
            if(arr[i]==false) {
                System.out.println(i);
            }
        }
    }
}
