package Baekjun.Baekjun_정렬;

import java.util.*;

public class java04_수정렬2 {
    public static void main(String args[]) {
        StringBuilder strB = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> arrL = new ArrayList<>();

        for(int i =0; i<N; i++) {
            arrL.add(scanner.nextInt());
        }

        Collections.sort(arrL);

        for(int i=0; i<N; i++) {
            strB.append(arrL.get(i)).append("\n");
        }
        System.out.print(strB);
    }
}

// Stringbulider = 변동가능한 문자열을 제공함으로 문자열을 더하는 시간 및 메모리를 단축
