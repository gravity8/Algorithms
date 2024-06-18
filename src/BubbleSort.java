public class BubbleSort {
    public static int[] sort(int[] numbers) {
        int n = numbers.length;
        for(int i=0; i<n-1; i++){
            boolean flag= false;
            for(int j=0; j<n-i-1; j++){
                if(numbers[j]> numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        return numbers;
    }
}
