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
        System.out.println("Hello " + name);
        scanner.close();
    }
}