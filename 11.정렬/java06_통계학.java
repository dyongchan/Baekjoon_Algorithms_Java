package Baekjun.Baekjun_정렬;

import java.util.*;

public class java06_통계학 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        int cnt = 0; // value의 중복을 체크

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr_val = new ArrayList<>(); // value 값들을 넣는 리스트
        ArrayList<Integer> arr_result = new ArrayList<>(); // 재출력된 key 값을 넣는 리스트

        int N = scanner.nextInt();
        int sum = 0;

        for(int i =0; i<N; i++) {
            arr.add(scanner.nextInt());
            sum+= arr.get(i);
        }

        Collections.sort(arr);

        HashMap<Integer, Integer> hs = new HashMap<>();


        for (int i=0; i<arr.size(); i++) {
            if(hs.containsKey(arr.get(i))) {
                hs.put(arr.get(i), hs.get(arr.get(i))+1);
            } else{
                hs.put(arr.get(i), 1);
            }
        }

        for (Integer key : hs.keySet()) {
            arr_val.add(hs.get(key));
        }


        Collections.sort(arr_val, Collections.reverseOrder());
        // value (중복된 값의 횟수가 내림차순으로 정리 되어있음)


        // 가장 많은 중복횟수의 key 값들이 여러개 있는지 검사
        for (int i = 0; i<arr_val.size(); i++) {
            if (arr_val.get(i).equals(arr_val.get(0))) {
                cnt++;

            }
        }
        // 모두 다른 수도 1의 중복횟수의 여러 key값이 됨.

        for(Map.Entry<Integer,Integer> entry : hs.entrySet()) {
            if(entry.getValue().equals(arr_val.get(0))) {
                arr_result.add(entry.getKey());
            }
        }

        Collections.sort(arr_result); // 두번째로 작은수 = 오름차순 정렬 후 인덱스 1번

        if(cnt > 1) { // value로 key를 찾고 정렬 후 2번째 인덱스 출력

            result = arr_result.get(1);

        } else { // 중복 수가 가장 큰 숫자가 하나만 있어서 배열에 하나의 값만 들어감
            result = arr_result.get(0);
        }


        System.out.println((int) Math.round(sum/ (double)arr.size()));
        System.out.println(arr.get(arr.size()/2));
        System.out.println(result);
        System.out.println(arr.get(arr.size()-1) - arr.get(0));
    }
}
