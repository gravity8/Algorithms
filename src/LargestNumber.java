public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {432,43243};
        StringBuilder mfinal = new StringBuilder();
        if(nums.length==1){
            System.out.print(nums[0]) ;
        }
        for(int i=0; i<nums.length; i++){
            if(i==0){
                mfinal.append(nums[i]);
            }
            else{
                String first = mfinal.toString()+nums[i];
                String last = nums[i]+mfinal.toString();
                int h = first.compareTo(last);
                if(h==Integer.parseInt(first)){
                    mfinal.append(nums[i]);
                }
//                else{
//                    mfinal.insert(0,nums[i]);
//                }
            }

        }

        System.out.println(mfinal.toString());
    }
}
