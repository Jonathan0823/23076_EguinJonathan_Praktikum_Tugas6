package Tugas2;

public class Tabel {
    int n;

    public Tabel(int n) {
        this.n = n;
    }

    void showTable() {
    System.out.format("%4s", " ");
    for (int i = 1; i <= n; i++) {
        System.out.format("%4d", i);
    }
    System.out.println();
    for (int i = 1; i <= n; i++) {
        System.out.format("%4d", i);
        for (int j = 1; j <= n; j++) {
            System.out.format("%4d", i * j);
        }
        System.out.println();
    }
    
    }
}
