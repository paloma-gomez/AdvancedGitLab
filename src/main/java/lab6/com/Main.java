package lab6.com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // print current date and time
        System.out.println(java.time.LocalDateTime.now());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and last name");
        String name = scanner.nextLine();
        //enter age
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        //print height
        System.out.println("Welcome, " + name +  "! You're " + age + " years old and " + height + "m tall. Have a fantastic day!");
        scanner.close();
    }
}