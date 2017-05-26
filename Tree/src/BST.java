import java.util.NoSuchElementException;

/**
 * Created by kirtanpatel on 2/16/17.
 */
public class BST <T extends Comparable <T>> {

    BSTNode<T> root;
    int size;

    public BST(){
        root = null;
        size = 0;
    }

    public void insert (T key){
        BSTNode<T> ptr = root;
        BSTNode<T> prev = null;
        int c = 0;

        while(ptr != null){
            c = key.compareTo(ptr.key);

            prev = ptr;

            if(c == 0){
                // key and ptr.key are the same
                throw new IllegalArgumentException("Duplicate Key");
            }
            else if(c<0){
                ptr = ptr.left;
            }
            else {
                ptr = ptr.right;
            }
        }

        BSTNode<T> node = new BSTNode<T>(key, null, null);

        if(prev == null){
            //had a empty tree
            root = node;
        }
        else if (c<0){
            prev.left = node;
        }
        else{
            prev.right = node;
        }
        size++;
    }

    public static <T extends Comparable<T>> void inorderTraversal (BSTNode <T> root)
    {
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.key + " ");
        inorderTraversal(root.right);
    }

    public void print(){
        inorderTraversal(root);
    }

    public void delete(T key){
        //1. find the node to delete
        BSTNode<T> p = null;
        BSTNode<T> x = root;
        int c = 0;

        while(x != null){
            c = key.compareTo(x.key);
            if(c == 0){
                break;
            }
            p = x;
            x = ( c < 0) ? x.left : x.right;
        }
        // 2. check if key is in BST
        if(x ==  null){
            throw new NoSuchElementException("key not in BST");
        }
        //3. x has two children actually, if x is the root
        BSTNode<T> y = null;
        if(x.right != null && x.left != null){
            //1. find the inorder predecessor (y)
            y = x.left;
            while(y.right != null){
                p = y;
                y = y.right;
            }
            // 2. copy y's kye into x's key
            x.key = y.key;

            //prepare to delete

            x = y;
        }
        //4. check for if x has one or no children
        BSTNode<T> tmp = (x.right != null) ? x.right : x.left;
        if(x == p.left){
            p.left = tmp;
        }
        else {
            p.right = tmp;
        }
        size --;

    }

    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        tree.insert(53);
        tree.insert(65);
        tree.insert(69);
        tree.insert(42);
        tree.insert(30);
        tree.insert(48);
        tree.insert(49);
        tree.print();
        tree.delete(53);
        System.out.println();
        tree.print();
    }
}
