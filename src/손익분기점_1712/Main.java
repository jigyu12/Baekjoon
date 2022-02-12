package 손익분기점_1712;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextInt();
        long b = input.nextInt();
        long c = input.nextInt();
        if(b > c || (b == c && a > 0)){
            System.out.print(-1);
        }
        else{
            long diff = c - b;
            System.out.print((a / diff) + 1);
        }
        input.close();
    }
}