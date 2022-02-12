package 셀프넘버_4673;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <=10000; i++){
            boolean isSelf = true;
            for(int j = 1; j <= i; j++){
                String num = Integer.toString(j);
                int res = sum(num);
                if((res + j) == i){
                    isSelf = false;
                    break;
                }
            }
            if(isSelf){
                System.out.println(i);
            }
        }
    }

    public static int sum(String a){
        int res = 0;
        for(int i = 0; i < a.length(); i++){
            res = res + Character.getNumericValue(a.charAt(i));
        }
        return res;
    }
}