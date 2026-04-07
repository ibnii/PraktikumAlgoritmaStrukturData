public class Mahasiswa13 {
    double ipk;
    String nama;
    String kelas;
    String nim;

    Mahasiswa13() {

    }

    Mahasiswa13(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("IPK\t: " + ipk);
    }
}
