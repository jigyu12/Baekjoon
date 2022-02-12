package 소수_2581;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;
        int min = 0;
        for(int i = m; i <= n; i++){
            if(i == 2){
                sum += 2;
                min = 2;
            }
            else if(i % 2 == 1 && i != 1){
                int root = (int)Math.floor(Math.sqrt(i));
                boolean isPrime = true;
                for(int j = 2; j <= root; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    sum += i;
                    if(min == 0){
                        min = i;
                    }
                }
            }
        }
        if(sum == 0 && min == 0){
            System.out.print(-1);
        }
        else{
            System.out.println(sum);
            System.out.print(min);
        }
        input.close();
    }
}