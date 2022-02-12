package 네번째점_3009;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] line1 = input.nextLine().split(" ");
        String[] line2 = input.nextLine().split(" ");
        String[] line3 = input.nextLine().split(" ");
        HashSet<String> hashSet_X = new HashSet<>();
        hashSet_X.add(line1[0]);
        hashSet_X.add(line2[0]);
        hashSet_X.add(line3[0]);
        ArrayList<String> X = new ArrayList<>();
        X.add(line1[0]);
        X.add(line2[0]);
        X.add(line3[0]);
        for(String s : hashSet_X){
            int cnt = 0;
            for(int i = 0; i < 3; i++){
                if(s.equals(X.get(i))){
                    cnt++;
                }
            }
            if(cnt == 1){
                System.out.print(s + " ");
                break;
            }
        }
        HashSet<String> hashSet_Y = new HashSet<>();
        hashSet_Y.add(line1[1]);
        hashSet_Y.add(line2[1]);
        hashSet_Y.add(line3[1]);
        ArrayList<String> Y = new ArrayList<>();
        Y.add(line1[1]);
        Y.add(line2[1]);
        Y.add(line3[1]);
        for(String s : hashSet_Y){
            int cnt = 0;
            for(int i = 0; i < 3; i++){
                if(s.equals(Y.get(i))){
                    cnt++;
                }
            }
            if(cnt == 1){
                System.out.print(s);
                break;
            }
        }
        input.close();
    }
}