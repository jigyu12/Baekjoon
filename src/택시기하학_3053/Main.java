package 택시기하학_3053;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        System.out.printf("%.6f\n",r * r * Math.PI);
        System.out.printf("%.6f\n",(double)(r * r * 2));
        input.close();
    }
}