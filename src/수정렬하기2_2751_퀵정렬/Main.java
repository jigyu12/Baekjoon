package 수정렬하기2_2751_퀵정렬;

import java.io.*;
import java.util.*;

//퀵 정렬
// 퀵정렬의 최악의 경우(최악의 시간복잡도) 방지를 위해 처음에 배열을 한번 랜덤으로 섞는다.(백준 문제풀이용)
//1. 가장 왼쪽 원소의 index를 low, 가장 오른쪽 원소의 index를 high로 잡고, 가운데 원소의 index를 pivot으로 잡는다.
//2. low가 pivot 값보다 크거나 같은 값이 나올때까지 low를 증가시킨다.
//3. high가 pivot 값보다 작거나 같은 값이 나올때까지 high를 감소시킨다.
//4. 2,3 의 루프가 끝나고 low < high 라면 low와 high에 있는 원소들을 서로 바꾼다. 2번으로 돌아간다.
//5. 2,3 의 루프가 끝나고 low < high 를 만족하지 못한다면 탐색을 종료하고, high를 분할기점 삼아 두 개의 부분리스트로 쪼개고, 각각의 부분 리스트에 1~5를 반복한다.
//6. 부분리스트의 크기가 1이 되면 리턴하면서, 자연스럽게 정렬이 완료된다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Integer[] number = new Integer[num];
        for(int i = 0; i < num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        //shuffle 매서드를 이용해 랜덤으로 배열의 원소들을 섞는다.
        List<Integer> list = Arrays.asList(number);
        Collections.shuffle(list);
        list.toArray(number);

        quickSort(number, 0, number.length - 1);

        for(int i = 0; i < num; i++){
            bw.write(number[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void quickSort(Integer[] number, int start, int end){
        if(start < end){
            //pivot은 인덱스가 아니라 증앙값을 의미한다.
            int pivot = number[(start + end)/2];
            //pivot에서 low또는 high가 움직이지 않는 현상을 해결하기위해 하나씩 index를 앞뒤로 밀었다가, 먼저 증가시키고 pivot과 비교한다.
            // int low = start 이런식으로 하게되면 "low" 와 "pivot의 인덱스"가 같다면 pivot에서 움직이지 않을수도 있음.(number[low] = pivot 이기 때문에)
            int low = start-1;
            int high = end+1;
            while(true) {
                do{
                    low++;
                }
                while (number[low] < pivot);

                do{
                    high--;
                }
                while (pivot < number[high]);

                if (low < high) {
                    swap(number, low, high);
                }
                else {
                    break;
                }
            }
            quickSort(number, start, high);
            quickSort(number,high+1, end);
        }
    }

    public static void swap(Integer[] number,  int a, int b){
        int temp = number[a];
        number[a] = number[b];
        number[b] = temp;
    }
}