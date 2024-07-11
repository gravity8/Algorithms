public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        int start=s.length()-1;
        int subStart =0;
        boolean enc =false;

        if(s.length()==1){
            System.out.println(1);
        }

        while(start>-1){
            if(!(s.charAt(start)==' ')&& !enc){
                subStart=start;
                enc = true;
            }
            if(enc && s.charAt(start)==' '){
                System.out.println(subStart-start);
                break;
            }
            start--;
        }
        System.out.println(subStart-start);
    }
}
