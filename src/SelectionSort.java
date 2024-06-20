public class SelectionSort {
    static void sort(int[] array){
        for(int i=0; i<array.length-1; i++){
            //set current minimum
            int j =i;
            int currentMinPos = j;

            //searching for the smallest element (from I(th) position--> ending of the list).
            while(j< array.length-1){
                //each time a smaller element is found, set it as the current minimum.
                if(array[currentMinPos]>=array[j]){
                    currentMinPos = j;
                }
                j++;
            }

            //swap element in currentMinPos with I(th) element.
            int temp = array[i];
            array[i] = array[currentMinPos];
            array[currentMinPos] = temp;
        }
    }
}
