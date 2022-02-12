package 소수구하기_1929;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        boolean[] primeNum = new boolean[n-m+1];
        Arrays.fill(primeNum, true);
        if(m == 1){
            primeNum[0] = false;
        }
        for(int i = 0; i < primeNum.length; i++){
            if(primeNum[i]){
                int num = i + m;
                boolean isPrime = true;
                for(int j = 2; j <= (int)Math.floor(Math.sqrt(num)); j++){
                    if(num % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(num);
                    for(int j = i; j < primeNum.length; j += num){
                        primeNum[j] = false;
                    }
                }
                else{
                    primeNum[i] = false;
                }
            }
        }
        input.close();
    }
}