package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java12_더하기사이클02 {
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            int insert = scanner.nextInt();

            int insert_1 = 0;
            int sum = 0;
            int sum_1 = 0;

            int new_insert = 0;

            int last_new_insert = insert;

            int i = 0;

           while (true) {

                insert_1 = insert % 10;
                sum = insert / 10 + insert % 10;
                sum_1 = sum % 10 ;

                new_insert = (insert_1 * 10) + sum_1;

                insert = new_insert ;
                i++;

                if (insert == last_new_insert) {
                    System.out.print(i);
                    break;
                }

            }
        }
}
// while (조건식) 조건식이 성립만 하면 작성한 아래식은 계속 돈다.
// for 문 작성 시 최대로 반복되게 하는 값이 애매할 때는 while을 고민하자 (무한으로 반복)
// 초기화를 해서 설정된 값과 이후 반복이나 조건을 통해 변경되는 값은 다르다.
// 반복문에서 초기화를 시킬 때는 반복적으로 돌 때마다 초기화 된다는걸 유의
