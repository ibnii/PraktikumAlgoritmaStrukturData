public class MahasiswaBerprestasi13 {
    Mahasiswa13[] listMhs;
    int idx;

    void inisialisasi(int kapasitas) {
        listMhs = new Mahasiswa13[kapasitas];
        idx = 0;
    }

    void tambah(Mahasiswa13 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa13 m : listMhs) {
            m.tampilInformasi();
            System.out.println("------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa13 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}
