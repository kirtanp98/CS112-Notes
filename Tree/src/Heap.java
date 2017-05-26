import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by kirtanpatel on 3/28/17.
 */
public class Heap <T extends Comparable<T>> {

    /** Mode : min or max healp */

	/* Mode: min or max heap */
    final static int MAX_HEAP = 1;
    final static int MIN_HEAP = 2;
    private int mode;

    private ArrayList<T> items;

    public Heap (int mode) {
        items = new ArrayList<T>();
        this.mode = mode;
    }
    private void siftUp() {
        int k = items.size() - 1; // item was inserted at the last position of the array
        while (k > 0) { // 0 is root's index
            int p = (k-1)/2; // p is the index of the k's parent
            T kid = items.get(k); // kid
            T parent = items.get(p); // kid's parent
            if ((mode == MAX_HEAP && kid.compareTo(parent) > 0) ||
                    mode == MIN_HEAP && kid.compareTo(parent) < 0) {
                // swap kid with parent
                items.set(k, parent);
                items.set(p, kid);
                // move one level up
                k = p;
            } else {
                break;
            }
        }
    }
    public void insert (T item) {
        items.add(item);
        siftUp();
    }

    private void siftDown() {
        int k = 0; // root's index
        int l = 2*k+1; // left child's index
        while (l < items.size()) {
            // k has a left child (l is within array bounds)
            int r = l+1; // right child's index
            int max = l; // assume left is the greatest/smalleest
            if (r < items.size() &&
                    ((mode == MAX_HEAP && items.get(r).compareTo(items.get(l)) > 0 ) ||
                            (mode == MIN_HEAP && items.get(r).compareTo(items.get(l)) < 0))) {
                max = r;
            }
            if ((mode == MAX_HEAP && items.get(max).compareTo(items.get(k)) > 0) ||
                    (mode == MIN_HEAP && items.get(max).compareTo(items.get(k)) < 0)) {

                //swap
                T parent = items.get(k);
                T child = items.get(max);
                items.set(k, child);
                items.set(max, parent);
                // move one level up
                k = max;
                l = 2*k+1;
            } else {
                break;
            }
        }
    }
    public T delete () {
        if (items.size() == 0) {
            throw new NoSuchElementException("Heap is empty");
        } else if (items.size() == 1) {
            return items.remove(0);
        }
        T root = items.get(0);
        T lastItem = items.remove(items.size()-1);
        items.set(0, lastItem);
        siftDown();
        return root;
    }
    public boolean isEmpty () {
        return items.isEmpty();
    }
}
