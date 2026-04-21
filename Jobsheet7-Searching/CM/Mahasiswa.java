package CM;

public class Mahasiswa {
    String nama,prodi;
    int nim;

    Mahasiswa(int nim, String nama, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Prodi\t: " + prodi);
        System.out.println();
    }
}
