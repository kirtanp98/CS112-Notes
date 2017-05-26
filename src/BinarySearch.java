/**
 * Created by kirtanpatel on 2/14/17.
 */
public class BinarySearch {


    public static void main(String[] args) {
        int [] a = {3,10,20,53,70,90};

        System.out.println(binarySearch(a, 53));
        System.out.println(binarySearch(a, 30));

    }

    public static int binarySearch(int[] a, int target){
        int lo = 0;
        int hi = a.length - 1;

        while(lo<=hi){
            int m = (lo+hi)/2;
            if (target == a[m]) {
                return m;
            }
            else if(target < a[m]){
                //target is in lower half of the array
                hi = m -1;
            }
            else{
                //target is in the upper half of the array
                lo = m+1;
            }

        }
        return -1; //target not found

    }

}
