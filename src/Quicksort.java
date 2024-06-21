public class Quicksort {
    static void sort(int[] array){
        int l = 0;
        int h = array.length-1;
        System.out.println(h);
        quicksort(l,h,array);
    }
    static void quicksort(int l, int h, int[] array){
        if(l<h){
            int j = partition(l,h,array);
            quicksort(l,j, array);
            quicksort(j+1, h, array);
        }
    }
    static int partition(int l, int h, int[] array){
        int pivot = array[l];
        int i=l, j=h;
        while(i<j){
            do{
                i++;
            }
            while(array[i]<=pivot);
            do{
                j--;
            }
            while(array[j]>pivot);
            if(i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        int temp = array[j];
        array[j] = array[l];
        array[l] = temp;
        return j;
    }
}
