package 분수찾기_1193;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int last_num = 0;
        int inx = 0;
        for(int i = 1; true; i++){
            last_num = last_num + i;
            if(last_num >= num){
                inx = i;
                break;
            }
        }
        int diff = last_num - num;
        if(inx % 2 == 0){
            System.out.print((inx-diff) + "/" + (1+diff));
        }
        else{
            System.out.print((1+diff) + "/" + (inx-diff));
        }
        input.close();
    }
}