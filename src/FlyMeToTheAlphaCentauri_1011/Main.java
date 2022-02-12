package FlyMeToTheAlphaCentauri_1011;

import java.util.*;

// 차수	 설명	최대거리	이때_워프한_회수 최고속도
//  1	  1	      1	          1	         1
//  2	 121	  4	          3	         2
//  i  1..i..1   i^2	     2i-1	     i

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test_Case = Integer.parseInt(input.nextLine());
        for(int t = 0; t < test_Case; t++) {
            String[] line = input.nextLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int distance = y - x;
            int max_speed;
            for(int i = 0; true; i++){
                if(distance < Math.pow(i, 2)){
                    max_speed = i-1;
                    break;
                }
            }
            int remain_distance = distance - (int)Math.pow(max_speed, 2);
            int remain_times = (int)Math.ceil((double)remain_distance / (double)max_speed);
            System.out.println((2*max_speed-1)+remain_times);
        }
        input.close();
    }
}