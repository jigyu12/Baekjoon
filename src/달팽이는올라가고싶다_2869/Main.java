package 달팽이는올라가고싶다_2869;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int height_up_diff = height - up;
        int up_down_diff = up - down;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(height_up_diff == 0){
            bw.write(Integer.toString(1));
        }
        else{
            bw.write(Integer.toString((int)Math.ceil((double) height_up_diff / (double) up_down_diff) + 1));
        }
        bw.flush();
        bw.close();
    }
}