package 분해합_2231;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int constructor = 0;
        for(int i = 1; i <= N; i++){
            String num = Integer.toString(i);
            int sum = i;
            for(int j = 0; j < num.length(); j++){
                sum += Character.getNumericValue(num.charAt(j));
            }
            if(sum == N){
                constructor = i;
                break;
            }
        }
        System.out.print(constructor);
        input.close();
    }
}