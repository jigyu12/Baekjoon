package 하노이탑이동순서_11729;

import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        bw.write((int)(Math.pow(2,k)-1) +"");
        bw.newLine();
        Hanoi(k,1 ,2 ,3);
        bw.close();
    }

    public static void Hanoi(int k, int first, int second, int third) throws IOException {
        if(k == 1){
            bw.write(first + " " + third);
            bw.newLine();
            return;
        }
        else{
            Hanoi(k-1, first, third, second);
            bw.write(first + " " + third);
            bw.newLine();
            Hanoi(k-1, second, first, third);
        }
    }
}