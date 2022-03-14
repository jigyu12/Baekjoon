package 통계학_2108;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] number = new int[n];
        for(int i = 0; i < n; i++){
            number[i] = input.nextInt();
        }
        Arrays.sort(number);

        //산술평균
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += number[i];
        }
        System.out.println(Math.round((double)sum/(double)n));

        //중앙값
        System.out.println(number[n/2]);

        //최빈값
        int[] frequency = new int[8001];
        for(int i = 0; i < n; i++){
            frequency[number[i]+4000]++;
        }
        int max_f = 0;
        int m_inx = -1;
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] > max_f){
                max_f = frequency[i];
                m_inx = i - 4000;
            }
        }
        boolean second = false;
        int s = 0;
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] == max_f){
               s++;
            }
            if(s == 2){
                m_inx = i - 4000;
                break;
            }
        }
        System.out.println(m_inx);

        //범위
        System.out.println(Math.abs(number[n-1]-number[0]));

        input.close();
    }
}