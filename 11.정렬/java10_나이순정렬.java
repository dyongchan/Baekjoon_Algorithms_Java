package Baekjun.Baekjun_정렬;

import org.example.Main;

import java.util.*;

// 나이는 오름차순 / 입력은 입력받은 순

public class java10_나이순정렬 {

    public  static class sorting {
        private int age;
        private String name;

        public sorting(int age, String name){
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }
        public String getName() {
            return this.name;
        }

        public void setAge() {
            this.age = age;
        }

        public void setName() {
            this.name = name;
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Main.sorting> arr = new ArrayList<>();
        int N = scanner.nextInt();

        for(int i=0; i<N; i++) {
            arr.add(new Main.sorting(scanner.nextInt(), scanner.next()));
        }

        Collections.sort(arr, new Comparator<Main.sorting>() {
            @Override
            public int compare(Main.sorting o1, Main.sorting o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i).getAge()+" "+arr.get(i).getName());
        }
    }
}