public class InsertionSort {
    static void sort(int[] array){
        int n = array.length;

        for(int i=1; i<n-1; i++){
            int j = i;

            //Ascending order sorting
            //starting from position (n-n+1 ) check if I(th) element is sorted.
            //if it's not sorted, iteratively swap it backwards until it's sorted.
            while(j>0 && array[j-1] > array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}
