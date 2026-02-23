import java.util.Scanner;

public class Dosen13 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen13(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void inputData(Scanner sc) {
        System.out.print("Kode            : ");
        kode = sc.nextLine();
        System.out.print("Nama            : ");
        nama = sc.nextLine();
        System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
        jenisKelamin = sc.nextBoolean();
        System.out.print("Usia            : ");
        usia = sc.nextInt();
        sc.nextLine();
    }

    void cetakInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
    }
}
