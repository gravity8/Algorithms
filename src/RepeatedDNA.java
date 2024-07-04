import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNA {
    public static void main(String[] args) {
        int left=0; int right =0;
        List<String> result = new ArrayList<>();
        int seq=10;
        String  s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        int comebackpoint=0;
        if(s.length()==1){
            System.out.print(new ArrayList<>());
        }

        Set<String> set = new HashSet<>();
        while(right<s.length()){
            char current = s.charAt(right);
            if(right==0 || current!=s.charAt(right-1)){
                comebackpoint = right;
            }
            if(s.charAt(right+1)==current||
                    s.charAt(right+2)==s.charAt(right+2)
            ){
                seq--;
            }else{
                left++;
            }
            right++;
            if(seq==0){
                set.add(s.substring(left, right));
                left=comebackpoint;
                seq= 10-(right-left);
            }
        }
        System.out.print(result.toString());
    }
}
