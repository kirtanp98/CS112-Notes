import java.util.HashMap;

/**
 * Created by kirtanpatel on 3/21/17.
 */

class Person{
    String firstName, lastName;
    String email; //key

    public Person(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public boolean equals(Object o){
        if(o == null || !(o instanceof Person)){
            return false;
        }
        Person other = (Person)o;
        if(other.email.equals(this.email)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "(" + firstName + " " + lastName + "," + email + ")";
    }
}

class Point{
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int hasCode(){
        return (""+x+y).hashCode();
    }

    public boolean equals(Object o){
        if(o == null || !(o instanceof Point)){
            return false;
        }
        Point other = (Point)o;
        return this.x == other.x && this.y == other.y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

public class hash {
    public static void main(String[] args) {
        //HashMap is Java's hash tbale (key -> value) : (String -> Person)

        HashMap<String, Person> people = new HashMap<String,Person>(500, 2.5f);
        Person p = new Person("Ana Paula", "Centeno", "anapaula@cs.rutgers.edu");

        people.put("anapaul@cs.rutgers.edu", p); // p is email

        p = new Person("Sesh", "Venugopale", "venugopal @cs.rutgers.edu");
        people.put(p.email, p);

        System.out.println(people.get("anapaul@cs.rutgers.edu"));

        //interate over all of the key s of the HT
        for(String e : people.keySet()){
            System.out.println(e);
            System.out.println(people.get(e));
            Person ppp = people.get(e);
            System.out.println(ppp);
        }
        //interate over all the values of the HT
        for(Person pp : people.values()){
            System.out.println(pp);
        }

        //hash table for a line
        HashMap<Point, Point> lines =  new HashMap<Point, Point>(10, 2.0f);//can put twenty items in it, because there are 10 linked list and 2 threshhold factor
        Point a = new Point(3,5);
        Point b = new Point(1,6);
        Point c = new Point(13,7);
        Point d = new Point(223,1);

        lines.put(a, b);
        lines.put(c, d);

        for(Point o : lines.values()){
            System.out.println(o);
        }

        for(Point k : lines.keySet()){
            System.out.println("Key : " + k + " Value: " + lines.get(k));
        }

    }

}
