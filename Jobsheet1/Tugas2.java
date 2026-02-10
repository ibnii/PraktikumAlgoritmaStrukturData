import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah jadwal: ");
        int jumlahJadwal = sc.nextInt();
        sc.nextLine();
        String[][] jadwal = new String[jumlahJadwal][4];
        inputJadwal(jadwal, sc);

        System.out.println("\n--- Data Masuk ---");
        tampilkanJadwal(jadwal);
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
    }

    static void tampilkanJadwal(String[][] jadwal) {
        System.out.println("\n=== JADWAL KULIAH ===");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("| %-30s | %-15s | %-10s | %-8s |\n","Mata Kuliah", "Tempat", "Hari", "Jam");
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
}