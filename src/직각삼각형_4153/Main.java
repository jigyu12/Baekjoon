package 직각삼각형_4153;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            String[] line = input.nextLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int z = Integer.parseInt(line[2]);
            if(x == 0 && y == 0 && z == 0){
                break;
            }
            else{
                if(x > z){
                    int temp;
                    temp = x;
                    x = z;
                    z = temp;
                }
                if(y > z){
                    int temp;
                    temp = y;
                    y = z;
                    z = temp;
                }
                if((int)Math.pow(x,2) + (int)Math.pow(y,2) == (int)Math.pow(z,2)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
        }
        input.close();
    }
}