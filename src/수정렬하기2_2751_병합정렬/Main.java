package 수정렬하기2_2751_병합정렬;

import java.io.*;

//병합 정렬
//1. 전체 배열을 길이가 1이 될때까지 절반씩 각각 나눈다.
//2. 길이가 1인 배열들을 각각 순서대로 두개씩 정렬하면서 합친다.
//3. 정렬할때 두 조각의 각각 왼쪽부터 시작해서 비교하며 작은 수를 넣고, 넣지 않은 수는 인덱스를 유지하면 자연스레 정렬된다.
//4. 어느 한쪽의 남은 원소는 마지막에 순서대로 다 넣어주면 된다.
// 배열을 반으로 나누고, 반으로 나눈 배열을 정렬한다는 개념의 분할-정복 기법이다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] number = new int[num];
        for(int i = 0; i < num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(number,0,number.length-1);

        for(int i = 0; i < num; i++){
            bw.write(number[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int[] number, int start, int end){
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(number, start, mid);
            mergeSort(number, mid + 1, end);
            merge(number,start,mid,end);
        }
    }

    public static void merge(int[] number, int start, int mid, int end){
        int[] temp1 = new int[mid-start+1];
        for(int i = start; i <= mid; i++){
            temp1[i-start] = number[i];
        }
        int[] temp2 = new int[end-(mid+1)+1];
        for(int i = mid+1; i <= end; i++){
            temp2[i-(mid+1)] = number[i];
        }
        int[] temp = new int[end-start+1];
        int t1 = 0;
        int t2 = 0;
        int t = 0;
        while(t1 < temp1.length && t2 < temp2.length){
            if(temp1[t1] < temp2[t2]){
                temp[t] = temp1[t1];
                t1++;
                t++;
            }
            else{
                temp[t] = temp2[t2];
                t2++;
                t++;
            }
        }
        if(t1 == temp1.length){
            while(t2 < temp2.length){
                temp[t] = temp2[t2];
                t2++;
                t++;
            }
        }
        else{
            while(t1 < temp1.length){
                temp[t] = temp1[t1];
                t1++;
                t++;
            }
        }
        for(int i = start; i <= end; i++){
            number[i] = temp[i-start];
        }
    }
}