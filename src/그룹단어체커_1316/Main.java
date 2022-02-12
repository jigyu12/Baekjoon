package 그룹단어체커_1316;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int count = 0;
        for(int i = 0; i < num; i++){
            String s = input.nextLine();
            HashSet<Character> hs = new HashSet<>();
            for(int j = 0; j < s.length(); j++){
                hs.add(s.charAt(j));
            }
            boolean isGroup = true;
            for(Character c : hs){
                ArrayList<Integer> al = new ArrayList<>();
                for(int j = 0; j < s.length(); j++){
                    if(s.charAt(j) == c){
                        al.add(j);
                    }
                }
                if(al.size() == 1){
                    continue;
                }
                else{
                    for(int j = 0; j < al.size()-1; j++){
                        if(al.get(j+1) - al.get(j) != 1){
                            isGroup = false;
                            break;
                        }
                    }
                }
                if(!isGroup){
                    break;
                }
            }
            if(isGroup){
                count++;
            }
        }
        System.out.print(count);
        input.close();
    }
}