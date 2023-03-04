package Baekjun.Baekjun_정렬;

import java.util.*;

public class java10_2_나이순정렬 {


        public static void main (String args[]){
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();

            HashMap<String, Integer> hs = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int age = scanner.nextInt();
                String name = scanner.next();

                hs.put(name, age);
            }

            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hs.entrySet());
           entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue() - o2.getValue(); // 오름차순 정렬
                }
            });

            for(Map.Entry<String, Integer> entry : entryList){
                System.out.println(entry.getValue()+" "+entry.getKey());


            }
        }
    }
