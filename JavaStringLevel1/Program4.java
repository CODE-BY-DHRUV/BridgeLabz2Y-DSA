public class Program4 {

    static void generateException() {
        String text = null;
        System.out.println(text.length()); // Exception
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see crash
        handleException();
    }
}

