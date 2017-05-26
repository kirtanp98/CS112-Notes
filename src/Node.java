/**
 * Created by kirtanpatel on 1/26/17.
 */
public class Node <T>{
    //<T> this tells the class its a generic

    T data; //data will be of type T
    Node<T> next; //link to the nest node

    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
}
