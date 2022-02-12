package 별찍기_hyphen_2_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        for(int i = 1; i <= num; i++){
            for(int k = num-i; k >= 1; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}