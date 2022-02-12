package 윤년_2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
        input.close();
    }
}