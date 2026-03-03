import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    String nama;
    String[] makanan = { "Piscok", "Nasgor", "Bakpia" };
    String[] minuman = { "Kopi Hitam", "Kopi Tubruk", "Nescafe" };
    int[] hargaMakanan = { 5_000, 10_000, 2_000 };
    int[] hargaMinuman = { 5_000, 3_000, 7_000 };
    ArrayList<String> pesananMakanan;
    ArrayList<String> pesananMinuman;

    Cafe() {
        this("Pelanggan");
    }

    Cafe(String nama) {
        this.nama = nama;
        pesananMakanan = new ArrayList<>();
        pesananMinuman = new ArrayList<>();

    }

    void cetakMenu(String[] temp, int[] temp2) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println((i + 1) + ". " + temp[i] + " : " + temp2[i]);
        }
        System.out.println();
    }

    void tampilkanMenuMakanan() {
        System.out.println("Menu Makanan:");
        cetakMenu(makanan, hargaMakanan);
    }

    void tampilkanMenuMinuman() {
        System.out.println("Menu Minuman:");
        cetakMenu(minuman, hargaMinuman);
    }

    void pesanMenu() {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Pesan Minuman");
            System.out.println("0. Selesai pesan");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                tampilkanMenuMakanan();
                System.out.print("Masukkan nama makanan: ");
                String tempNama = sc.nextLine();
                if (pesanMakanan(tempNama)) {
                    System.out.println("Makanan ditambahkan.");
                } else {
                    System.out.println("Nama makanan tidak ditemukan.");
                }
            } else if (pilihan == 2) {
                tampilkanMenuMinuman();
                System.out.print("Masukkan nama minuman: ");
                String tempNama = sc.nextLine();
                if (pesanMinuman(tempNama)) {
                    System.out.println("Minuman ditambahkan.");
                } else {
                    System.out.println("Nama minuman tidak ditemukan.");
                }
            }
        } while (pilihan != 0);
    }

    boolean pesanMakanan(String namaMenu) {
        int index = cariIndexMenu(makanan, namaMenu);
        if (index == -1) {
            return false;
        }
        pesananMakanan.add(makanan[index]);
        return true;
    }

    boolean pesanMinuman(String namaMenu) {
        int index = cariIndexMenu(minuman, namaMenu);
        if (index == -1) {
            return false;
        }
        pesananMinuman.add(minuman[index]);
        return true;
    }

    void hitungBill() {
        int totalHarga = hitungBill2();
        System.out.println("Total bill: " + totalHarga);
    }

    int hitungBill2() {
        int totalHarga = 0;

        for (int i = 0; i < pesananMakanan.size(); i++) {
            int index = cariIndexMenu(makanan, pesananMakanan.get(i));
            if (index != -1) {
                totalHarga += hargaMakanan[index];
            }
        }

        for (int i = 0; i < pesananMinuman.size(); i++) {
            int index = cariIndexMenu(minuman, pesananMinuman.get(i));
            if (index != -1) {
                totalHarga += hargaMinuman[index];
            }
        }
        return totalHarga;
    }

    void tampilkanPesanan() {
        System.out.println("Pelanggan: " + nama);
        System.out.println("Pesanan makanan: " + pesananMakanan);
        System.out.println("Pesanan minuman: " + pesananMinuman);
    }

    int bayar(int uangDibayar) {
        int total = hitungBill2();
        if (uangDibayar < total) {
            return -1;
        }
        return uangDibayar - total;
    }

    void resetPesanan() {
        pesananMakanan.clear();
        pesananMinuman.clear();
    }

    int cariIndexMenu(String[] menu, String namaMenu) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(namaMenu)) {
                return i;
            }
        }
        return -1;
    }
}
