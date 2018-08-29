package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {

        int password = 111;
        try {
            int result = password / 0;
            System.out.println(result);
        }

        catch (Exception ex) {
            System.out.println("Please try again with correct password ");
        }
    }
}
