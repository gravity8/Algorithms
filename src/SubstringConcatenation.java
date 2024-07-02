import java.util.ArrayList;
import java.util.List;

public class SubstringConcatenation {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        List<String> wordList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int lenEach = words[0].length();
        int n = words.length;
        int subStringLen = n * lenEach;
        int start=0,end=subStringLen;
        int st = start;
        int e = lenEach;
        int correctCount = 0;


        if(lenEach > s.length()){
            System.out.println(new int[0]);
        }
        for(String word : words){
            wordList.add(word);
        }
        while(end <= s.length()){
            List<String> checked = new ArrayList<>();
            while(e<=end){
                String sub = s.substring(st,e);
                if(wordList.contains(sub) && !checked.contains(sub)){
                    correctCount++;
                    checked.add(sub);
                }
                st+=lenEach;
                e+=lenEach;
            }
            if(correctCount==n){
                result.add(start);
            }
            end+=lenEach;
            start+=lenEach;
            st=start;
            e = st+lenEach;
            correctCount=0;
        }
        System.out.println(result);
    }

}
