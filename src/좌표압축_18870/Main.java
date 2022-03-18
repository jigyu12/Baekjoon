package 좌표압축_18870;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        int[] number = new int[n];
        for(int i = 0; i < n; i++){
            number[i] = Integer.parseInt(num[i]);
        }
        int[] sorted_number = Arrays.copyOf(number, n);
        Arrays.sort(sorted_number);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int value = 0;
        for(int i = 0; i < n; i++){
            if(i == 0){
                treeMap.put(sorted_number[i], value);
            }
            else{
                if(sorted_number[i] > sorted_number[i-1]){
                    value++;
                    treeMap.put(sorted_number[i], value);
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(i == n-1){
                bw.write(treeMap.get(number[i]) + "");
            }
            else{
                bw.write(treeMap.get(number[i]) + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}