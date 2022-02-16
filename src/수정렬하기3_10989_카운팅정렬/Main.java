package 수정렬하기3_10989_카운팅정렬;

import java.io.*;

//카운팅 정렬
//1. 배열을 한 번 돌면서 각 값이 나올 때마다 해당 값을 index 로 하는 counting 배열의 값을 1 증가시킨다.
//2. counting 배열의 각 값을 누적합으로 변환시킨다.
//3. (counting 배열의 각 값 - 1)이 result 배열의 index 를 알려준다.
//4. 안정적으로 정렬하기 위해서 배열의 마지막 index 부터 순회를 시작해 (배열의 값) -> (counting 배열의 index) -> (counting 배열의 해당 index 의 값 - 1) -> (result 배열의 index) -> (해당 result 배열 index 에 맨 처음 배열의 값 삽입) 의 과정을 모든 원소에 반복한다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] number = new int[num];
        for(int i = 0; i < num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        int[] result = countingSort(number);

        for(int i = 0; i < num; i++){
            bw.write(result[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int[] countingSort(int[] number){
        int[] counting = new int[10001];
        int[] result = new int[number.length];
        for(int i = 0; i < number.length; i++){
            counting[number[i]]++;
        }
        for(int i = 1; i < counting.length; i++){
            counting[i] = counting[i] + counting[i-1];
        }
        for(int i = number.length-1; i >= 0; i--){
            result[--counting[number[i]]] = number[i];
        }
        return result;
    }
}