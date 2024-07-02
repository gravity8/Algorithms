public class IndexOfFirstOcc {
    public static void main(String[] args) {
        int needleStackPointer = 0;
        int start =-1;
        String haystack = "mississippi";
        String needle = "issip";

        if(needle.length()==0 || haystack.length()==0 || needle.length()>haystack.length()){
            System.out.println(start);
        }
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i)==needle.charAt(needleStackPointer)){
                if(needleStackPointer==0){
                    start=i;
                }
                needleStackPointer++;
            }
            else{
                if (needleStackPointer > 0) {
                    i = start;
                }
                needleStackPointer = 0;
                start = -1;
            }
            if(needleStackPointer==needle.length()){
                System.out.println(start);
            }
        }
        System.out.println(start);
    }
}
