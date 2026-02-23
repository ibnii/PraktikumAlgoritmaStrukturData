import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa13[] arrayOfMahasiswa13 = new Mahasiswa13[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa13[i] = new Mahasiswa13();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa13[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa13[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa13[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa13[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa13[i].cetakInfo();
        }

    }
}
