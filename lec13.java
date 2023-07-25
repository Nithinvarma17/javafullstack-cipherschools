import java.util.LinkedList;

public class lec13 {
    public static void main(String[] args) {
         LinkedList<String> ll = new LinkedList<String>();
  
        // Adding elements to the linked list
        ll.add("Alabama");
        ll.add("Britain");
        ll.addLast("Costa rica");
        ll.addFirst("Denmark");
        ll.add(2, "Egypt");
  
        System.out.println(ll);
  
        ll.remove("Britain");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
  
        System.out.println(ll);
        ll.set(1, "For");
        ll.add("Hello");
        ll.add("Ramante");
        ll.add(1, "Vochesindha");
  
        System.out.println("Initial LinkedList " + ll);
  
          // Function call
        ll.remove(1);
  
        System.out.println("After the Index Removal " + ll);
  
        ll.remove("Hello");
  
        System.out.println("After the Object Removal "
                           + ll);
    }
    }
}
