package 소트인사이드_1427;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int[] number = new int[s.length()];
        for(int i = 0; i < number.length; i++){
            number[i] = Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(number);
        for(int i = number.length-1; i >= 0; i--){
            System.out.print(number[i]);
        }
        input.close();
    }
}