package 더하기사이클_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = -1;
        int count = 0;

        if (a < 10) {
            String num = "0" + a;
            while (a != b) {
                int plus,one, ten;
                if(num.length() == 1){ ;
                    one = Character.getNumericValue(num.charAt(0));
                    plus = one;
                }
                else{
                    ten = Character.getNumericValue(num.charAt(0));
                    one = Character.getNumericValue(num.charAt(1));
                    plus = ten + one;
                }
                String p = Integer.toString(plus);
                if(p.length() == 1){
                    b = Integer.parseInt(one + Character.toString(p.charAt(0)));
                }
                else {
                    b = Integer.parseInt(one + Character.toString(p.charAt(1)));
                }
                num = Integer.toString(b);
                count++;
            }
        } else {
            String num = Integer.toString(a);
            while (a != b) {
                int plus, one, ten;
                if (num.length() == 1) {
                    one = Character.getNumericValue(num.charAt(0));
                    plus = one;
                } else {
                    ten = Character.getNumericValue(num.charAt(0));
                    one = Character.getNumericValue(num.charAt(1));
                    plus = ten + one;
                }
                String p = Integer.toString(plus);
                if (p.length() == 1) {
                    b = Integer.parseInt(one + Character.toString(p.charAt(0)));
                } else {
                    b = Integer.parseInt(one + Character.toString(p.charAt(1)));
                }
                num = Integer.toString(b);
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}