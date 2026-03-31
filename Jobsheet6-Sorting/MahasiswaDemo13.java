import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        sc.nextLine();
        list.listMhs = new Mahasiswa13[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("--- Input Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa13 m = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("======================================");
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("======================================");
        System.out.println("Data Mahasiswa setelah sorting IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("======================================");
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("======================================");
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
