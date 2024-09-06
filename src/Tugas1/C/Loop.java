package Tugas1.C;

/**
 * App
 */
public class Loop {
    void loopZtoAFor() {
        for (int i = 90; i >= 65; i--) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }

    void loopZtoAWhile() {
        int i = 90;
        while (i >= 65) {
            System.out.print((char)i + " ");
            i--;
        }
        System.out.println();
    }
    
    void loopZtoADoWhile() {
        int i = 90;
        do {
            System.out.print((char)i + " ");
            i--;
        } while (i >= 65);
        System.out.println();
    }
}