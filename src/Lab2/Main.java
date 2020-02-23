package Lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "Text messaging, or texting, is the " +
                "act of composing and sending electronic messages, " +
                "typically consisting of alphabetic a" +
                "nd numeric characters, between two or" +
                " more users of mobile devices, " +
                "desktops/laptops, or other type of " +
                "compatible computer. " +
                "Text messages may be sent over a cellular network," +
                " or may also be sent via an Internet connection.";

        System.out.println("Enter {trail substring} {what to add}");
        Scanner sc = new Scanner(System.in);
        String answer = "";
        try {
            answer = sc.nextLine();
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
        String[] splittedAnswer = answer.split("\\s");
        String output = input.replaceAll("(" + splittedAnswer[0] + "\\b)", "$1 " + splittedAnswer[1]);

        System.out.println(output);
    }
}