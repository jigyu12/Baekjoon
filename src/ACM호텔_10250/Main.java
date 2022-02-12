package ACM호텔_10250;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Case_num = Integer.parseInt(input.nextLine());
        for(int i = 1; i <= Case_num; i++){
            String Line = input.nextLine();
            String[] num_array = Line.split(" ");
            int h = Integer.parseInt(num_array[0]);
            int w = Integer.parseInt(num_array[1]);
            int v = Integer.parseInt(num_array[2]);
            int X = 1;
            int Y = 1;
            int remain = (v % h) - 1;
            if(remain == -1){
                remain = h-1;
            }
            X = X + remain;
            Y = Y + ((v-1) / h);
            if(i == Case_num){
                System.out.printf("%d%02d",X,Y);
            }
            else{
                System.out.printf("%d%02d\n",X,Y);
            }
        }
        input.close();
    }
}