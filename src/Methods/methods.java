package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        //user-defined methods...
        printMessage("Hello, World!", 5);
        //predefined methods....
        System.out.println("Pre-defined Methods....");
        //Math.max()
        System.out.println(Math.max(10, 20));
        //String.length()
        System.out.println("Array Length: "+"ABC".length());
        //Arrays.sort()
        Arrays.stream((new int[]{5, 2, 8, 1, 9})).sorted().forEach(System.out::println);
        //Scanner.nextLine()
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any value: ");
        String input = scanner.nextLine();
        System.out.println("Input value: "+input);
    }

    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

}
