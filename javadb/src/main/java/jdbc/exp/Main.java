package jdbc.exp;

public class Main {

    private static String value = "one";

    public static void main(String[] args) {
        switch(value) {
            case "one":
                System.out.println("The value is " + value);
                break;
            default:
                System.out.println("The value is not " + value);
                break;
        }
    }
}