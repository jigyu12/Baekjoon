package 단어의개수_1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int count = 0;
        if(line.charAt(0) == ' ' && line.length() == 1){
            System.out.print(count);
            System.exit(0);
        }
        else{
            line = line.trim();
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == ' '){
                    count++;
                }
            }
            count++;
            System.out.print(count);
        }
        input.close();
    }
}