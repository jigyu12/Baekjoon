package 터렛_1002;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test_Case = Integer.parseInt(input.nextLine());
        for(int t = 0; t < test_Case; t++){
            String[] line = input.nextLine().split(" ");
            double x1 = Double.parseDouble(line[0]);
            double y1 = Double.parseDouble(line[1]);
            double r1 = Double.parseDouble(line[2]);
            double x2 = Double.parseDouble(line[3]);
            double y2 = Double.parseDouble(line[4]);
            double r2 = Double.parseDouble(line[5]);
            double center_distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
            if(center_distance == 0 && r1 == r2){
                System.out.println(-1);
            } // 동일한 두 원
            else if(center_distance == 0 && r1 != r2){
                System.out.println(0);
            } // 중심은 같지만 반지름이 다른 두 원
            else if(center_distance > r1 + r2){
                System.out.println(0);
            } // 떨어져 있는 두 원
            else if(center_distance < Math.abs(r1 - r2)){
                System.out.println(0);
            } // 안에 들어 있지만 만나지 않는 두 원
            else if(center_distance == r1 + r2){
                System.out.println(1);
            } // 외접하는 두 원
            else if(center_distance == Math.abs(r1 - r2)){
                System.out.println(1);
            } // 내접하는 두 원
            else if(r1 + r2 > center_distance && center_distance > Math.abs(r1 - r2)){
                System.out.println(2);
            } // 이외에 두 점에서 만나는 두 원
        }
        input.close();
    }
}