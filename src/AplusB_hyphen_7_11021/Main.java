package AplusB_hyphen_7_11021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Case = Integer.parseInt(input.nextLine());
        for(int i = 1; i <= Case; i++){
            String line = input.nextLine();
            String[] num = line.split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            System.out.println("Case #" + i + ": " + (a+b));
        }
        input.close();
    }
}