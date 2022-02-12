package AplusB_hyphen_5_10952;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String num[] = line.split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);

        while(a != 0 && b != 0){
            System.out.println(a + b);
            line = input.nextLine();
            num = line.split(" ");
            a = Integer.parseInt(num[0]);
            b = Integer.parseInt(num[1]);
        }

        input.close();
    }
}