package AplusB_hyphen_3_10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 1; i <= a; i++) {
            int b = input.nextInt();
            int c = input.nextInt();
            System.out.println(b+c);
        }
        input.close();
    }
}