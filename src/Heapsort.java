//After Heapifying a Complete Binary Tree, If I delete the root node and place it at the end of the array until Zero(th) element
// then I will have a sorted array. Provided The tree is always a complete Binary Tree after Deletion.
public class Heapsort {
    static void sort(int[] array){
        int end = array.length-1;
        heapify(array.length, array);
        Delete(end, array);
    }

    //This is used to Heapify the unsorted Array
    static void heapify(int currIndex, int[] array){
        int n = array.length;
        int leftChild = currIndex*2+1;
        int rightChild = leftChild+1;
        if(currIndex>=0) {
            if (leftChild < n) {
                if (rightChild < n) {
                    int greaterElem = rightChild;
                    if (array[greaterElem] < array[leftChild]) {
                        greaterElem = leftChild;
                    }
                    if (array[currIndex] < array[greaterElem]) {
                        swap(currIndex, greaterElem, array);
                        placeInRightPos(greaterElem, array.length-1, array);
                    }
                } else {
                    if (array[currIndex] < array[leftChild]) {
                        swap(currIndex, leftChild, array);
                        placeInRightPos(leftChild, array.length-1, array);
                    }
                }
            }
            heapify(currIndex - 1, array);
        }
    }

    //This is to swap two nodes
    static void swap( int node1, int node2, int[] array){
        int temp = array[node1];
        array[node1] = array[node2];
        array[node2] = temp;
    }

    //This is to delete the root node and bring the last node up and sort the last node into
    // it's right position in the tree.
    static void Delete(int end, int[] array){
        int start = 0;
        if(end>=1){
            swap(start, end, array);
            end--;
            placeInRightPos(start, end, array);
            Delete(end, array);
        }
    }

    // this is to recursively place element in the right position.
    //Small elements are sent down the tree and large elements are sent up.
    static void placeInRightPos(int start,int end, int[] array){
        int left = (start*2)+1;
        int right = (start*2)+2;
        if(left<=end && right<=end){
            int greater = Greater(left, right, array);
            if(array[greater]>array[start]){
                swap(greater, start, array);
                start = greater;
                placeInRightPos(start,end,array);
            }
        } else if (left<=end) {
            if(array[left]>array[start]){
                swap(left, start, array);
                start = left;
                placeInRightPos(start,end,array);
            }

        }

    }
    //This returns the position of the Greater element between left and right node.
    static int Greater(int l, int r, int[] array){
        int greater = array[l];
        if(greater<array[r]){
            greater = array[r];
            return r;
        }
        return l;
    }
}
