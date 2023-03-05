package Baekjun.Baekjun_정렬;

import java.util.*;

public class java10_단어정렬 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hs.add(scanner.next()) ;
        }

        ArrayList<String> arr = new ArrayList<>(hs);

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (int i =0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}