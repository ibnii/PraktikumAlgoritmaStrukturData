public class MahasiswaBerprestasi13 {
    Mahasiswa13[] listMhs;
    int idx;

    MahasiswaBerprestasi13() {
        this.listMhs = new Mahasiswa13[5];
        idx = 0;
    }

    void tambah(Mahasiswa13 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data Mahasiswa sudah penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong");
            return;
        }
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("------------------------------------");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
