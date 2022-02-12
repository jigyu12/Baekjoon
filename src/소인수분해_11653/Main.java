package 소인수분해_11653;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int root = (int)Math.floor(Math.sqrt(num));
        boolean isPrime = true;
        for(int j = 2; j <= root; j++){
            if(num % j == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime && num != 1){
            System.out.print(num);
        }
        else if(num != 1){
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 1; i <= root; i++){
                if(num % i == 0){
                    arrayList.add(i);
                }
            }
            int inx = arrayList.size();
            if(arrayList.get(inx-1) * arrayList.get(inx-1) == num){
                for(int i = inx - 2; i >= 0; i--){
                    arrayList.add(num/arrayList.get(i));
                }
            }
            else{
                for(int i = inx - 1; i >= 0; i--){
                    arrayList.add(num/arrayList.get(i));
                }
            }
            ArrayList<Integer> primeNum = new ArrayList<>();
            for(int i = 1; i <= arrayList.size()-2; i++){
                isPrime = true;
                root = (int)Math.floor(Math.sqrt(arrayList.get(i)));
                for(int j = 2; j <= root; j++){
                    if(arrayList.get(i) % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    primeNum.add(arrayList.get(i));
                }
            }
            for(int i = 0; i < primeNum.size(); i++){
                if(num % primeNum.get(i) == 0){
                    System.out.println(primeNum.get(i));
                    num = num / primeNum.get(i);
                    i--;
                }
            }
        }
        input.close();
    }
}