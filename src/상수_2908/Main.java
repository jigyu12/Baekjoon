package 상수_2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] num = line.split(" ");
        StringBuilder num1 = new StringBuilder();
        for(int i = num[0].length()-1; i >=0; i--){
            num1.append(num[0].charAt(i));
        }
        StringBuilder num2 = new StringBuilder();
        for(int i = num[1].length()-1; i >=0; i--){
            num2.append(num[1].charAt(i));
        }
        int a = Integer.parseInt(String.valueOf(num1));
        int b = Integer.parseInt(String.valueOf(num2));
        System.out.print(Math.max(a, b));
        input.close();
    }
}