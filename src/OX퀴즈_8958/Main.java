package OX퀴즈_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Case = Integer.parseInt(input.nextLine());

        String OX[] = new String[Case];

        for(int i = 0; i < OX.length; i++){
            OX[i] = input.nextLine();
        }

        for(int i = 0; i < OX.length; i++){
            int score[] = new int[OX[i].length()];
            for(int j = 0; j < OX[i].length(); j++){
                if(OX[i].charAt(j) == 'O' && j == 0) {
                    score[j] = 1;
                }
                else if(OX[i].charAt(j) == 'O' && j > 0) {
                    score[j] = score[j-1]+1;
                }
                else if(OX[i].charAt(j) == 'X'){
                    score[j] = 0;
                }
            }
            int sum = 0;
            for(int j = 0; j < score.length; j++){
                sum = sum + score[j];
            }
            System.out.println(sum);
        }
        input.close();
    }
}