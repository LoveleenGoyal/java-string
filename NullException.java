public class NullException {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; 
        System.out.println(text.length()); 
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Attempted to access a null reference.");
        }
    }

    public static void main(String[] args) {
        // Uncomment the below line 
        // generateException();
        
        // Handling the exception
        handleException();
    }
}
