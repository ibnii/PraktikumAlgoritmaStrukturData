import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan jumlah jadwal: ");
        int jumlahJadwal = sc.nextInt();
        sc.nextLine();
        String[][] jadwal = new String[jumlahJadwal][4];
        inputJadwal(jadwal, sc);

        do {
            System.out.println("\n1. Tampilkan Jadwal");
            System.out.println("2. Tampilkan Berdasar Hari");
            System.out.println("3. Tampilkan Berdasar MK");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan : ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    tampilkanJadwal(jadwal);
                    break;
                case 2:
                    tampilkanBerdasarHari(jadwal, sc);
                    break;
                case 3:
                    tampilkanBerdasarMK(jadwal, sc);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

    }

    static void inputJadwal(String[][] jadwal, Scanner sc) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan nama MK\t\t: ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Masukkan tempat\t\t\t: ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Masukkan hari\t\t\t: ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Masukkan jam mata kuliah\t: ");
            jadwal[i][3] = sc.nextLine();

            System.out.println();
        }

        System.out.println("Jadwal kuliah selesai di input");
    }

    static void tampilkanJadwal(String[][] jadwal) {
        System.out.println("\n=== JADWAL KULIAH ===");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("| %-30s | %-15s | %-10s | %-8s |\n", "Mata Kuliah", "Tempat", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("| %-30s | %-15s | %-10s | %-8s |\n",
                    jadwal[i][0], // MK
                    jadwal[i][1], // Tempat
                    jadwal[i][2], // Hari
                    jadwal[i][3] // Jam
            );
        }
        System.out.println("---------------------------------------------------------------------");
    }

    static void tampilkanBerdasarMK(String[][] jadwal, Scanner sc) {
        sc.nextLine();
        System.out.print("Masukkan nama Mata Kuliah: ");
        String cariMK = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariMK)) {
                System.out.println("\nJadwal ditemukan:");
                System.out.println("MK     : " + jadwal[i][0]);
                System.out.println("Tempat : " + jadwal[i][1]);
                System.out.println("Hari   : " + jadwal[i][2]);
                System.out.println("Jam    : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Jadwal tidak ditemukan.");
        }
    }

    static void tampilkanBerdasarHari(String[][] jadwal, Scanner sc) {
        sc.nextLine();
        System.out.print("Masukkan hari: ");
        String cariHari = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.println("\nJadwal ditemukan:");
                System.out.println("MK     : " + jadwal[i][0]);
                System.out.println("Tempat : " + jadwal[i][1]);
                System.out.println("Hari   : " + jadwal[i][2]);
                System.out.println("Jam    : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal di hari tersebut.");
        }
    }

}