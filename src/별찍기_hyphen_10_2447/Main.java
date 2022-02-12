package 별찍기_hyphen_10_2447;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        String[][] S = DrawSquare(N);
        for(int i = 0; i < S.length; i++){
            for(int j = 0; j < S.length; j++){
                bw.write(S[i][j]);
            }
            bw.newLine();
        }
        bw.close();
    }

    public static String[][] DrawSquare(int N){
        String[][] S = new String[N][N];
        int l = Log(3, N);
        if(l == 1){
            for(int i = 0; i < S.length; i++){
                for(int j = 0; j < S.length; j++){
                    if(i == 1 && j == 1){
                        S[i][j] = " ";
                    }
                    else{
                        S[i][j] = "*";
                    }
                }
            }
            return S;
        }
        else{
            String[][] S2 = DrawSquare(N/3);
            for(int i = 0; i < S.length; i++){
                for(int j = 0; j < S.length; j++){
                    if((S.length/3 <= i) && i < (S.length/3*2) && (S.length/3 <= j) && j < (S.length/3*2)){
                        S[i][j] = " ";
                    }
                    else{
                        S[i][j] = S2[i%S2.length][j%S2.length];
                    }
                }
            }
            return S;
        }
    }

    public static int Log(int a, int b){
        return (int)(Math.log(b) / Math.log(a));
    }
}