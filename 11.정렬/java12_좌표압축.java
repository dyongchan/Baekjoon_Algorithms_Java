package Baekjun.Baekjun_정렬;

import java.util.*;

public class java12_좌표압축 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            int a = scanner.nextInt();
            arr.add(a);
            arr2.add(a);
        }
        Collections.sort(arr);

        int count = 0;
        for(int i=0; i<N; i++) {
            if(!hm.containsKey(arr.get(i))) {
                hm.put(arr.get(i), count);
                count++;
            }
        }

        for(int a : arr2){
            int result = hm.get(a);
            sb.append(result).append(' ');
        }

        System.out.println(sb);
    }
}

