/**
 * Created by kirtanpatel on 1/24/17.
 */
public class StringLL {
    StringNode front;
    int size;

    public StringLL(){
        front = null;
        size = 0;
    }

    public void addToFront(String data){
        front = new StringNode(data, front);
        size++;
    }
    public void traverse(){
        StringNode ptr = front;
        while(ptr != null){
            System.out.print(ptr.data + " -->");
            ptr = ptr.next;

        }
        System.out.println("\\");
    }


}
