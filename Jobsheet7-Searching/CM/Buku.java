package CM;

public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku(String judul, String kodebuku, int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
        this.kodeBuku = kodebuku;
        this.judul = judul;
    }
    void tampilBuku() {
        System.out.println("judul\t\t: " + judul);
        System.out.println("kodeBuku\t: " + kodeBuku);
        System.out.println("tahun terbit\t: " + tahunTerbit);
        System.out.println();
    }
}
