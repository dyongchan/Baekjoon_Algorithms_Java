package Baekjun.Algorithms_Basic.수학1;

/*
유클리드 호제법 : 최대공약수 구하기
A, B의 최대 공약수를 구해보자
r = A % B로 나타낼때, r과 B는 공통된 약수를 가진다는 개념에서 출발
A = ad, B = bd에서 d는 공통된 약수, but 최대공약수인지는 확인을 해야한다.
a와 b가 서로소라는 증명을 할때, d로 인하여 A, B가 만들어져야하므로 d는 최대공약수가 된다.

A = Bq + r 로 표현할 때, q는 몫, r는 나머지가 된다.
이항정리로 r로 나타내면, r = A - Bq / 각각 ad, bd를 대입하여 정리하면
r = ad - (bd)q = (a - bq)d로 나타내어 B와 r은 공통된 약수를 지니기에
상위의 식과 비교하여 a-bq 와 b가 서로소임을 나타내면 된다.
임의의 공약수 p가 있다고 가정하고 b = mp / a-bq = np 라고 할때,
b = mp를 a - bq에 대입하여 정리하면
a -(mp)q = np / a = np + mpq / a = (n+mq)p
하지만 위에서 b = mp라고 했기에 a 와 b는 공약수를 가진다고 나타낼 수 있기에, 모순이 발생한다.
(가장 상위의 식 A = ad, B = bd에서 a와 b는 서로소)

이러한 정리에 의거하여 모순이 발생해 b와 a -bq도 서로소임을 알 수 있고, 이에따라 d가 최대 공약수가 된다.
따라서 r이 0이 될때까지 반복적으로 각각의 수를 나누다보면, r이 0이되는 시점에서 최대공약수를 도출할 수 있다.
최소 공배수 : 소인수분해에 의하여 최대공약수와 그 몫을 곱할 시 최소공배수가 나오는데,
이는 A = ad / B = bd 로 표현할 시 a * b * d임을 알 수 있다.
이는 A * B / d로 d를 하나 다시 나누어 준다면 쉽게 도출 할 수 있다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java00_유클리드호제법 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        System.out.println(gcd(first,second));
        System.out.println(gcd_re(first,second));
    }

    public static int gcd(int f, int s) { // 반복문 방법

        while (s != 0) {
            int r = f % s;

            f = s;
            s = r;
        }
        return f;
    }

    public static int gcd_re(int f, int s) { // 재귀적 방법
        if(s ==0) {
            return f;
        }

        return gcd(s, f% s);
    }
}
