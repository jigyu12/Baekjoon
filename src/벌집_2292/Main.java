package 벌집_2292;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int cnt = 1;
        int ans = 0;
        for(int i = 1; i <= Integer.MAX_VALUE; i++){
            cnt = cnt + (6 * (i-1));
            if(cnt >= num){
                ans = i;
                break;
            }
        }
        System.out.print(ans);
        input.close();
    }
}