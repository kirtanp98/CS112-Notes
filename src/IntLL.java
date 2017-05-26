/**
 * Created by kirtanpatel on 1/19/17.
 */
public class IntLL {
    public static void main(String[] args) {
        IntNode L = null; //starting of the Link List. The handle for the beginning of the link list
        L = addToFront(L, 26);
        L = addToFront(L, 24);
        L = addToFront(L, 19);
        L = addToFront(L, 17);
        //addToFront(L, 19);;
        //
        traverse(L);
        before(L,17, 10);
        //L = new IntNode(10, L);
        traverse(L);
        traverse(L);
        /**
        L = removeFront(L);
        traverse(L);
        IntNode found  = search(L, 24);
        if(found != null){
            System.out.println("found it");
        }
        else{
            System.out.println("not found");

        }
        L =  delete(L, 19);
        traverse(L);
         **/
    }

    public static IntNode addToFront(IntNode front, int data) {
        return  new IntNode(data, front);
        //front = node;
        //return node;
    }

    public static void traverse (IntNode front){
        IntNode ptr = front; //ptr points to the first ndoe fo the LL
        while(ptr != null){
            System.out.print(ptr.data + " -> ");
            ptr=ptr.next;
        }
        System.out.println("\\");
    }

    public static IntNode removeFront (IntNode front){
        return front.next;

    }

    public static IntNode search (IntNode front, int target){
        IntNode ptr = front;
        while(ptr != null){
            if(ptr.data == target){
                return ptr;
            }
            ptr = ptr.next;
        }
        return null;
    }
    public static boolean addAfter (IntNode front, int target, int data){
        for(IntNode ptr = front; ptr != null; ptr = ptr.next){
            if(ptr.data == target){
                IntNode node = new IntNode (data, ptr.next);
                ptr.next = node;
                return true;
            }
        }
        return false;
    }

    public static IntNode delete(IntNode front, int target){
        IntNode prev =  null;
        IntNode ptr = front;
        while(ptr != null && ptr.data != target){
            prev = ptr;
            ptr = ptr.next;
        }
        if(ptr == null){
            return front;
        }
        else if (ptr == front){
            // target istthe first element of the LL
            return front.next;
        }
        else{
            prev.next = ptr.next;
            return front;
        }
    }

    public static void before(IntNode front, int target, int newItem){
        IntNode ptr = front;
        IntNode temp = front;
        int size = 0;

        while(ptr != null && ptr.data != target){
            ptr = ptr.next;
            if(ptr.data != target){
                temp = temp.next;
            }
            size++;
        }

        if(ptr ==  null){
            return;
        }
        else if(size == 0){
            System.out.print("WORKSq");
            front = new IntNode(newItem, front);
        }
        else{
            IntNode node = new IntNode(newItem, temp.next);
            temp.next = node;
        }
    }
}
