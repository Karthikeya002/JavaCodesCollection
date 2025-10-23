import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {
        String fileName = "test.txt";
        
        // Write to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, File I/O!\n");
            writer.write("This is a test file.\n");
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
