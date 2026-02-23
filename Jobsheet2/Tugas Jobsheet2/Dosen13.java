public class Dosen13 {
    String idDosen = "D01",nama = "Alexander",bidangKeahlian = "Sastra";
    boolean statusAktif = true;
    int tahunBergabung = 1999;

    Dosen13(){

    }
    Dosen13(String id, String nama, String bidang, boolean status, int tahunBergabung){
        this.idDosen = id;
        this.nama = nama;
        this.bidangKeahlian = bidang;
        this.statusAktif = status;
        this.tahunBergabung = tahunBergabung;
    }

    void tampilinInformasi(){
        System.out.println("Nama Dosen\t\t: " + nama);
        System.out.println("ID\t\t\t: " + idDosen);
        System.out.println("Bidang Keahlian\t\t: " + bidangKeahlian);
        System.out.println("Status Aktif\t\t: " + ((this.statusAktif)? "Aktif" : "Nonaktif"));
        System.out.println("Tahun Bergabung\t\t: " + tahunBergabung);
    }

    void setStatusAktif(boolean status){
        this.statusAktif = status;
        System.out.println("Berhasil merubah status dosen");
        System.out.println("Status Aktif\t\t: " + ((this.statusAktif)? "Aktif" : "Nonaktif"));
    }

    int hitungMasaKerja(int thnSkrng){
        return thnSkrng - tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        this.bidangKeahlian = bidang;
    }
}
