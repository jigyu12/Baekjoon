package 평균은넘겠지_4344;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Case = Integer.parseInt(input.nextLine());

        String stu_score[] = new String[Case];

        for(int i = 0; i < stu_score.length; i++){
            stu_score[i] = input.nextLine();
        }

        for(int i = 0; i < stu_score.length; i++){
            String temp[] = stu_score[i].split(" ");
            int score[] = new int[Integer.parseInt(temp[0])];
            for(int j = 1; j < temp.length; j++){
                score[j-1] = Integer.parseInt(temp[j]);
            }
            int sum = 0;
            for(int j = 0; j < score.length; j++){
                sum = sum + score[j];
            }
            int avg = sum / score.length;
            int count = 0;
            for(int j = 0; j < score.length; j++){
                if(score[j] > avg){
                    count++;
                }
            }
            double ans = ((double)count/ score.length)*100;
            System.out.printf("%.3f", ans);
            System.out.print("%\n");
        }
        input.close();
    }
}