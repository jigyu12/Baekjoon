package 수정렬하기_2750_삽입정렬;

import java.io.*;

//삽입 정렬
//1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
//2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
//3. 타겟의 index를 하나씩 줄여가며 2를 실행한다.(두 번째 원소까지 실행한다.)
//4. 1,2,3의 방식으로 맨뒤까지 돌면서 정렬해나간다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] number = new int[num];
        for(int i = 0; i < num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 1; i < num; i++){
            for(int j = i; j > 0; j--){
                if(number[j] < number[j-1]){
                    int temp = number[j];
                    number[j] = number[j-1];
                    number[j-1] = temp;
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