package 최소최대_10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String first = input.nextLine();
        String second = input.nextLine();

        int array[] = new int[Integer.parseInt(first)];
        String s_num[] = second.split(" ");

        for(int i = 0; i < s_num.length; i++){
            array[i] = Integer.parseInt(s_num[i]);
        }

        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }

            if(max < array[i]){
                max = array[i];
            }
        }

        System.out.print(min + " " + max);

        input.close();
    }
}