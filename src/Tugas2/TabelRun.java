package Tugas2;
import java.util.Scanner;

public class TabelRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka n : ");
        Tabel tabel = new Tabel(input.nextInt());
        input.close();
        tabel.showTable();
    }
}
