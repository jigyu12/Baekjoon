package AplusB_hyphen_4_10951;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine()){
            String line = input.nextLine();
            String num[] = line.split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            System.out.println(a+b);
        }

        input.close();
    }
}