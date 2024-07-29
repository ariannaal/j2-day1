package es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Inserisci il numero di chilometri percorsi");
            int km = Integer.parseInt(scanner.nextLine());
            System.out.println("inserisci il numero di litri di carburante consumati");
            double litri = Integer.parseInt(scanner.nextLine());

            if (litri == 0) {
                throw new ArithmeticException("non è possibile dividere per 0");
            }

            double kmPerLitro = (double) km / litri;
            System.out.println("Chilometri per litro: " + kmPerLitro);

        } catch (ArithmeticException e) {
            System.err.println("errore: " + e.getMessage());

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("errore");
        } finally {
            scanner.close();
        }


    }


}