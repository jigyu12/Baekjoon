package 수정렬하기2_2751_힙정렬;

import java.io.*;

//힙 정렬
//1. 주어진 배열을 최대힙 형태로 만든다. (참고 : 왼쪽 자식 노드 인덱스 = 부모 노드 인덱스 × 2 + 1, 오른쪽 자식 노드 인덱스 = 부모 노드 인덱스 × 2 + 2, 부모 노드 인덱스 = (자식 노드 인덱스 - 1) / 2)
//2. 최대힙의 배열에서 첫 노드와 마지막 노드의 순서를 바꾼다. (가장 큰 수가 배열 맨 뒤로 가게되는 형태가 된다.)
//3. 맨 뒤의 노드는 정렬 된 상태이므로 하나 제외하고 나머지 배열을 다시 최대힙 형태로 만든다.
//4. 1 ~ 3을 반복하며 뒤부터 하나씩 정렬해 나가면 된다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] number = new int[num];
        for(int i = 0; i < num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        heapSort(number);

        for(int i = 0; i < num; i++){
            bw.write(number[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void heapSort(int[] number){
        // number.length/2 - 1 의 의미 : 항상 마지막 노드의 부모노드 인덱스를 뜻한다.
        for(int i = number.length/2 - 1; i >= 0; i--){
            heapify(number,number.length,i);
        }

        for(int i = number.length-1; i >= 0; i--){
            swap(number, i, 0);
            heapify(number, i, 0);
        }
    }

    //last_Index 까진 정렬 되어 있다고 본다.
    public static void heapify(int[] number, int last_Index, int parent_Index){
        int p = parent_Index;
        int l = parent_Index * 2 + 1;
        int r = parent_Index * 2 + 2;
        //이 부분에서 왼쪽, 오른쪽 자식노드중 큰 수의 인덱스만 저장하고
        if(l < last_Index && number[l] > number[p]){
            p = l;
        }
        if(r < last_Index && number[r] > number[p]){
            p = r;
        }
        //이 부분에서 기존의 부모노드의 인덱스와 p가 일치하지 않으면(큰 수의 인덱스를 저장했다는 뜻) 부모, 자식노드를 서로 바꾸고, 그 하위 노드를 최대힙 형태로 정렬한다.
        if(p != parent_Index){
            swap(number, p, parent_Index);
            heapify(number, last_Index, p);
        }
    }

    public static void swap(int[] number, int a, int b){
        int temp = number[a];
        number[a] = number[b];
        number[b] = temp;
    }
}