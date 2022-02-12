package 부녀회장이될테야_2775;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Case_num = Integer.parseInt(input.nextLine());
        for(int i = 0; i < Case_num; i++){
            int k = Integer.parseInt(input.nextLine());
            int n = Integer.parseInt(input.nextLine());
            int[] array = new int[n];
            int[] ans_array = new int[n];
            for(int j = 0; j < n; j++){
                array[j] = j+1;
            }
            for(int j = 1; j <= k; j++){
                for(int z = 0; z < n; z++){
                    int sum = 0;
                    for(int x = 0; x <= z; x++){
                        sum += array[x];
                    }
                    ans_array[z] = sum;
                }
                for(int z = 0; z < n; z++){
                    array[z] = ans_array[z];
                }
            }
            System.out.println(ans_array[n-1]);
        }
        input.close();
    }
}