package 팩토리얼_10872;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.print(Factorial(N));
        input.close();
    }

    public static int Factorial(int N){
        if(N <= 1){
            return 1;
        }
        else{
            return N * Factorial(N-1);
        }
    }
}