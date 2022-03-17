package 단어정렬_1181;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sn = input.nextLine();
        int n = Integer.parseInt(sn);
        HashSet<String> hashSet = new HashSet<>();
        for(int i = 0; i < n; i++){
            hashSet.add(input.nextLine());
        }
        String[] s = new String[hashSet.size()];
        int inx = 0;
        for(Iterator i = hashSet.iterator(); i.hasNext();inx++){
            s[inx] = (String)i.next();
        }
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    int same = 0;
                    for(int i = 0; i < o1.length(); i++){
                        if((int)o1.charAt(i) < (int)o2.charAt(i)){
                            same = -1;
                            break;
                        }
                        else if((int)o1.charAt(i) > (int)o2.charAt(i)){
                            same = 1;
                            break;
                        }
                    }
                    return same;
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
        input.close();
    }
}