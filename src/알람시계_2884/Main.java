package 알람시계_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int total = a * 60 + b - 45;
        if(total < 0) {
            System.out.println("" + (total+(24*60))/60 + " " + (total+(24*60))%60);
        }
        else {
            System.out.println("" + total/60 + " " + total%60);
        }
        input.close();
    }
}