/**
 * Created by kirtanpatel on 1/31/17.
 */
public class CLLApp {
    public static void main(String[] args) {

        CLL<Double> cll =  new CLL<Double>();
        cll.addToFront(45.7);
        cll.addToFront(12.9);
        cll.addToFront(3.2);
        cll.traverse();

    }
}
