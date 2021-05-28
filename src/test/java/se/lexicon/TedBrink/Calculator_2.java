package se.lexicon.TedBrink;

import java.util.Scanner;

public class Calculator_2 {

    public static void main(String[] args) {

        String data; // talen och operanden som skrivs in av användaren
        int index; // För att hitta var operanden är i den inmatade Stringen
        boolean run = true; // För att ge värdet true eller false i while satsen
        char stop; // för att lagra j/n för att stoppa eller fortsätta att köra programmet.

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("skriv in: tal + operand + tal ");
            data = scan.next();

            index = data.indexOf('+');
            if (index != -1) {
                String tal1 = data.substring(0, index);
                String tal2 = data.substring(index + 1);
                double iTal1 = Integer.parseInt(tal1.trim());
                double iTal2 = Integer.parseInt(tal2.trim());
                System.out.println(iTal1 + " + " + iTal2 + " = " + (iTal1 + iTal2));
            }
            index = data.indexOf('-');
            if (index != -1) {
                String tal1 = data.substring(0, index);
                String tal2 = data.substring(index + 1);
                double iTal1 = Integer.parseInt(tal1.trim());
                double iTal2 = Integer.parseInt(tal2.trim());
                System.out.println(iTal1 + " - " + iTal2 + " = " + (iTal1 - iTal2));
            }
            index = data.indexOf('*');
            if (index != -1) {

                String tal1 = data.substring(0, index);
                String tal2 = data.substring(index + 1);
                double iTal1 = Integer.parseInt(tal1.trim());
                double iTal2 = Integer.parseInt(tal2.trim());
                System.out.println(iTal1 + " * " + iTal2 + " = " + (iTal1 * iTal2));
            }
            index = data.indexOf('/');
            if (index != -1) {
                String tal1 = data.substring(0, index);
                String tal2 = data.substring(index + 1);
                double iTal1 = Integer.parseInt(tal1.trim());
                double iTal2 = Integer.parseInt(tal2.trim());
                System.out.println(iTal1 + " / " + iTal2 + " = " + (iTal1 / iTal2));
            }
            System.out.println("fortsätt med j + enter, avsluta med n + enter");  // ja med vilket tecken som helst
            stop = scan.next().charAt(0);
            if (stop == 'j')
                run = true;

            if(stop == 'n') {
                run = false;
                System.exit(0);
            }
        } while (run);
    }
}