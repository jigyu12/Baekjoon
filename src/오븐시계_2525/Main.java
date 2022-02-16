package 오븐시계_2525;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int sec = input.nextInt();
        int plus = input.nextInt();
        int min_plus = plus / 60;
        int sec_plus = plus % 60;
        int minute = -1;
        int second = -1;
        if(sec + sec_plus >= 60){
            second = sec + sec_plus - 60;
            min_plus++;
        }
        else{
            second = sec + sec_plus;
        }
        if(min + min_plus >= 24){
            minute = min + min_plus - 24;
        }
        else{
            minute = min + min_plus;
        }
        System.out.print(minute + " " + second);
        input.close();
    }
}