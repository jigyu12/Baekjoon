package 블랙잭_2798;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        Integer[] num = new Integer[N];
        for(int i = 0; i < num.length; i++){
            num[i] = input.nextInt();
        }
        Arrays.sort(num, Collections.reverseOrder());
        int sum = -1;
        for(int i = 0; i < num.length-2; i++){
            for(int j = i+1; j < num.length-1; j++) {
                for (int k = j+1; k < num.length; k++) {
                    int sum1 = num[i] + num[j] + num[k];
                    if (sum < sum1 && sum1 <= M) {
                        sum = sum1;
                    }
                }
            }
        }
        System.out.print(sum);
        input.close();
    }
}