package 한수_1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int res = countNum(a);
        System.out.print(res);
        input.close();
    }

    public static int countNum(int a){
        int cnt = 0;
        for(int i = 1; i <= a; i++){
            String num = Integer.toString(i);
            if(num.length() <= 2){
                cnt++;
            }
            else{
                boolean isAns = true;
                int diff = Character.getNumericValue(num.charAt(0))-Character.getNumericValue(num.charAt(1));
                for(int j = 1; j < num.length()-1; j++){
                    if(!((Character.getNumericValue(num.charAt(j))-Character.getNumericValue(num.charAt(j+1))) == diff)){
                        isAns = false;
                    }
                }
                if(isAns){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}