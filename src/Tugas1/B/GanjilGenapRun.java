package Tugas1.B;

public class GanjilGenapRun {
    public static void main(String[] args) {
        GanjilGenap angka = new GanjilGenap(20);
        System.out.println("Loop menggunakan for");
        angka.ganjilFor();
        angka.genapFor();
        
        System.out.println("\nLoop menggunakan while");
        angka.ganjilWhile();
        angka.genapWhile();
        
        System.out.println("\nLoop menggunakan do while");
        angka.ganjilDoWhile();
        angka.genapDoWhile();
    }
}
