package 곱셈_2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String sb = Integer.toString(b);
        System.out.println(a * Character.getNumericValue(sb.charAt(2)));
        System.out.println(a * Character.getNumericValue(sb.charAt(1)));
        System.out.println(a * Character.getNumericValue(sb.charAt(0)));
        System.out.println(a * b);
        input.close();
    }
}