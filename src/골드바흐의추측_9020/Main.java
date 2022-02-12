package 골드바흐의추측_9020;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int case_Num = Integer.parseInt(input.nextLine());
        for(int t = 0; t < case_Num; t++){
            int num = Integer.parseInt(input.nextLine());
            int num1 = num/2;
            int num2 = num/2;
            while(true){
                boolean isPrime1 = true;
                boolean isPrime2 = true;
                for(int i = 2; i <= (int)Math.floor(Math.sqrt(num1)); i++){
                    if (num1 % i == 0) {
                        isPrime1 = false;
                        break;
                    }
                }
                for(int i = 2; i <= (int)Math.floor(Math.sqrt(num2)); i++){
                    if(num2 % i == 0){
                        isPrime2 = false;
                        break;
                    }
                }
                if(isPrime1 && isPrime2){
                    break;
                }
                else{
                    num1--;
                    num2++;
                }
            }
            System.out.println(num1 + " " + num2);
        }
        input.close();
    }
}