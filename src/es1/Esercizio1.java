package es1;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

    private int[] array;

    public Esercizio1(int[] array) {
        this.array = array;
    }

    public void esercizio1() {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        printArray();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Inserisci la posizione in cui inserire il numero da 1 a 10");
                int posizione = scanner.nextInt();

                if (posizione < 0 || posizione > array.length) {
                    throw new ArrayIndexOutOfBoundsException("posizione fuori dai range dell'array");
                }

                if (posizione == 0) {
                    System.out.println("Fine");
                    break;

                } else {

                    System.out.print("Inserisci il valore da inserire: ");
                    int value = scanner.nextInt();
                    array[posizione - 1] = value;
                    printArray();
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("errore: posizione fuori dai range");

            } catch (Exception e) {
                System.out.println("errore");
            }

        }

        scanner.close();
    }


    private void printArray() {
        System.out.print("array aggiornato: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(+i + ") " + array[i] + "\n");
        }
        System.out.println();
    }
}
