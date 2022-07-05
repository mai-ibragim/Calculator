import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long value1 = 0;
        long value2 = 0;
        String operation = null;

        System.out.println("Enter the num: ");
        Scanner scanner = new Scanner(System.in);
        if (value1 > 0 || value1 < 10) {
            value1 = scanner.nextInt();
            operation = scanner.next();
            value2 = scanner.nextInt();
        }
        if (operation.equals("+")) {
            System.out.println(value1 + value2);

        }
        if (operation.equals("-")) {
            System.out.println(value1 - value2);
        }
        if (operation.equals("*")) {
            System.out.println(value1 * value2);
        }
        if (operation.equals("/")) {
            System.out.println(value1 / value2);

        }
    }
}