package Baekjun.Baekjun_스택;

import java.util.Scanner;

public class java01_스택 {

    public static int[] Stack;
    public static int size = 0;
    public static void push(int item) {
        Stack[size] = item;
        size++;
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        } else {
            int result = Stack[size-1];
            Stack[size] = 0;
            size --;
            return result;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return Stack[size-1];
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0 ) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Stack = new int[N];

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            String str = scanner.next();

            switch (str) {
                case "push" :
                    push(scanner.nextInt());
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
            }
        }
        System.out.println(sb);

    }
}
