package 피보나치수5_10870;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print(Fibonacci(n));
        input.close();
    }

    public static int Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return Fibonacci(n-1) + Fibonacci(n - 2);
        }
    }
}