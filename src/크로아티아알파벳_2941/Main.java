package 크로아티아알파벳_2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int count = 0;
        for(int i = 0; i < line.length(); i++){
            StringBuilder sb1 = new StringBuilder();
            if(i <= line.length()-2){
                sb1.append(line.charAt(i));
                sb1.append(line.charAt(i+1));
            }
            StringBuilder sb2 = new StringBuilder();
            if(i <= line.length()-3){
                sb2.append(line.charAt(i));
                sb2.append(line.charAt(i+1));
                sb2.append(line.charAt(i+2));
            }
            if(sb1.toString().equals("c=") || sb1.toString().equals("c-") || sb1.toString().equals("d-") || sb1.toString().equals("lj") || sb1.toString().equals("nj") || sb1.toString().equals("s=") || sb1.toString().equals("z=")){
                count++;
                i++;
            }
            else if(sb2.toString().equals("dz=")){
                count++;
                i += 2;
            }
            else{
                count++;
            }
        }
        System.out.print(count);
        input.close();
    }
}