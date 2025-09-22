package lab6.com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // print current date and time
        System.out.println(java.time.LocalDateTime.now());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        //enter age
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        //print height
        System.out.println("Your height is " + height + " meters.");
        System.out.println("Hello " + name + " you are " + age + " years old.");
        scanner.close();
    }
}