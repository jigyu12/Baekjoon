package 문자열반복_2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        for(int i = 0; i < a; i++){
            String line = input.nextLine();
            String s[] = line.split(" ");
            for(int j = 0; j < s[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(s[0]); k++) {
                    System.out.print(s[1].charAt(j));
                }
            }
            System.out.println();
        }
        input.close();
    }
}