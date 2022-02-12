package 수정렬하기_2750_선택정렬;

import java.io.*;

//선택 정렬
//1. 주어진 리스트에서 최솟값을 찾는다.
//2. 최솟값을 맨 앞 자리의 값과 교환한다.
//3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] number = new int[num];
        for(int i = 0; i < num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < num-1; i++){
            int inx = -1;
            int min = Integer.MAX_VALUE;
            for(int j = i; j < num; j++){
                if(min > number[j]){
                    inx = j;
                    min = number[j];
                }
            }
            int temp = number[i];
            number[i] = number[inx];
            number[inx] = temp;
        }
        for(int i = 0; i < num; i++){
            bw.write(number[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}