import java.util.Scanner;

class Arvauspeli extends Game {

    /* Implementation of necessary concrete methods */
    int arvattava;
    int arvaus;
    int pelaaja;

    void initializeGame() {
        int min = 1;
        int max = 20;

        arvattava = (int)(Math.random()*(max-min+1)+min);

    }

    void makePlay(int player) {
        pelaaja = player + 1;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Pelaajan " + pelaaja + " vuoro!");
        System.out.println("Arvaa numero 1-20");

        arvaus = Integer.parseInt(myObj.nextLine());

    }

    boolean endOfGame() {
        // ...
        if (arvaus == arvattava) {
            return true;
        } else {
            return false;
        }

    }

    void printWinner() {
        // ...
        System.out.println("Pelaaja numero: " + pelaaja + " voitti pelin!");
    }

    /* Specific declarations for the Monopoly game. */

    // ...

}
