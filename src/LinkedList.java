import java.util.NoSuchElementException;

/**
 * Created by kirtanpatel on 1/26/17.
 */
public class LinkedList <T>{
    Node<T> front;
    int size;

    public LinkedList(){
        front = null;
        size = 0;
    }

    public void addToFront(T data){
        front = new Node<T>(data, front);
        size++;
    }

    public void Traverse(){
        Node<T> ptr = front;
        while(ptr != null){
            System.out.print(ptr.data + " - >");
            ptr = ptr.next;
        }
        System.out.println("\\");
    }

    public T deleteFront(){
        if(front == null){
            throw new NoSuchElementException("List is empty");
        }
        T data = front.data;
        front = front.next; // update front to point to the second node
        size--;
        return data;

    }
}
