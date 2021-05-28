package se.lexicon.TedBrink;

import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {
        char operator;
        double n1, n2;
        double result = 0;
        boolean run = true;
        char exit;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println(" Vilken operator? +, -, *, /");
            operator = scan.next().charAt(0);

            System.out.println("första talet?");
            n1 = scan.nextDouble();

            System.out.println("Andra talet?");
            n2 = scan.nextDouble();

            switch (operator) {
                case '+':
                    result = n1 + n2;
                    break;

                case '-':
                    result = n1 - n2;
                    break;

                case '*':
                    result = n1 * n2;
                    break;

                case '/':
                    result = n1 / n2;
                    break;

                default:
                    System.out.println("Fel operator");
            }

            System.out.println(n1 + " " + operator + " " + n2 + " = " + result);

            System.out.println("Fortsätt med j avsluta med n");
            exit = scan.next().charAt(0);
            if (exit == 'n') {
                run = false;
                System.exit(0);
            }
            if (exit == 'j') {
                run = true;
            }
        } while (run);
    }
}