import java.util.Arrays;

public class MergeSort {
    public static void  sort(int[] array){
        if(array.length<2) {
            return;
        }
        //get the middle
        int middle = array.length/2;
        //seperate the array into two
        //left
        int[] leftArray = new int[middle];
        //right
        int[] rightArray = new int[array.length-middle];

        //populate the left array
        for(int i =0; i<middle; i++){
            leftArray[i] = array[i];
        }
        //populate the right array
        for(int i = middle; i<array.length; i++){
            rightArray[i-middle] = array[i];
        }
        //recursively breakdown the two subarray until length is less than 2 then return
        sort(leftArray);
        sort(rightArray);
        //merge the sub arrays
        mergeSubArray(array,leftArray, rightArray);
    }
    public static void mergeSubArray(int[] array, int[] leftArray, int[] rightArray){
        //get the length of the left and right array
        int llength = leftArray.length;
        int rlength = rightArray.length;

        // i, j, k are used to keep track of position in left, right and actual array respectively
        int i =0;
        int j = 0;
        int k = 0;

        //push the lesser element into the big array
        while((i<llength)&&(j<rlength)){
            if(leftArray[i]<rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }
            else{
                array[k]= rightArray[j];
                j++;
            }
            k++;
        }

        //push all element in the left array to the big array if there are any left
        while(i<llength){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        //push all element in the right arrray if there are any left.
        while(j<rlength){
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }
}
