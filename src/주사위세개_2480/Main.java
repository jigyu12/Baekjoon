package 주사위세개_2480;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] dice = new int[3];
        for(int i = 0; i < 3; i++){
            dice[i] = input.nextInt();
        }
        int max = 0;
        int same = 0;
        for(int i = 0; i < 3; i++){
            int m = 0;
            for(int j = 0; j < 3; j++){
                if(dice[i] == dice[j]){
                    m++;
                }
            }
            if(max < m){
                max = m;
            }
            if(m >= 2){
                same = dice[i];
            }
        }
        if(max == 3){
            System.out.print(10000+(same*1000));
        }
        else if(max == 2){
            System.out.print(1000+(same*100));
        }
        else if(max == 1){
            int m = 0;
            for(int i = 0; i < 3; i++){
                if(dice[i] > m){
                    m = dice[i];
                }
            }
            System.out.print(m*100);
        }
        else{
            System.out.print("에러");
        }
        input.close();
    }
}