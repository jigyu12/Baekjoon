package 수정렬하기_2750_버블정렬;

import java.io.*;

//버블 정렬
//1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
//2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
//3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
//4. 1,2,3의 방식으로 끝까지 돌면서 맨 뒤부터 하나씩 정렬해나가면서 완성시킨다. 매 루프마다 마지막 원소는 제외하며 정렬해간다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] number = new int[num];
        for(int i = 0; i < num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
        for(int i = num - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(number[j] > number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < num; i++){
            bw.write(number[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}