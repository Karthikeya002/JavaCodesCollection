import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        
        // Add key-value pairs
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        
        System.out.println("HashMap: " + ages);
        
        // Get value
        System.out.println("Alice's age: " + ages.get("Alice"));
        
        // Check if key exists
        System.out.println("Contains Bob: " + ages.containsKey("Bob"));
        
        // Remove
        ages.remove("Charlie");
        System.out.println("After removal: " + ages);
    }
}
