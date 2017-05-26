/**
 * Created by kirtanpatel on 1/26/17.
 */
public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList<String> llS = new LinkedList<String>();
        llS.addToFront("Sophia's world");
        llS.addToFront("Data Structures");
        llS.addToFront("Winnie the Pooh");
        llS.addToFront("The Republic");

        LinkedList<Integer> llI =  new LinkedList<Integer>();
        llI.addToFront(8);
        llI.addToFront(5);
        llI.addToFront(3);
        llI.addToFront(2);
        llI.addToFront(1);
        llI.addToFront(1);

        llS.Traverse();
        llI.Traverse();
        llS.deleteFront();
        llS.deleteFront();
        llS.deleteFront();
        llS.deleteFront();
        llS.Traverse();
        llS.deleteFront();
    }
}
