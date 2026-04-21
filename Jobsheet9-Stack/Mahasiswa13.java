public class Mahasiswa13 {
    String nim,nama,kelas;
    int nilai;

    Mahasiswa13(){

    }
    Mahasiswa13(String nama, String nim, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.nilai = -1;
        this.kelas = kelas;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }

}
