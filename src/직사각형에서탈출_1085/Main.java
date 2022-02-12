package 직사각형에서탈출_1085;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] line = input.nextLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
        int w = Integer.parseInt(line[2]);
        int h = Integer.parseInt(line[3]);
        int b = h-y;
        int c = w-x;
        System.out.print(Math.min(Math.min(x, b), Math.min(c,y)));
        input.close();
    }
}