package 체스판다시칠하기_1018;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        String temp = input.nextLine();
        String[] Chess = new String[N];
        for(int i = 0; i < Chess.length; i++){
            Chess[i] = input.nextLine();
        }
        int min = Integer.MAX_VALUE;
        int cnt_B = 0;
        int cnt_W = 0;
        String[] Chess_B = {"BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB"};
        String[] Chess_W = {"WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW"};
        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){
                cnt_B = 0;
                cnt_W = 0;
                for(int m = i; m < i+8; m++){
                    for(int n = j; n < j+8; n++){
                        if(Chess[m].charAt(n) != Chess_B[m-i].charAt(n-j)){
                            cnt_B++;
                        }
                        if(Chess[m].charAt(n) != Chess_W[m-i].charAt(n-j)){
                            cnt_W++;
                        }
                    }
                }
                if(min > cnt_B && cnt_W >= cnt_B){
                    min = cnt_B;
                }
                else if(min > cnt_W && cnt_B >= cnt_W){
                    min = cnt_W;
                }
            }
        }
        System.out.print(min);
        input.close();
    }
}