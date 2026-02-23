import java.util.Scanner;

public class Matakuliah13 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah13(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    Matakuliah13() {
    }

    void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("Sks        : ");
        sks = sc.nextInt();
        sc.nextLine();
        System.out.print("Jumlah Jam : ");
        jumlahJam = sc.nextInt();
        sc.nextLine();
        System.out.println("-------------------------------------");
    }

    void cetakInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("Sks        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
        System.out.println("-------------------------------------");
    }
}
