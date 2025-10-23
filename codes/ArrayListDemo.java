import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        System.out.println("Original List: " + fruits);
        
        // Sort
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);
        
        // Remove
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
        
        // Size
        System.out.println("List size: " + fruits.size());
    }
}
