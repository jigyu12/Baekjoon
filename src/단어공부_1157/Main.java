package 단어공부_1157;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            if((int)line.charAt(i) >= (int)'a' && (int)line.charAt(i) <= (int)'z'){
                c = (char)((int)line.charAt(i)-32);
            }
            s.append(c);
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        char[] ch = new char[set.size()];
        int inx = 0;
        for (Character character : set) {
            ch[inx] = character;
            inx++;
        }
        int[] count = new int[ch.length];
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == ch[i]){
                    count[i]++;
                }
            }
        }
        int max = 0;
        int max_inx = -1;
        boolean q_mark = false;
        int q_count = 0;
        for(int i = 0; i < count.length; i++){
            if(max < count[i]){
                max = count[i];
                max_inx = i;
            }
        }
        for (int j : count) {
            if (max == j) {
                q_count++;
            }
        }
        if(q_count >= 2){
            q_mark = true;
        }
        if(q_mark){
            System.out.print("?");
        }
        else{
            System.out.print(ch[max_inx]);
        }
        input.close();
    }
}