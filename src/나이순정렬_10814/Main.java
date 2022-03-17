package 나이순정렬_10814;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sn = input.nextLine();
        int n = Integer.parseInt(sn);
        String[] age_name = new String[n];
        for(int i = 0; i < n; i++){
            age_name[i] = input.nextLine() + " " + i;
        }
        Arrays.sort(age_name, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] person1 = o1.split(" ");
                String[] person2 = o2.split(" ");
                if(Integer.parseInt(person1[0]) == Integer.parseInt(person2[0])){
                    return Integer.parseInt(person1[2]) - Integer.parseInt(person2[2]);
                }
                else{
                    return Integer.parseInt(person1[0]) - Integer.parseInt(person2[0]);
                }
            }
        });
        for(int i = 0; i < n; i++){
            String[] temp = age_name[i].split(" ");
            System.out.println(temp[0] + " " + temp[1]);
        }
        input.close();
    }
}