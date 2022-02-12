package 설탕배달_2839;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int kg = input.nextInt();
        boolean five = false;
        int max = -1;
        for(int i = 1; i <= 1000; i++){
            if(5*i == kg){
                five = true;
                break;
            }
            else if(5*i > kg){
                max = i-1;
                break;
            }
        }
        if(five){
            System.out.print(kg/5);
        }
        else{
            boolean able = false;
            int a = -1;
            int b = -1;
            for(int i = max; i >= 0; i--){
                for(int j = 1; true; j++){
                    if(((5*i)+(3*j)) == kg){
                        able = true;
                        a = i;
                        b = j;
                        break;
                    }
                    else if(5*i + 3*j > kg){
                        break;
                    }
                }
                if(able){
                    break;
                }
            }
            if(able){
                System.out.print(a+b);
            }
            else{
                System.out.print(-1);
            }
        }
        input.close();
    }
}