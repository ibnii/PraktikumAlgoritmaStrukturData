import java.util.Scanner;

public class MatakuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah13[] arrayOfMatakuliah = new Matakuliah13[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah13();
            arrayOfMatakuliah[i].tambahData();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
