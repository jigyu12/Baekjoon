package 큰수AplusB_10757;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] number = input.nextLine().split(" ");
        String num1 = number[0];
        String num2 = number[1];
        if(number[0].length() > number[1].length()){
            num2 = "0".repeat(number[0].length() - number[1].length()) + num2;
        }
        else if(number[0].length() < number[1].length()){
            num1 = number[1];
            num2 = number[0];
            num2 = "0".repeat(Math.max(0, number[1].length() - number[0].length())) + num2;
        }
        char[] ans = new char[num1.length()+1];
        Arrays.fill(ans, '0');
        int inx = ans.length - 1;
        for(int i = num1.length()-1; i >= 0; i--){
            int first = Character.getNumericValue(num1.charAt(i));
            int second = Character.getNumericValue(num2.charAt(i));
            int sum = first + second + Character.getNumericValue(ans[inx]);
            if(sum >= 10){
                ans[inx-1] = '1';
                sum -= 10;
            }
            ans[inx] = Character.forDigit(sum, 10);
            inx--;
        }
        if(ans[0] == '0'){
            for(int i = 1; i < ans.length; i++) {
                System.out.print(ans[i]);
            }
        }
        else{
            for (char an : ans) {
                System.out.print(an);
            }
        }
        input.close();
    }
}