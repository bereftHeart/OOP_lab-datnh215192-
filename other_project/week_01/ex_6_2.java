import java.util.Scanner;

public class ex_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("How tall are you?");
        double height = scanner.nextDouble();
        System.out.println("Hello, " + name + ". You are " + age + " years old and your height is " + height);
    }
}
