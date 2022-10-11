import java.util.ArrayList;
import java.lang.Math;
import java.util.HashMap;
class LongestPalindrome {
    public static boolean isPali(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String s = "babad";
        // for creating the substrings
        for(int i = 0;i<s.length();i++){
            String str = "";
            int count = 0;
            for(int j = i;j<s.length();j++){
                str = str + s.charAt(j);
                // here we use HashMap for removing the duplicates substring
                if(!map.containsKey(str)){
                    list.add(str);
                    map.put(str, count);
                    count++;
                }
            }
        }
        System.out.println(list);
        // now we will remove the non - palidrome string from the list;
        ArrayList<String> paliList = new ArrayList<>();
        for(int i =0;i<list.size();i++){
            String ab = list.get(i);
            if(isPali(ab)){
                paliList.add(ab);
            }
        }
        System.out.println(paliList);
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<paliList.size();i++){
            String pol = paliList.get(i);
            int x = pol.length();
            max = Math.max(max, x);
        }
        String res = "";
        for(int i = 0;i<paliList.size();i++){
            String fin = paliList.get(i);
            if(fin.length() == max){
                res = fin;
                break;
            }
        }
        System.out.println(res);
    }
}
