import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3Closest {
    public static void main(String[] args) {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        int target = -2;
        int sum=0, closest=Integer.MAX_VALUE, count=3,
                i=0, j=0;
        while(j<nums.length){
            if(count>0){
                sum+=nums[j];
                count--;
                j++;
            }
            else{
                if(Math.abs(closest-target)>Math.abs(sum-target)){
                    closest=sum;
                    sum-=nums[i];
                    count++;
                }
                else{
                    sum-=nums[i];
                    count++;
                }
                i++;
            }
        }
        System.out.println(closest);
    }
}
