package Task_18.Task_18_5;

public class ThrowsDemo {
    public static void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
    public static void getDetails2(String key) {

        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
    }

    public static void main(String[] args) {
        getDetails(null);
        getDetails2(null);
    }
}