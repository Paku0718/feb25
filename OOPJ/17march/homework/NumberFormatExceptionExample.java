public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
