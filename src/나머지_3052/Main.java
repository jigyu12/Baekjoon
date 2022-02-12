package 나머지_3052;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        int cnt[] = new int[10];

        for(int i = 0; i < cnt.length; i++){
            cnt[i] = array[i] % 42;
        }

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < cnt.length; i++){
            set.add(cnt[i]);
        }

        System.out.print(set.size());

        input.close();
    }
}