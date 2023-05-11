// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        trycatch(18, 0);

        trycatch(20, 5);
    }

    public static void trycatch( int dividend, int divisor) {

        int qotient = 0;

        try {

            qotient = dividend / divisor;
        }
        catch (Exception e)
        {
            System.out.println("1. Catch block: error message: " + e.getMessage() );
        }
        finally {
            System.out.println("2. Finally block, qotient: " + qotient);
        }

        System.out.println("3. Outside block, qotient: " + qotient);
    }
}