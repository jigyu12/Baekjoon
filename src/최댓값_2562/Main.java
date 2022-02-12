package 최댓값_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int inx = -1;

        int array[] = new int[9];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
                inx = i;
            }
        }

        System.out.print(max + "\n" + (inx+1));

        input.close();
    }
}