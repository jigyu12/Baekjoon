package 좌표정렬하기_11650;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] xy = new int[n][2];
        for(int i = 0; i < n; i++){
            xy[i][0] = input.nextInt();
            xy[i][1] = input.nextInt();
        }
        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                else {
                    return o1[0] - o2[0];
                }
            }
        });
        for(int i = 0; i < n; i++){
            System.out.print(xy[i][0] + " ");
            System.out.println(xy[i][1]);
        }

        input.close();
    }
}