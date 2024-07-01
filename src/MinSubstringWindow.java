import java.util.HashMap;
import java.util.Map;

public class MinSubstringWindow {
    public static void main(String[] args) {
        String s = "cabwefgewcwaefgcf", t = "cae";
        int back=0,front=0;
        int[] occ = new int[128];
        int minStart=0;
        int minEnd= Integer.MAX_VALUE;
        int cfm = t.length();

        if(s.length()==0 || t.length()==0 || s.length()<t.length()){
           System.out.println(new String());
        }
        //adding all the character in c to map
        for(char c : t.toCharArray()){
            occ[c]++;
        }

        char[] arr = s.toCharArray();

        while(front<arr.length){
            if(occ[arr[front++]]-->0){
                cfm--;
            }
            while(cfm==0){
                if(minEnd-minStart > front-back){
                    minStart = back;
                    minEnd= front;
                }
                if(occ[arr[back++]]++==0){
                    cfm++;
                }
            }
        }
        System.out.println(minEnd==Integer.MAX_VALUE ? new String() : s.substring(minStart,minEnd));
    }
}
