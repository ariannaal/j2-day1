package es3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContoCorrente CC1 = new ContoCorrente("Arianna Loreti", 3000);
        ContoOnline CO1 = new ContoOnline("Mario Rossi", 4000, 5000);


        try {
            System.out.println("Inserisci l'importo da prelevare dal conto corrente");
            double importoAttuale = scanner.nextDouble();
            CC1.preleva(importoAttuale);
            System.out.println("Saldo sul conto corrente dopo l'operazione di prelievo: " + CC1.restituisciSaldo());

            System.out.println("Inserisci l'importo da prelevare dal conto corrente");
            double importoAttualeOnline = scanner.nextDouble();
            CO1.preleva(importoAttualeOnline);
            System.out.println("Saldo sul conto online dopo l'operazione di prelievo: " + CO1.restituisciSaldo());

        } catch (BancaException e) {
            System.err.println("errore: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
