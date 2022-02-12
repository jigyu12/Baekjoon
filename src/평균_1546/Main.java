package 평균_1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double array[] = new double[input.nextInt()];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        double max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        for(int i = 0; i < array.length; i++){
            array[i] = (array[i]/max)*100;
        }

        double sum = 0;

        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        System.out.print(sum/array.length);

        input.close();
    }
}