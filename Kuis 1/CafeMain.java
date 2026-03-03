import java.util.ArrayList;
import java.util.Scanner;

public class CafeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cafe> pelanggan = new ArrayList<>();
        int idxPelangganAktif = -1;
        int pilihan;

        do {
            System.out.println("\n=== Sistem Cafe ===");
            System.out.println("1. Tambah pelanggan");
            System.out.println("2. Lihat daftar pelanggan");
            System.out.println("3. Pesan menu (pelanggan aktif)");
            System.out.println("4. Lihat bill (pelanggan aktif)");
            System.out.println("5. Bayar (pelanggan aktif)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Nama pelanggan: ");
                String nama = sc.nextLine();
                Cafe pelangganBaru = new Cafe(nama);
                pelanggan.add(pelangganBaru);
                if (idxPelangganAktif == -1) {
                    idxPelangganAktif = 0;
                }
                System.out.println("Pelanggan berhasil ditambahkan");
            } else if (pilihan == 2) {
                if (pelanggan.isEmpty()) {
                    System.out.println("Belum ada pelanggan");
                } else {
                    for (int i = 0; i < pelanggan.size(); i++) {
                        String penanda = (i == idxPelangganAktif) ? " (aktif)" : "";
                        System.out.println((i + 1) + ". " + pelanggan.get(i).nama + penanda);
                    }
                    System.out.println("Switch pelanggan aktif? (ya/tidak)");
                    System.out.print("=> ");
                    String pilihanSwitch = sc.nextLine();
                    if (pilihanSwitch.equalsIgnoreCase("ya")) {
                        System.out.print("Pilih nomer dari pelanggan :");
                        int switchPelanggan = sc.nextInt();
                        sc.nextLine();
                        if (switchPelanggan > 0 && switchPelanggan <= pelanggan.size()) {
                            idxPelangganAktif = switchPelanggan - 1;
                            System.out.println("Pelanggan Aktif telah diganti");
                        }else{
                            System.out.println("Tidak ada pelanggan tersebut");
                        }

                    }
                }
            } else if (pilihan == 3) {
                Cafe aktif = getPelangganAktif(pelanggan, idxPelangganAktif);
                if (aktif == null) {
                    System.out.println("Pilih pelanggan aktif dulu");
                } else {
                    aktif.pesanMenu();
                }
            } else if (pilihan == 4) {
                Cafe aktif = getPelangganAktif(pelanggan, idxPelangganAktif);
                if (aktif == null) {
                    System.out.println("Pilih pelanggan aktif dulu.");
                } else {
                    aktif.tampilkanPesanan();
                    System.out.println("Total bill: " + aktif.hitungBill2());
                }
            } else if (pilihan == 5) {
                Cafe aktif = getPelangganAktif(pelanggan, idxPelangganAktif);
                if (aktif == null) {
                    System.out.println("Pilih pelanggan aktif dulu.");
                } else {
                    int total = aktif.hitungBill2();
                    System.out.println("Total bill: " + total);
                    System.out.print("Masukkan uang bayar: ");
                    int uang = sc.nextInt();
                    sc.nextLine();
                    int kembalian = aktif.bayar(uang);
                    if (kembalian < 0) {
                        System.out.println("Uang kurang: " + (total - uang));
                    } else {
                        System.out.println("Pembayaran berhasil. Kembalian: " + kembalian);
                        aktif.resetPesanan();
                    }
                }
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }

    private static Cafe getPelangganAktif(ArrayList<Cafe> pelanggan, int idxPelangganAktif) {
        if (idxPelangganAktif < 0 || idxPelangganAktif >= pelanggan.size()) {
            return null;
        }
        return pelanggan.get(idxPelangganAktif);
    }
}
