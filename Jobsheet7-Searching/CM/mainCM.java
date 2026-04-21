package CM;

import java.util.ArrayList;
import java.util.Scanner;

public class mainCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] listMhs = new Mahasiswa[3];
        Buku[] listBuku = new Buku[4];
        Peminjaman[] listPinjam = new Peminjaman[4];

        insertData(listMhs, listBuku, listPinjam);
        int pilihan;

        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan NIM");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanMahasiswa(listMhs);
                    pilihan = 1;
                    break;
                case 2:
                    tampilkanBuku(listBuku);
                    pilihan = 2;
                    break;
                case 3:
                    tampilkanPeminjaman(listPinjam);
                    pilihan = 3;
                    break;
                case 4:
                    // tampilkanPeminjaman(bubbleSort(listPinjam));
                    tampilkanPeminjaman(bubbleSortNIM(listPinjam));
                    pilihan = 4;
                    break;
                case 5:
                    searchNIMSequential(listPinjam);
                    pilihan = 5;
                    break;
                case 0:
                    System.out.println("\nTerima kasih sudah Mengunjungi " +
                            "Sistem Peminjaman Ruang Baca JTI");
                    pilihan = 0;
                    break;
                default:
                    System.out.println("\nPilihan anda tidak valid\n");
                    break;
            }
        } while (pilihan != 0);

    }

    static void insertData(Mahasiswa[] listMhs, Buku[] listBuku, Peminjaman[] listPinjam) {
        // Data Mahasiswa
        listMhs[0] = new Mahasiswa(22001, "Andi", "Teknik Informatika");
        listMhs[1] = new Mahasiswa(22002, "Budi", "Teknik Informatika");
        listMhs[2] = new Mahasiswa(22003, "Citra", "Sistem Informasi Bisnis");

        // Data Buku
        listBuku[0] = new Buku("Algoritma", "B001", 2020);
        listBuku[1] = new Buku("Basis Data", "B002", 2019);
        listBuku[2] = new Buku("Pemograman", "B003", 2021);
        listBuku[3] = new Buku("Fisika", "B004", 2024);

        // Data Peminjaman
        listPinjam[0] = new Peminjaman(listMhs[0], listBuku[0], 7);
        listPinjam[1] = new Peminjaman(listMhs[1], listBuku[1], 3);
        listPinjam[2] = new Peminjaman(listMhs[2], listBuku[2], 10);
        listPinjam[3] = new Peminjaman(listMhs[2], listBuku[3], 6);
    }

    static void tampilkanMahasiswa(Mahasiswa[] listMhs) {
        System.out.println();
        for (int i = 0; i < listMhs.length; i++) {
            listMhs[i].tampilMahasiswa();
        }
    }

    static void tampilkanBuku(Buku[] listBuku) {
        System.out.println();
        for (int i = 0; i < listBuku.length; i++) {
            listBuku[i].tampilBuku();
        }
    }

    static void tampilkanPeminjaman(Peminjaman[] listPinjam) {
        System.out.println();
        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %n",
                "NIM",
                "NAMA",
                "JUDUL BUKU",
                "LAMA PINJAM",
                "TERLAMBAT",
                "DENDA");
        for (int i = 0; i < listPinjam.length; i++) {
            listPinjam[i].tampilPeminjaman();
        }
        System.out.println();
    }

    static Peminjaman[] bubbleSort(Peminjaman[] listPinjam) {
        boolean swapped = false;
        Peminjaman[] sortDenda = listPinjam.clone();
        for (int i = 0; i < sortDenda.length; i++) {
            sortDenda[i].hitungDenda();
        }
        for (int i = 0; i < sortDenda.length - 1; i++) {
            swapped = false;
            Peminjaman temp;
            for (int j = 0; j < sortDenda.length - i - 1; j++) {
                if (sortDenda[j].denda < sortDenda[j + 1].denda) {
                    temp = sortDenda[j];
                    sortDenda[j] = sortDenda[j + 1];
                    sortDenda[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return sortDenda;
    }

    static void searchNIMSequential(Peminjaman[] listPinjam) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nimTarget = sc.next();
        boolean isNIM = false;

        for (int i = 0; i < listPinjam.length; i++) {
            if (listPinjam[i].mhs.nim == nimTarget) {
                listPinjam[i].mhs.tampilMahasiswa();
                isNIM = true;
            }
        }
        if (!isNIM) {
            System.out.println("NIM tidak ditemukan");
        }
    }

        static Peminjaman[] bubbleSortNIM(Peminjaman[] listPinjam) {
        boolean swapped = false;
        Peminjaman[] sortDenda = listPinjam.clone();
        for (int i = 0; i > sortDenda.length - 1; i++) {
            swapped = false;
            Peminjaman temp;
            for (int j = 0; j < sortDenda.length - i - 1; j++) {
                if (sortDenda[j].mhs.nim < sortDenda[j + 1].mhs.nim) {
                    temp = sortDenda[j];
                    sortDenda[j] = sortDenda[j + 1];
                    sortDenda[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return sortDenda;
    }
}
