package 영화감독숌_1436;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int cnt = 0;
        int answer = -1;
        for(int i = 666; i <= Integer.MAX_VALUE; i++){
            boolean is666 = false;
            String six = Integer.toString(i);
            for(int j = 0; j < six.length()-2; j++){
                if(six.charAt(j) == '6' && six.charAt(j+1) == '6' && six.charAt(j+2) == '6'){
                    is666 = true;
                }
            }
            if(is666){
                cnt++;
            }
            if(N == cnt){
                answer = i;
                break;
            }
        }
        System.out.print(answer);
        input.close();
    }
}