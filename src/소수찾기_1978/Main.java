package 소수찾기_1978;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        int cnt = 0;
        for(int i = 0; i < t; i++){
            int num = input.nextInt();
            if(num == 2){
                cnt++;
            }
            else if(num % 2 == 1 && num != 1){
                int root = (int)Math.floor(Math.sqrt(num));
                boolean isPrime = true;
                for(int j = 2; j <= root; j++){
                    if(num % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
        input.close();
    }
}