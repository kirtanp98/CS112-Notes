/**
 * Created by kirtanpatel on 3/30/17.
 */
public class HeapSort {

    public static void main(String[] args) {

        int[] n = {14, 3, 1, 15, 2, 10};
        Heap<Integer> heap = new Heap<Integer>(Heap.MIN_HEAP);

        //build phase
        for(int i = 0; i< n.length; i++){
            heap.insert(n[i]);
        }

        //sort phase
        int count = 0;

        while(!heap.isEmpty()){
            n[count++] = heap.delete();
        }

        for(int item : n){
            System.out.println(item);
        }
    }
}
