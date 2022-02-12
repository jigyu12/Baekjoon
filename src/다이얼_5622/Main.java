package 다이얼_5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int ans = 0;
        for(int i = 0; i < line.length(); i++){
            if((int)line.charAt(i) >= 65 && (int)line.charAt(i) <= 67){
                ans += 3;
            }
            else if((int)line.charAt(i) >= 68 && (int)line.charAt(i) <= 70){
                ans += 4;
            }
            else if((int)line.charAt(i) >= 71 && (int)line.charAt(i) <= 73){
                ans += 5;
            }
            else if((int)line.charAt(i) >= 74 && (int)line.charAt(i) <= 76){
                ans += 6;
            }
            else if((int)line.charAt(i) >= 77 && (int)line.charAt(i) <= 79){
                ans += 7;
            }
            else if((int)line.charAt(i) >= 80 && (int)line.charAt(i) <= 83){
                ans += 8;
            }
            else if((int)line.charAt(i) >= 84 && (int)line.charAt(i) <= 86){
                ans += 9;
            }
            else if((int)line.charAt(i) >= 87 && (int)line.charAt(i) <= 90){
                ans += 10;
            }
        }
        System.out.print(ans);
        input.close();
    }
}