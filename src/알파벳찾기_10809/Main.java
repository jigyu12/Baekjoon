package 알파벳찾기_10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char a = 97;
        for(int i = 0; i < 26; i++){
            char b = (char)(a+i);
            int inx = -1;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == b){
                    inx = j;
                    break;
                }
            }
            System.out.print(inx + " ");
        }
        input.close();
    }
}