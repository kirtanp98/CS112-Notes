/**
 * Created by kirtanpatel on 2/14/17.
 */
public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] array = {3,10,20,53,70,99};
        System.out.println(binarySearch(array, 53));
        System.out.println(binarySearch(array, 30));
    }

    public static int binarySearch(int[] a, int target, int lo, int hi){
        if(lo>hi){
            return -1;
        }
        int m = (lo+hi)/2;
        if(target == a[m]){
            return m;
        }
        else if (target < a[m]){
            return binarySearch(a, target, lo, m-1);
        }
        else{
            return binarySearch(a, target, m+1, hi);
        }
    }

    public static int binarySearch(int[]a, int target){
        return binarySearch(a,target,0, a.length -1);
    }

}
