import java.util.Scanner;

public class ChattyBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Daja", "2020");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    // This method welcome any new user and asks for their name.
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    // this method takes the name of the user, and displays it ont he screen.
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    /*
    this method asks the user to enter the remainders of dividing their age by (3, 5, and 7).
    then it calculates their age and displays it on the screen
     */
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 7 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    // This method displays from 0 to a number (entered by the user) on the screen
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    /*
    This method asks the user a question and keep repeating until the user
    enters the right answer.
     */
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int choice = scanner.nextInt();

        while(choice != 2) {
            System.out.println("Please, try again.");
            choice = scanner.nextInt();
        }

    }

    // This method displays a good bye message.
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}