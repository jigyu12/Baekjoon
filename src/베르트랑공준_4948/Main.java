package 베르트랑공준_4948;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0){
            boolean[] primeNum = new boolean[n];
            Arrays.fill(primeNum, true);
            int cnt = 0;
            for(int i = 0; i < primeNum.length; i++){
                if(primeNum[i]){
                    int num = i + n + 1;
                    boolean isPrime = true;
                    for(int j = 2; j <= (int)Math.floor(Math.sqrt(num)); j++){
                        if(num % j == 0){
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime){
                        cnt++;
                        for(int j = i; j < primeNum.length; j += num){
                            primeNum[j] = false;
                        }
                    }
                    else{
                        primeNum[i] = false;
                    }
                }
            }
            System.out.println(cnt);
            n = input.nextInt();
        }
        input.close();
    }
}