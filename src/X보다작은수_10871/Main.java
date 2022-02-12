package X보다작은수_10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String second = input.nextLine();

        String NX[] = first.split(" ");
        int N = Integer.parseInt(NX[0]);
        int X = Integer.parseInt(NX[1]);

        String A[] = second.split(" ");

        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(A[i]);
            if(a < X){
                System.out.print(a + " ");
            }
        }

        input.close();
    }
}