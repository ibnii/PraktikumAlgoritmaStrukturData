package CM;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.buku = buku;
        this.mhs = mhs;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = 2000 * terlambat;
        }
    }

    void tampilPeminjaman() {
        hitungDenda();
        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %n",
                mhs.nim,
                mhs.nama,
                buku.judul,
                lamaPinjam,
                terlambat,
                denda);
    }
}
