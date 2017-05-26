/**
 * Created by kirtanpatel on 2/16/17.
 */
public class BSTNode <T> {

    T key;
    BSTNode<T> left;
    BSTNode<T> right;

    public BSTNode(T key, BSTNode<T> left, BSTNode<T> Right){
        this.key = key;
        this.left = left;
        this.right = right;

    }

    public String toString(){
        return String.format("[%d, %s %s]", key,
                (left != null) ? left.key : "null",// like if else
                (right !=null) ? right.key : "null");
    }
}
