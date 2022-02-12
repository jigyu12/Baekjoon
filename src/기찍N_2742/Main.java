package 기찍N_2742;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = num; i >= 1; i--){
            System.out.println(i);
        }
        input.close();
    }
}