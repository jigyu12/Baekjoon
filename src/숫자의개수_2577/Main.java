package 숫자의개수_2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = new int[3];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        int res = array[0] * array[1] * array[2];

        int cnt[] = new int[10];

        String s_res = Integer.toString(res);

        for(int i = 0; i < s_res.length(); i++){
            if(s_res.charAt(i) == '0'){
                cnt[0]++;
            }
            else if(s_res.charAt(i) == '1'){
                cnt[1]++;
            }
            else if(s_res.charAt(i) == '2'){
                cnt[2]++;
            }
            else if(s_res.charAt(i) == '3'){
                cnt[3]++;
            }
            else if(s_res.charAt(i) == '4'){
                cnt[4]++;
            }
            else if(s_res.charAt(i) == '5'){
                cnt[5]++;
            }
            else if(s_res.charAt(i) == '6'){
                cnt[6]++;
            }
            else if(s_res.charAt(i) == '7'){
                cnt[7]++;
            }
            else if(s_res.charAt(i) == '8'){
                cnt[8]++;
            }
            else if(s_res.charAt(i) == '9'){
                cnt[9]++;
            }
        }

        for(int i = 0; i < cnt.length; i++){
            System.out.println(cnt[i]);
        }

        input.close();
    }
}