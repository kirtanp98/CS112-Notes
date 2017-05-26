import java.util.NoSuchElementException;

/**
 * Created by kirtanpatel on 1/26/17.
 */
public class CLL <T> {

    private Node<T> tail;
    int size;

    public CLL(){
        tail = null;
        size = 0;
    }

    public void addToFront (T data){
        Node <T> node = new Node <T> (data,null);
        if(tail == null){
            node.next = node;
            tail = node;
        }
        else{
            // at least one element in the CLL
            node.next = tail.next; //tail.next points the front of teh CLL
            tail.next = node; //update tail.next to point to the new front
        }
        size++;
    }

    public void traverse (){
        Node<T> ptr = tail.next; //ptr points to front
        do{
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }while(ptr != tail.next);
    }

    public T deleteFront(){
        if(tail ==  null){
            throw new NoSuchElementException("CLL is empty");
        }
        else if (tail ==  tail.next){
            //one element
            T data = tail.data;
            tail = null;
            size --;
            return data;
        }
        else{
            //more then one element
            T data = tail.next.data;
            tail.next = tail.next.next;
            size--;
            return data;
        }

    }
}
