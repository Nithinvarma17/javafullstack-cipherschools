import java.util.*;

public class lec12 {
    public static void main(String[] args) {
         Vector vec = new Vector();
    vec.add("texas");
    vec.add("zurich");
    vec.add("newyork");
    Iterator pointer = vec.iterator();
    while(pointer.hasNext()){
        System.out.println(pointer.next());
    }
    ArrayList<Product> products = new ArrayList<Product>();
    Product p = new Product();
    p.title="xmen";
    p.price=333;
    products.add(p);
    System.out.println(products.get(0));
    }

   
   
}
 class Product{
        String title;
        int price;
    }
