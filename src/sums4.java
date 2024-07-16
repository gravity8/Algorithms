import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sums4 {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = 0;

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> uniqueQuads = new HashSet<>();

//        if(nums.length<4){
//            return ans;
//        }

        for(int i=0; i<nums.length-3; ++i){
            for(int j=i+1; j<nums.length-2; ++j){
                int k = j+1;
                int l = nums.length-1;
                while(k<l){
                    if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[k]);
                        quad.add(nums[l]);
                        uniqueQuads.add(quad);
                        k++;
                        l--;
                    }
                    else if(nums[i]+nums[j]+nums[k]+nums[l]>target){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
            }
        }

        ans.addAll(uniqueQuads);

        System.out.println(ans);
    }
}
