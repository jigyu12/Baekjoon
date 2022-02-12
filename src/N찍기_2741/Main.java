package N찍기_2741;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
        input.close();
    }
}