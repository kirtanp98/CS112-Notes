/**
 * Created by kirtanpatel on 1/24/17.
 */
public class StringLLApp {
    public static void main(String[] args) {
        StringLL catNames  = new StringLL();
        catNames.addToFront("Baloo");
        catNames.addToFront("Lilo");
        catNames.addToFront("Flo");
        catNames.traverse();

        StringLL weekDays = new StringLL();
        weekDays.addToFront("Saturday");
        weekDays.addToFront("Friday");
        weekDays.addToFront("Thursday");
        weekDays.traverse();
    }
}
