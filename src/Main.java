import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();
            
            // Format the date and time
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = currentDateTime.format(formatter);
            
            // Print the greeting message with the current date and time
            System.out.println("Hello, Docker! Current date and time: " + formattedDateTime);
        } catch (Exception e) {
            // Handle unexpected exceptions gracefully
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}