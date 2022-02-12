package 숫자의합_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        String b = input.nextLine();
        int sum = 0;
        for(int i = 0; i < a; i++){
            sum = sum + Character.getNumericValue(b.charAt(i));
        }
        System.out.print(sum);
        input.close();
    }
}