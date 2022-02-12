package 덩치_7568;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] people = new int[num][2];
        for(int i = 0; i < num; i++){
            people[i][0] = input.nextInt();
            people[i][1] = input.nextInt();
        }
        for(int i = 0; i < num; i++){
            int rank = 0;
            for(int j = 0; j < num; j++){
                if(i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]){
                    rank++;
                }
            }
            if(i == num-1){
                System.out.print((rank+1));
            }
            else{
                System.out.print((rank+1) + " ");
            }
        }
        input.close();
    }
}